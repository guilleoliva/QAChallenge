package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CredifyPage;
import pages.LoginPage;
import pages.OfferPage;
import pages.ProfilePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StepDef extends BaseUtil{

    private  BaseUtil base;
    private String loanAmount;
    private String apr;
    private String loanTerm;
    private String monthlyPayment;

    CredifyPage credifyPage;
    ProfilePage profilePage;
    OfferPage offerPage;
    LoginPage loginPage;


    public StepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the Credify page$")
    public void iNavigateToPage() throws Throwable {
        System.out.println("Navigate on Credify Page");
        base.Driver.navigate().to("https://www.credify.tech/");
        credifyPage = new CredifyPage(base.Driver);
    }

    @When("^I enter the loan amount \"([^\"]*)\"$")
    public void iEnterTheLoanAmount(String loanAmount) throws Throwable {
        credifyPage.loanAmount(loanAmount);
    }

    @And("^I select the loan purpose \"([^\"]*)\"$")
    public void iSelectTheLoanPurpose(String purpose) throws Throwable {
        credifyPage.selectPurpose(purpose);
    }

    @And("^I click on Check Your Rate button$")
    public void iClickOnCheckYourRateButton() {
        credifyPage.checkRate();
        profilePage = new ProfilePage(base.Driver);
    }

    @And("^I enter my personal information on page$")
    public void iEnterMyPersonalInformationOnPage(DataTable table) {
        List<Map<String, String>> list = table.asMaps(String.class, String.class);
        for(int i=0; i<list.size(); i++) {
            //updatePasswordPage.CompletePasswordForm(list.get(i).get("password"),list.get(i).get("newPassword"));
            profilePage.FirstName(list.get(i).get("First Name"));
            profilePage.LastName(list.get(i).get("Last Name"));
            profilePage.homeAdress(list.get(i).get("Home Adress"));
            profilePage.dateOfBirth(list.get(i).get("DOB"));
            profilePage.iAIncome(list.get(i).get("Annual Income"));
            profilePage.aAIncome(list.get(i).get("Additional Income"));
            profilePage.email(list.get(i).get("Email"));
            profilePage.password(list.get(i).get("Password"));
            profilePage.ClickTerms();
        }
    }

    @Then("^I am on the Offer Page$")
    public void iAmOnTheOfferPage() {
        WebDriverWait wait = new WebDriverWait(base.Driver, 20);
        wait.until(ExpectedConditions.urlContains("offer-page"));
        String URL = base.Driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.credify.tech/phone/offer-page" );
    }

    @And("^I click on Sign out on menu$")
    public void iClickOnSignOutOnMenu() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(base.Driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[1]/div/main/div/header/div/label")));
        Thread.sleep(3000);
        offerPage.clickBtnMenu();
        offerPage.clickLogout();
    }

    @When("^I navigate to the Credify login page$")
    public void iNavigateToTheCredifyLoginPage() {
        System.out.println("Navigate on Credify login Page");
        base.Driver.navigate().to("https://www.credify.tech/portal/login");
        loginPage = new LoginPage(base.Driver);
    }
    @When("^I enter the following valid credentials$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        //Create an ArrayList
        List<User> users =  new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        LoginPage page = new LoginPage(base.Driver);

        for (User user: users){
            page.Login(user.username, user.password);
        }
    }

    @And("^I store values of Loan Amount, APR, Loan Term and Loan Term$")
    public void iStoreValuesOfLoanAmountAPRLoanTermAndLoanTerm() {
       loanAmount = offerPage.getYourLoanAmount();
       apr = offerPage.getYourAPR();
       loanTerm = offerPage.getYourLoanTerm();
       monthlyPayment = offerPage.getYourMonthlyPayment();
    }

    @And("^I click on check Rate to submit the information$")
    public void iClickOnCheckRateToSubmitTheInformation() {
        profilePage.ClickCheckRate();
        offerPage = new OfferPage(base.Driver);
    }

    @And("^Validate that Loan Amount, APR, Loan Term and Loan Term matches with the info stored previously$")
    public void validateThatLoanAmountAPRLoanTermAndLoanTermMatchesWithTheInfoStoredPreviously() {
        try {
            Assert.assertEquals("Loan Amount is not the same!!",loanAmount, offerPage.getYourLoanAmount());
        } catch (AssertionError e) {
            String message = e.getMessage();
        }
        try {
            Assert.assertEquals("APR is not the same!!",apr,offerPage.getYourAPR() );
        } catch (AssertionError e) {
            String message = e.getMessage();
        }
        try {
            Assert.assertEquals("Loan Term is not the same!!",loanTerm,offerPage.getYourLoanTerm() );
        } catch (AssertionError e) {
            String message = e.getMessage();
        }
        try {
            Assert.assertEquals("Monthly Payment is not the same!!",monthlyPayment,offerPage.getYourMonthlyPayment() );
        } catch (AssertionError e) {
            String message = e.getMessage();
        }
    }

    @And("^I click on login Button$")
    public void iClickOnLoginButton() {
        loginPage.ClickLogin();
    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username= userName;
            password = passWord;
        }
    }
}

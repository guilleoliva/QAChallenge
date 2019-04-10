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
import pages.CreateUserPage;
import pages.AddKidsPage;
import pages.ListPage;

import java.util.ArrayList;
import java.util.List;

public class StepDef extends BaseUtil {

    private BaseUtil base;
    private String loanAmount;
    private String apr;
    private String loanTerm;
    private String monthlyPayment;

    CreateUserPage createuserpage;
    AddKidsPage addKidsPage;
    ListPage listPage;

    public StepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the Goalsetter Create Users page$")
    public void iNavigateToPage() throws Throwable {
        System.out.println("Navigate on Goalsetter Create Users page");
        base.Driver.navigate().to("https://dev-portal.goalsetter.co/create-user");
        createuserpage = new CreateUserPage(base.Driver);
    }

    @Then("^I am on Goalsetter Create Users page$")
    public void iAmOnCreateUsersPage() {
        WebDriverWait wait = new WebDriverWait(base.Driver, 50);
        wait.until(ExpectedConditions.urlContains("create-user"));
        String URL = base.Driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://dev-portal.goalsetter.co/create-user");
    }

    @And("^I should see the Goalsetter icon on the top of the Page$")
    public void iShouldSeeTheGoalsetterIconOnTheTopOfThePage() {
        Assert.assertTrue("Goalsetter Icon on top is not displayed", createuserpage.isLogoDisplayed());
    }

    @When("^I enter the FirstName \"([^\"]*)\"$")
    public void iEnterTheFirstName(String firstName) throws Throwable {
        createuserpage.FillFirstName(firstName);
    }

    @When("^I enter the LastName \"([^\"]*)\"$")
    public void iEnterTheLastName(String lastName) throws Throwable {
        createuserpage.FillLastName(lastName);
    }

    @When("^I enter the Email \"([^\"]*)\"$")
    public void iEnterTheEmail(String email) throws Throwable {
        createuserpage.FillEmail(email);
    }

    @When("^I enter the Password \"([^\"]*)\"$")
    public void iEnterThePassword(String passw) throws Throwable {
        createuserpage.FillPassword(passw);
    }

    @And("^I click on Create Your Free Goalsetter Account button$")
    public void iClickOnCreateYourFreeGoalsetterAccountButton() {
        createuserpage.ClikBottonCreateAccount();
        addKidsPage = new AddKidsPage(base.Driver);
    }

    @Then("^I am on Goalsetter Add Kids page$")
    public void iAmOnGoalsetterAddKidsPage() {
        WebDriverWait wait = new WebDriverWait(base.Driver, 50);
        wait.until(ExpectedConditions.urlContains("add-kids"));
        String URL = base.Driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://dev-portal.goalsetter.co/add-kids");
    }

    @And("^I should see the Goalsetter icon on the top of the Add Kids Page$")
    public void iShouldSeeTheGoalsetterIconOnTheTopOfTheAddKidsPage() {
        Assert.assertTrue("Goalsetter Icon on top is not displayed", addKidsPage.isLogoDisplayed());
    }

    @When("^I enter the Kid's Name \"([^\"]*)\"$")
    public void iEnterTheKidSName(String kidName) throws Throwable {
        addKidsPage.FillName(kidName);
    }

    @And("^I click on The stork is on the way$")
    public void iClickOnTheStorkIsOnTheWay() {
        addKidsPage.ClickStorkOnWay();
    }

    @And("^I click on Continue button on Add Kids Page$")
    public void iClickOnContinueButtonOnPage() {
        addKidsPage.ClickContinue();
        listPage = new ListPage(base.Driver);
    }

    @Then("^I am on Goalsetter List Kids page$")
    public void iAmOnGoalsetterListKidsPage() {
        WebDriverWait wait = new WebDriverWait(base.Driver, 50);
        wait.until(ExpectedConditions.urlContains("list-kid"));
        String URL = base.Driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://dev-portal.goalsetter.co/list-kid");
    }

    @And("^I should see the Goalsetter icon on the top of the List Kids Page$")
    public void iShouldSeeTheGoalsetterIconOnTheTopOfTheListKidsPage() {
        listPage.isLogoDisplayed();
    }

    @And("^I should see You´ve added Benjamin on page$")
    public void iShouldSeeYouVeAddedBenjaminOnPage() {
        listPage.isAddedKidTxtDisplayed();
    }
}


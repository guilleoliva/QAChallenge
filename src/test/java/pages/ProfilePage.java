package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[1]/div[1]/div[1]/div/div/div/div/input")
    private WebElement firstNameTxt;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[1]/div[1]/div[2]/div/div/div/div/input")
    private WebElement lastNameTxt;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[1]/div[2]/div/div/div/div/div/div/div[1]/input")
    private WebElement homeAdressTxt;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[1]/div[4]/div/div/div/input")
    private WebElement dateOfBirthTxt;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[1]/div[5]/div/div[1]/div/input")
    private WebElement iAIncomeTxt;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[1]/div[6]/div/div[1]/div/input")
    private WebElement aAIncomeTxt;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[2]/div[1]/div/div/div/input")
    private WebElement emailTxt;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[2]/div[2]/div/div[1]/div/input")
    private WebElement passwordTxt;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[3]/div/label/div[1]")
    private WebElement termsOfUseBox;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[4]/button")
    private WebElement checkYourRateBtn;

    //*[@id="root"]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[1]/div[2]/div/div/div/div/div/div/div[2]/ul/li[1]/span
    @FindBy(xpath = ".//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div[1]/div/div/form/div[1]/div[2]/div/div/div/div/div/div/div[2]/ul/li[1]/span")
    private WebElement selectHomeAdr;


    public void FirstName(String firstName)
    {
        firstNameTxt.clear();
        firstNameTxt.sendKeys(firstName);
    }
    public void LastName(String lastName)
    {
        lastNameTxt.clear();
        lastNameTxt.sendKeys(lastName);
    }

    public void dateOfBirth(String dob)
    {
        dateOfBirthTxt.clear();
        dateOfBirthTxt.sendKeys(dob);
    }

    public void homeAdress(String homaAdrs)
    {
        homeAdressTxt.clear();
        homeAdressTxt.sendKeys(homaAdrs);
        selectHomeAdr.click();

    }

    public void iAIncome(String iaI)
    {
        iAIncomeTxt.clear();
        iAIncomeTxt.sendKeys(iaI);
    }

    public void email(String emails)
    {
        emailTxt.clear();
        emailTxt.sendKeys(emails);
    }

    public void aAIncome(String aaI)
    {
        aAIncomeTxt.clear();
        aAIncomeTxt.sendKeys(aaI);
    }

    public void password(String psw)
    {
        passwordTxt.clear();
        passwordTxt.sendKeys(psw);
    }


    public void ClickTerms()
    {
        termsOfUseBox.click();
    }


    public void ClickCheckRate()
    {
        checkYourRateBtn.click();
    }

}

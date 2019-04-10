package pages;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUserPage {

    public CreateUserPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@id=\"firstname\"]")
    private WebElement firstnameTxt;

    @FindBy(xpath = ".//*[@id=\"lastname\"]")
    private WebElement lastnameTxt;

    @FindBy(xpath = ".//*[@id=\"email\"]")
    private WebElement emailTxt;

    @FindBy(xpath = ".//*[@id=\"password\"]")
    private WebElement passwordTxt;

    @FindBy(xpath = ".//*[@id=\"btnCreate\"]")
    private WebElement btnCreate;

    @FindBy(xpath = ".//*[@id=\"lnkLogo\"]")
    private WebElement lnkLogo;


    public void FillFirstName(String firstName)
    {
        firstnameTxt.clear();
        firstnameTxt.sendKeys(firstName);
    }

    public void FillLastName(String lastName)
    {
        lastnameTxt.clear();
        lastnameTxt.sendKeys(lastName);
    }

    public void FillEmail(String email)
    {
        emailTxt.clear();
        emailTxt.sendKeys(email);
    }

    public void FillPassword(String password)
    {
        passwordTxt.clear();
        passwordTxt.sendKeys(password);
    }

    public void ClikBottonCreateAccount()
    {
        btnCreate.click();
    }

    public boolean isLogoDisplayed() {
        return lnkLogo.isDisplayed();
    }

}

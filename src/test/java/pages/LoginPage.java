package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div/div/form/div/div[2]/div/div/div/input")
    private WebElement txtUserName;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div/div/form/div/div[3]/div/div/div[1]/input")
    private WebElement txtPassword;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div/div/form/button")
    private WebElement btnLogin;

    public boolean isLoginButtonDisplayed() {
        return btnLogin.isDisplayed();
    }

    public void Login(String userName, String password)
    {
        txtUserName.clear();
        txtUserName.sendKeys(userName);
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void ClickLogin()
    {
        btnLogin.submit();
    }


}

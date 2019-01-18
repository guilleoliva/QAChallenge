package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPage {

    public MasterPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//span[contains(text(),'Expire User Password')]")
    private WebElement expireUserBtn;

    @FindBy(xpath = ".//span[contains(text(),'Update Password')]")
    private WebElement updatePasswordBtn;

    @FindBy(xpath = ".//span[contains(text(),'Update Profile')]")
    private WebElement updateProfileBtn;

    @FindBy(xpath = ".//span[contains(text(),'Logout')]")
    private WebElement logoutBtn;

    @FindBy(xpath = ".//h3[contains(text(),'Logged In')]")
    private WebElement LoggedInText;

    public void ClickExpireUser()
    {
       expireUserBtn.click();
    }

    public void ClickUpdatePassword()
    {
        updatePasswordBtn.click();
    }

    public void ClickUpdateProfile()
    {
        updateProfileBtn.click();
    }


    public void pageTitleContains(String phrase) {

    }

    public void ClickLogout() throws InterruptedException {
            Thread.sleep (3000);
            logoutBtn.click();
    }

    public boolean isLoggedInDisplayed() throws InterruptedException {
        Thread.sleep (6000);
        return LoggedInText.isDisplayed();
    }

    public boolean isExpirePasswordDisplayed() {
        return expireUserBtn.isDisplayed();
    }

    public boolean isUpdatePasswordDisplayed() {
        return updatePasswordBtn.isDisplayed();
    }

    public boolean isUpdateProfileDisplayed() {
        return updateProfileBtn.isDisplayed();
    }

    public boolean isLogoutDisplayed() {
        return logoutBtn.isDisplayed();
    }
}

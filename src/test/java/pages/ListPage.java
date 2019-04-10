package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListPage {

    public ListPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@id=\"ContentPlaceHolder1_lnb_Continue\"]")
    private WebElement btnContinue;

    @FindBy(xpath = ".//*[@id=\"ContentPlaceHolder1_lblAddedKid\"]")
    private WebElement txtAddedKids;

    @FindBy(xpath = ".//*[@id=\"lnkLogo\"]")
    private WebElement lnkLogo;

    @FindBy(xpath = ".//*[@id=\"ContentPlaceHolder1_lnb_AddKid\"]")
    private WebElement btnAnotherKid;


    public boolean isLogoDisplayed() {
        return lnkLogo.isDisplayed();
    }

    public boolean isAddedKidTxtDisplayed() {
        return txtAddedKids.isDisplayed();
    }
    public void ClickContinue()
    {
        btnContinue.click();
    }

    public void ClickAnotherKid()
    {
        btnAnotherKid.click();
    }

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferPage {

    public OfferPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[3]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/button")
    private WebElement selectBtn;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/header/div/label")
    private WebElement menueBtn;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/header/div/nav/ul/li[2]/a")
    private WebElement logoutBtn;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[3]/div[1]/div/div[1]/div[1]/div[1]/div[2]/span[2]")
    private WebElement yourLoanAmount;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[3]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[3]/div/div")
    private WebElement yourAPR;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[3]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[1]")
    private WebElement yourLoanTerm;

    @FindBy(xpath = ".//html/body/div[1]/div/main/div/div[3]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div/span")
    private WebElement yourMonthlyPayment;

    @FindBy(xpath = ".//*[@id=\"root\"]/div/main/div/header/a/div/svg[3]")
    private WebElement upgradeImage;

    public void clickBtnSelect()
    {
        selectBtn.click();
    }

    public void clickBtnMenu()
    {
        menueBtn.click();
    }

    public void clickLogout()
    {
        logoutBtn.click();
    }

    public String getYourLoanAmount() {
        return yourLoanAmount.getText();
    }

    public String getYourAPR() {
        return yourAPR.getText();
    }

    public String getYourLoanTerm() {
        return yourLoanTerm.getText();
    }

    public String getYourMonthlyPayment () {
        return yourMonthlyPayment.getText();
    }

    public boolean isCelltrakImageDisplayed() {
        return upgradeImage.isDisplayed();
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddKidsPage {

    public AddKidsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@id=\"lnkLogo\"]")
    private WebElement lnkLogo;

    @FindBy(xpath = ".//*[@id=\"name\"]")
    private WebElement nameTxt;

    @FindBy(xpath = ".//html/body/form/div[3]/div[2]/div[2]/div[1]/div[1]/div/label/span[1]")
    private WebElement selectBtn;

    @FindBy(xpath = ".//*[@id=\"btnAddKid\"]")
    private WebElement btnAddKid;

    public void FillName(String name)
    {
        nameTxt.clear();
        nameTxt.sendKeys(name);
    }

    public boolean isLogoDisplayed() {
        return lnkLogo.isDisplayed();
    }

    public void ClickContinue()
    {
        btnAddKid.click();
    }

    public void ClickStorkOnWay()
    {
        selectBtn.click();
    }

}

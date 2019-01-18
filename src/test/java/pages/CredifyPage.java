package pages;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CredifyPage {

    public CredifyPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@id=\"loan-amount\"]")
    private WebElement loanAmount;

    @FindBy(xpath = ".//*[@id=\"loan-purpose-select\"]")
    private WebElement loanPurpose;

    @FindBy(xpath = ".//*[@id=\"loan-form-submit\"]")
    private WebElement checkRateBtn;

    public void loanAmount(String loanAm)
    {
        loanAmount.clear();
        loanAmount.sendKeys(loanAm);
    }

    public  void selectPurpose(String index) {
        Select drop = new Select(loanPurpose);
        drop.selectByVisibleText(index);
    }

    public void checkRate()
    {
        checkRateBtn.submit();
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class US603_Content extends Parent {

    public US603_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "tbody > tr input")
    public List<WebElement> payeeInformation;

    @FindBy(className = "button")
    public WebElement sendPaymentCl;

    @FindBy(linkText = "Bill Pay")
    public WebElement billPayBtn;

    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverviewBtn;

    @FindBy(xpath = "//a[starts-with(@href,'activity.htm?')]")
    public WebElement accountNumberCl;

    @FindBy(xpath = "//*[text()='See Account Activity for more details.']")
    public WebElement billPaymentValid;


}

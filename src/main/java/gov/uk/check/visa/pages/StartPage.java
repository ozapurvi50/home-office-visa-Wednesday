package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * StartPage - startNowButton locatores and create method 'void clickStartNow()'
 */
public class StartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement clickOnStart;
    public void clickStartNow(){
        Reporter.log("Click on Start Button " + clickOnStart.toString() + "<br>");
        clickOnElement(clickOnStart);
        CustomListeners.test.log(Status.PASS, "Click on start ");

    }
}

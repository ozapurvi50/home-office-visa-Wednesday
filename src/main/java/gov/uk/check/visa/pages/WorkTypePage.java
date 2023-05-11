package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * WorkTypePage - nextStepButton, selectJobtypeList locators and create methods  'void selectJobType(String job)'
 *   and 'void clickNextStepButton()'
 */
public class WorkTypePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement work;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void typeOfWork(){
        Reporter.log("Click on radio Button " + work.toString() + "<br>");
        clickOnElement(work);
        CustomListeners.test.log(Status.PASS, "Click on radio button");
    }

    public void clickOnContinue(){
        Reporter.log("Click on radio Button " + continueButton.toString() + "<br>");
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on continue button ");
    }
}

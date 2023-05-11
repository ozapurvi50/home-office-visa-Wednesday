package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * FamilyImmigrationStatusPage - nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
 *   (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
 */
public class FamilyImmigrationStatusPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickonContinue;

    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement radioButton;

    public void selectReasonForVisit1(String reason) {
        Reporter.log("Click on radio Button " + radioButton.toString() + "<br>");
        doClickOnElement(radioButton, reason);
        CustomListeners.test.log(Status.PASS, "Click on radio button ");
    }

    public void clickContinueButton() {
        Reporter.log("Click on Start Button ");
        clickOnElement(clickonContinue);
        CustomListeners.test.log(Status.PASS, "Click on start ");

    }
}

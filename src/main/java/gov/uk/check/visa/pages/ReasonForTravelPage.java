package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods  'void selectReasonForVisit(String reason)'
 * and  'void clickNextStepButton()'
 */
public class ReasonForTravelPage extends Utility {

    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement reasonForComing;

    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement reasonForComing1;

    @CacheLookup
    @FindBy(css = "#response-4")
    WebElement reasonForComing2;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickonContinue;

    public void selectReasonForVisit(String reason) {
        Reporter.log("Click on radio Button " + reasonForComing.toString() + "<br>");
        doClickOnElement(reasonForComing, reason);
        CustomListeners.test.log(Status.PASS, "Click on radio button ");
    }

    public void selectReasonForVisit1(String reason) {
        Reporter.log("Click on radio Button " + reasonForComing1.toString() + "<br>");
        doClickOnElement(reasonForComing1, reason);
        CustomListeners.test.log(Status.PASS, "Click on radio button ");
    }

    public void selectReasonForVisit2(String reason) {
        Reporter.log("Click on radio Button " + reasonForComing1.toString() + "<br>");
        doClickOnElement(reasonForComing2, reason);
        CustomListeners.test.log(Status.PASS, "Click on radio button ");
    }


    public void clickContinueButton() {
        Reporter.log("Click on Start Button ");
        clickOnElement(clickonContinue);
        CustomListeners.test.log(Status.PASS, "Click on start ");

    }


}






package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
 *   'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select moreOrLess stay) and
 *   'void clickNextStepButton()'
 */
public class DurationOfStayPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement stay;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void howLongIsStayRadioButton(){
        Reporter.log("Click on radio Button ");
        clickOnElement(stay);
        CustomListeners.test.log(Status.PASS, "Click on radio button ");
    }

    public void clickOnContinue(){
        Reporter.log("Click on Start Button ");
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on start ");
    }
}


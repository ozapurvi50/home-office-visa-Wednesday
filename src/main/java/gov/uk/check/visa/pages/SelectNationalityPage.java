package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create methods  'void selectNationality(String nationality)'
 * and 'void clickNextStepButton()'
 */
public class SelectNationalityPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement country;

    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueButton;

    public void selectNationality(String nationality) {
        Reporter.log("Select country " + country.toString() + "<br>");
        selectByVisibleTextFromDropDown(country, nationality);
        CustomListeners.test.log(Status.PASS, "Select nationality ");

    }

    public void clickOnContinueButton() {
        Reporter.log("Click on Continue " + continueButton.toString() + "<br>");
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on continue ");
    }
}

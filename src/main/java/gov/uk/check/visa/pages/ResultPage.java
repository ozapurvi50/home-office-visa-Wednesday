package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * ResultPage - resultMessage locator and create methods 'String getResultMessage()' and
 * 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
 */
public class ResultPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement gettext;

    public String getTextFromElement(){
        Reporter.log("Verify text " + gettext.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Verify Text ");
        return getTextFromElement(gettext);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement gettext1;

    public String getTextFromElement1(){
        Reporter.log("Verify text " + gettext.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Verify Text ");
        return getTextFromElement(gettext);
    }
}

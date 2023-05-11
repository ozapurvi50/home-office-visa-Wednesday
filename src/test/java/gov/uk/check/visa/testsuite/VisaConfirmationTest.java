package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {

    DurationOfStayPage durationOfStayPage;
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage result;
    WorkTypePage workTypePage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;

    @BeforeMethod
    public void inIt() {
        durationOfStayPage = new DurationOfStayPage();
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        result = new ResultPage();
        workTypePage = new WorkTypePage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void anAustralianComingToUKForTourism() {
        // Click on start button
        startPage.clickStartNow();
        // Select a Nationality 'Australia'
        selectNationalityPage.selectNationality("Australia");
        // Click on Continue button
        selectNationalityPage.clickOnContinueButton();
        // Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        // Click on Continue button
        reasonForTravelPage.clickContinueButton();
        // Verify result 'You will not need a visa to come to the UK'
        Assert.assertEquals(result.getTextFromElement(), "You will not need a visa to come to the UK", "Result not matched");


    }

    @Test(groups = {"smoke", "regression"})
    public void aChileanComingToTheUkForWorkAndPlanOnStayingForLongerThanSixMonths() {

        // Click on start button
        startPage.clickStartNow();
        // Select a Nationality 'Chile'
        selectNationalityPage.selectNationality("Chile");
        // Click on Continue button
        selectNationalityPage.clickOnContinueButton();
        // Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisit1("Work, academic visit or business ");
        // Click on Continue button
        reasonForTravelPage.clickContinueButton();
        // Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.howLongIsStayRadioButton();
        // Click on Continue button
        durationOfStayPage.clickOnContinue();
        // Select have planning to work for 'Health and care professional'
        workTypePage.typeOfWork();
        // Click on Continue button
        workTypePage.clickOnContinue();
        // verify result 'You need a visa to work in health and care'
        Assert.assertEquals(result.getTextFromElement(), "You need a visa to work in health and care", "Result not matched");


    }

    @Test(groups = {"sanity", "regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {

        //Click on start button
        startPage.clickStartNow();
        //Select a Nationality 'Congo'
        selectNationalityPage.selectNationality("Congo");
        //Click on Continue button
        selectNationalityPage.clickOnContinueButton();
        //Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectReasonForVisit2("Join partner or family for a long stay");
        //Click on Continue button
        reasonForTravelPage.clickContinueButton();
        //Select state My partner of family member have uk immigration status 'yes'
        familyImmigrationStatusPage.selectReasonForVisit1("Yes");
        //Click on Continue button
        familyImmigrationStatusPage.clickContinueButton();
        //verify result 'You’ll need a visa to join your family or partner in the UK'
        Assert.assertEquals(result.getTextFromElement(), "You’ll need a visa to join your family or partner in the UK", "Result not matched");


    }
}

package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]")
    WebElement verifySysUser;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement enterN;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[1]")
    WebElement userRoleDropDown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement adminInUserDropDown;

    //Add empplyoee name

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectS;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Disabled')]")
    WebElement disabled;


    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'-- Select --')]")
    WebElement clickSButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Disabled')]")
    WebElement clickOnStatusForMethood2;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;

    //reset
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]")
    WebElement resetTab;

    //verify message "record found"
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]")
    WebElement recordFound;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement enterUserName1;
    //
//    @CacheLookup
//    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[1]")
//    WebElement enterUserRole;
//
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement emplyoeeName1;
//
//    @CacheLookup
//    @FindBy(xpath = "//div[contains(text(),'-- Select --')]")
//    WebElement status1;


    //--------for data set
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Enabled')]")
    WebElement clickOnStatusForMethood3;

    //------for data set----STATUS
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement statusClicking;

    public String verifySystemUsers() {
        Reporter.log("Verify System User" + verifySysUser.toString());
        CustomListeners.test.log(Status.PASS, "Verify System User");
        return getTextFromElement(verifySysUser);

    }

    public void enterUserNameOnVerify() {
        sendTextToElement(enterN, "pas1111");
        Reporter.log("Enter User Name Verification" + enterN.toString());
        CustomListeners.test.log(Status.PASS, "Enter User Name Verification");
    }

    public void clickOnUserRoleDropDown() {
        mouseHoverToElementAndClick(userRoleDropDown);
        Reporter.log("Click on user role " + userRoleDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Click on user role " + userRoleDropDown.toString());
    }

    public void cLickOnAdminRole() {
        clickOnElement(adminInUserDropDown);
        Reporter.log("Click on admin role " + adminInUserDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Click on admin role " + adminInUserDropDown.toString());
    }


    public void selectStatus() {
        mouseHoverToElementAndClick(selectS);
        Reporter.log("Select status" + selectS.toString());
        CustomListeners.test.log(Status.PASS, "Select Status");
    }

    public void clickOnDisabled() {
        clickOnElement(disabled);
        Reporter.log("Click on disabled" + disabled.toString());
        CustomListeners.test.log(Status.PASS, "Click on disabled");

    }

    public void clickOnStatusButton() {
        //  clickOnElement(clickSButton);
        mouseHoverToElementAndClick(clickSButton);
        Reporter.log("Click on status button" + clickSButton.toString());
        CustomListeners.test.log(Status.PASS, "click on status button");

    }

    public void clickOnStatusButtonOnForAdminUserManagement() {
        mouseHoverToElementAndClick(clickOnStatusForMethood2);
        Reporter.log("Click on status button" + clickOnStatusForMethood2.toString());
        CustomListeners.test.log(Status.PASS, "click on status button");

    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
        Reporter.log("Click on search button" + searchButton.toString());
        CustomListeners.test.log(Status.PASS, "click on search button");
    }

    public void clickOnResetTab() {
        clickOnElement(resetTab);
        Reporter.log("Click on reset tab" + resetTab.toString());
        CustomListeners.test.log(Status.PASS, "click on reset tab");

    }

    public String verifyRecordFound() {
        Reporter.log("Verify record found" + recordFound.toString());
        CustomListeners.test.log(Status.PASS, "verify record found");
        return getTextFromElement(recordFound);

    }

    //-------for data set
    public void enterTheUserName1(String username1) {

        sendTextToElement(enterUserName1, username1);
        Reporter.log("enter username" + enterUserName1.toString());
        CustomListeners.test.log(Status.PASS, "enter username");
    }

    //------for data set
    public void enterTheStatusForDataSet() {
        mouseHoverToElementAndClick(clickOnStatusForMethood3);
        Reporter.log("enter the status" + clickOnStatusForMethood3.toString());
        CustomListeners.test.log(Status.PASS, "enter the status");
    }

    //----for data set -click on Status
    public void clickOnStatusToClick() {
        clickOnElement(statusClicking);
        Reporter.log("click on status" + statusClicking.toString());
        CustomListeners.test.log(Status.PASS, "click on status");
    }


    //----for data set----enter the employee name
    public void enterTheEmployeeName1(String employeeName1) {
        sendTextToElement(emplyoeeName1, employeeName1);


        Reporter.log("enter the employee name" + emplyoeeName1.toString());
        CustomListeners.test.log(Status.PASS, "enter the employee name");


    }

}
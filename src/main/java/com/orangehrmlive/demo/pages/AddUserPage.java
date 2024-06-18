package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddUserPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")
    WebElement clickButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]")
    WebElement vAddUser;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
    WebElement clickDDown;

    @CacheLookup
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > span:nth-child(1)")
    WebElement clickOnAdmin;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement enterName;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")
    WebElement enterUName;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement enterPword;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement enterCPword;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
    WebElement clickOnSButton;


    public void clickOnAddButton() {
        clickOnElement(clickButton);
        Reporter.log("click on add button " + clickButton.toString());
        CustomListeners.test.log(Status.PASS, "click on add button");

    }


    public String verifyAddUser() {
        Reporter.log("Verify add user" +vAddUser.toString());
        CustomListeners.test.log(Status.PASS,"Verify add user");
        return getTextFromElement(vAddUser);

    }

    public void clickOnDropDownMenu() {
        clickOnElement(clickDDown);
        Reporter.log("click on drop down menu"+clickDDown.toString());
        CustomListeners.test.log(Status.PASS,"click on drop down menu");

    }

    public void selectAdminButtom() {
        selectByValueFromDropDown(clickOnAdmin, "1");
        Reporter.log("select admin button" +clickOnAdmin.toString());
        CustomListeners.test.log(Status.PASS,"select admin button");

    }

    public void enterEmplyoeeName() {
        sendTextToElement(enterName, "Ananya Dash");
        Reporter.log("enter Employee name "+enterName.toString());
        CustomListeners.test.log(Status.PASS,"enter employee name");


    }

    public void enterTheUserName() {
        sendTextToElement(enterUName, "manish");
        Reporter.log("enter username "+enterUName.toString());
        CustomListeners.test.log(Status.PASS,"enter username");
    }

    public void enterThePassword() {
        sendTextToElement(enterPword, "hello123");
        Reporter.log("enter the password "+enterPword.toString());
        CustomListeners.test.log(Status.PASS,"enter the password");
    }

    public void enterTheConfirmPassword() {
        sendTextToElement(enterCPword, "hello123");
        Reporter.log("enter the confirm password"+enterCPword.toString());
        CustomListeners.test.log(Status.PASS,"enter the confirm password");

    }

    public void clickOnSaveButton() {
        clickOnElement(clickOnSButton);
        Reporter.log("Click on Save Button"+clickOnSButton.toString());
        CustomListeners.test.log(Status.PASS,"click on Save Button");

    }


}


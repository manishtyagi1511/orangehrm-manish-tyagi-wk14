package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    //LOcators

    @CacheLookup
    @FindBy(name = "username")
    WebElement userName;

    //By userName=By.name("username");
    @CacheLookup
    @FindBy(name = "password")
    WebElement passWord;

    //  By passWord = By.name("password");

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    // By loginButton = By.xpath("//button[normalize-space()='Login']");


    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement verifyDashboardMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
    WebElement clickOnPLogo;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement mHoover;

    @CacheLookup
    @FindBy(css = ".oxd-text.oxd-text--h5.orangehrm-login-title")
    WebElement verifyLoginPanel;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    WebElement errorMessage1;


    public void enterUserName(String usernameText) {
        sendTextToElement(userName, usernameText);
        Reporter.log("enter the username" + userName.toString());
        CustomListeners.test.log(Status.PASS, "enter the username");

    }

    public void enterThePassword(String passwordText) {
        sendTextToElement(passWord, passwordText);
        Reporter.log("enter the password" + passWord.toString());
        CustomListeners.test.log(Status.PASS, "enter the password");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        Reporter.log("Clicking on Login Link " + loginButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on Login Link");

    }

    public String verifyWelcomeMessage() {
        Reporter.log("Verify welcome message" + verifyDashboardMessage.toString());
        CustomListeners.test.log(Status.PASS, "Verify Welcome Message");
        return getTextFromElement(verifyDashboardMessage);

    }

    public void clickOnProfilLogo() {
        clickOnElement(clickOnPLogo);
        Reporter.log("Click on profile Logo" + clickOnPLogo.toString());
        CustomListeners.test.log(Status.PASS, "Click on Profile Logo");

    }

    public void mouseHooverAndClickOnLogout() {
        mouseHoverToElementAndClick(mHoover);
        Reporter.log("Click on LogOut" + mHoover.toString());
        CustomListeners.test.log(Status.PASS, "Click on Logout");
    }

    public String verifyLoginPanelDisplayed() {
        Reporter.log("Verify Login Panel Displayed" + verifyLoginPanel.toString());
        CustomListeners.test.log(Status.PASS, "Verify Login Panel Displayed");
        return getTextFromElement(verifyLoginPanel);

    }

    public String errorMessageVerification() {
        Reporter.log("Verification error message" + errorMessage1.toString());
        CustomListeners.test.log(Status.PASS, "Verification error message");
        return getTextFromElement(errorMessage1);

    }


}

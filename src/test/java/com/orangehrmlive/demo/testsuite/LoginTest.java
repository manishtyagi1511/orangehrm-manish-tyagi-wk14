package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class LoginTest extends BaseTest {
    //object creation
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterThePassword("admin123");
        loginPage.clickOnLoginButton();

        //Verify "Dashboard" Message
        Assert.assertEquals(loginPage.verifyWelcomeMessage(), "Dashboard", "Text is not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheLogoDisplayOnHomePage() {
        //Login To The application
        loginPage.enterUserName("Admin");
        loginPage.enterThePassword("admin123");
        loginPage.clickOnLoginButton();
        //
        dashboardPage.verifyLogoDisplayed();

    }

    @Test(groups = "regression")
    public void verifyUserShouldLogOutSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterThePassword("admin123");
        loginPage.clickOnLoginButton();
        loginPage.clickOnProfilLogo();
        loginPage.mouseHooverAndClickOnLogout();
        Assert.assertEquals(loginPage.verifyLoginPanelDisplayed(), "Login", "Text is not displayed");

    }


    @Test(dataProvider = "LoginTest", dataProviderClass = TestData.class,groups = "regression")
    public void verifyErrorMessageWithInvalidCredentials(String username, String password, String errorMessage) throws InterruptedException {
        loginPage.enterUserName(username);
        loginPage.enterThePassword(password);
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        //   Assert.AsserEquals(loginPage.getErrorMessage(),errorMessage);
        //Assert.assertEquals(loginPage.errorMessageVerification(),errorMessage,"Text is not verified");

    }
}




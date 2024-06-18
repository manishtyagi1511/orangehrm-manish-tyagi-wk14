package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class UsersTest extends BaseTest {

    AddUserPage addUserPage;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ViewSystemUsersPage viewSystemUsersPage;


    @BeforeMethod(alwaysRun = true)
    public void inIT() {

        addUserPage = new AddUserPage();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        viewSystemUsersPage = new ViewSystemUsersPage();


    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void adminShouldAddUserSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterThePassword("admin123");
        loginPage.clickOnLoginButton();
        dashboardPage.clickOnAdmin();
        Assert.assertEquals(viewSystemUsersPage.verifySystemUsers(), "System Users", "Text is not displayed");
        addUserPage.clickOnAddButton();
        Assert.assertEquals(addUserPage.verifyAddUser(), "Add User", "Text is not displayed");

        viewSystemUsersPage.clickOnUserRoleDropDown();
        viewSystemUsersPage.cLickOnAdminRole();

        addUserPage.enterEmplyoeeName();
        addUserPage.enterTheUserName();

        viewSystemUsersPage.selectStatus();
        viewSystemUsersPage.clickOnDisabled();


        addUserPage.enterThePassword();
        addUserPage.enterTheConfirmPassword();
        addUserPage.clickOnSaveButton();

        //Verify message -Save Successfully

    }

    @Test(groups = {"smoke", "regression"})
    public void searchTheUserCreatedAndVerifyIt() {
        loginPage.enterUserName("Admin");
        loginPage.enterThePassword("admin123");
        loginPage.clickOnLoginButton();

        dashboardPage.clickOnAdmin();

        Assert.assertEquals(viewSystemUsersPage.verifySystemUsers(), "System Users", "Text is not displayed");

        viewSystemUsersPage.enterUserNameOnVerify();
        viewSystemUsersPage.clickOnUserRoleDropDown();
        viewSystemUsersPage.cLickOnAdminRole();
        //click on select status
        viewSystemUsersPage.clickOnStatusButton();
        viewSystemUsersPage.clickOnStatusButtonOnForAdminUserManagement();

        //click on search button
        // viewSystemUsersPage.clickOnSearchButton();
    }

    @Test(groups = "regression")
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterThePassword("admin123");
        loginPage.clickOnLoginButton();
        dashboardPage.clickOnAdmin();
        Assert.assertEquals(viewSystemUsersPage.verifySystemUsers(), "System Users", "Text is not displayed");
        viewSystemUsersPage.enterUserNameOnVerify();
        viewSystemUsersPage.clickOnUserRoleDropDown();
        viewSystemUsersPage.cLickOnAdminRole();
        //click on select status
        viewSystemUsersPage.clickOnStatusButton();
        viewSystemUsersPage.clickOnStatusButtonOnForAdminUserManagement();
        // click on Search Button
        viewSystemUsersPage.clickOnSearchButton();

        //Verify the user should be in Result List

        //Click on Check Box

        // Click on Delete Button
        //Popup will display
        //Click on Ok Button on Popup
        //verify message "Successfully Deleted
    }

    @Test(dataProvider = "UsersTest", dataProviderClass = TestData.class,groups = "regression")
    public void searchTheUserAndVerifyTheMessageRecordFound(String userName2, String userRole, String employeeName, String Status) {
        loginPage.enterUserName("Admin");
        loginPage.enterThePassword("admin123");
        loginPage.clickOnLoginButton();
        dashboardPage.clickOnAdmin();
        Assert.assertEquals(viewSystemUsersPage.verifySystemUsers(), "System Users", "Text is not displayed");

        //Data set Username
        viewSystemUsersPage.enterTheUserName1(userName2);

        //Data set userRole
        viewSystemUsersPage.clickOnUserRoleDropDown();
        viewSystemUsersPage.cLickOnAdminRole();


        //Data set emplyoee name
        viewSystemUsersPage.enterTheEmployeeName1(employeeName);

        //Data set for Status
        viewSystemUsersPage.clickOnStatusToClick();
        //driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
        // to enable the status
        viewSystemUsersPage.enterTheStatusForDataSet();
        // click on Search Button
        viewSystemUsersPage.clickOnSearchButton();

        //verify message "(1) Record Found"
        Assert.assertEquals(viewSystemUsersPage.verifyRecordFound(),"(5) Records Found","Text is not displayed");

        //Verify username <username>


        //Click on Reset Tab
        viewSystemUsersPage.clickOnResetTab();

    }

}

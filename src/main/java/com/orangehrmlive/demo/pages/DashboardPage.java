package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DashboardPage extends Utility {

    //Verify LOgo
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[1]/a[1]/div[2]/img[1]")
    WebElement verifyLogo;

    //Click on Admin
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
    WebElement clickOnAdm;





    public void verifyLogoDisplayed() {
        verifyLogo.isDisplayed();
        Reporter.log("verify logo displayed"+verifyLogo.toString());
        CustomListeners.test.log(Status.PASS,"verified logo displayed");
    }

    public void clickOnAdmin(){
        clickOnElement(clickOnAdm);
        Reporter.log("click on Admin"+clickOnAdm.toString());
        CustomListeners.test.log(Status.PASS,"click on Admin");
    }
}

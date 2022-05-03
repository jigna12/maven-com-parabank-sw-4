package com.parabank.testsuite;

import com.parabank.pages.LoginPage;
import com.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginpage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginpage.enterusername("PrimeTesting");
        loginpage.enterpassword("prime123");
        loginpage.clickOnLoginButton();
        String expectedErrorMessage = "Accounts Overview";
        String actualErrorMessage = loginpage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message displayed");
    }
    @Test
    public void verifyTheErrorMessage() {
        loginpage.enterusername("");
        loginpage.enterpassword("Patel123");
        loginpage.clickOnLoginButton();
        String expectedErrorMessage = "Please enter a username and password.";
        String actualErrorMessage = loginpage.getErrorMessage1();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message displayed");
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        loginpage.enterusername("PrimeTesting");
        loginpage.enterpassword("prime123");
        loginpage.clickOnLoginButton();
        loginpage.clickOnLogOut();
        String expectedErrorMessage = "Customer Login";
        String actualErrorMessage = loginpage.getErrorMessage2();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message displayed");
    }
    }

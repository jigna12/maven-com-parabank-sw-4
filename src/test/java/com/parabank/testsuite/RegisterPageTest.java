package com.parabank.testsuite;

import com.parabank.pages.RegisterPage;
import com.parabank.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase{
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        registerPage.clickonRegisterLink();
        registerPage.firstnamefield("Mina Patel");
        registerPage.lastnamefield("Patel123");
        registerPage.addressfield("Harrow Close");
        registerPage.cityfield("Watford");
        registerPage.statefield("Hertfordshire");
        registerPage.zipcodefield("WD20 6TZ");
        registerPage.phonefield("0790797896");
        registerPage.SSNfield("AA-12-34-56-B");
        registerPage.usernamefield("Mina Patel");
        registerPage.passwordfield("Patel123");
        registerPage.confirmpasswordfield("Patel123");
        registerPage.clickOnregisterButton();
        String expectedErrorMessage = "Your account was created successfully. You are now logged in.";
        String actualErrorMessage = registerPage.verifyTheLoginMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message displayed");
    }
}

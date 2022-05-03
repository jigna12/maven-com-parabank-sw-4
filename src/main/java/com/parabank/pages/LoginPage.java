package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.xpath("//input[@type='text']");//Enter valid username
    By passwordField = By.xpath("//input[@type='password']");//Enter valid password
    By loginButton = By.xpath("//input[@type='submit']");//Click on ‘LOGIN’ button
    By verifyText = By.xpath("//h1[@class='title']");//Verify the ‘Accounts Overview’ text is display
    By verifyText1 = By.xpath("//p[@class='error']");//Verify the error message ‘The username and password could not be verified.
    By logout = By.xpath("//a[contains(text(),'Log Out')]");//Click on ‘Log Out’ link
    By verifyText2 = By.xpath("//h2[contains(text(),'Customer Login')]");//Verify the text ‘Customer Login

    public void enterusername(String username)
    {
        sendTextToElement(usernameField,username);
    }
    public void enterpassword(String password)
    {
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton()
    {
        clickOnElement(loginButton);
    }
    public String getErrorMessage()
    {
        return getTextFromElement(verifyText);
    }
    public String getErrorMessage1()
    {
        return getTextFromElement(verifyText1);
    }
    public void clickOnLogOut()
    {
        clickOnElement(logout);
    }
    public String getErrorMessage2()
    {
        return getTextFromElement(verifyText2);
    }

}

package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility{
    By registerLink = By.linkText("Register");//click on the ‘Register’ link
    By firstname1 = By.id("customer.firstName");//Enter First name
    By lastname1 = By.id("customer.lastName");//Enter Last name
    By addres = By.id("customer.address.street");//Enter Address
    By city1 = By.id("customer.address.city");//Enter City
    By state1 = By.id("customer.address.state");//Enter State
    By zipcode1 = By.id("customer.address.zipCode");//Enter Zip Code
    By phone1 = By.id("customer.phoneNumber");//Enter Phone
    By ssn1 = By.id("customer.ssn");//Enter SSN
    By username1 = By.id("customer.username");//Enter Username
    By password1 = By.id("customer.password");//Enter Password
    By confirm1 = By.id("repeatedPassword");//Enter Confirm
    By registerButton = By.xpath("//tbody/tr[13]/td[2]/input[1]");//Click on REGISTER button
    By verifyText1 = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");//Verify the text 'Your account was created successfully. You are now logged in.

    public void clickonRegisterLink(){
        clickOnElement(registerLink);
    }
    public void firstnamefield(String firstname){
        sendTextToElement(firstname1,firstname);
    }
    public void lastnamefield(String lastname) {
        sendTextToElement(lastname1, lastname);
    }
    public void addressfield(String address) {
        sendTextToElement(addres, address);
    }
    public void cityfield(String city) {
        sendTextToElement(city1, city);
    }
    public void statefield(String state) {
        sendTextToElement(state1, state);
    }
    public void zipcodefield(String zipcode) {
        sendTextToElement(zipcode1, zipcode);
    }
    public void phonefield(String phone) {
        sendTextToElement(phone1, phone);
    }
    public void SSNfield(String ssn) {
        sendTextToElement(ssn1, ssn);
    }
    public void usernamefield(String username) {
        sendTextToElement(username1, username);
    }
    public void passwordfield(String password) {
        sendTextToElement(password1, password);
    }
    public void confirmpasswordfield(String confirmpassword) {
        sendTextToElement(confirm1, confirmpassword);
    }
    public void clickOnregisterButton(){
        clickOnElement(registerButton);
    }
    public String verifyTheLoginMessage(){
        return getTextFromElement(verifyText1);
    }
}


package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ap_customer_name")
    WebElement nameField;
    @FindBy(id = "ap_email")
    WebElement emailField;
    @FindBy(id = "ap_password")
    WebElement passwordField;

    @FindBy(id = "ap_password_check")
    WebElement confirmPasswordField;

    @FindBy(id = "continue")
    WebElement continueButton;



    public void enterName(String name){
        sendTextToElement(nameField,name);
    }
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String pass){
        sendTextToElement(passwordField,pass);
    }
    public void confirmPassword(String confpass){
        sendTextToElement (confirmPasswordField,confpass);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}

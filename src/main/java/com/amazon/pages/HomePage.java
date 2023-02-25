package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "sp-cc-accept")
    WebElement acceptButton;
    @FindBy(xpath = "//div[@id='nav-tools']/a[2]")
    WebElement signIn;
    @FindBy(xpath = "//span[@id='auth-create-account-link']/span/a")
    WebElement registerLink;
    public void clickOnAcceptButton(){
        clickOnElement(acceptButton);
    }
    public void clickOnSignIn(){
        clickOnElement(signIn);
    }
    public void clickOnRegister(){
        clickOnElement(registerLink);
    }

}

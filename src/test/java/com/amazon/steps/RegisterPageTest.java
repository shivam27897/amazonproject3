package com.amazon.steps;

import com.amazon.pages.HomePage;
import com.amazon.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegisterPageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new HomePage().clickOnAcceptButton();
    }

    @When("^I click on sign in$")
    public void iClickOnSignIn() {
        new HomePage().clickOnSignIn();
    }

    @And("^I click on register$")
    public void iClickOnRegister() {
        new HomePage().clickOnRegister();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }

    @And("^I enter name \"([^\"]*)\"$")
    public void iEnterName(String name) {
        new RegisterPage().enterName(name);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email ){
        new RegisterPage().enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password){
        new RegisterPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmpassword) {
        new RegisterPage().confirmPassword(confirmpassword);
    }
}
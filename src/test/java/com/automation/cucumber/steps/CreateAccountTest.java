package com.automation.cucumber.steps;

import com.automation.pages.CreateAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CreateAccountTest {
    @And("^User enter email for registration$")
    public void userEnterEmailForRegistration() {
        new CreateAccountPage().enterEmailBeforeCreate();
    }

    @And("^User click on create account link$")
    public void userClickOnCreateAccountLink() {
        new CreateAccountPage().clickOnCreateAccount();
    }

    @And("^User fill personal information form <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\">$")
    public void userFillPersonalInformationForm(String firstname, String lastname, String password) {
        new CreateAccountPage().fillPersonalInformationForm(firstname, lastname, password);
    }

    @And("^User fill address details <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\">$")
    public void userFillAddressDetails(String addLine, String city, String state, String zip, String country, String mobile, String addAlias) {
        new CreateAccountPage().fillYourAddressDetails(addLine, city, state, zip, country, mobile, addAlias);
    }

    @And("^User click on register button$")
    public void userClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }

    @Then("^User should create account successfully and get <\"([^\"]*)\"> text$")
    public void userShouldCreateAccountSuccessfullyAndGetText(String msg) {
        String exp = msg;
        String actual = new CreateAccountPage().verifyMyAccountText();
        Assert.assertEquals(exp, actual);
    }
}

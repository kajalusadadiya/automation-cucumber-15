package com.automation.cucumber.steps;

import com.automation.pages.SignInPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WomenCategorySteps {
    @When("^User click on women tab$")
    public void userClickOnWomenTab() {
        new SignInPage().clickOnWomenTab();
    }

    @Then("^User should successfully navigate to women category page and verify <\"([^\"]*)\">$")
    public void userShouldSuccessfullyNavigateToWomenCategoryPageAndVerify(String verify) {
        String exp = verify;
        String act = new WomenCategoryPage().verifyWomenText();
        Assert.assertEquals(exp, act);
    }

    @And("^User click on the product \"([^\"]*)\"$")
    public void userClickOnTheProduct(String product) {
        new WomenCategoryPage().setSelectProduct(product);
    }

    @And("^User change quantity \"([^\"]*)\"$")
    public void userChangeQuantity(String qty) {
        new WomenCategoryPage().selectQty(qty);
    }

    @And("^User select size \"([^\"]*)\"$")
    public void userSelectSize(String size) {
        new WomenCategoryPage().setSelectSize(size);
    }

    @And("^User select colour \"([^\"]*)\"$")
    public void userSelectColour(String color) {
        new WomenCategoryPage().setSelectColour(color);
    }

    @And("^User click on Add To Cart Button$")
    public void userClickOnAddToCartButton() {
        new WomenCategoryPage().setAddToCartButton();
    }

    @And("^Click on X button and close the popup$")
    public void clickOnXButtonAndCloseThePopup() {
    }

    @Then("^Verify the message <\"([^\"]*)\">$")
    public void verifyTheMessage(String expText) {
        String exp = expText;
        String act = new WomenCategoryPage().verifyPopUpMsg();
    }
}

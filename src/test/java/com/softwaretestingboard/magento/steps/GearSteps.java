package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GearSteps {
    @Given("I am on HomePage")
    public void iAmOnHomePage() {
    }

    @When("Mouse Hover On Gear Menu")
    public void mouseHoverOnGearMenu() {
        new GearPage().mouseHooverOnGearMenu();
    }

    @And("Clicks on Bags")
    public void clicksOnBags() {
        new GearPage().clickOnBags();
    }

    @And("Click on product Over Night Duffle")
    public void clickOnProductOverNightDuffle() {
        new GearPage().clickOnProductNameOvernightDuffle();
    }

    @Then("User should see error Message of Product {string}")
    public void userShouldSeeErrorMessageOfProduct(String erroMessage) {
        Assert.assertEquals("",erroMessage,new GearPage().getTextOvernightDuffle());
    }

    @And("Change Quantity")
    public void changeQuantity() {
        new GearPage().changeQuantity();
    }

    @And("ClickAdd to Cart")
    public void clickaddToCart() {
        new GearPage().clickAddToCart();
    }

    @Then("User should see error Message Shopping Cart {string}")
    public void userShouldSeeErrorMessageShoppingCart(String errorMessage1) {
        Assert.assertEquals("",errorMessage1,new GearPage().getTextToVerifyText());
    }

    @And("Click on Shopping Cart")
    public void clickOnShoppingCart() {
        new GearPage().clickOnShoppingCart();
    }

    @Then("User should see error Message check Product {string}")
    public void userShouldSeeErrorMessageCheckProduct(String Producterror) {
        Assert.assertEquals("",Producterror,new GearPage().getTextToVerifyOvernightDuffleInTheCart());
    }

    @Then("User Should see error Message check quantity {string}")
    public void userShouldSeeErrorMessageCheckQuantity(String quantity) {
        Assert.assertEquals("Please see Here",quantity,new GearPage().getTextToVerifyQuantityInTheCart());

    }

    @Then("User should see error Message Check prise {string}")
    public void userShouldSeeErrorMessageCheckPrise(String Prise) {
        Assert.assertEquals("",Prise,new GearPage().getTextToVerifyTotalAmountInTheCart());
    }

    @And("User should change quantity {string}")
    public void userShouldChangeQuantity(String changeQuantity) {
       new GearPage().changeTheQuantity(changeQuantity);
    }

    @And("Click On Update quantity")
    public void clickOnUpdateQuantity() {
        new GearPage().clickOnUpdateShoppingCart();
    }

    @Then("User should see error Prise check {string}")
    public void userShouldSeeErrorPriseCheck(String priseCheck) {
        Assert.assertEquals("",priseCheck,new GearPage().getTextToVerifyTotalAmountInTheCartAfterUpdatingQty());
    }
}

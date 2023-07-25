package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.MenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenSteps {
    @Given("User should on Home Page")
    public void userShouldOnHomePage() {
    }

    @When("Mouse Hover on Men Menu")
    public void mouseHoverOnMenMenu() {
        new MenPage().mouseHoverOnElementMen();
    }

    @And("Mouse Hover On Bottom")
    public void mouseHoverOnBottom() {
        new MenPage().mouseHoverOnElementBottom();
    }

    @And("Click on Pants")
    public void clickOnPants() {
        new MenPage().clickOnElementPants();
    }

    @And("Click on Particular Pant {string}")
    public void clickOnParticularPant(String pant) {
        new MenPage().mouseHoverOnElementCronusYogaPant(pant);
    }

    @And("Click on Pant Size {string}")
    public void clickOnPantSize(String size) {
        new MenPage().mouseHooverOnCronusYogaPantAndClickOnSize32(size);
    }

    @And("Click on Pant and Choose color Black")
    public void clickOnPantAndChooseColorBlack() {
        new MenPage().mouseHooverOnCronusYogaPantAndClickColourBlack();
    }

    @And("Click on Add to Cart")
    public void clickOnAddToCart() {
        new MenPage().mouseHooverOnCronusYogaPantAndClickAddToCart();
    }

    @Then("User should see error Message {string}")
    public void userShouldSeeErrorMessage(String shopincart) {
        new MenPage().getTextCronusYogaPantToYourShoppingCart(shopincart);
    }

    @And("Click on Shopping Cart Link")
    public void clickOnShoppingCartLink() {
        new MenPage().clickOnShoppingCartLink();
    }

    @Then("User should see error Message for shopping cart {string}")
    public void userShouldSeeErrorMessageForShoppingCart(String scart) {
        new MenPage().getTextShoppingCartMessage(scart);

    }

    @Then("User should see error Message for Pant {string}")
    public void userShouldSeeErrorMessageForPant(String product) {
        new MenPage().getTextProductName(product);
    }

    @Then("User should see error Message for color {string}")
    public void userShouldSeeErrorMessageForColor(String color) {
        new MenPage().getTextColorMessage(color);
    }
}

package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearPage extends Utility
{
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public GearPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    WebElement bags;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement productDuffle;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement  overnightDuffle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-success success message']")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement verifyProductInTheCart;

    @CacheLookup
    @FindBy(xpath = "//input[@id='cart-266515-qty']")
    WebElement qtyInTheCart;

    @CacheLookup
    @FindBy(xpath = "//span[@data-bind='text: getValue()'][normalize-space()='$135.00']")
    WebElement TotalAmount;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;

   @CacheLookup
   @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
   WebElement updatedPrise;






    public void mouseHooverOnGearMenu() {
        mouseHoverToElement(gearMenu);

    }
    public void clickOnBags() {
        mouseHoverToElement(bags);
        //mouseHoverToElementAndClick(bags);
        clickOnElement(bags);
    }

    public void clickOnProductNameOvernightDuffle() {
        clickOnElement(productDuffle);

    }
    public String getTextOvernightDuffle() {
        return getTextFromElement(overnightDuffle);
    }

    public void changeQuantity() {
       qty.clear();

        sendTextToElement(qty, "3");
    }

    public void clickAddToCart() {
        clickOnElement(addToCart);
    }

    public String getTextToVerifyText() {
        return getTextFromElement(verifyText);

    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String getTextToVerifyOvernightDuffleInTheCart() {
        return getTextFromElement(verifyProductInTheCart);
    }

    public String getTextToVerifyQuantityInTheCart() {
        return getTextFromElement(qtyInTheCart);
    }

    public String getTextToVerifyTotalAmountInTheCart() {
        return getTextFromElement(TotalAmount);
    }

    //Change Qty to ‘5’

    public void changeTheQuantity(String changeqty){
        qtyInTheCart.clear();
        sendTextToElement(qtyInTheCart,"5");
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);

    }

    // * Verify the product price ‘$225.00

    public String getTextToVerifyTotalAmountInTheCartAfterUpdatingQty() {
        return getTextFromElement(updatedPrise);
    }
}
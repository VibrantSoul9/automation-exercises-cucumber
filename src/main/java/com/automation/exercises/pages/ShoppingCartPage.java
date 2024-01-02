package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//li[@class='active']")
    WebElement shoppingCartWelcomeText;
    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckoutButton;
    @CacheLookup
    @FindBy (xpath = "//i[@class='fa fa-times']")
    WebElement crossButtonAcrossProductToRemove;
    @CacheLookup
    @FindBy (xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLoginLinkOnCheckoutPopup;
    @CacheLookup
    @FindBy (xpath = "//td[@class = 'cart_quantity']/button")
    WebElement quantity;
    @CacheLookup
    @FindBy (xpath = "//td[@class = 'cart_description']/h4/a")
    List<WebElement> cartProductList;
    @CacheLookup
    @FindBy (xpath = "//td[@class = 'cart_price']/p")
    List<WebElement> cartPriceList;
    @CacheLookup
    @FindBy (xpath = "//td[@class = 'cart_quantity']/button")
    List<WebElement> cartQuantityList;
    @CacheLookup
    @FindBy (xpath = "//td[@class = 'cart_total']/p")
    List<WebElement> cartTotalPriceList;

    public String getShoppingCartWelcomeText() {
        log.info("Getting welcome text from shopping cart page : " + shoppingCartWelcomeText.toString());
        return getTextFromElement(shoppingCartWelcomeText);
    }
    public void clickOnProceedToCheckoutButton() {
        clickOnElement(proceedToCheckoutButton);
        log.info("Clicking on proceed to checkout button : " + proceedToCheckoutButton.toString());
    }
    public void clickOnCrossButtonAcrossProductToRemove() {
        clickOnElement(crossButtonAcrossProductToRemove);
        log.info("Clicking on cross button to remove the product from cart : " + crossButtonAcrossProductToRemove.toString());
    }
    public void clickOnRegisterLoginLinkOnCheckoutPopup() {
        clickOnElement(registerLoginLinkOnCheckoutPopup);
    }
    public String getQuantity() {
        log.info("Getting quantity from shopping cart page : " +quantity.toString());
        return getTextFromElement(quantity);
    }
    public String getProductNameFromCart(String pName) {
        for (WebElement p : cartProductList) {
            if(p.getText().equalsIgnoreCase(pName)) {
                log.info("Getting " + pName + " from shopping cart : " + cartProductList.toString());
                return pName;
            }
        }
        return "Product Not Found";
    }
}

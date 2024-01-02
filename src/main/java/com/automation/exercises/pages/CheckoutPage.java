package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());
    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='Address Details']")
    WebElement addressDetailsText;
    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewYourOrderText;
    @CacheLookup
    @FindBy (xpath = "//textarea[@name='message']")
    WebElement commentArea;
    @CacheLookup
    @FindBy (xpath = "//a[contains(text() , 'Place Order')]")
    WebElement placeOrderButton;
    @CacheLookup
    @FindBy (xpath = "//ul[@id = 'address_delivery']/li[4]")
    WebElement deliveryAddress;
    @CacheLookup
    @FindBy (xpath = "//ul[@id = 'address_invoice']/li[4]")
    WebElement billingAddress;

    public String verifyTextOnCheckoutPage(String text) {
        if(text.equalsIgnoreCase("Address Details")){
            log.info("Getting " + text + ":" + addressDetailsText.toString());
            return getTextFromElement(addressDetailsText);
        } else if (text.equalsIgnoreCase("Review Your Order")){
            log.info("Getting" + text+ ":"+ reviewYourOrderText.toString());
            return getTextFromElement(reviewYourOrderText);
        } else {
            return "Text is not displayed";
        }
    }
    public void sendTextToCommentArea(String comment) {
        sendTextToElement(commentArea, comment);
        log.info("Sending text to comment area :" + commentArea.toString());
    }
    public void clickOnPlaceOrderButton(){
        // clickOnElement(placeOrderButton);
        try {
            placeOrderButton.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text() , 'Place Order')]")));
        }
        log.info("Clicking on Place Order button :"+ placeOrderButton.toString());
    }
    public String getDeliveryAddress(){
        log.info("Getting delivery address :" + deliveryAddress.toString());
        return getTextFromElement(deliveryAddress);
    }
    public String getBillingAddress(){
        log.info("Getting billing address :"+ deliveryAddress.toString());
        return getTextFromElement(billingAddress);
    }
}

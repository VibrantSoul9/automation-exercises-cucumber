package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Payment']")
    WebElement paymentPageWelcomeText;
    @CacheLookup
    @FindBy (xpath = "//input[@name='name_on_card']")
    WebElement nameOnCardField;
    @CacheLookup
    @FindBy (xpath = "//input[@name='card_number']")
    WebElement cardNumberField;
    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='ex. 311']")
    WebElement CVCField;

    @CacheLookup    @FindBy (xpath = "//input[@placeholder='MM']")
    WebElement expirationMonthField;
    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='YYYY']")
    WebElement expirationYearField;
    @CacheLookup
    @FindBy (xpath = "//button[@id='submit']")
    WebElement payAndConfirmButton;
    @CacheLookup
    @FindBy (xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement orderConfirmationMessage;
    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoiceButtonAfterOrderSuccessMessage;
    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonAfterOrderSuccessMessage;

    public String getWelcomeTextOnPaymentPage() {
        log.info("Getting welcome text from payment page : " + paymentPageWelcomeText.toString());
        return getTextFromElement(paymentPageWelcomeText);
    }
   public void sendPaymentDetails(String name, String cNumber, String CVCNumber, String eMonth, String eYear){
        sendTextToElement(nameOnCardField, name);
        log.info("Sending " + name + " to Name on Card field : " + nameOnCardField.toString());
        sendTextToElement(cardNumberField, cNumber);
        log.info("Sending " + cNumber + " to Card Number : " + cardNumberField.toString());
        sendTextToElement(CVCField, CVCNumber);
        log.info("Sending " + CVCNumber + " to CVC field : " + CVCField.toString());
        sendTextToElement(expirationMonthField, eMonth);
        log.info("Sending " + eMonth + " to Month field : " + expirationMonthField.toString());
        sendTextToElement(expirationYearField, eYear);
        log.info("Sending " + eYear + " to Year field : " + expirationYearField.toString());
    }
    public void clickOnPayAndConfirmOrderButton() {
        clickOnElement(payAndConfirmButton);
        log.info("Clicking on Pay and Confirm Order button : " + payAndConfirmButton.toString());
    }
    public String getOrderConfirmationMessage(){
        log.info("Getting order confirmation message : " +orderConfirmationMessage.toString());
        return getTextFromElement(orderConfirmationMessage);
    }
    public void clickOnDownloadInvoiceButtonAfterOrderSuccessMessage() {
        clickOnElement(downloadInvoiceButtonAfterOrderSuccessMessage);
        log.info("Click on download invoice button : " + downloadInvoiceButtonAfterOrderSuccessMessage.toString());
    }
    public void clickOnContinueButtonAfterOrderSuccessMessage() {
        clickOnElement(continueButtonAfterOrderSuccessMessage);
        log.info("Click on continue button after order success message : " + continueButtonAfterOrderSuccessMessage.toString());
    }
}

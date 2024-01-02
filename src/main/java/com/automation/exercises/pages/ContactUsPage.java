package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactUsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement subjectField;
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement messageField;
    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitButton;
    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement uploadFile;
    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement detailsSubmittedSuccessMessage;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement homeButton;

    public String verifyGetInTouchText(){
        log.info("Getting text from welcome page :" + getInTouchText.toString());
        return getTextFromElement(getInTouchText);
    }
    public void sendDataToNameField(String name) {
        sendTextToElement(nameField, name);
        log.info("Sending" + name + "to name field :" + nameField.toString());
    }
    public void sendDataToEmailField(String email){
        sendTextToElement(emailField, email);
        log.info("Sending " + email + "to email field : " + emailField.toString());
    }
    public void sendDataToSubjectField(String subject) {
        sendTextToElement(subjectField, subject);
        log.info("Sending" + subject + "to subject field :" + subjectField.toString());
    }
    public void sendDataToMessageField(String message){
        log.info("sending"+ message + "to message field :" + messageField.toString());
        sendTextToElement(messageField, message);
    }
    public void clickOnSubmitButton(){
        //clickOnElement(submitButton);
        try { submitButton.click();
    } catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='submit']")));
        }
        log.info("Clicking on submit button :" + submitButton.toString());
}
    public void uploadFile(){
    uploadFile.sendKeys("D;//Study/texting.txt");
    log.info("Uploading file : " + uploadFile.toString());
    }
    public void acceptPopupMessage(){
        acceptAlert();
        log.info("Accepting the alert : ");
    }
    public String getDetailsSubmittedMessage(){
        log.info("getting detailed success message : " + detailsSubmittedSuccessMessage.toString());
        return getTextFromElement(detailsSubmittedSuccessMessage);
    }
    public void clickOnHomeButton(){
        clickOnElement(homeButton);
        log.info("Clicking on home button : " + homeButton.toString());
    }
}

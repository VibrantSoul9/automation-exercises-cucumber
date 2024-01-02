package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignupPage.class.getName());

    @CacheLookup
    @FindBy(id = "id_gender1")
    WebElement titleAsMrRadioButton;
    @CacheLookup
    @FindBy (id = "id_gender2")
    WebElement titleAsMrsRadioButton;
    @CacheLookup
    @FindBy (id = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy (id = "days")
    WebElement dayInDOBDropdown;
    @CacheLookup
    @FindBy (id = "months")
    WebElement monthInDOBDropdown;
    @CacheLookup
    @FindBy (id = "years")
    WebElement yearInDOBDropdown;
    @CacheLookup
    @FindBy (id = "first_name")
    WebElement fNameFieldInAddressInfo;
    @CacheLookup
    @FindBy (id = "last_name")
    WebElement lNameFieldInAddressInfo;
    @CacheLookup
    @FindBy (id = "address1")
    WebElement address1Field;
    @CacheLookup
    @FindBy (id = "address2")
    WebElement address2Field;
    @CacheLookup
    @FindBy (id = "country")
    WebElement countryDropDown;
    @CacheLookup
    @FindBy (id = "state")
    WebElement stateField;
    @CacheLookup
    @FindBy (id = "city")
    WebElement cityField;
    @CacheLookup
    @FindBy (id = "zipcode")
    WebElement zipcodeField;
    @CacheLookup
    @FindBy (id = "mobile_number")
    WebElement mobileNumberField;
    @CacheLookup
    @FindBy (xpath = "(//button[@type = 'submit'])[1]")
    WebElement createAccountButton;
    @CacheLookup
    @FindBy (xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreatedMessage;
    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonAfterAccountCreated;
    @CacheLookup
    @FindBy (xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement enterAccountInformationText;
    @CacheLookup
    @FindBy (xpath = "//input[@id='newsletter']")
    WebElement newsLetterCheckBox;
    @CacheLookup
    @FindBy (xpath = "//input[@id='optin']")
    WebElement specialOfferCheckBox;

    public void sendDataToSignupForm(String title, String password, String day, String month, String year, String fName,
                                     String lName, String add1, String add2, String country, String state, String city,
                                     String zipcode, String mNumber) {
        if (title.equalsIgnoreCase("Mr")){
            clickOnElement(titleAsMrRadioButton);
            log.info("Selecting radio button against Mr.");
        } else {
            clickOnElement(titleAsMrsRadioButton);
            log.info("Selecting radio button against Mrs.");
        }
        sendTextToElement(passwordField, password);
        log.info("Sending " + password + " to password field");
        selectByVisibleTextFromDropDown(dayInDOBDropdown, day);
        log.info("Selecting " + day + " from Day dropdown in DOB");
        selectByVisibleTextFromDropDown(monthInDOBDropdown, month);
        log.info("Selecting " + month + " from Month dropdown in DOB");
        selectByVisibleTextFromDropDown(yearInDOBDropdown, year);
        log.info("Selecting " + year + " from Year dropdown in DOB");
        sendTextToElement(fNameFieldInAddressInfo, fName);
        log.info("Sending " + fName + " to First Name field");
        sendTextToElement(lNameFieldInAddressInfo, lName);
        log.info("Sending " + lName + " to Last Name field");
        sendTextToElement(address1Field, add1);
        log.info("Sending " + add1 + " to Address1 field");
        sendTextToElement(address2Field, add2);
        log.info("Sending " + add2 + " to Address2 field");
        selectByVisibleTextFromDropDown(countryDropDown, country);
        log.info("Selecting " + country + " from Country dropdown");
        sendTextToElement(stateField, state);
        log.info("Sending " + state + " to State field");
        sendTextToElement(cityField, city);
        log.info("Sending " + city + " to City field");
        sendTextToElement(zipcodeField, zipcode);
        log.info("Sending " + zipcode + " to Zipcode field");
        sendTextToElement(mobileNumberField, mNumber);
        log.info("Sending " + mNumber + " to Mobile Number field");
    }
    public void clickOnCreateAccountButton() {
        // clickOnElement(createAccountButton);
        try {
            createAccountButton.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[@type = 'submit'])[1]")));
        }
        log.info("Clicking on create account button : " + createAccountButton.toString());
    }
    public String getAccountCreatedMessage() {
        log.info("Getting account created message : " + accountCreatedMessage.toString());
        return getTextFromElement(accountCreatedMessage);
    }
    public void clickOnContinueButtonAfterAccountCreated() {
        clickOnElement(continueButtonAfterAccountCreated);
        log.info("Clicking on continue button after account created : " + continueButtonAfterAccountCreated.toString());
    }
    public String getEnterAccountInformation() {
        log.info("Getting Enter Account Information text : " + enterAccountInformationText.toString());
        return getTextFromElement(enterAccountInformationText);
    }
    public void clickOnSignUpNewLetterCheckBox() {
        clickOnElement(newsLetterCheckBox);
        log.info("Clicking on News Letter Subscription Check Box : " + newsLetterCheckBox.toString());
    }
    public void clickOnReceiveSpecialOfferCheckBox() {
        clickOnElement(specialOfferCheckBox);
        log.info("Clicking on Receive Special Offer Check Box : " + specialOfferCheckBox.toString());
    }
}

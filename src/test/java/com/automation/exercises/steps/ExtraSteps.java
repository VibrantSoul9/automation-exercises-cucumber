package com.automation.exercises.steps;

import com.automation.exercises.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * @author VibrantSoul
 */
public class ExtraSteps {
    @Then("I should see welcome text on contact us page {string}")
    public void iShouldSeeWelcomeTextOnContactUsPage(String expectedText) {
        Assert.assertEquals(new ContactUsPage().verifyGetInTouchText(), expectedText);
    }

    @And("I enter {string} name to name field")
    public void iEnterNameToNameField(String name) {
        new ContactUsPage().sendDataToNameField(name);
    }

    @And("I enter {string} email to email field")
    public void iEnterEmailToEmailField(String email) {
        new ContactUsPage().sendDataToEmailField(email);
    }

    @And("I enter {string} subject to subject field")
    public void iEnterSubjectToSubjectField(String subject) {
        new ContactUsPage().sendDataToSubjectField(subject);
    }

    @And("I enter {string} message to message field")
    public void iEnterMessageToMessageField(String message) {
        new ContactUsPage().sendDataToMessageField(message);
    }

    @And("I upload file")
    public void iUploadFile() {
        new ContactUsPage().uploadFile();
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        new ContactUsPage().clickOnSubmitButton();
    }

    @And("I click on ok button popup")
    public void iClickOnOkButtonPopup() {
        new ContactUsPage().acceptPopupMessage();
    }

    @And("I click on home button")
    public void iClickOnHomeButton() {
        new ContactUsPage().clickOnHomeButton();
    }

    @Then("I should see the success message {string}")
    public void iShouldSeeTheSuccessMessage(String expectedText) {
        Assert.assertEquals(new ContactUsPage().getDetailsSubmittedMessage(),expectedText);
    }

    @Then("I am on text cases page and verify the test-cases URL {string}")
    public void iAmOnTextCasesPageAndVerifyTheTestCasesURL(String expectedURL) {
        Assert.assertEquals(new TestCasesPage().getCurrentURL(), expectedURL);
    }

    @When("I scroll down up to subscription link")
    public void iScrollDownUpToSubscriptionLink() {
        new HomePage().scrollDownToSubscriptionLink();
    }

    @Then("I enter email {string}")
    public void iEnterEmail(String email) {
        new HomePage().sendDataToSubscriptionEmail(email);
    }

    @And("I click on arrow button")
    public void iClickOnArrowButton() {
        new HomePage().clickOnArrowToSubscribe();
    }

    @And("I should see the success subscription message {string}")
    public void iShouldSeeTheSuccessSubscriptionMessage(String expectedMessage) {
        Assert.assertEquals(new HomePage().getSubscriptionSuccessMessage(), expectedMessage);
    }

    @Then("I should see the subscription {string} text")
    public void iShouldSeeTheSubscriptionText(String expectedText) {
        Assert.assertEquals(new HomePage().getSubscriptionText(), expectedText);
    }

    @And("I click on arrow up button at bottom right corner")
    public void iClickOnArrowUpButtonAtBottomRightCorner() {
        new HomePage().clickOnButtomRightArrowButton();
    }

    @And("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getFullFledgedText(), expectedText);
    }

    @And("I scroll up")
    public void iScrollUp() {
        new HomePage().scrollUp();
    }

    @Then("I click on cross button to remove the product from the cart")
    public void iClickOnCrossButtonToRemoveTheProductFromTheCart() {
        new ShoppingCartPage().clickOnCrossButtonAcrossProductToRemove();
    }

    @And("I click on register link in the checkout popup")
    public void iClickOnRegisterLinkInTheCheckoutPopup() {
        new ShoppingCartPage().clickOnRegisterLoginLinkOnCheckoutPopup();
    }

    @And("I click on download invoice after order success")
    public void iClickOnDownloadInvoiceAfterOrderSuccess() {
        new PaymentPage().clickOnDownloadInvoiceButtonAfterOrderSuccessMessage();
    }

    @And("I click on continue button after order success")
    public void iClickOnContinueButtonAfterOrderSuccess() {
        new PaymentPage().clickOnContinueButtonAfterOrderSuccessMessage();
    }
}

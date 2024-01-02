package com.automation.exercises.steps;

import com.automation.exercises.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

/**
 * @author VibrantSoul
 */
public class RegisterSteps {
    @Then("I should see text {string}")
    public void iShouldSeeText(String expectedText) {
        Assert.assertEquals(new SignupPage().getEnterAccountInformation(), expectedText);
    }

    @And("I click on news letter subscription check box")
    public void iClickOnNewsLetterSubscriptionCheckBox() {
        new SignupPage().clickOnSignUpNewLetterCheckBox();
    }

    @And("I click on special offers check box")
    public void iClickOnSpecialOffersCheckBox() {
        new SignupPage().clickOnReceiveSpecialOfferCheckBox();
    }

    @And("I add product {string} to the cart")
    public void iAddProductToTheCart(String product) {
        new HomePage().mouseHoverAndClickAddToCartOnProduct(product);
    }

    @And("I click on view cart in popup")
    public void iClickOnViewCartInPopup() {
        new HomePage().clickOnViewCartLink();
    }

    @And("I should see the welcome text on shopping cart page {string}")
    public void iShouldSeeTheWelcomeTextOnShoppingCartPage(String expectedText) {
        Assert.assertEquals(new ShoppingCartPage().getShoppingCartWelcomeText(), expectedText);
    }

    @And("I click on Proceed to Checkout button")
    public void iClickOnProceedToCheckoutButton() {
        new ShoppingCartPage().clickOnProceedToCheckoutButton();
    }

    @And("I should see the text on checkout page {string}")
    public void iShouldSeeTheTextOnCheckoutPage(String expectedText) {
        Assert.assertEquals(new CheckoutPage().verifyTextOnCheckoutPage(expectedText), expectedText);
    }

    @And("I enter details into comment area {string}")
    public void iEnterDetailsIntoCommentArea(String comment) {
        new CheckoutPage().sendTextToCommentArea(comment);
    }

    @And("I click on place order button")
    public void iClickOnPlaceOrderButton() {
        new CheckoutPage().clickOnPlaceOrderButton();
    }

    @And("I enter payment details {string} {string} {string} {string} and {string}")
    public void iEnterPaymentDetailsAnd(String name, String cNumber, String CVC, String month, String year) {
        new PaymentPage().sendPaymentDetails(name, cNumber, CVC, month, year);
    }

    @And("I click on Pay and Confirm Order button")
    public void iClickOnPayAndConfirmOrderButton() {
        new PaymentPage().clickOnPayAndConfirmOrderButton();
    }

    @Then("I should see the order confirmation message {string}")
    public void iShouldSeeTheOrderConfirmationMessage(String expectedMessage) {
        Assert.assertEquals(new PaymentPage().getOrderConfirmationMessage(), expectedMessage);
    }

    @And("I send name {string} and email {string} to signup")
    public void iSendNameAndEmailToSignup(String name, String eMail) {
        new LoginPage().sendDataToSignupFields(name, eMail);
    }

    @And("I fill all details in signup page {string} {string} {string} {string} {string} {string} {string} {string} {string} " +
            "{string} {string} {string} {string} {string}")
    public void iFillAllDetailsInSignupPage(String title, String pass, String day, String month,
                                            String year, String fName, String lName, String add1, String add2,
                                            String country, String state, String city, String zipcode, String pNumber) {
        new SignupPage().sendDataToSignupForm(title, pass, day, month, year,fName, lName, add1, add2, country, state, city, zipcode, pNumber);
    }

    @And("I click on Create Account button")
    public void iClickOnCreateAccountButton() {
        new SignupPage().clickOnCreateAccountButton();
    }

    @Then("I see account created message {string}")
    public void iSeeAccountCreatedMessage(String expectedText) {
        Assert.assertEquals(new SignupPage().getAccountCreatedMessage(), expectedText);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new SignupPage().clickOnContinueButtonAfterAccountCreated();
    }

    @Then("I should see the account deleted message {string}")
    public void iShouldSeeTheAccountDeletedMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getAccountDeleteMessage(), expectedText);
    }

    @And("I click on continue button after deleting account")
    public void iClickOnContinueButtonAfterDeletingAccount() {
        new HomePage().clickOnContinueButtonAfterAccountDeletedMessage();
    }

    @Then("I should see the text {string} {string}")
    public void iShouldSeeTheText(String text, String name) {
        Assert.assertEquals(new HomePage().getLoggedInAsUserNameText(), text + name);
    }

    @Then("I should see the delivery address is same address filled at the time registration of account {string}")
    public void iShouldSeeTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String expectedAddress) {
        Assert.assertEquals(new CheckoutPage().getDeliveryAddress(), expectedAddress);
    }

    @And("I should see billing address is same address filled at the time registration of account {string}")
    public void iShouldSeeBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String expectedAddress) {
        Assert.assertEquals(new CheckoutPage().getBillingAddress(), expectedAddress);
    }

    @And("I send name {string} to name field in signup")
    public void iSendNameToNameFieldInSignup(String name) {
        new LoginPage().sendDataToNameFieldInSignUp(name);
    }

    @And("I send email {string} to email field in signup")
    public void iSendEmailToEmailFieldInSignup(String email) {
        new LoginPage().sendDataToEmailFieldInSignup(email);
    }

    @Then("I should see error message {string}")
    public void iShouldSeeErrorMessage(String expectedError) {
        Assert.assertEquals(new LoginPage().getEmailAlreadyExistErrorMessage(), expectedError);
    }
}

package com.automation.exercises.steps;

import com.automation.exercises.pages.HomePage;
import com.automation.exercises.pages.LoginPage;
import com.automation.exercises.propertyreader.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * @author VibrantSoul
 */
public class LoginSteps {
    @Given("I am on homepage and verify the homepage URL")
    public void iAmOnHomepageAndVerifyTheHomepageURL() {
        Assert.assertEquals(new HomePage().getCurrentURL(), "https://automationexercise.com/");
    }

    @When("I click on header menu option {string}")
    public void iClickOnHeaderMenuOption(String option) {
        new HomePage().clickOnHeaderTab(option);
    }

    @Then("I should see the login page text {string}")
    public void iShouldSeeTheLoginPageText(String text) {
        Assert.assertEquals(new LoginPage().getTextFromLoginPage(text), text);
    }

    @And("I enter {string} email and {string} password for login")
    public void iEnterEmailAndPasswordForLogin(String email, String password) {
        new LoginPage().sendDataToLoginFields(email, password);
    }

    @And("I click on button {string}")
    public void iClickOnButton(String button) {
        new LoginPage().clickOnLoginPageButton(button);
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String text) {
        Assert.assertEquals(new HomePage().getLoggedInAsUserNameText(), text + PropertyReader.getInstance().getProperty("userName"));
    }

    @And("I am on login page and verify the login URL")
    public void iAmOnLoginPageAndVerifyTheLoginURL() {
        Assert.assertEquals(new LoginPage().getCurrentURL(), "https://automationexercise.com/login");
    }
}

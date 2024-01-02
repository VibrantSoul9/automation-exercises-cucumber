package com.automation.exercises.steps;

import com.automation.exercises.pages.HomePage;
import com.automation.exercises.pages.ProductDetailsPage;
import com.automation.exercises.pages.ProductPage;
import com.automation.exercises.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * @author VibrantSoul
 */
public class ProductSteps {
    @Then("I should see text {string} on product page")
    public void iShouldSeeTextOnProductPage(String expectedText) {
        Assert.assertEquals(new ProductPage().getAllProductText(), expectedText);
    }

    @And("I click on view product of first product {string}")
    public void iClickOnViewProductOfFirstProduct(String pName) {
        new ProductPage().clickOnViewProductWithProductName(pName);
    }

    @And("I am on product details page and verify the URL")
    public void iAmOnProductDetailsPageAndVerifyTheURL() {
        Assert.assertTrue(new ProductDetailsPage().verifyTheURL().contains("https://automationexercise.com/product_details"));
    }

    @And("I should see product name {string}")
    public void iShouldSeeProductName(String pName) {
        Assert.assertEquals(new ProductDetailsPage().getProductName(), pName);
    }

    @And("I should see category {string}")
    public void iShouldSeeCategory(String category) {
        Assert.assertEquals(new ProductDetailsPage().getProductCategory(), category);
    }

    @And("I should see price {string}")
    public void iShouldSeePrice(String price) {
        Assert.assertEquals(new ProductDetailsPage().getProductPrice(), price);
    }

    @And("I should see availability {string}")
    public void iShouldSeeAvailability(String avail) {
        Assert.assertEquals(new ProductDetailsPage().getProductAvailability(), avail);
    }

    @And("I should see condition {string}")
    public void iShouldSeeCondition(String condition) {
        Assert.assertEquals(new ProductDetailsPage().getProductCondition(), condition);
    }

    @And("I should see brand {string}")
    public void iShouldSeeBrand(String brand) {
        Assert.assertEquals(new ProductDetailsPage().getProductBrand(), brand);
    }

    @And("I increase the quantity {string}")
    public void iIncreaseTheQuantity(String qua) {
        new ProductDetailsPage().sendQuantity(qua);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductDetailsPage().clickOnAddToCartButton();
    }

    @And("I click on view cart link in success message")
    public void iClickOnViewCartLinkInSuccessMessage() {
        new ProductDetailsPage().clickOnViewCartLinkInSuccessMessage();
    }

    @Then("I should see quantity {string}")
    public void iShouldSeeQuantity(String qua) {
        Assert.assertEquals(new ShoppingCartPage().getQuantity(), qua);
    }

    @When("I click on products tab")
    public void iClickOnProductsTab() {
        new HomePage().clickOnProductsTab();
    }

    @And("I enter product name {string} in search bar")
    public void iEnterProductNameInSearchBar(String pName) {
        new ProductPage().sendTextToSearchBar(pName);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ProductPage().clickOnSearchButton();
    }

    @Then("I should see the text {string} on the page")
    public void iShouldSeeTheTextOnThePage(String expectedText) {
        Assert.assertEquals(new ProductPage().getSearchedProductsText(), expectedText);
    }

    @And("I should see the searched product {string}")
    public void iShouldSeeTheSearchedProduct(String pName) {
        Assert.assertEquals(new ProductPage().getSearchedProductName(), pName);
    }

    @And("I click on continue shopping link")
    public void iClickOnContinueShoppingLink() {
        new ProductPage().clickOnContinueShoppingLink();
    }

    @Then("I verify the product {string} in shopping cart")
    public void iVerifyTheProductInShoppingCart(String pName) {
        Assert.assertEquals(new ShoppingCartPage().getProductNameFromCart(pName), pName);
    }

    @Then("I click on {string} category")
    public void iClickOnCategory(String category) {
        new ProductPage().clickOnCategory(category);
    }

    @And("I click on {string} in women category")
    public void iClickOnInWomenCategory(String subCategory) {
        new ProductPage().clickOnSubCategoryOfWomen(subCategory);
    }

    @And("I click on {string} in men category")
    public void iClickOnInMenCategory(String subCategory) {
        new ProductPage().clickOnSubCategoryOfMen(subCategory);
    }

    @And("I should see {string} page title")
    public void iShouldSeePageTitle(String expectedTitle) {
        Assert.assertEquals(new ProductPage().getSubMenuPageTitle(), expectedTitle);
    }

    @Then("I click on {string} brand in Brands tab")
    public void iClickOnBrandInBrandsTab(String brand) {
        new ProductPage().clickOnBrandOnBrandsTab(brand);
    }

    @And("I enter {string} name at your name field")
    public void iEnterNameAtYourNameField(String name) {
        new ProductDetailsPage().sendNameToYourNameField(name);
    }

    @And("I enter {string} email at email address field")
    public void iEnterEmailAtEmailAddressField(String email) {
        new ProductDetailsPage().sendEmailToEmailAddressField(email);
    }

    @And("I click on review submit button")
    public void iClickOnReviewSubmitButton() {
        new ProductDetailsPage().clickOnReviewSubmitButton();
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String message) {
        Assert.assertEquals(new ProductDetailsPage().getThankYouForReviewMessage(), message);
    }

    @And("I enter {string} message to review here field")
    public void iEnterMessageToReviewHereField(String review) {
        new ProductDetailsPage().sendReviewToAddReviewField(review);
    }

    @When("I scroll down up to recommended items text")
    public void iScrollDownUpToRecommendedItemsText() {
        new HomePage().scrollDownToRecommendedItems();
    }


    @Then("I should see {string} text")
    public void iShouldSeeText(String expectedText) {
        Assert.assertEquals(new HomePage().getRecommendedItemText(), expectedText);
    }

    @And("I add to cart {string} product from recommended items")
    public void iAddToCartProductFromRecommendedItems(String pName) {
        new HomePage().clickAddToCartOnRecommendedItems(pName);
    }
}

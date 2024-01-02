@regression
Feature: As a user,
  I should verify all products and product detail page
  I should search product
  I should add products in cart
  I should verify product quantity in cart
  I should view category products
  I should view and cart brand products
  I should search product and verify cart after login
  I should add review on product
  I should add to cart from recommended items

#Test Case 8: Verify All Products and product detail page
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Products' button
#        5. Verify user is navigated to ALL PRODUCTS page successfully
#        6. The products list is visible
#        7. Click on 'View Product' of first product
#        8. User is landed to product detail page
#        9. Verify that detail detail is visible: product name, category, price, availability, condition, brand

  @author_VibrantSoul @sanity @smoke
  Scenario: User should verify all products and product detail page
    Given I am on homepage and verify the homepage URL
    When I click on products tab
    Then I should see text "ALL PRODUCTS" on product page
    And I click on view product of first product "Blue Top"
    And I am on product details page and verify the URL
    And I should see product name "Blue Top"
    And I should see category "Category: Women > Tops"
    And I should see price "Rs. 500"
    And I should see availability "Availability: In Stock"
    And I should see condition "Condition: New"
    And I should see brand "Brand: Polo"

#Test Case 9: Search Product
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Products' button
#        5. Verify user is navigated to ALL PRODUCTS page successfully
#        6. Enter product name in search input and click search button
#        7. Verify 'SEARCHED PRODUCTS' is visible
#        8. Verify all the products related to search are visible

  @author_VibrantSoul @smoke
  Scenario: User should search product
    Given I am on homepage and verify the homepage URL
    When I click on products tab
    Then I should see text "ALL PRODUCTS" on product page
    And I enter product name "Men Tshirt" in search bar
    And I click on search button
    Then I should see the text "SEARCHED PRODUCTS" on the page
    And I should see the searched product "Men Tshirt"

#Test Case 12: Add Products in Cart
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click 'Products' button
#        5. Hover over first product and click 'Add to cart'
#        6. Click 'Continue Shopping' button
#        7. Hover over second product and click 'Add to cart'
#        8. Click 'View Cart' button
#        9. Verify both products are added to Cart
#        10. Verify their prices, quantity and total price

  @author_VibrantSoul
  Scenario: User should add products in cart
    Given I am on homepage and verify the homepage URL
    When I click on products tab
    Then I add product "Men Tshirt" to the cart
    And I click on continue shopping link
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    Then I verify the product "Blue Top" in shopping cart
    Then I verify the product "Men Tshirt" in shopping cart

#Test Case 13: Verify Product quantity in Cart
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click 'View Product' for any product on home page
#        5. Verify product detail is opened
#        6. Increase quantity to 4
#        7. Click 'Add to cart' button
#        8. Click 'View Cart' button
#        9. Verify that product is displayed in cart page with exact quantity

  @author_VibrantSoul
  Scenario: User should verify product quantity in cart
    Given I am on homepage and verify the homepage URL
    When I click on view product of first product "Blue Top"
    And I am on product details page and verify the URL
    And I should see product name "Blue Top"
    And I should see category "Category: Women > Tops"
    And I should see price "Rs. 500"
    And I should see availability "Availability: In Stock"
    And I should see condition "Condition: New"
    And I should see brand "Brand: Polo"
    And I increase the quantity "4"
    And I click on add to cart button
    And I click on view cart link in success message
    Then I should see quantity "4"

#Test Case 18: View Category Products
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that categories are visible on left side bar
#        4. Click on 'Women' category
#        5. Click on any category link under 'Women' category, for example: Dress
#        6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
#        7. On left side bar, click on any sub-category link of 'Men' category
#        8. Verify that user is navigated to that category page

  @author_VibrantSoul
  Scenario: User should view category products
    Given I am on homepage and verify the homepage URL
    When I click on products tab
    Then I click on "Women" category
    And I click on "Dress" in women category
    And I should see "WOMEN - DRESS PRODUCTS" page title
    Then I click on "Men" category
    And I click on "Tshirts" in men category
    And I should see "MEN - TSHIRTS PRODUCTS" page title

#Test Case 19: View & Cart Brand Products
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Click on 'Products' button
#        4. Verify that Brands are visible on left side bar
#        5. Click on any brand name
#        6. Verify that user is navigated to brand page and brand products are displayed
#        7. On left side bar, click on any other brand link
#        8. Verify that user is navigated to that brand page and can see products

  @author_VibrantSoul
  Scenario: User should view and cart brand products
    Given I am on homepage and verify the homepage URL
    When I click on products tab
    Then  I click on "Polo" brand in Brands tab
    And I should see "BRAND - POLO PRODUCTS" page title
    And I click on "Madame" brand in Brands tab
    And I should see "BRAND - MADAME PRODUCTS" page title

#Test Case 20: Search Products and Verify Cart After Login
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Click on 'Products' button
#        4. Verify user is navigated to ALL PRODUCTS page successfully
#        5. Enter product name in search input and click search button
#        6. Verify 'SEARCHED PRODUCTS' is visible
#        7. Verify all the products related to search are visible
#        8. Add those products to cart
#        9. Click 'Cart' button and verify that products are visible in cart
#        10. Click 'Signup / Login' button and submit login details
#        11. Again, go to Cart page
#        12. Verify that those products are visible in cart after login as well

  @author_VibrantSoul
  Scenario: User should search product and verify cart after login
    Given I am on homepage and verify the homepage URL
    When I click on products tab
    Then I should see text "ALL PRODUCTS" on product page
    And I enter product name "Men Tshirt" in search bar
    And I click on search button
    Then I should see the text "SEARCHED PRODUCTS" on the page
    And I should see the searched product "Men Tshirt"
    And I add product "Men Tshirt" to the cart
    And I click on view cart in popup
    Then I verify the product "Men Tshirt" in shopping cart
    And I click on header menu option "Signup / Login"
    Then I should see the login page text "Login to your account"
    And I enter "pinalp@gmail.com" email and "Pinal@123" password for login
    And I click on button "Login"
    And I click on header menu option "Cart"
    Then I verify the product "Men Tshirt" in shopping cart

#Test Case 21: Add review on product
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Click on 'Products' button
#        4. Verify user is navigated to ALL PRODUCTS page successfully
#        5. Click on 'View Product' button
#        6. Verify 'Write Your Review' is visible
#        7. Enter name, email and review
#        8. Click 'Submit' button
#        9. Verify success message 'Thank you for your review.'

  @author_VibrantSoul
  Scenario: User should add review on product
    Given I am on homepage and verify the homepage URL
    When I click on products tab
    Then I should see text "ALL PRODUCTS" on product page
    And I click on view product of first product "Blue Top"
    And I enter "Pinal" name at your name field
    And I enter "pinalp@gmail.com" email at email address field
    And I enter "This is a nice product." message to review here field
    And I click on review submit button
    Then I should see "Thank you for your review." message

#Test Case 22: Add to cart from Recommended items
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Scroll to bottom of page
#        4. Verify 'RECOMMENDED ITEMS' are visible
#        5. Click on 'Add To Cart' on Recommended product
#        6. Click on 'View Cart' button
#        7. Verify that product is displayed in cart page

  @author_VibrantSoul
  Scenario: User should add to cart from recommended items
    Given I am on homepage and verify the homepage URL
    When I scroll down up to recommended items text
    Then I should see "RECOMMENDED ITEMS" text
    And I add to cart "Stylish Dress" product from recommended items
    And I click on view cart in popup
    Then I verify the product "Stylish Dress" in shopping cart
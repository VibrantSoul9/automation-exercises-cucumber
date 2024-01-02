@regression
  Feature: As a user,
    I should log the contact us form
    I should redirect to Test Cases page successfully
    I should subscribe in the homepage
    I should subscribe in the Cart page
    I should remove the product from cart
    I should download invoice after purchase order
    I should scroll down and scroll up using Arrow button at bottom right corner
    I should scroll down and scroll up without Arrow button

  #Test Case 6: Contact Us Form
  # 1. Launch browser
  # 2. Navigate to url 'http://automationexrcise.com'
  # 3. Verify that home page is visible successfully
  # 4. Click on 'Contact Us' button
  # 5. Verify 'GET IN TOUCH' in visible
  # 6. Enter name, email, subject and message
  # 7. Upload file
  # 8. Click 'Submit' button
  # 9. Click OK button
  # 10. Verify success message 'Success! Your details have been submitted successfully.' is visible
  # 11. Click 'Home' button and verify that landed to home page successfully

  @author_VibrantSoul @sanity @smoke
    Scenario:  User should log the contact us form
    Given I am on homepage and verify the homepage URL
    When I click on header menu option "Contact us"
    Then I should see welcome text on contact us page "GET IN TOUCH"
    And I enter "Pinal" name to name field
    And I enter "pinal12@gmail.com" email to email field
    And I enter "About product" subject to subject field
    And I enter "This product is nice" message to message field
    And I upload file
    And I click on submit button
    And I click on ok button popup
    Then I should see the success message "Success! Your details have been submitted successfully."
    And I click on home button
    Then I am on homepage and verify the homepage URL

#Test Case 7: Verify Test Cases Page
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Test Cases' button
#        5. Verify user is navigated to test cases page successfully

    @author_VibrantSoul @smoke
    Scenario: User should redirect to Test Cases page successfully
      Given I am on homepage and verify the homepage URL
      When I click on header menu option "Test Cases"
      Then I am on text cases page and verify the test-cases URL "https://automationexercise.com/test_cases"

#Test Case 10: Verify Subscription in home page
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Scroll down to footer
#        5. Verify text 'SUBSCRIPTION'
#        6. Enter email address in input and click arrow button
#        7. Verify success message 'You have been successfully subscribed!' is visible

    @author_VibrantSoul
    Scenario: User should subscribe in the homepage
      Given I am on homepage and verify the homepage URL
      When I scroll down up to subscription link
      Then I enter email "pinal@gmail.com"
      And I click on arrow button
      And I should see the success subscription message "You have been successfully subscribed!"

#Test Case 11: Verify Subscription in Cart page
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click 'Cart' button
#        5. Scroll down to footer
#        6. Verify text 'SUBSCRIPTION'
#        7. Enter email address in input and click arrow button
#        8. Verify success message 'You have been successfully subscribed!' is visible

    @author_VibrantSoul
    Scenario: User should subscribe in the Cart page
      Given I am on homepage and verify the homepage URL
      When I click on header menu option "Cart"
      And I scroll down up to subscription link
      Then I enter email "pinal@gmail.com"
      And I click on arrow button
      And I should see the success subscription message "You have been successfully subscribed!"

#Test Case 17: Remove Products From Cart
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Add products to cart
#        5. Click 'Cart' button
#        6. Verify that cart page is displayed
#        7. Click 'X' button corresponding to particular product
#        8. Verify that product is removed from the cart

    @author_VibrantSoul
    Scenario: User should remove the product from cart
      Given I am on homepage and verify the homepage URL
      When I add product "Blue Top" to the cart
      And I click on view cart in popup
      And I should see the welcome text on shopping cart page "Shopping Cart"
      Then I click on cross button to remove the product from the cart

#Test Case 24: Download Invoice after purchase order
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Add products to cart
#        5. Click 'Cart' button
#        6. Verify that cart page is displayed
#        7. Click Proceed To Checkout
#        8. Click 'Register / Login' button
#        9. Fill all details in Signup and create account
#        10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#        11. Verify ' Logged in as username' at top
#        12.Click 'Cart' button
#        13. Click 'Proceed To Checkout' button
#        14. Verify Address Details and Review Your Order
#        15. Enter description in comment text area and click 'Place Order'
#        16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#        17. Click 'Pay and Confirm Order' button
#        18. Verify success message 'Your order has been placed successfully!'
#        19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
#        20. Click 'Continue' button
#        21. Click 'Delete Account' button
#        22. Verify 'ACCOUNT DELETED!' and click 'Continue' button

    @author_VibrantSoul
    Scenario: User should download invoice after purchase order
      Given I am on homepage and verify the homepage URL
      When I add product "Blue Top" to the cart
      And I click on view cart in popup
      And I should see the welcome text on shopping cart page "Shopping Cart"
      And I click on Proceed to Checkout button
      And I click on register link in the checkout popup
      And I send name "Hina" and email "hina" to signup
      And I click on button "Signup"
      And I fill all details in signup page "Mrs" "Hina@123" "14" "January" "1988" "Heena" "Patel" "Rugby Avenue" "Lalbaugh" "India" "Gujarat" "Surat" "395001" "09584766214"
      And I click on Create Account button
      Then I see account created message "ACCOUNT CREATED!"
      And I click on continue button
      Then I should see the text "Logged in as " "Hina"
      And I click on header menu option "Cart"
      And I click on Proceed to Checkout button
      And I should see the text on checkout page "Review Your Order"
      And I should see the text on checkout page "Address Details"
      And I enter details into comment area "Please deliver it on time."
      And I click on place order button
      And I enter payment details "Pinal Patel" "4263982640269299" "837" "02" and "2026"
      And I click on Pay and Confirm Order button
      Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
      And I click on download invoice after order success
      And I click on continue button after order success
      And I click on header menu option "Delete Account"
      Then I should see the account deleted message "ACCOUNT DELETED!"
      Then I click on continue button after deleting account

#Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Scroll down page to bottom
#        5. Verify 'SUBSCRIPTION' is visible
#        6. Click on arrow at bottom right side to move upward
#        7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

    @author_VibrantSoul
    Scenario: User should scroll down and scroll up using Arrow button at bottom right corner
      Given I am on homepage and verify the homepage URL
      When I scroll down up to subscription link
      Then I should see the subscription "SUBSCRIPTION" text
      And I click on arrow up button at bottom right corner
      And I should see the message "Full-Fledged practice website for Automation Engineers"

#Test Case 26: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Scroll down page to bottom
#        5. Verify 'SUBSCRIPTION' is visible
#        6. Scroll up page to top
#        7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

    @author_VibrantSoul
    Scenario: User should scroll down and scroll up without Arrow button
      Given I am on homepage and verify the homepage URL
      When I scroll down up to subscription link
      Then I should see the subscription "SUBSCRIPTION" text
      And I scroll up
      And I should see the message "Full-Fledged practice website for Automation Engineers"

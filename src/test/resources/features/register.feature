Feature: As a user,
  I should register successfully
  I should see error message while register with existing email
  I should Place Order: Register while Checkout
  I should Place Order: Register before Checkout
  I should Place Order: Login before Checkout
  I should verify address details in checkout page

#Test Case 1: Register User
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Signup / Login' button
#        5. Verify 'New User Signup!' is visible
#        6. Enter name and email address
#        7. Click 'Signup' button
#        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
#        9. Fill details: Title, Name, Email, Password, Date of birth
#        10. Select checkbox 'Sign up for our newsletter!'
#        11. Select checkbox 'Receive special offers from our partners!'
#        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#        13. Click 'Create Account button'
#        14. Verify that 'ACCOUNT CREATED!' is visible
#        15. Click 'Continue' button
#        16. Verify that 'Logged in as username' is visible
#        17. Click 'Delete Account' button
#        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

  @author_VibrantSoul @sanity @smoke
  Scenario: User should register successfully
    Given I am on homepage and verify the homepage URL
    When I click on header menu option "Signup / Login"
    Then I should see the login page text "New User Signup!"
    And I send name "Hina" and email "hina" to signup
    And I click on button "Signup"
    Then I should see text "ENTER ACCOUNT INFORMATION"
    And I fill all details in signup page "Mrs" "Hina@123" "14" "January" "1988" "Heena" "Patel" "Rugby Avenue" "Lalbaugh" "India" "Gujarat" "Surat" "395001" "09584766214"
    And I click on news letter subscription check box
    And I click on special offers check box
    And I click on Create Account button
    Then I see account created message "ACCOUNT CREATED!"
    And I click on continue button
    Then I should see the text "Logged in as " "Hina"
    And I click on header menu option "Delete Account"
    Then I should see the account deleted message "ACCOUNT DELETED!"
    And I click on continue button after deleting account

#Test Case 5: Register User with existing email
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Signup / Login' button
#        5. Verify 'New User Signup!' is visible
#        6. Enter name and already registered email address
#        7. Click 'Signup' button
#        8. Verify error 'Email Address already exist!' is visible

  @author_VibrantSoul @smoke
  Scenario: User should see error message while register with existing email
    Given I am on homepage and verify the homepage URL
    When I click on header menu option "Signup / Login"
    Then I should see the login page text "New User Signup!"
    And I send name "Hina" to name field in signup
    And I send email "pinalp@gmail.com" to email field in signup
    And I click on button "Signup"
    Then I should see error message "Email Address already exist!"

#Test Case 14: Place Order: Register while Checkout
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
#        19. Click 'Delete Account' button
#        20. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_VibrantSoul
  Scenario: User should Place Order: Register while Checkout
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
    And I click on header menu option "Delete Account"
    Then I should see the account deleted message "ACCOUNT DELETED!"
    Then I click on continue button after deleting account

#Test Case 15: Place Order: Register before Checkout
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click 'Signup / Login' button
#        5. Fill all details in Signup and create account
#        6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#        7. Verify ' Logged in as username' at top
#        8. Add products to cart
#        9. Click 'Cart' button
#        10. Verify that cart page is displayed
#        11. Click Proceed To Checkout
#        12. Verify Address Details and Review Your Order
#        13. Enter description in comment text area and click 'Place Order'
#        14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#        15. Click 'Pay and Confirm Order' button
#        16. Verify success message 'Your order has been placed successfully!'
#        17. Click 'Delete Account' button
#        18. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_VibrantSoul
  Scenario: User should Place Order: Register before Checkout
    Given I am on homepage and verify the homepage URL
    When I click on header menu option "Signup / Login"
    And I send name "Hina" and email "hina" to signup
    And I click on button "Signup"
    And I fill all details in signup page "Mrs" "Hina@123" "14" "January" "1988" "Heena" "Patel" "Rugby Avenue" "Lalbaugh" "India" "Gujarat" "Surat" "395001" "09584766214"
    And I click on Create Account button
    Then I see account created message "ACCOUNT CREATED!"
    And I click on continue button
    Then I should see the text "Logged in as " "Hina"
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    And I should see the text on checkout page "Review Your Order"
    And I should see the text on checkout page "Address Details"
    And I enter details into comment area "Please deliver it on time."
    And I click on place order button
    And I enter payment details "Pinal Patel" "4263982640269299" "837" "02" and "2026"
    And I click on Pay and Confirm Order button
    Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And I click on header menu option "Delete Account"
    Then I should see the account deleted message "ACCOUNT DELETED!"
    Then I click on continue button after deleting account

#Test Case 16: Place Order: Login before Checkout
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click 'Signup / Login' button
#        5. Fill email, password and click 'Login' button
#        6. Verify 'Logged in as username' at top
#        7. Add products to cart
#        8. Click 'Cart' button
#        9. Verify that cart page is displayed
#        10. Click Proceed To Checkout
#        11. Verify Address Details and Review Your Order
#        12. Enter description in comment text area and click 'Place Order'
#        13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#        14. Click 'Pay and Confirm Order' button
#        15. Verify success message 'Your order has been placed successfully!'
#        16. Click 'Delete Account' button
#        17. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_VibrantSoul
  Scenario: User should place the order successfully : Login before Checkout
    Given I am on homepage and verify the homepage URL
    When I click on header menu option "Signup / Login"
    Then I should see the login page text "Login to your account"
    And I enter "pinalp@gmail.com" email and "Pinal@123" password for login
    And I click on button "Login"
    Then I should see the text "Logged in as "
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    And I should see the text on checkout page "Review Your Order"
    And I should see the text on checkout page "Address Details"
    And I enter details into comment area "Please deliver it on time."
    And I click on place order button
    And I enter payment details "Pinal Patel" "4263982640269299" "837" "02" and "2026"
    And I click on Pay and Confirm Order button
    Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And I click on header menu option "Logout"

#Test Case 23: Verify address details in checkout page
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click 'Signup / Login' button
#        5. Fill all details in Signup and create account
#        6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#        7. Verify ' Logged in as username' at top
#        8. Add products to cart
#        9. Click 'Cart' button
#        10. Verify that cart page is displayed
#        11. Click Proceed To Checkout
#        12. Verify that the delivery address is same address filled at the time registration of account
#        13. Verify that the billing address is same address filled at the time registration of account
#        14. Click 'Delete Account' button
#        15. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_VibrantSoul
  Scenario: Verify address details in checkout page
    Given I am on homepage and verify the homepage URL
    When I click on header menu option "Signup / Login"
    And I send name "Hina" and email "hina" to signup
    And I click on button "Signup"
    And I fill all details in signup page "Mrs" "Hina@123" "14" "January" "1988" "Heena" "Patel" "Rugby Avenue" "Lalbaugh" "India" "Gujarat" "Surat" "395001" "09584766214"
    And I click on Create Account button
    Then I see account created message "ACCOUNT CREATED!"
    And I click on continue button
    Then I should see the text "Logged in as " "Hina"
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    Then I should see the delivery address is same address filled at the time registration of account "Rugby Avenue"
    And I should see billing address is same address filled at the time registration of account "Rugby Avenue"
    And I click on header menu option "Delete Account"
    Then I should see the account deleted message "ACCOUNT DELETED!"
    And I click on continue button after deleting account

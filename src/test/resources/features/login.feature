@regression
Feature: As a user,
  I should login successfully with correct email and password
  I should not login successfully with incorrect email and password
  I should logout successfully

#Test Case 2: Login User with correct email and password
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Signup / Login' button
#        5. Verify 'Login to your account' is visible
#        6. Enter correct email address and password
#        7. Click 'login' button
#        8. Verify that 'Logged in as username' is visible
#        9. Click 'Delete Account' button
#        10. Verify that 'ACCOUNT DELETED!' is visible

  @author_VibrantSoul @sanity @smoke
  Scenario: User should login successfully with correct email and password
    Given I am on homepage and verify the homepage URL
    When I click on header menu option "Signup / Login"
    Then I should see the login page text "Login to your account"
    And I enter "pinalp@gmail.com" email and "Pinal@123" password for login
    And I click on button "Login"

#Test Case 3: Login User with incorrect email and password
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Signup / Login' button
#        5. Verify 'Login to your account' is visible
#        6. Enter incorrect email address and password
#        7. Click 'login' button
#        8. Verify error 'Your email or password is incorrect!' is visible

  @author_VibrantSoul @smoke
  Scenario: User should not login successfully with incorrect email and password
    Given I am on homepage and verify the homepage URL
    When I click on header menu option "Signup / Login"
    Then I should see the login page text "Login to your account"
    And I enter "pinal@gmail.com" email and "pinal123" password for login
    And I click on button "Login"
    And I should see the login page text "Your email or password is incorrect!"

#Test Case 4: Logout User
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Signup / Login' button
#        5. Verify 'Login to your account' is visible
#        6. Enter correct email address and password
#        7. Click 'login' button
#        8. Verify that 'Logged in as username' is visible
#        9. Click 'Logout' button
#        10. Verify that user is navigated to login page

  @author_VibrantSoul
  Scenario: User should logout successfully
    Given I am on homepage and verify the homepage URL
    When I click on header menu option "Signup / Login"
    Then I should see the login page text "Login to your account"
    And I enter "pinalp@gmail.com" email and "Pinal@123" password for login
    And I click on button "Login"
    Then I should see the text "Logged in as "
    And I click on header menu option "Logout"
    And I am on login page and verify the login URL

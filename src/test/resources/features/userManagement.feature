@Regression @userManagement
Feature: Crater User Management
   User management focuses on user creation, update and delete 
   and also authentication.

  @validLoginTest
  Scenario: User is able to login successfully
    Given user is on the login page
    When user enters valid "adminuser@primetechschool.com" and "Testing123"
    And clicks on the login button
    Then user should be on the dashboard page

  @invalidLogin
  Scenario: Invalid login attempts
    Given user is on the login page  # implimented
    When user enters invalid "username" and "password"
    And clicks on the login button # implimented
    Then an error message appears
    And user is not logged in

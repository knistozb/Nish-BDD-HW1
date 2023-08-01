@LoginFeature @Regression
Feature: n  Techfios billing login page functionality validation

  Background: 
    Given User is on the techfios login page

  @LoginScenario1 @Sanity
  Scenario Outline: User should be able to login with valid credentials
    Given User is on the techfios login page
    When User enters the "<username>" in the username field
    When User enters the "<password>" in the password field
    And User clicks on sign in button
    Then User should land on dashboard page
    And User clicks on Bank and Cash
    And User clicks on New Account
    Then User should land on Add Contact page
    And User enters "<accountTitle>" in the accountTitle field in accounts page
    And User enters "<description>" in the description field in accounts page
    And User enters "<initialBalance>" in the initialBalance field in accounts page
    And User enters "<accountNumber>" in the accountNumber field in accounts page
    And User enters "<contactPerson>" in the contactPerson field in accounts page
    And User enters "<phone>" in the phone field in accounts page
    And User enters "<internetBankingURL>" in the internetBankingURL field in accounts page
    And User clicks on submit button
    Then User should be able to validate account created successfully

    Examples: 
      | username          | password | accountTitle     | description   | initialBalance | accountNumber | contactPerson    | phone   | internetBankingURL |
      | demo@techfios.com | abc123   | Nish BDD Account | BDD HW1 Final |            500 |        021821 | Bhattarai Family | 1234567 | www.nishhw1.com    |

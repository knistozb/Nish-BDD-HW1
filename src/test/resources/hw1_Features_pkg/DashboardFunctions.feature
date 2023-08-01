
# On Saturday, July 30, 2023, BDD class 3, sess 3 with MS Islam

# @DashboardFeature @Regression
Feature: n  Techfios dashboard page functionality validation


  Background: 
    Given User is on the techfios dashboard page

     
#@DashboardScenario1 @Sanity 
  Scenario: User should be able to click on dashboard menu options
    And User clicks on Bank and Cash
    And User clicks on New Account
    When User clicks on sign in button
    Then User should land on dashboard page



 
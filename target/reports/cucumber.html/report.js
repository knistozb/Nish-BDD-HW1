$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:hw1_Features_pkg/TechfiosLogin.feature");
formatter.feature({
  "name": "n  Techfios billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginScenario1"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the \"\u003cpassword\u003e\" in the password field",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on Bank and Cash",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on New Account",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on Add Contact page",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters \"\u003caccountTitle\u003e\" in the accountTitle field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cdescription\u003e\" in the description field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the initialBalance field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountNumber\u003e\" in the accountNumber field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccontactPerson\u003e\" in the contactPerson field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cphone\u003e\" in the phone field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinternetBankingURL\u003e\" in the internetBankingURL field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingURL"
      ]
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Nish BDD Account",
        "BDD HW1 Final",
        "500",
        "021821",
        "Bhattarai Family",
        "1234567",
        "www.nishhw1.com"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@LoginScenario1"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"demo@techfios.com\" in the username field",
  "keyword": "When "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.user_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"abc123\" in the password field",
  "keyword": "When "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Bank and Cash",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on New Account",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.user_clicks_on_New_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on Add Contact page",
  "keyword": "Then "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.user_should_land_on_Add_Contact_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Nish BDD Account\" in the accountTitle field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.User_enters_accountTitle_in_the_accountTitle_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"BDD HW1 Final\" in the description field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.User_enters_description_in_the_description_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"500\" in the initialBalance field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.User_enters_initialBalance_in_the_initialBalance_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"021821\" in the accountNumber field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.User_enters_accountNumber_in_the_accountNumber_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Bhattarai Family\" in the contactPerson field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.User_enters_contactPerson_in_the_contactPerson_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"1234567\" in the phone field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.User_enters_phone_in_the_phone_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"www.nishhw1.com\" in the internetBankingURL field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.User_enters_internetBankingURL_in_the_internetBankingURL_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.User_clicks_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "hw1_Steps_pkg.LoginStepsDefinition.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
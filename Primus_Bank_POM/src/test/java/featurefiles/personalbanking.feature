#Author: Joseph Gnanaraj
@personalbanking
Feature: Primus Bank - Personal Banking Page
  The Following Scenarios will be Executed

  Background: Launch the Personal Banking page of Primus Bank
    Given Launch the Primus Bank Browser Application
    When I Click on Personal Banking in Menu Option
    Then The Personal Banking Page must be opened

  @navigate-savingsaccount
  Scenario: Navigate to Savings Account Page
    When I Click on Savings Account Button
    Then The Savings Account Page Should Be Opened
    Then Close the Browser Application

  @navigate-fixeddeopsits
  Scenario: Navigate to Fixed Deposits Page
    When I Click on Fixed Deposits Button
    Then The Fixed Deposits Page Should Be Opened
    Then Close the Browser Application

  @navigate-moneytransfer
  Scenario: Navigate to Money Transfer Page
    When I Click on Money Transfer Button
    Then The Money Transfer Page Should Be Opened
    Then Close the Browser Application

  @navigate-cards
  Scenario: Navigate to Cards Page
    When I Click on Cards Button
    Then The Cards Page Should Be Opened
    Then Close the Browser Application

  @navigate-loans
  Scenario: Navigate to Loans Page
    When I Click on Loans Button
    Then The Loans Page Should Be Opened
    Then Close the Browser Application

  @navigate-payments
  Scenario: Navigate to Payments Page
    When I Click on Payments Button
    Then The Payments Page Should Be Opened
    Then Close the Browser Application

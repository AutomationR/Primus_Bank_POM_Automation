#Author: Joseph Gnanaraj

@home
Feature: Primus Bank Home
  The Following Scenarios will be Executed

  Background: Launch the Primus Bank Application
    Given Launch the Primus Bank Application

  #Scenarios For Checking the Menu Links
  
  @navigate-personalbanking
  Scenario: To Navigate to Personal Banking page
    When I Click on Personal Banking Menu Option
    Then The Personal Banking Page should be opened
    Then Close the Application

  @navigate-corporatebanking
  Scenario: To Navigate to Corporate Banking page
    When I Click on Corporate Banking Menu Option
    Then The Corporate Banking Page should be opened
    Then Close the Application

  @navigate-internationalbanking
  Scenario: To Navigate to International Banking page
    When I Click on International Banking Menu Option
    Then The International Banking Page should be opened
    Then Close the Application

  @navigate-aboutusbanking
  Scenario: To Navigate to About Us page
    When I Click on About Us Menu Option
    Then The About Us Page should be opened
    Then Close the Application

  #Scenarios For Checking the Customer Login Section Links
  
  @navigate-personal
  Scenario: To Navigate to Personal Login Page
    When I Click on Personal Button in Customer Login Section
    Then Personal Login Page Should Be Opened
    Then Close the Application

  @navigate-corporate
  Scenario: To Navigate to Corporate Login Page
    When I Click on Corporate Button in Customer Login Section
    Then Corporate Login Page Should Be Opened
    Then Close the Application
    
  @navigate-international
  Scenario: To Navigate to International Login Page
    When I Click on International Button in Customer Login Section
    Then International Login Page Should Be Opened
    Then Close the Application

  #Scenario For Validating Banking Login Section
  
  @bankerlogin
  Scenario Outline: To Perform Banker Login
    When I Select "<branch>" , "<username>" and "<password>" in Banker Login Details
    And Click on Login Button
    Then The Admin Page should be Opened
    Then Close the Application

    Examples: 
      | branch | username | password |
      | Dubhai | Admin    | Admin    |
     

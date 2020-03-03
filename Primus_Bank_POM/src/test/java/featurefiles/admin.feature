#Author: Joseph Gnanaraj
@admin
Feature: Primus Bank - Admin Page
  The Following Scenarios will be executed

  Background: Launch the Admin page of Primus Bank
    Given Launch the Primus Bank Application in Chrome

  @navigate-branches
  Scenario Outline: Navigate to Branches Page
    When I Select "<branch>" , "<username>" and "<password>" in Banker Login Section
    And Click on Login
    Then The Admin Page must be Opened
    When I Click on Branches Button
    Then Branches Page should be opened.
    Then Close The Primus Bank Application

    Examples: 
      | branch | username | password |
      | Dubhai | Admin    | Admin    |

  @navigate-roles
  Scenario Outline: Navigate to Roles Page
    When I Select "<branch>" , "<username>" and "<password>" in Banker Login Section
    And Click on Login
    Then The Admin Page must be Opened
    When I Click on Roles Button
    Then Roles Page should be opened.
    Then Close The Primus Bank Application

    Examples: 
      | branch | username | password |
      | Dubhai | Admin    | Admin    |

  @navigate-users
  Scenario Outline: Navigate to Users Page
    When I Select "<branch>" , "<username>" and "<password>" in Banker Login Section
    And Click on Login
    Then The Admin Page must be Opened
    When I Click on Users Button
    Then Users Page should be opened.
    Then Close The Primus Bank Application

    Examples: 
      | branch | username | password |
      | Dubhai | Admin    | Admin    |

  @navigate-employee
  Scenario Outline: Navigate to Employees Page
    When I Select "<branch>" , "<username>" and "<password>" in Banker Login Section
    And Click on Login
    Then The Admin Page must be Opened
    When I Click on Employees Button
    Then Employees Page should be opened.
    Then Close The Primus Bank Application

    Examples: 
      | branch | username | password |
      | Dubhai | Admin    | Admin    |

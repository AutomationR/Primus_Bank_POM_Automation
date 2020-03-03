#Author: Joseph Gnanaraj
@admin_branches
Feature: Primus Bank - Admin Branches Page
  The Following Scenarios will be Executed

  Background: Launch the Admin page of Primus Bank
    Given Launch the Primus Bank Application in Browser
    When I Select "abcd1" , "Admin" and "Admin" in Banker Login Sect
    And Click on the Login Button
    Then The Admin Page must open
    When I Click on Branches
    Then Branches Page must be opened.

  @register_new_branch
  Scenario Outline: To Register New Branch
    When I Click on New Branches Button
    And Enter the "<branchname>" , "<address1>" , "<address2>" , "<address3>" , "<area>" , "<zipcode>" , and Select the "<country>" , "<state>" , "<city>"
    And Click on the Submit Button
    Then The New Branch Should be Added

    Examples: 
      | branchname | address1 | address2 | address3     | area    | zipcode | country | state      | city    |
      | Tester     | This is  | a Test   | Case Address | Eclipse |  600127 | INDIA   | Tamil Nadu | CHENNAI |

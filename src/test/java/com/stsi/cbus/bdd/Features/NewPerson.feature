Feature: New Person Feature

  @NewHire
  Scenario: Add New Hire Employee into the Organisation
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "New Person" Link Under My Clients Group
    When  I Click On "Hire an Employee" Icon under New Person Page
    Then  I Validate the Page with "Hire an Employee: Identification" header is Displayed
    When  I Enter Employee details in the "Hire an Employee" Identification Section and Click on Next
    Then  I Validate the Page with "Hire an Employee: Person Information" header is Displayed
    When  I Enter all Employee details in the Person Information Section and Click on Next Button
    Then  I Validate the Page with "Hire an Employee: Employment Information" header is Displayed
    When  I Enter all Employee details in the Employment Information Section and Click on Next Button
    Then  I Validate the Page with "Hire an Employee: Compensation and Other Information" header is Displayed
    When  I Enter all Employee Compensation details in Compensation Section and Click on Next Button
    Then  I Validate the Page with "Hire an Employee: Review" header is Displayed
    Then  I Click on Submit Button to Submit the New Hire Employee Request


  @ContingentWorker
  Scenario: Add Contingent into the Organisation
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "New Person" Link Under My Clients Group
    When  I Click On "Add a Contingent Worker" Icon under New Person Page
    Then  I Validate the Page with "Add a Contingent Worker: Identification" header is Displayed
    When  I Enter Employee details in the "Add a Contingent Worker" Identification Section and Click on Next
    Then  I Validate the Page with "Add a Contingent Worker: Person Information" header is Displayed
    When  I Enter all Employee details in the Person Information Section and Click on Next Button
    Then  I Validate the Page with "Add a Contingent Worker: Employment Information" header is Displayed
    When  I Enter all Employee details in the Employment Information Section and Click on Next Button
    Then  I Validate the Page with "Add a Contingent Worker: Compensation and Other Information" header is Displayed
    When  I Enter all Employee Compensation details in Compensation Section and Click on Next Button
    Then  I Validate the Page with "Add a Contingent Worker: Review" header is Displayed
    Then  I Click on Submit Button to Submit the New Hire Employee Request


  @PendingWorker
  Scenario: Add Pending Worker into the Organisation
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "New Person" Link Under My Clients Group
    When  I Click On "Add a Pending Worker" Icon under New Person Page
    Then  I Validate the Page with "Add a Pending Worker: Identification" header is Displayed
    And   I Enter Employee details in the "Add Pending Worker" Identification Section and Click on Next
    Then  I Validate the Page with "Add a Pending Worker: Person Information" header is Displayed
    When  I Enter all Employee details in the Person Information Section and Click on Next Button
    Then  I Validate the Page with "Add a Pending Worker: Person Profile" header is Displayed
    Then  I Enter Person Profile Details and Click on Next Button
    Then  I Validate the Page with "Add a Pending Worker: Employment Information" header is Displayed
    When  I Enter all Employee details in the Employment Information Section and Click on Next Button
    Then  I Validate the Page with "Add a Pending Worker: Compensation and Other Information" header is Displayed
    When  I Enter all Employee Compensation details in Compensation Section and Click on Next Button
    Then  I Validate the Page with "Add a Pending Worker: Review" header is Displayed
    Then  I Click on Submit Button to Submit the New Hire Employee Request
Feature: PersonManagement Feature

  @Terminate
  Scenario:
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    Then  I Click on the Actions Icon and Select Work Relationship Action under Personal and Employment Section
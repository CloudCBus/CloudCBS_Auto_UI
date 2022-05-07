Feature: HomePage Feature

  @home
  Scenario:
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And  I Click on "My Client Groups" Link in NAV Tabs on Main Page
    Then  I Click on "Person Management" Link Under My Clients Group
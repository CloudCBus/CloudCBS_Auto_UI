Feature: Employee Self Service


  @AddEmail
  Scenario: Add Email
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "Me" Link in NAV Tabs on Main Page
    And   I Click on "Personal Information" Cluster link Under My Team Section
    Then  I Validate the Page with "Personal Info" header is Displayed
    When  I Click on "Contact Info" Icon in Personal Info Page
    Then  I Validate the Page with "Contact Info" header is Displayed
    Then  I Click On Add Dropdown and Select "Email Details" option
    When  I Select "Work Email" item From Contact Type DropDown
    Then  I Enter Email Details and Click On Submit Button


  @AddorChangePhone
  Scenario: Add or Change Phone Numbers
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "Me" Link in NAV Tabs on Main Page
    And   I Click on "Personal Information" Cluster link Under My Team Section
    Then  I Validate the Page with "Personal Info" header is Displayed
    When  I Click on "Contact Info" Icon in Personal Info Page
    Then  I Validate the Page with "Contact Info" header is Displayed
    Then  I Click On Add Dropdown and Select "Phone Details" option
    When  I Select "Home Phone" item From Contact Type DropDown
    Then  I Enter Contact Details and Click On Submit Button


  @ChangeMaritalStatus
  Scenario: Add or Change Phone Numbers
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "Me" Link in NAV Tabs on Main Page
    And   I Click on "Personal Information" Cluster link Under My Team Section
    Then  I Validate the Page with "Personal Info" header is Displayed
    When  I Click on "Personal Details" Icon in Personal Info Page
    Then  I Validate the Page with "Personal Details" header is Displayed
    Then  I Click On Edit Demographic Info Icon
    Then  I change the Maritial status And Click On Submit Button

  @ChangeAddress
  Scenario: Add or Change Phone Numbers
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "Me" Link in NAV Tabs on Main Page
    And   I Click on "Personal Information" Cluster link Under My Team Section
    Then  I Validate the Page with "Personal Info" header is Displayed
    When  I Click on "Contact Info" Icon in Personal Info Page
    Then  I Validate the Page with "Contact Info" header is Displayed
    Then  I Click On Add Button to Add or change the Address
    When  I Select "Home Address" item From Contact Type DropDown
    Then  I Enter Address Details and Click On Submit Button


  @AdditionalPersonalInformation
  Scenario: Additional Personal Information
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "Me" Link in NAV Tabs on Main Page
    And   I Click on "Personal Information" Cluster link Under My Team Section
    Then  I Validate the Page with "Personal Info" header is Displayed
    When  I Click on "Additional Person Info" Icon in Personal Info Page
    Then  I Validate the Page with "Additional Person Info" header is Displayed
    Then  I Click On Add Assigned Property Buton to add property details
    Then  I Enter Assigned Property Details and Click On Submit Button
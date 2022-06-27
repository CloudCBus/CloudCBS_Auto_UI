Feature: PersonManagement Feature

  @Terminate
  Scenario: Terminate an Employee and Validate the Employee Should not be visible in the System after Termination.
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Work Relationship" Action under "Personal and Employment" Section
    Then  I Validate Work Relationship page is displayed
    When  I Select "Terminate" Item in Actions Dropdown in WorkRelationship Page
    Then  I Validate Terminate Work Relationship Page is Displayed
    When  I Enter Termination Date and Review the Termination Process and Submit the Request
    Then  I Validate the Employee should not appear in the System anymore upon Employee Search


  @AddSecassignment
  Scenario: Terminate an Employee and Validate the Employee Should not be visible in the System after Termination.
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Employment" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Employment" header is Displayed
    Then  I Click Edit button and Select "Update" Employement option from the dropdown
    When  I Select Action as "Add Assignment" and Action Reason as "Internal Recruitment" and Click on OK Button
    Then  I Validate the Page with "Add Assignment: Employment Information" header is Displayed
    When  I Click on Add Assignment Label and enter all the Mandatory fields and Click on Next Button
    Then  I Validate the Page with "Add Assignment: Compensation" header is Displayed
    When  I Enter all Mandatory Details in the Compensation Section and Click on Next
    Then  I Validate the Page with "Add Assignment: Roles" header is Displayed
    When  I Enter all Mandatory Details in the Roles Section and Click on Next
    Then  I Validate the Page with "Add Assignment: Review" header is Displayed
    Then  I Click On Submit Button to Sumbit the Secendory Assignment



  @AddContingentWorkerAssignment
  Scenario: Add Contingent Worker Assignment to an Existing Employee
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Create Work Relationship" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Create Work Relationship: Identification" header is Displayed
    When  I Enter Add Assignement Action Action Reason and Legal Employer and Click on Next
          |              Action                  |              ActionReason	                |     LegalEmployer        |    WorkerType          |
          |   Add Employee Work Relationship     |   Additional work relationship for Employee  |     US1 Legal Entity     |    Contingent worker   |
    Then  I Validate the Page with "Create Work Relationship: Person Information" header is Displayed
    When  I Enter all Employee details in the Person Information Section and Click on Next Button
    Then  I Validate the Page with "Create Work Relationship: Employment Information" header is Displayed
    When  I Enter all Employee details in the Employment Information Section and Click on Next Button
    Then  I Validate the Page with "Create Work Relationship: Compensation and Other Information" header is Displayed
    When  I Enter all Employee Compensation details in Compensation Section and Click on Next Button
    Then  I Validate the Page with "Create Work Relationship: Review" header is Displayed
    Then  I Click on Submit Button to Submit the New Hire Employee Request




  @PersonExternalIdentifiers
  Scenario: Add Person External Identifiers
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Person Identifiers for External Applications" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Person Identifiers for External Applications" header is Displayed
    When  I Enter below Person Identifier Details and Click on Submit Button
          |         IdentifierType       |        Identifier       |        IdentifierComments      |
          |     Third-Party Payroll ID   |          546723         |      Secendory Identifier      |


  @cancelWorkRelationship
  Scenario: Cancel Work Relationship
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Work Relationship" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Work Relationship Details" header is Displayed
    When  I Select "Terminate" Item in Actions Dropdown in WorkRelationship Page
    Then  I Validate the Page with "Terminate Work Relationship" header is Displayed
    When  I Enter Termination Date and Review the Termination Process and Submit the Request




  @PramoteAnEmployee
  Scenario: Demote an Employee
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Employment" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Employment" header is Displayed
    Then  I Click Edit button and Select "Update" Employement option from the dropdown
    When  I Select Action as "Promotion" and Action Reason as "Performance" and Click on OK Button
    Then  I Validate the Page with "Edit Employment: Promotion" header is Displayed
    When  I change the JOB Name and Click on Review Button
    Then  I Validate the Page with "Edit Employment: Review" header is Displayed
    Then  I Review the Change Details and Click on Submit Button




  @demoteAnEmployee
  Scenario: Demote an Employee
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Employment" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Employment" header is Displayed
    Then  I Click Edit button and Select "Update" Employement option from the dropdown
    When  I Select Action as "Demotion" and Action Reason as "Performance" and Click on OK Button
    Then  I Validate the Page with "Edit Employment: Demotion" header is Displayed
    When  I Enter all Employee Demotion Details and Click on Review Button
    Then  I Validate the Page with "Edit Employment: Review" header is Displayed
    Then  I Review the Demotion Details and Click on Submit Button




  @AssignmentChange
  Scenario: Assignment Change Of an Employee
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Employment" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Employment" header is Displayed
    Then  I Click Edit button and Select "Update" Employement option from the dropdown
    When  I Select Action as "Assignment Change" and Action Reason as "Contract Renewal" and Click on OK Button
    Then  I Validate the Page with "Edit Employment: Assignment Change" header is Displayed
    Then  I change the Assignemt Name and Click on Review Button
    Then  I Validate the Page with "Edit Employment: Review" header is Displayed
    Then  I Review the Change Details and Click on Submit Button

  @JobChange
  Scenario: Assignment Change Of an Employee
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Employment" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Employment" header is Displayed
    Then  I Click Edit button and Select "Update" Employement option from the dropdown
    When  I Select Action as "Job Change" and Action Reason as "Performance" and Click on OK Button
    Then  I Validate the Page with "Edit Employment: Job Change" header is Displayed
    Then  I change the JOB Name and Click on Review Button
    Then  I Validate the Page with "Edit Employment: Review" header is Displayed
    Then  I Review the Change Details and Click on Submit Button



  @LocationChange
  Scenario: Job Location Change
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Employment" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Employment" header is Displayed
    Then  I Click Edit button and Select "Update" Employement option from the dropdown
    When  I Select Action as "Location Change" and Action Reason as "Worker Request" and Click on OK Button
    Then  I Validate the Page with "Edit Employment: Location Change" header is Displayed
    Then  I change the Location Name and Click on Review Button
    Then  I Validate the Page with "Edit Employment: Review" header is Displayed
    Then  I Review the Change Details and Click on Submit Button


  @Transfer
  Scenario: Transfer an Employee
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Employment" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Employment" header is Displayed
    Then  I Click Edit button and Select "Update" Employement option from the dropdown
    When  I Select Action as "Transfer" and Action Reason as "Worker Request" and Click on OK Button
    Then  I Validate the Page with "Edit Employment: Transfer" header is Displayed
    Then  I change the Location Name and Click on Review Button
    Then  I Validate the Page with "Edit Employment: Review" header is Displayed
    Then  I Review the Change Details and Click on Submit Button



  @WorkingHrsChange
  Scenario: Working Hours Change
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Employment" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Employment" header is Displayed
    Then  I Click Edit button and Select "Update" Employement option from the dropdown
    When  I Select Action as "Working Hours Change" and Action Reason as "Reorganization" and Click on OK Button
    Then  I Validate the Page with "Edit Employment: Working Hours Change" header is Displayed
    Then  I change the Employee Working Hours and Click on Review Button
    Then  I Validate the Page with "Edit Employment: Review" header is Displayed
    Then  I Review the Change Details and Click on Submit Button



  @PersonExtraInformation
  Scenario: Update Person Extra Information
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Client Groups" Link in NAV Tabs on Main Page
    And   I Click on "Person Management" Link Under My Clients Group
    Then  I Verify Person Management Search Page is Displayed
    When  I Search Employee by Person Number and Click on Search Button
    Then  I Validate the Employee with Person Number is Displayed in the Search Results
    When  I Click on the Actions Icon and Select "Person" Action under "Personal and Employment" Section
    Then  I Validate the Page with "Person" header is Displayed
    Then  I Click Edit button and Select "Update" Employement option from the dropdown
    When  I Select Action as "Working Hours Change" and Action Reason as "Reorganization" and Click on OK Button
    Then  I Validate the Page with "Edit Employment: Working Hours Change" header is Displayed
    Then  I change the Employee Working Hours and Click on Review Button
    Then  I Validate the Page with "Edit Employment: Review" header is Displayed
    Then  I Review the Change Details and Click on Submit Button

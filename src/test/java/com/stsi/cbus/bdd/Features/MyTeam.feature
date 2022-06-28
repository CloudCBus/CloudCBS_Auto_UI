Feature: My Team Page Feature

  @AddAssignment
  Scenario: Add New Hire Employee into the Organisation
    Given I Navigate to Oracel HCM Login Page
    Then  I Login into the Application with Valid Credentials
    And   I Click on "My Team" Link in NAV Tabs on Main Page
    And   I Click on "My Team" Cluster link Under My Team Section
    Then  I Search Person by the Person Name and Click on Search Icon
    Then  I Click on "Add Assignment" from the Actions List under Workers Sections
    And   I Validate "Add Assignment" Page is displayed for the Employee
    Then  I Click On all the Assignment Options and Click on Continue Button
    Then  I Enter the details in "When and Why" details Pannel and Click on Continue
    Then  I Enter the details in "Assignment" details Pannel and Click on Continue
    Then  I Enter the details in "Maintain Managers" details Pannel and Click on Continue
    Then  I Enter the details in "Salary" details Pannel and Click on Continue
    Then  I Enter the details in "Compensation" details Pannel and Click on Continue
    Then  I Enter the details in "Add Direct Reports" details Pannel and Click on Continue
    Then  I Enter the details in "Comments and Attachments" details Pannel and Click on Continue
    Then  I Click on Submit Button to Submit the Candidate Assignement

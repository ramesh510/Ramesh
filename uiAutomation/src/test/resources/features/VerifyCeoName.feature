
@GetCEOName
Feature: To get CEO name from OrangeHRM app
 
  
  
  Scenario Outline: To Verify CEO name
    Given User logged in successfully and is on home page
    When user clicks on the directory option from the drop down
    And user selects the job title as "CEO" from the drop down
    And clicks the search button
    Then user should see the CEO name as "<CEO_Name>" 

    Examples: 
      | CEO_Name  | 
      | John Smith  |

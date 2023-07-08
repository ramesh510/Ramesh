
@timesheets
Feature: To get pending timesheets
 
  
  
  Scenario Outline: To Verify pending timesheet
    Given User is on home page
    When user clicks on the time option from the menu
    And user enters the name "John Smith"
    And clicks on the view button
    Then user should see the message as "<message>" 

    Examples: 
      | message  | 
      | No Timesheets Found  |

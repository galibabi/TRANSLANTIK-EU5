Feature: Vehicle Information
@wip
Scenario Outline: Landing on All Cars page


Given the user logged in as "<userType>"
When the user navigates to "Fleet" "Vehicles"
Then User should see the table  of vehicle information


Examples:
| userType      |
| driver        |
| store manager |
| sales manager |


  Scenario Outline: Downloading the table


    Given the user logged in as "<userType>"
    And the user navigates to "Fleet" "Vehicles"
    When User can download table data in XLS or CSV format


    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |
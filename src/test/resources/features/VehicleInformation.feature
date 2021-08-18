@530
Feature: Vehicle Information
@AC125
  Scenario Outline: Landing on All Cars page
    Given the user logged in as "<userType>"
    When the user navigates to "Fleet" "Vehicles"
    Then User should see the table  of vehicle information
    And user should see total recordings
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |

@AC3
  Scenario Outline: Downloading the table
    Given the user logged in as "<userType>"
    And the user navigates to "Fleet" "Vehicles"
    When user selects the format XLS or CSV under ExportGrid dropdown
    Then user succesfully downloaded the table
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |

  @AC4
  Scenario Outline: User can see the total page and change the page number
    Given the user logged in as "<userType>"
    When the user navigates to "Fleet" "Vehicles"
    And user selects different page
    Then user is on selected page and can see total pages
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |
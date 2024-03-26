Feature: Hw_1

  @Hw1
  Scenario: Simple Dynamic Buttons scenario
   Given I open the browser
    And I am on the simple dynamic page
    When I am start click
    When I am first click
    When I am second click
    When I am third click
    Then I should see All Buttons Clicked on the results
    Then I close the browser
Feature: first

  This is the description that i am adding to the feature file

  Scenario: The name of scenario
    Given I open the browser
    And I am on the google homepage
    When I search for "amazon" on google
    Then I should see "amazon" on the results
    Then I close the browser

  Scenario: The name of second scenario
    Given I open the browser
    And I am on the google homepage
    When I search for "abdullah" on google
    Then I should see "abdullah" on the results
    Then I close the browser
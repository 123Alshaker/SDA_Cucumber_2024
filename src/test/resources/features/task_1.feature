Feature: task_1

@samsung
  Scenario: TC01_samsungSearch scenario
    Given I open the browser
    And I am on the google homepage
    When I search for "samsung" on google
    Then I should see "samsung" on the results
    Then I close the browser

  @cucmber
  Scenario: TC02_cucmberSearch scenario
    Given I open the browser
    And I am on the google homepage
    When I search for "cucmber" on google
    Then I should see "cucmber" on the results
    Then I close the browser
Feature: Search functionality

  Background:
    Given  I open home page

  Scenario: Searching by valid query should return proper results
    When  I search by "DynaMed"
    Then  I should see results
    And   I can open first search result
    And   I should find "DynaMed" on page

  Scenario: Searching by valid query should return proper results
    When  I search by "qweqweqwe"
    Then  I should see message "Your search yielded no results."




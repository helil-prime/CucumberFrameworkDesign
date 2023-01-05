Feature: Amazon search

  @amazonSearchTests
  Scenario Outline: Search items on amazon
    Given I am on the amazon homepage
    When I enter the search term "<items>"
    And I click on search button
    Then I should see the search item "<items>" on search result page

    Examples: 
      | name  | value |
      | name1 |     5 |
      | name2 |     7 |

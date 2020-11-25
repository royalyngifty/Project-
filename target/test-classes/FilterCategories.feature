Feature: Verify filter Categories under Clothes section

  In order to test filter functionality of filter Categories
  As a visitor on the page
  I want to be able to apply filters under Clothes section


  Scenario: Verify all values in filter Categories
    Given User is on the homepage
    And user selects Clothes section
    When user selects both filters in Categories
    Then both categories filters are shown as active


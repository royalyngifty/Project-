Feature: Open pages under Clothes section

  In order to test filter functionality
  As a visitor on the page
  I want to be able to open pages under Clothes section

  Scenario: Verify that Clothes section is opened
    Given User is on MyStore page
    When user selects Clothes section
    Then Clothes section is shown


  Scenario: Verify that page Men under Clothes section is opened
    Given User is on MyStore page
    And user selects Clothes section
    When  selects link Men under Clothes section
    Then page with query parameter Men is opened


  Scenario: Verify that page Women under Clothes section is opened
    Given User is on MyStore page
    And user selects Clothes section
    When  selects link Women under Clothes section
    Then page with query parameter Women is opened
Feature: Open pages under Clothes section

  In order to test filter functionality
  As a visitor on the page
  I want to be able to open pages under Clothes section

  Scenario: Verify that Clothes section is opened
    Given user is on the My Store page
    When user selects Clothes section
    Then Clothes section is shown
    And Filters are not shown in the menu

  Scenario Outline: Verify that pages under Clothes section are opened
    Given user is on the My Store page
    And user selects Clothes section
    When user selects <gender>
    Then <genderPage> is opened

  Examples:
    | gender | genderPage                           |
    | Men    | http://40.76.27.113:8085/en/4-men    |
    | Women  | http://40.76.27.113:8085/en/4-women  |
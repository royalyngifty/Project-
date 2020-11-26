Feature: Verify filter Categories under Clothes section

  In order to test filter functionality of filter Categories
  As a visitor on the page
  I want to be able to apply filters under Clothes section


  Scenario: Verify both active filters in Categories
    Given git 
    And user selects Clothes section
    When user selects both filters
    Then both categories filters are shown as active

  Scenario: Verify that active filter Women is shown in Categories
    Given User is on MyStore page
    And user selects Clothes section
    When user clicks on filter Woman in Categories
    Then Woman filter is shown as active

  Scenario: Verify that active filter Men is shown in Categories
    Given User is on MyStore page
    And user selects Clothes section
    When user clicks on filter Men in Categories
    Then Men filter is shown as active

  Scenario Outline: Verify Links after filter is applied
    Given User is on MyStore page
    And user selects Clothes section
    When user selects <oneCategory> in Categories
    Then <link> with query parameter is shown

    Examples:
      | oneCategory                           | link                                                     |
      | //label/span/span                     | http://40.76.27.113:8085/en/3-clothes?q=Categories-Men   |
      | //section[1]/ul/li[2]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Categories-Women |


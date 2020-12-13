Feature: Verify filter Property under Clothes section

  In order to test functionality of filter property
  As a visitor on the page
  I want to be able to apply filters under Clothes section and related pages



  Scenario Outline: Verify one by one value for filter property in Clothes section
    Given User is on MyStore page
    And user selects Clothes section
    When user selects <property> in Categories
    Then "<filter>" should be applied

    Examples:
      | property                              | filter                     |
      | //section[4]/ul/li[1]/label/span/span | Property: Long sleeves\n  |
      | //section[4]/ul/li[2]/label/span/span | Property: Short sleeves\n |

  Scenario Outline: Verify one by one value for filter property in Clothes section
    Given User is on MyStore page
    And user selects Clothes section
    When user selects <property> in Categories
    Then <link> with query parameter is shown
    Examples:
      | property                              | link                                                           |
      | //section[4]/ul/li[1]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Property-Long+sleeves  |
      | //section[4]/ul/li[2]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Property-Short+sleeves |

  Scenario Outline: Verify two values for filter Property in Clothes section
    Given User is on MyStore page
    And user selects Clothes section
    When user selects two filters <filter1> and <filter2> under Categories Size page
    Then <link> and active filters <actFilter1> and <actFilter2> are shown
    Examples:
      | filter1                               | filter2                               | link                                                                        | actFilter1                                       | actFilter2                                       |
      | //section[4]/ul/li[1]/label/span/span | //section[2]/ul/li[2]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Property-Long+sleeves-Short+sleeves | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |

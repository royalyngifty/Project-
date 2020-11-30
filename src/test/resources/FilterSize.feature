Feature: Verify filter Size under Clothes section

  In order to test functionality of filter Size
  As a visitor on the page
  I want to be able to apply filters under Clothes section and related pages

  Scenario Outline: Verify one by one value for filter Size in Clothes section
    Given User is on MyStore page
    And user selects Clothes section
    When user selects <filter> in Categories
    Then <link> with query parameter is shown

    Examples:
      | filter                                | link                                            |
      | //section[2]/ul/li[1]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Size-S  |
      | //section[2]/ul/li[2]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Size-M  |
      | //section[2]/ul/li[3]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Size-L  |
      | //section[2]/ul/li[4]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Size-XL |

  Scenario Outline: Verify two values for filter Size in Categories
   Given User is on MyStore page
   And user selects Clothes section
   When user selects two filters <filter1> and <filter2> under Categories Size page
   Then <link> and active filters <actFilter1> and <actFilter2> are shown
   Examples:
     | filter1                               | filter2                               | link                                              | actFilter1                                       | actFilter2                                       |
     | //section[2]/ul/li[1]/label/span/span | //section[2]/ul/li[2]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Size-S-M  | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
     | //section[2]/ul/li[1]/label/span/span | //ul/li[3]/label/span/span            | http://40.76.27.113:8085/en/3-clothes?q=Size-S-L  | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
     | //section[2]/ul/li[2]/label/span/span | //section[2]/ul/li[4]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Size-M-XL | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
     | //section[2]/ul/li[3]/label/span/span | //section[2]/ul/li[4]/label/span/span | http://40.76.27.113:8085/en/3-clothes?q=Size-L-XL | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |

  Scenario Outline: Verify two values for filter Size in Categories Man page
    Given User is on MyStore page
    And user selects Clothes section
    And user selects Men link under Clothes section
    When user selects two filters <filter1> and <filter2> under Categories Size page
    Then <link> and active filters <actFilter1> and <actFilter2> are shown
    Examples:
      | filter1                               | filter2                               | link                                          | actFilter1                                       | actFilter2                                       |
      | //section[1]/ul/li[1]/label/span/span | //section[1]/ul/li[2]/label/span/span | http://40.76.27.113:8085/en/4-men?q=Size-S-M  | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
      | //section[1]/ul/li[1]/label/span/span | //section[1]/ul/li[3]/label/span/span | http://40.76.27.113:8085/en/4-men?q=Size-S-L  | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
      | //section[1]/ul/li[2]/label/span/span | //section[1]/ul/li[4]/label/span/span | http://40.76.27.113:8085/en/4-men?q=Size-M-XL | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
      | //section[1]/ul/li[3]/label/span/span | //section[1]/ul/li[4]/label/span/span | http://40.76.27.113:8085/en/4-men?q=Size-L-XL | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |

  Scenario Outline: Verify two values for filter Size in Categories Women page
    Given User is on MyStore page
    And user selects Clothes section
    And user selects Women link under Clothes section
    When user selects two filters <filter1> and <filter2> under Categories Size page
    Then <link> and active filters <actFilter1> and <actFilter2> are shown

    Examples:
      | filter1                               | filter2                               | link                                            | actFilter1                                       | actFilter2                                       |
      | //section[1]/ul/li[1]/label/span/span | //section[1]/ul/li[2]/label/span/span | http://40.76.27.113:8085/en/5-women?q=Size-S-M  | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
      | //section[1]/ul/li[2]/label/span/span | //section[1]/ul/li[3]/label/span/span | http://40.76.27.113:8085/en/5-women?q=Size-M-L  | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
      | //section[1]/ul/li[1]/label/span/span | //section[1]/ul/li[4]/label/span/span | http://40.76.27.113:8085/en/5-women?q=Size-S-XL | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |

Feature: Verify filter Color under Clothes section

  In order to test functionality of filter Color
  As a visitor on the page
  I want to be able to apply Color filter under Clothes section and related pages

  Scenario: Verify White filter Color in Categories
    Given User is on MyStore page
    And user selects Clothes section
    When user selects White color in filter Color
    Then White is active filter

  Scenario: Verify Black filter Color in Categories
    Given User is on MyStore page
    And user selects Clothes section
    When user selects Black color in filter Color
    Then Black is active filter

  Scenario: Verify both values in filter Color
   Given User is on MyStore page
   And user selects Clothes section
   When user selects both values in filter Color
   Then both color filters are shown as active

 Scenario Outline: Verify one by one value for filter Color in Clothes section for page Man
   Given User is on MyStore page
   And user selects Clothes section
   When user selects Men link under Clothes section
   And user selects filter <colorValue> under Clothes Men
   Then Clothes Men <genderPage> is opened with color query parameter
   And  active filter <activeValue> is shown

   Examples:
     | colorValue                            | genderPage                                      | activeValue                            |
     | //section[2]/ul/li[1]/label/span/span | http://40.76.27.113:8085/en/4-men?q=Color-White | //section/section/div[2]/section/ul/li |
     | //section[2]/ul/li[2]/label/span/span | http://40.76.27.113:8085/en/4-men?q=Color-Black | //div[2]/section/ul/li[2]              |

  Scenario: Verify filter with both colors under Clothes section for page Man
    Given User is on MyStore page
    And user selects Clothes section
    And user selects Men link under Clothes section
    When user selects both color values under Clothes section for page Men
    Then Clothes Men page is opened with two color parameters
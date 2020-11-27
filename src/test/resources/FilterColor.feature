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

  Scenario: Verify black Color filter in Clothes section for page Man
    Given User is on MyStore page
    And user selects Clothes section
    And selects link Men under Clothes section
    When user Men selects Black color in filter Color
    Then page with query parameter Men and black color is opened
    And Black is active filter

  Scenario: Verify both Color filters in Clothes section for page Man
    Given User is on MyStore page
    And user selects Clothes section
    And selects link Men under Clothes section
    When user Men selects both values in filter Color
    Then page with query parameter Men and colors is opened
    And both color filters are shown as active
#
#
# Scenario Outline: Verify one by one value for filter Color in Clothes section for page Man
#   Given User is on MyStore page
#   And user selects Clothes section
#   When user selects <gender>
#   And user selects <value> in filter Color
#   Then <genderPage> is opened
#   And active filter <value> is shown
#
#   Examples:
#     | gender | value | genderPage                        |
#     | Men    | White | http://40.76.27.113:8085/en/4-men?q=Color-White |
#     | Men    | Black | http://40.76.27.113:8085/en/4-men?q=Color-Black |
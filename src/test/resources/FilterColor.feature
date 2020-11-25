Feature: Verify filter Color under Clothes section

  In order to test functionality of filter Color
  As a visitor on the page
  I want to be able to apply Color filter under Clothes section and related pages

  Scenario Outline: Verify one by one value for filter Color in Categories
    Given user is on the My Store page
    And user selects Clothes section
    When user selects <value> in filter Color
    Then active filter <value> is shown

    Examples:
      | value |
      | White |
      | Black |

  Scenario: Verify all values in filter Color
    Given user is on the My Store page
    And user selects Clothes section
    When user selects both values in filter Color
    Then both color filters are shown as active


  Scenario Outline: Verify one by one value for filter Color in Clothes section for page Man
    Given user is on the My Store page
    And user selects Clothes section
    When user selects <gender>
    And user selects <value> in filter Color
    Then <genderPage> is opened
    And active filter <value> is shown

    Examples:
      | gender | value | genderPage                        |
      | Men    | White | http://40.76.27.113:8085/en/4-men?q=Color-White |
      | Men    | Black | http://40.76.27.113:8085/en/4-men?q=Color-Black |
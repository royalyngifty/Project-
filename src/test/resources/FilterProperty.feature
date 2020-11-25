Feature: Verify filter Property under Clothes section

  In order to test functionality of Property filter
  As a visitor on the page
  I want to be able to apply filters under Clothes section

  Scenario Outline: Verify one by one filter value in Property
    Given user is on the My Store page
    And user selects Clothes section
    When user selects <value> in filter Property
    Then active filter <value> is shown

    Examples:
      | value         |
      | Long sleeves  |
      | Short sleeves |

  Scenario: Verify all values in filter Property
    Given user is on the My Store page
    And user selects Clothes section
    When user selects both values in filter Property
    Then both property filters are shown as active

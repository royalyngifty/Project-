Feature: Verify Clear All filters in Clothes section

  In order to test functionality of Clear All button
  As a visitor on the page
  I want to be able to remove all selected filters under Clothes section and related pages

  Scenario Outline: Verify Clear All button in Clothes section
    Given user is on the My Store page
    And user selects Clothes section
    And user selects <category> from Categories filter
    And user selects <size> from Size filter
    When user clicks on Clear All button
    Then All checkboxes are removed
    And user is on <correctPage>

    Examples:
      | category | size | correctPage                           |
      | Men      | S    | http://40.76.27.113:8085/en/3-clothes |
      | Women    | L    | http://40.76.27.113:8085/en/3-clothes |

    Scenario: Verify Clear All button when more than one checkbox per filter is selected
      Given user is on the My Store page
      And user selects Clothes section
      And users selects Man Category
      And user selects Women Category
      And user selects S Size
      And user selects M Size
      And user selects Black Color
      And user selcts Price
      When user clicks on Clear All button
      Then All checkboxes are removed
      And user is on correctPage
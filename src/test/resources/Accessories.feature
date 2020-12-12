Feature: User clicks on Accessories category and uses filter options

  @testing
  Scenario: User navigates to Accessories Category
    Given User is on the homepage
    When User clicks on Accessories Category
    Then Accessories category products to be loaded

  @testing
  Scenario Outline: User filters by Categories
    Given User is on the homepage
    And User clicks on Accessories Category
    When User selects "<categories>"
    Then "<filter>" should be applied
    Examples:
      | categories                            | filter                          |
      | //section[1]/ul/li[1]/label/span/span | Categories: Home Accessories\n |
      | //li[2]/label/span/span               | Categories: Stationery\n       |

 Scenario Outline: User filters by Color
   Given User is on the homepage
   And User clicks on Accessories Category
   When User selects "<color>"
   Then "<filter>" should be applied
   Examples:
     | color                                 | filter          |
     | //section[2]/ul/li[1]/label/span/span | Color: White\n |
     | //section[2]/ul/li[2]/label/span/span | Color: Black\n |

# Scenario Outline: User filters by Dimension options
#   Given User is on the homepage
#   When User clicks on Art Category
#   Then select "<dimension>" and verify "<filter>"
#   Examples:
#     |dimension|filter|
#     |//section[4]/ul/li/label/span/span|Dimension: 40x60cm\n|
#     |//li[2]/label/span/span|Dimension: 60x90cm\n|
#     |//li[3]/label/span/span|Dimension: 80x120cm\n|

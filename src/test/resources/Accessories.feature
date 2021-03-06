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

  Scenario Outline: User filters by Composition
    Given User is on the homepage
    And User clicks on Accessories Category
    When User selects "<composition>"
    Then "<filter>" should be applied
    Examples:
      | composition                           | filter          |
      | //section[3]/ul/li[1]/label/span/span | Composition: Ceramic\n |
      | //section[3]/ul/li[2]/label/span/span | Composition: Polyester\n |
      | //section[3]/ul/li[3]/label/span/span | Composition: Recycled cardboard\n |


  Scenario Outline: User filters by Property
    Given User is on the homepage
    And User clicks on Accessories Category
    When User selects "<property>"
    Then "<filter>" should be applied
    Examples:
      | property                                 | filter          |
      | //section[4]/ul/li[1]/label/span/span | Property: 120 pages\n |
      | //section[4]/ul/li[2]/label/span/span | Property: Removable cover\n |


  Scenario Outline: User filters by Brand
    Given User is on the homepage
    And User clicks on Accessories Category
    When User selects "<brand>"
    Then "<filter>" should be applied
    Examples:
      | brand                                 | filter          |
      | //section[5]/ul/li[1]/label/span/span | Brand: Graphic Corner\n |
      | //section[5]/ul/li[2]/label/span/span | Brand: Studio Design\n |


  Scenario Outline: User filters by Paper Type
    Given User is on the homepage
    And User clicks on Accessories Category
    When User selects "<papertype>"
    Then "<filter>" should be applied
    Examples:
      | papertype                                 | filter          |
      | //section[7]/ul/li[1]/label/span/span | Paper Type: Ruled\n |
      | //section[7]/ul/li[2]/label/span/span | Paper Type: Plain\n |
      | //section[7]/ul/li[3]/label/span/span | Paper Type: Squarred\n |
      | //section[7]/ul/li[4]/label/span/span | Paper Type: Doted\n |



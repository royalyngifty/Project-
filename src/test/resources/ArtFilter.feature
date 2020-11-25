Feature: User clicks on Art category and uses filter optins

  @testing
  Scenario: User navigates to Art Category
    Given User is on the homepage
    When User clicks on Art Category
    Then Art category products to be loaded

  @testing
  Scenario: User filters by Composition
    Given User is on the homepage
    And User clicks on Art Category
    When User selects filter by Composition
    Then Composition filter should be applied

  @testing
  Scenario: User filters by Brand
    Given User is on the homepage
    And User clicks on Art Category
    When User selects filter by Brand
    Then Brand filter should be applied

  @testing
  Scenario Outline: User filters by Dimension options
    Given User is on the homepage
    When User clicks on Art Category
    Then select "<dimension>" and verify "<filter>"
    Examples:
      |dimension|filter|
      |//section[4]/ul/li/label/span/span|Dimension: 40x60cm\n|
      |//li[2]/label/span/span|Dimension: 60x90cm\n|
      |//li[3]/label/span/span|Dimension: 80x120cm\n|

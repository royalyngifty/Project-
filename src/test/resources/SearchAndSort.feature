Feature: Search And Sort Feature

  @testing
  @Proceed
  Scenario: Search for product
    Given User is on the homepage
    And User clicks on search textbox
    When User gives search criteria
    And Clicks on Search icon
    Then Search Results will be dispalyed

  @testing
  @Proceed
  Scenario: Sort out the Product
    Given User is on the homepage
    And User clicks on search textbox
    When User gives search criteria
    And Clicks on Search icon
    And Clicks on Sort By textbox And select one choice
    Then Sort out the dispalyed results as per sorting order.

  @testing
    @Proceed
  Scenario Outline: Search for different items
    Given User is on the homepage
    And User clicks on search textbox
    When User gives search "<Item>"
    And Clicks on Search icon
    Then Search "<Results>" will be dispalyed
    Examples:
    |Item|          |Results|
    |Mug |          |There are 5 products.|
    |Shirt|         |There is 1 product.|
    |Cushion|       |There are 3 products.|
    |Notebook|      |There are 3 products.|
    |Graphics|      |There are 3 products.|











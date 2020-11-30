Feature: Check the Header fields
  @testing
  Scenario Outline: User selects on Gender and checks items listed
    Given User is on the homepage
    When User clicks on Clothes
    Then Select "<gender>" and verify "<value>"
    Examples:
      |gender|value|
      |(//a[contains(text(),'Men')])[2]|MEN|
      |(//a[contains(text(),'Women')])[2]|WOMEN|

  @testing
  Scenario Outline: User selects on Accessories and checks items listed
    Given User is on the homepage
    When User clicks on Accessories
    Then Select "<item>" and check "<text>"
    Examples:
      |item|text|
      |(//a[contains(text(),'Stationery')])[2]|STATIONERY|
      |(//a[contains(text(),'Home Accessories')])[2]|HOME ACCESSORIES|

    @testing
    Scenario: User selects on Art and checks items
      Given User is on the homepage
      When User clicks on Art
      Then Art page is opened
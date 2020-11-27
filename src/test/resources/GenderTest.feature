Feature: Check the clothes by selecting Gender
  @testing
  Scenario Outline: User selects on Gender and checks items listed
    Given User is on the homepage
    When User clicks on Clothes
    Then Select "<gender>" and verify "<value>"
    Examples:
      |gender|value|
      |(//a[contains(text(),'Men')])[2]|MEN|
      |(//a[contains(text(),'Women')])[2]|WOMEN|
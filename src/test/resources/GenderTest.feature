Feature: Check the clothes by selecting Gender
  @testing
  Scenario Outline: User selects on Gender and checks items listed
    Given User is on the homepage
    When User clicks on Clothes
    Then Select "<gender>" and verify "<url>"
    Examples:
      |gender|url|
      |(//a[contains(text(),'Men')])[2]|http://40.76.27.113:8085/en/4-men|
      |(//a[contains(text(),'Women')])[2]|http://40.76.27.113:8085/en/5-women|
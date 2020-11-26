Feature: Check feature to check the clothes header tab

  @testing
  Scenario Outline: Check categories under Clothes (Data driven test case)

    Given User is on the homepage
    When User clicks on Clothes
    Then Click "<Gender>" and check "<Url>"

    Examples:
      | Gender | Url |
      | But | http://40.76.27.113:8085/sv/4-men |
      | Women | http://40.76.27.113:8085/sv/5-women |
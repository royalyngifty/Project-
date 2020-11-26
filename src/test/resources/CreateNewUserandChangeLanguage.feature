Feature: Create new user

  @testing
  Scenario Outline: Fill in required data as a new user then save it
    Given User is shopping website homepage
    And user clicks sign in
    And user clicks create one here
    And user check mandatory boxes
    When user enters data  <firstname> <lastname> <email> <password> <birthday>
    And user check optional boxes
    And user click save
    Then user clicks save to save new user data
    Examples:
      | firstname | lastname | email         | password    | birthday   |
      | Mary      | Jul      | julMary018@aol.com | testing1234 | 05/31/1970 |





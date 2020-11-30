Feature: Create new user

  @testing
  Scenario: Fill in required data as a new user then save it
    Given User is shopping website homepage
    And user clicks sign in
    And user clicks create one here
    And user check mandatory boxes
    When user enters data
#    And user check optional boxes
    And user click save
    Then user clicks save to save new user data







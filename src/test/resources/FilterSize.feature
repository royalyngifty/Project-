#Feature: Verify filter Size under Clothes section
#
#  In order to test functionality of filter Size
#  As a visitor on the page
#  I want to be able to apply filters under Clothes section and related pages

#  Scenario Outline: Verify one by one value for filter Size in Categories
#    Given user is on the My Store page
#    And user selects Clothes section
#    When user selects <value> in filter Size
#    Then active filter <value> is shown

#    Examples:
#      | value |
#      | S     |
#      | M     |
#      | L     |
#      | XL    |

#  Scenario Outline: Verify combinations of values for filter Size in Categories
#    Given user is on the My Store page
#    And user selects Clothes section
#    When user selects <number> of the options in Size filter
#    Then <number> active filters are shown

#    Examples:
#      | number |
#      | 2      |
#      | 3      |
#      | 4      |

#  Scenario Outline: Verify one by one value for filter Size in Clothes section for pages Men and Women
#    Given user is on the My Store page
#    And user selects Clothes section
#    And user selects <gender>
#    When user selects <value> in filter Size
#    Then <genderPage> is opened
#    And active filter <value> is shown

#    Examples:
#      | gender | value | genderPage                                    |
#      | Men    | S     | http://40.76.27.113:8085/en/4-men?q=Size-S    |
#      | Men    | M     | http://40.76.27.113:8085/en/4-men?q=Size-M    |
#      | Men    | L     | http://40.76.27.113:8085/en/4-men?q=Size-L    |
#      | Men    | XL    | http://40.76.27.113:8085/en/4-men?q=Size-XL   |
#      | Women  | S     | http://40.76.27.113:8085/en/4-women?q=Size-S  |
#      | Women  | M     | http://40.76.27.113:8085/en/4-women?q=Size-M  |
#      | Women  | L     | http://40.76.27.113:8085/en/4-women?q=Size-L  |
#      | Women  | XL    | http://40.76.27.113:8085/en/4-women?q=Size-XL |

#  Scenario Outline: Verify combinations of values for filter Size in Clothes section for pages Men and Women
#    Given user is on the My Store page
#    And user selects Clothes section
#    And user selects <gender>
#    When user selects <number> of options from Size filter
#    Then <genderPage> is opened
#    And <number> active filters are shown

#    Examples:
#      | gender | number | genderPage                                          |
#      | Men    | 2      | http://40.76.27.113:8085/en/4-men?q=Size-S-M        |
#      | Men    | 3      | http://40.76.27.113:8085/en/4-men?q=Size-S-L-XL     |
#      | Men    | 4      | http://40.76.27.113:8085/en/4-men?q=Size-S-M-L-XL   |
#      | Women  | 2      | http://40.76.27.113:8085/en/4-women?q=Size-S-L      |
#      | Women  | 3      | http://40.76.27.113:8085/en/4-women?q=Size-S-M-XL   |
#      | Women  | 4      | http://40.76.27.113:8085/en/4-women?q=Size-S-M-L-XL |
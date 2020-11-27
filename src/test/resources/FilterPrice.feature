#Feature: Verify filter Price under Clothes section
#
# In order to test functionality of filter Price
# As a visitor on the page
# I want to be able to apply Price filter under Clothes section and related pages
#
# Scenario Outline: Verify one by one value for filter Price in Categories
#   Given user is on the My Store page
#   And user selects Clothes section
#   When user selects <value> in filter Price
#   Then active filter <value> is shown
#
#   Examples:
#     | value |
#     | 23-36 |
#     | 32-36 |
#
# Scenario Outline: Verify one by one value for filter Price in Clothes section for page Man
#   Given user is on the My Store page
#   And user selects Clothes section
#   When user selects <gender>
#   And user selects <value> in filter Price
#   Then <genderPage> is opened
#   And active filter <value> is shown
#
#   Examples:
#     | gender | value | genderPage                                           |
#     | Men    | 23-23 | http://40.76.27.113:8085/en/4-men?q=Price-kr-23-23   |
#     | Men    | 23-24 | http://40.76.27.113:8085/en/4-men?q=Price-kr-23-24   |
#     | Men    | 24-24 | http://40.76.27.113:8085/en/4-men?q=Price-kr-24-24   |
#     | Women  | 35-35 | http://40.76.27.113:8085/en/5-women?q=Price-kr-35-35 |
#     | Women  | 35-36 | http://40.76.27.113:8085/en/5-women?q=Price-kr-35-36 |
#     | Women  | 36-36 | http://40.76.27.113:8085/en/5-women?q=Price-kr-36-36 |
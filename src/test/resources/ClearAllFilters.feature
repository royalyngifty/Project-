Feature: Verify Clear All filters in Clothes section

 In order to test functionality of Clear All button
 As a visitor on the page
 I want to be able to remove all selected filters under Clothes section and related pages

 Scenario Outline: Verify Clear All button in Clothes section
   Given User is on MyStore page
   And user selects Clothes section
   And user selects filters <filter1> and <filter2> from different sections
   And active filters <actFilter1> and <actFilter2> are shown
   When user clicks on Clear All button
   And filters under Clothes are removed
   Then user is on <correctPage>


   Examples:
     | filter1                               | filter2                               | correctPage                           | actFilter1                                       | actFilter2                                       |
     | //section[2]/ul/li[1]/label/span/span | //section[3]/ul/li[1]/label/span/span | http://40.76.27.113:8085/en/3-clothes | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
     | //section[1]/ul/li[1]/label/span/span | //section[2]/ul/li[2]/label/span/span | http://40.76.27.113:8085/en/3-clothes | //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
#
#  And active filters <actFilter1> and <actFilter2> are shown
# actFilter1                                       | actFilter2                                       |
# //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |
# //div[2]/section/section/div[2]/section/ul/li[1] | //div[2]/section/section/div[2]/section/ul/li[2] |




#   Scenario: Verify Clear All button when more than one checkbox per filter is selected
#     Given user is on the My Store page
#     And user selects Clothes section
#     And users selects Man Category
#     And user selects Women Category
#     And user selects S Size
#     And user selects M Size
#     And user selects Black Color
#     And user selcts Price
#     When user clicks on Clear All button
#     Then All checkboxes are removed
#     And user is on correctPage
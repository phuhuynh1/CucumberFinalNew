Feature: User should be able to change dashboard page color
@Scenario1
  Scenario:1
   	Sky Blue Background
    Given Set SkyBlue Background button exists
    When I click on the button on "Sky Blue"
    Then the background color will change to sky blue

  @Smoke
  Scenario:2
   	Sky White Background
    Given Set SkyWhite Background button exists
    When I click on the button on "Sky White"
    Then the background color will change to sky white
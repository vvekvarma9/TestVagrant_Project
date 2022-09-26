Feature: Team RCB(Royal Challengers Bangalore)

  Background: Validate data of RCB Cricket team from json file
    Given User getting the data from Json file

  @TestVagrant1
  Scenario: Validate team has only 4 foreign players
    When User retrieving the foreign players data
    Then User validating the team has only 4 foreign players

  @TestVagrant2
  Scenario: Validate team at least one wicket keeper
    When User retrieving the wicket keeper's data
    Then User validating the team has 1 wicket keeper
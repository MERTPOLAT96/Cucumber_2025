Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User sholud login successfully
    And Navigate to Citizenship page

    Scenario Outline: Citizenship create
      When User a Citizenship name as "<name>" short name as"<short>"
      Then Success message should be displayed

      When User a Citizenship name as "<name>" short name as"<short>"
      Then Success message should be displayed

      When User delete the "<name>"
      Then Success message should be displayed
      Examples:
        | name | short |
        | me3456 | ç14çnbn |
        | m34235jj | za53jkl |
        | m4234vbn | mtmöçm |
        | uyu798fghf | m147hfg |






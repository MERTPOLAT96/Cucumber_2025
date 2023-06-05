Feature: Country Multi Scenario

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User sholud login successfully
    And Navigate to Country page

    Scenario:Create country
    When create a country
    Then Success message should be displayed

    Scenario:Create country 2
      When create a country name as "mertpolat0983111" code as "435475443"
      Then Success message should be displayed

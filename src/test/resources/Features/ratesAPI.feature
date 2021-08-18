@tag
Feature: To validate rates API

  @tag1
  Scenario: Rates API
    Given I am providing base api
    When I try to hit the request
    Then I validate the outcomes for status code and json body
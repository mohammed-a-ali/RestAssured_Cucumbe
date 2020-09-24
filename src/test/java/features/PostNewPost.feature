Feature: Post a new user

  Scenario: User can add a new user
    Given I am on endpoint "/users"
    When I send "POST" request to create new user using faker
    Then the status code should be 201
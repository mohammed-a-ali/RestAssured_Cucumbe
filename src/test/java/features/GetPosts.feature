Feature: Get 100 Post

  Scenario: User can get 100 posts
    Given I am on endpoint "/users"
    When I send "GET" request
    Then the status code should be 200
    And I should get 10 posts

  Scenario: Get specific post
    Given I am on endpoint "/users"
    When I send "GET" request with these parameters to get posts
      | id |
      | 5  |
    Then the status code should be 200
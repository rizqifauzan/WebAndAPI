@API
Feature: API Test

  Scenario: Sample API Test
      Given I have the API endpoint "https://jsonplaceholder.typicode.com/posts/1"
      When I send a GET request to the endpoint
      Then the response status code should be 200
      And the response body should contain "userId": 1
Feature: Web Test

  Scenario: Sample Web Test
      Given I navigate to "https://www.example.com"
      When I click on the "More information..." link
      Then the page title should be "Example Domain"
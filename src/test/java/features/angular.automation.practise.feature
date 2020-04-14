Feature: Automation practise on Angular application

  @angularPractise
  Scenario: Enter details on Angular practise web app
    Given User is on Angular practise home page
    When User enters his "Name", "Email", "Password", "Gender" and "Date of Birth"
    And User clicks on Submit button
    Then User should see a Success message
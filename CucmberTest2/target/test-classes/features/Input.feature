Feature: Single User Account Creation

  Scenario: Facebook Account
    Given User in google home page
    Given google title test
    When user in facebook home page
    When facebook title test
    When user enters "Automation" and "QA" and "Automation@gmail.com" and "Automation@gmail.com" and "Automation123@"
    Then user clicks submit

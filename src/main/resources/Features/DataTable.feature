Feature: verify Adactin Applicatin

  Scenario: Verify with various credentials
    Given User should be in adactin page
    When user should enter username and password
    And user should click login button
    Then user should enter into the adactin application

    

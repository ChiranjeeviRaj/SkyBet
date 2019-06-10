Feature: Footlball Events verification

  Scenario: Read Football events and verify
    Given read football events using given url
    When i enter the input parameter primaryMarkets is "true"
    Then verifies football events successfully retrieved and also verifies competitors 

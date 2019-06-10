$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("footballEvents.feature");
formatter.feature({
  "line": 1,
  "name": "Footlball Events verification",
  "description": "",
  "id": "footlball-events-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Read Football events and verify",
  "description": "",
  "id": "footlball-events-verification;read-football-events-and-verify",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "read football events using given url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i enter the input parameter primaryMarkets is \"true\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verifies football events successfully retrieved and also verifies competitors",
  "keyword": "Then "
});
formatter.match({
  "location": "FootBallEventsVerifyTest.read_football_events_using_given_url()"
});
formatter.result({
  "duration": 353098620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 47
    }
  ],
  "location": "FootBallEventsVerifyTest.i_enter_the_input_parameter_primarymarkets_is_something(String)"
});
formatter.result({
  "duration": 11481144,
  "status": "passed"
});
formatter.match({
  "location": "FootBallEventsVerifyTest.verifies_football_events_successfully_retrieved_and_also_verifies_competitors()"
});
formatter.result({
  "duration": 2404212,
  "status": "passed"
});
});
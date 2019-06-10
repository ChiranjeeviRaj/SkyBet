package uk.skybet.stepdefinations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.skybet.football.service.BetsJSONService;
import uk.skybet.football.service.model.Events;
import uk.skybet.football.service.model.Root;

public class FootBallEventsVerifyTest {
	
	private BetsJSONService betsJSONService;
	private static String URL = "http://localhost:8888/football/live";
	private Root root;
	
	@Given("^read football events using given url$")
    public void read_football_events_using_given_url() throws FileNotFoundException, IOException {
		betsJSONService = new BetsJSONService();
		root = betsJSONService.readEvents(URL);
    }

    @When("^i enter the input parameter primaryMarkets is \"([^\"]*)\"$")
    public void i_enter_the_input_parameter_primarymarkets_is_something(String primaryMarkets) throws FileNotFoundException, IOException {
    	root = betsJSONService.readEvents(URL+"?primaryMarkets="+primaryMarkets);
    }

    @Then("^verifies football events successfully retrieved and also verifies competitors$")
    public void verifies_football_events_successfully_retrieved_and_also_verifies_competitors() {
		assertNotNull(root);
		assertEquals(true, root.getEvents().size()>0);
    	for (Events events : root.getEvents()) {
    		assertEquals("Football", events.getClassName());
        	assertEquals("home", events.getCompetitors().get(0).getPosition());
        	assertEquals("away", events.getCompetitors().get(1).getPosition());
		}

    }

}

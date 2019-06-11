package uk.skybet.football.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import uk.skybet.football.service.model.Root;

public class BetsJSONServiceTest {
	
	private BetsJSONService service = null;
	private Root root;
	private static String FOOTBALL_URL = "http://localhost:8888/football/live";

	@Before
	public void setUp() {
		service = new BetsJSONService();
	}
	
	@Test
	public void readEventsValidTest() throws FileNotFoundException, IOException {
		root = service.readEvents(FOOTBALL_URL+"?primaryMarkets=true");
		assertNotNull(root);
		assertEquals(true, root.getEvents().size()>0);

	}
	
	@Test
	public void readEventsTestValid_Input_DataPrimaryMarketsFalse() throws FileNotFoundException, IOException {
		root = service.readEvents(FOOTBALL_URL+"?primaryMarkets=false");
		assertNotNull(root);
		assertEquals(true, root.getEvents().size()>0);

	}
	
	@Test(expected = FileNotFoundException.class)
	public void readEventsTestInValid_URL_throws_FileNotFoundException() throws FileNotFoundException, IOException {
		root = service.readEvents(FOOTBALL_URL+"INVALID");
		assertNotNull(root);
		assertEquals(true, root.getEvents().size()>0);

	}

}

package uk.skybet.football.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import uk.skybet.football.service.model.Root;

/**
 * 
 * @author chiranjeevirajupennamaraju
 *
 */
public class BetsJSONService {
	
	final static Logger logger = Logger.getLogger(BetsJSONService.class);
	
	/**
	 * The below method read JSON data from the given url and converts into Root object using Gson parser
	 * @param url
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public Root readEvents(String url) throws FileNotFoundException, IOException{
		try (InputStream is = new URL(url).openStream();
                Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {
			logger.info("Events Successfully converted from the URL "+ url);
            return new Gson().fromJson(reader, Root.class);
            
		} 
		
	}

}

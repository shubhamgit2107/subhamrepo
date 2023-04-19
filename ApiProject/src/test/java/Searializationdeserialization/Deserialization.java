package Searializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoClassesSErializationdeserialization.SimplePojo;

public class Deserialization {
	
	@Test
	public void deserialtion() throws JsonParseException, JsonMappingException, IOException
	{
		
		ObjectMapper omap= new ObjectMapper();
		
		SimplePojo spojo=omap.readValue(new File("./addproject.json"), SimplePojo.class);
		
		System.out.println(spojo.getAddress());
		System.out.println(spojo.getAddress());
		System.out.println(spojo.getEmail());
		
	
	}

}

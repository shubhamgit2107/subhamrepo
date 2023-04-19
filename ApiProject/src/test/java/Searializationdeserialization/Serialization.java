package Searializationdeserialization;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoClassesSErializationdeserialization.SimplePojo;

public class Serialization {
	@Test
	public void Serialization() throws JsonGenerationException, JsonMappingException, IOException
	{
		//create object for pojo
		SimplePojo spojo= new SimplePojo("shubhamkumar", "tyss123", 7987, "shubhamk115@gmail.com", "Bihar");
		
		// create object  for mapper
	ObjectMapper omap= new ObjectMapper();
	
	//write the value in json file
	omap.writeValue(new File("./addproject.json"),spojo );
	}

}

package Searializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoClassesSErializationdeserialization.StudentPojo;

public class StudentDserialization {
	
	@Test
	public void deserialization() throws JsonParseException, JsonMappingException, IOException
	
	{
		
		ObjectMapper omap=new ObjectMapper();
		StudentPojo sp= omap.readValue(new File("./src/test/resources/Student.json"), StudentPojo.class);
		System.out.println(sp.getBranch()[0]);
		
	}

}

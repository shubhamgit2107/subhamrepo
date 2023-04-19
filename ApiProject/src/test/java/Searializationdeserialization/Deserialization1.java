package Searializationdeserialization;


import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoClassesSErializationdeserialization.EmpPojo;

public class Deserialization1 {
	
	@Test
	public void serialization() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj= new ObjectMapper();
		EmpPojo epojo=obj.readValue(new File("./addproject.json"), EmpPojo.class);
	  System.out.println(epojo.getEmpid()[0]+"   "+epojo.getEmpid()[1]);
	}

}

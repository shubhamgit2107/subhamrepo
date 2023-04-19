package Searializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoClassesSErializationdeserialization.StudentPojo;

public class StudentSerialization {
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException
	{
	String name="shubham";
	String[] branch= {"patna","gaya","muzafferpur"};
	long[] contect= {2345678l,23423456l,765490l};
	int []sid= {123,124,125};
	
	StudentPojo sp=new StudentPojo(name, branch, contect, sid);
	ObjectMapper omap=new ObjectMapper();
	omap.writeValue(new File("./src/test/resources/Student.json"),  sp);
	
	
	
	}

}

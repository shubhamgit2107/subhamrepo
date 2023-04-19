package Searializationdeserialization;


import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoClassesSErializationdeserialization.EmpPojo;
import PojoClassesSErializationdeserialization.ObjectSpouse;

public class Serialization1 {
	int[] empid= {2345,12346,12347,2348};
	
    
	
	
	@Test
	public void ArraySerialization() throws JsonGenerationException, JsonMappingException, IOException
	{
		String name="dhubham";
		int a[]= {456,789};
		String mail="skjd@lkd.com";
		long[] p= {70533l,987554l,562432l};
		String[] ad= {"karnatka","Bihar","Punjab"};
		
	EmpPojo epojo= new EmpPojo(name,a,mail,p,ad);
			 
	ObjectMapper obj=new ObjectMapper();
	obj.writeValue(new File("./addproject.json"),epojo);
	
	}
	
	@Test
	public void ArraySerialization2() throws JsonGenerationException, JsonMappingException, IOException
	{
		String name="dhubham";
		int a[]= {456,789};
		String mail="skjd@lkd.com";
		long[] p= {70533l,987554l,562432l};
		String[] ad= {"karnatka","Bihar","Punjab"};
	 	 
	ObjectMapper obj=new ObjectMapper();
	obj.writeValue(new File("./addproject.json"),ObjectSpouse.spouse(name, a, mail, p, ad));
	
	}

}

package Parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


import io.restassured.http.ContentType;

public class FormParam {
	
	
	@Test
	public void formParameter()
	{
		
		
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		
		   given().formParam("createdBy", "tyewasrt")
		   .formParam("projectName", "987ytrew")
		   .formParam("status", "completed")
		   .formParam("teamSize", 15)
		   
		
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then().statusCode(201).contentType(ContentType.JSON).log().all();
		  
	}

}

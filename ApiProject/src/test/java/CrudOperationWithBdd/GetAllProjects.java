package CrudOperationWithBdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllProjects {
	
	
	@Test
	
public void GetAllProject()
{
	baseURI="http://rmgtestingserver:8084";
	port=8084;
	
		when()
		.get("/projects")
		.then().statusCode(200).contentType(ContentType.JSON).log().all();
	
	
	
}
	 
		

	

}

package CrudOperationWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutUpdate {
	
	Random ran=new Random();
	@Test
	public void putUpdate()
	{
		JSONObject obj= new JSONObject();
		obj.put("projectName", "qwertkumar123456"+ran.nextInt(500));
		obj.put("createdBy", "kumrshubham1");
		obj.put("status", "ongoing");
		obj.put("teamSize", 11);
		
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/"+PostCreateObject.projectID)
		.then().statusCode(200).contentType(ContentType.JSON)
		.log().all();
		
	
	}

}

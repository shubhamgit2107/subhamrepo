package CrudOperationWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;
import java.util.Random;

import PojoUtility.PostPojo;
import io.restassured.http.ContentType;

public class PostUsingPojo {
	Random ran=new Random();
	
	public void postUsingPojoClass()
	{
		PostPojo pojo= new PostPojo("shubhamkumar", "qweasert"+ran.nextInt(500),"created", 13); 
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		
		   given()
		.body(pojo)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then().statusCode(201).contentType(ContentType.JSON).log().all();
		  
	}

}

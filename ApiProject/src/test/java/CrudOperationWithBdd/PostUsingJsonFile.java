package CrudOperationWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

 
public class PostUsingJsonFile {
	@Test
	public void jsonFile()
	{
		File file= new File("./addproject.json");
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		 
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then().statusCode(201).contentType(ContentType.JSON).log().all();
		  
	}

	}



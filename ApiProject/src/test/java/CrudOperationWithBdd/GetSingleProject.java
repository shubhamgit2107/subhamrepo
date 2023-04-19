package CrudOperationWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.http.ContentType.*;

public class GetSingleProject {
@Test
public void GetSingleProject()
	 {
	
	baseURI="http://rmgtestingserver:8084";
	port=8084;
	
		when()
		.get("/projects/"+PostCreateObject.projectID)
		.then().statusCode(200).contentType(ContentType.JSON).log().all();
	
	
	}

}

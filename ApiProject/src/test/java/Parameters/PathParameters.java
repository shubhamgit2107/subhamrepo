package Parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import CrudOperationWithBdd.PostCreateObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PathParameters {
	@Test
	public void pathParameter()
	{
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		given()
		.pathParam("projectID", "TY_PROJ_2957")
		.queryParam("page", 3)
		
			.when()
			.get("/projects/{projectID}")
			.then().statusCode(200).contentType(ContentType.JSON).log().all();
		
		
		
	}
	
	
	

}

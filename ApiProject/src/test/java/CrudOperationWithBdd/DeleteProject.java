package CrudOperationWithBdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteProject {
	@Test
	public void DeleteProject()
	{
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		
			when()
			.delete("/projects/"+PostCreateObject.projectID)
			.then().statusCode(204).contentType(ContentType.JSON).log().all();
		
	}

}

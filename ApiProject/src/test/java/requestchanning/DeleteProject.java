package requestchanning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProject {
@Test
public void deleteProject()
{
	RequestSpecification request = RestAssured.given().pathParam("pid", PostRequest.projectID);
	Response resp = request.when().delete("http://rmgtestingserver:8084/projects/{pid}");
		resp.then().contentType(ContentType.JSON);
	System.out.println(resp.asString());
}

}

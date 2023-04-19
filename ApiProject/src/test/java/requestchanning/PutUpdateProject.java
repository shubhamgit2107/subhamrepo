package requestchanning;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutUpdateProject {
	@Test
public void update()
{
		JSONObject obj= new JSONObject();
		obj.put("projectName", "qwertyshubham");
		obj.put("createdBy", "kiransingh");
		obj.put("status", "ongoing");
		obj.put("teamSize", 11);
		
		RequestSpecification request = RestAssured.given().pathParam("pid", PostRequest.projectID);
		request.body(obj);
		request.contentType(ContentType.JSON);
		Response respo = request.when().put("http://rmgtestingserver:8084/Projects/{pid}");
		respo.getContentType();
		respo.then().contentType(ContentType.JSON);
		System.out.println(respo.asString());
		
		}
		
}
	


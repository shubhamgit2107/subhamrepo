package crudoperationwithoutbbd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetSingleproject {
	@Test
	public void getSingleProject()
	{
		Response resp = RestAssured.get("http://rmgtestingserver:8084/projects/"+PostRequest.projectID);
		resp.contentType();
		resp.body();
		resp.then().contentType(ContentType.JSON);
		System.out.println(resp.asString());
	}

}

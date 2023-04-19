package crudoperationwithoutbbd;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetProject {

	public static void main(String[] args) {
		
		Response resp = RestAssured.get("http://rmgtestingserver:8084/projects");
		resp.then().contentType(ContentType.JSON).and().statusCode(200);
		System.out.println(resp.asPrettyString());
		
	}

}
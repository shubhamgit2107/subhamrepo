package crudoperationwithoutbbd;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	public static String  projectID;
Random ran=new Random();
@Test

	public void postReq()
	{
	JSONObject obj= new JSONObject();
	obj.put("projectName", "qwertyuiop"+ran.nextInt(500));
	obj.put("createdBy", "shubhamkumar");
	obj.put("status", "created");
	obj.put("teamSize", 12);
	
	RequestSpecification request = RestAssured.given();
	request.body(obj);
	request.contentType(ContentType.JSON);

	Response respo = request.post("http://rmgtestingserver:8084/addProject");
 projectID = respo.jsonPath().get("projectId");

	
	respo.contentType();
	respo.then().contentType(ContentType.JSON).and().statusCode(201);
	System.out.println(respo.asString());
	
	}
}


package requestchanning;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import  io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostGetPutDelete {
	  String projectID;
	Random ran= new Random();
	@Test(priority  =1)
	public void postRequest()
	{
		JSONObject obj= new JSONObject();
		obj.put("projectName", "qwertyuiop"+ran.nextInt(500));
		obj.put("createdBy", "shubhamkumar");
		obj.put("status", "created");
		obj.put("teamSize", 12);
		
		RequestSpecification request = RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		 
		 

		Response respo = request.when().post("http://rmgtestingserver:8084/addProject");
		 projectID = respo.jsonPath().get("projectId");
	  System.out.println(projectID);

		
		respo.contentType();
		respo.then().contentType(ContentType.JSON).and().statusCode(201);
		System.out.println(respo.asString());
		
	}
	@Test(priority=2)
	public void Get()
	{

	RequestSpecification request = RestAssured.given().pathParam("pid",projectID );
	Response response = request.when().get("http://rmgtestingserver:8084/projects/{pid}");
	response.contentType();
	response.then().contentType(ContentType.JSON).statusCode(200);
		
		
	}
	@Test(priority =3)
	public void putRequest()
	{
		JSONObject obj= new JSONObject();
		obj.put("projectName", "qwertyuiop"+ran.nextInt(500));
		obj.put("createdBy", "shubhamkumar1234");
		obj.put("status", "ongoing");
		obj.put("teamSize", 12);
		
		RequestSpecification request = RestAssured.given().pathParam("pid",  projectID);
		request.body(obj);
		request.contentType(ContentType.JSON);
		 
		 

		Response respo = request.when().put("http://rmgtestingserver:8084/projects/{pid}");
		respo.then().statusCode(200);
		
		
		
		
	}
	


}

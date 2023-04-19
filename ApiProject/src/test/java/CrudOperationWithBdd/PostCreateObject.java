package CrudOperationWithBdd;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Endpoint;

import PojoUtility.EndPoints;
import ecom_Flashcart_genericUtility.BuilderClass;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class PostCreateObject  extends BuilderClass{
	
	public static String projectID;
	
	Random ran=new Random();
	@Test
	public void createProject()
	{
		JSONObject obj= new JSONObject();
		obj.put("projectName", "qwertkumar123456"+ran.nextInt(500));
		obj.put("createdBy", "shubhamkumar1");
		obj.put("status", "created");
		obj.put("teamSize", 12);
		
		//baseURI="http://rmgtestingserver:8084";
		//port=8084;
		
		  Response respo = given()
				  .spec(requestSpecification)
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post(EndPoints.project_addproject);
		  projectID = respo.jsonPath().get("projectId");
		respo.then().spec(responseSpecification);  
		
	
		//
		// respo.then().log().all();
		  
	}

}

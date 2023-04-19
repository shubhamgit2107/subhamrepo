

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class StaticResponseValidation {
	String expproject="TY_PROJ_2924";
	
	@Test
	public void staticResponseValidation()
	{
		
		
		
	
		
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		
		
	Response respo = when().get("/projects");
	String data = respo.jsonPath().get("[4].ProjectId");
		if(expproject.equalsIgnoreCase(data))
		{
			System.out.println("pass");
		}
		
		
	}

}

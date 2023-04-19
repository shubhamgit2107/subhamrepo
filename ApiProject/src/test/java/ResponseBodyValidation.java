import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;

public class ResponseBodyValidation {
	
	@Test
	public void responseBodyValidation() 
	{
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		
		Response respo = when().get("/projects");
		//System.out.println(respo.body().asString());
		//System.out.println(respo.getBody().prettyPrint());
	//	System.out.println(respo.body().asPrettyString());
		//System.out.println(respo.body().toString());
		respo.getBody().peek();
	
		
	}

}

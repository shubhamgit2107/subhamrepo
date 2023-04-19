package Authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BasicAuth {
	
	@Test
	public void basicAuth() 
	{
	
		baseURI="http://rmgserver:8084";
		port=8084;
		
		
	given().auth().basic("rmgyantra", "rmgy@9999")
	
		.when().get("/login")
		.then().statusCode(200).contentType(ContentType.JSON);
		
		
	}
@Test
public void barearToken()
{
	given().header(null)
	
}
}

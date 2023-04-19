package ShopperStack;

import org.testng.annotations.Test;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class GetMethod {
	@Test
	public void get() 
	{
		baseURI="https://www.shoppersstack.com/shopping/";
		 when().get("/products")
		
	
		.then().assertThat().statusCode(403);
		 
		
		
		
		
	}

}

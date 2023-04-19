package ShopperStack;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateId {
	
	
	@Test
	public void CreateId()
	{
		baseURI="https://www.shoppersstack.com/shopping/";
		File f=new File("./shop.json");
		given().body(f).contentType(ContentType.JSON)
		.when().post("/shoppers")
		.then().assertThat().log().all();
		
	}

}

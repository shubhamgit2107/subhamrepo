package ShopperStack;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateMerchantId {
	@Test
	public void merchent()
	{
		baseURI="https://www.shoppersstack.com/shopping/";
	File f= new File("/shop.json");
	given().body(f)
	.when().post("/merchants")
	.then().log().all();
	
	
	}

}

package PetStore;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

public class PetStoreUploadImage {
	@Test
	public void petstoreImageUpload()
	{
		File f=new File("C:\\Users\\shubh\\Desktopdownload.jpg");
		
		given().multiPart("f","multipart/form-data")
		.when().post("https://petstore.swagger.io/v2/pet/123456/f");
		
		
 
		
	}

}

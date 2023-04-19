package ShopperStack;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;
import java.util.Random;

public class PostMethod {
	Random ran= new Random();
	/**
	 *@author shubham kumar
	 */
	@Test(priority=1)
	public void post()
	{
		baseURI="https://www.shoppersstack.com/shopping";
		File f= new File("./shop.json");
		
	
		//given().auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzaHViaGFtazExNUBnbWFpbC5jb20gU0hPUFBFUiIsImV4cCI6MTY4MTkzNjcxNCwiaWF0IjoxNjgxOTAwNzE0fQ.oPhrcfqqeeIklT9LlT1HgRrRhLQyL8EaeCx4pO0xfM8")
	given().contentType(ContentType.JSON)
.body(f)
	
	.when().post("/shoppers")
	.then().assertThat().statusCode(201).log().all();
	}
	@Test(priority=2)
	public void login()
	{
		baseURI="https://www.shoppersstack.com/shopping";
		JSONObject map=new JSONObject();
		map.put("email", "shubhamk115@gmail.com");
		map.put("password", "Shubham@1995");
		map.put("role", "SHOPPER");
		
		given().body(map).contentType(ContentType.JSON)
		.when().post("/users/login")
		.then().log().all().statusCode(200);
	}
	@Test(priority=3)
	
	public void get()
	{
		baseURI="https://www.shoppersstack.com/shopping";
	given().pathParam("shopperid", "20302").auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzaHViaGFtazExNUBnbWFpbC5jb20gU0hPUFBFUiIsImV4cCI6MTY4MTkzNjcxNCwiaWF0IjoxNjgxOTAwNzE0fQ.oPhrcfqqeeIklT9LlT1HgRrRhLQyL8EaeCx4pO0xfM8")
	.when().get("/shoppers/{shopperid}")
	.then().statusCode(200).log().all();
	}
	@Test(priority=4)
	public void patch()
	{
		
		baseURI="https://www.shoppersstack.com/shopping";
		File f=new File("./shop.json");
		
				given().pathParam("shopperid", "20302").auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzaHViaGFtazExNUBnbWFpbC5jb20gU0hPUFBFUiIsImV4cCI6MTY4MTkzNjcxNCwiaWF0IjoxNjgxOTAwNzE0fQ.oPhrcfqqeeIklT9LlT1HgRrRhLQyL8EaeCx4pO0xfM8").contentType(ContentType.JSON)
		.body(f)
		.when().patch("/shoppers/{shopperid}")
		.then().statusCode(200).log().all();
	
		
	}
	

}

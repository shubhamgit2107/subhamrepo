package CrudOperationWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostUsingHashMap {
	Random ran= new Random();
@Test
public void postUsingHash()
{
	HashMap map=new HashMap<>();
	map.put("projectName", "qwertkumar123456"+ran.nextInt(500));
	map.put("createdBy", "shubhamkumar1");
	map.put("status", "created");
	map.put("teamSize", 12);
	
	baseURI="http://rmgtestingserver:8084";
	port=8084;
	
	   given()
	.body(map)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then().statusCode(201).contentType(ContentType.JSON).log().all();
	  
}
}

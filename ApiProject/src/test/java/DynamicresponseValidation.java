import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import  io.restassured.response.Response;

public class DynamicresponseValidation {
	
	String expproject="TY_PROJ_2947";
	@Test
	public void dynamicResponce()
	{
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		
		
	Response respo = when().get("/projects");
	
 
	
	List<String> pid = respo.jsonPath().get("projectId");
	for (String projectID : pid)
	{ 
		 if(projectID.equalsIgnoreCase(expproject)) {
			 Assert.assertTrue(true);
		 }
	}
	 
	respo.then().assertThat().time(Matchers.lessThan(3000L),TimeUnit.MILLISECONDS);
		
		
		
	
	

}
}
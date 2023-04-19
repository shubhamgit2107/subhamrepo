import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class HeaderValidation {
	@Test
	public void headerValidation()
	{
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		Response respo = when().get("/projects");
		respo.getBody().prettyPeek();
		String expcontenytype="application/json";
		String expVary="Access-Control-Request-Headers";
		String expPragma="no-cache";
		String accontentType = respo.getHeader("Content-Type");
	
		String acvary = respo.getHeader("Vary");
		String acpragma = respo.getHeader("Pragma");
	respo.then().log().all();
	Assert.assertEquals(acvary, expVary);
	Assert.assertEquals(accontentType, expcontenytype);
	Assert.assertEquals(acpragma, expPragma);
	}

}

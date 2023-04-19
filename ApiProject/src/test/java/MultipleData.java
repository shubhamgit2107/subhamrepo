import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoUtility.ExcelsheetxlxsUtility;
import PojoUtility.FrameworkConstant;
import PojoUtility.JavaUtility;
import PojoUtility.PostPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class MultipleData {
	
	@DataProvider(name ="data")
	@BeforeClass
	String[][] intiallize() throws EncryptedDocumentException, IOException
	{
ExcelsheetxlxsUtility ex=new ExcelsheetxlxsUtility(FrameworkConstant.APIEXE);
		return ex.getDataProvider("dataprovider");
	}

	
	@Test(dataProvider = "data")
	public void multipleData(String createdBy,String projectName,String status,String teamSize ) {
		System.out.println(createdBy+","+projectName+","+status+","+teamSize);
		
		PostPojo pojo=new PostPojo(createdBy, projectName+JavaUtility.randomNumber(1000), status, Integer.parseInt(teamSize));
		 
		Response response = given().contentType(ContentType.JSON).body(pojo)
				.when()
				   .post("http://rmgtestingserver:8084/addProject");
		
		response.then().statusCode(201).log().all();
}
}

package ecom_Flashcart_genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import PojoUtility.FrameworkConstant;
import ecom_Flashcart_genericUtility_enums.PropertyFileKey;
import ecom_Flashcart_genericUtility_externalfileutility.ExcelsheetxlxsUtility;
import ecom_Flashcart_genericUtility_externalfileutility.PropertyUtility;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class BuilderClass {
	 
	
	JavaUtility jutil=new JavaUtility(); 
	RequestSpecification requestspec;
	ResponseSpecification responsespec;
	@BeforeSuite
	
	public void bsconfig() throws IOException
	{
		 PropertyUtility putil=new PropertyUtility(FrameworkConstant.filepath);	
	RequestSpecBuilder builder = new RequestSpecBuilder();
		//String baseuri = putil.getPropertyData(putil.getData(PropertyFileKey.BASEURI ));
		builder.setBaseUri("http://localhost:8084");
		builder.setPort(8084);
		
		requestspec =builder.build();
	
	
	
	ResponseSpecBuilder builder1=new ResponseSpecBuilder();
	builder1.expectContentType(ContentType.JSON);
	builder1.expectResponseTime(Matchers.lessThan(100L), TimeUnit.MILLISECONDS);
	responsespec = builder1.build(); 
	


}
}

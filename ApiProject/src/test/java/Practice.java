import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoUtility.ExcelsheetxlxsUtility;
import PojoUtility.FrameworkConstant;
import PojoUtility.JavaUtility;
import PojoUtility.PostPojo;

import static io.restassured.RestAssured.*;

public class Practice 
{
@DataProvider(name="shubham")
@BeforeClass
public String[][] intialize() throws EncryptedDocumentException, IOException
{
ExcelsheetxlxsUtility ex=new ExcelsheetxlxsUtility(FrameworkConstant.APIEXE);
 return ex.getDataProvider("dataprovider");
}

@Test(dataProvider ="shubham")
public void setData(String createdBy ,String projectName, String status,String teamSize)
{
	PostPojo pojo =new PostPojo(createdBy, projectName+JavaUtility.randomNumber(500), status, Integer.parseInt(teamSize));
	given().body(pojo)
	.when().post("http://rmgtestingserver:8084/addProject")
	.then().log().all();
}
}
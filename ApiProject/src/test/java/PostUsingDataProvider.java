import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoUtility.PostPojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostUsingDataProvider {
	Random ran= new Random();
	
@Test(dataProvider = "setdata")	
public void PostUsingDataProvider(String createdBy, String projectName, String status, int teamSize)
{
	PostPojo pojo=new PostPojo(createdBy, projectName+ran.nextInt(500), status, teamSize);
	baseURI="http://rmgtestingserver:8084";
	port=8084;
	given().body(pojo).contentType(ContentType.JSON)
	.when().post("/addProject")
.then().log().all();
}
@DataProvider(name="setdata")	
public Object[][] setData() throws EncryptedDocumentException, IOException
{
	
	Object[][] obj= new Object[2][4];
	
	obj[0][0]="shubhamkumar";
	obj[0][1]="fstar";
	obj[0][2]="completed";
	obj[0][3]= 12;
	
	obj[1][0]="shubhamkumar";
	obj[1][1]="uytrew";
	obj[1][2]="completed";
	obj[1][3]= 12;
	return obj;
	
}
	
	
	
	
}


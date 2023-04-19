package ecom_Flashcart_genericUtility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import Config.ConfigDeclaration;
import ObjectRepositry.pom.CommonPage;
import ObjectRepositry.pom.CreateUserLoginPage;
import ObjectRepositry.pom.InsertProduct1;
import ObjectRepositry.pom.InsertproductPage;
import ObjectRepositry.pom.LoginPage;
import ObjectRepositry.pom.OrderLoginPage;
import ObjectRepositry.pom.WishlistPage;
import ecom_Flashcart_genericUtility_enums.PropertyFileKey;
import ecom_Flashcart_genericUtility_externalfileutility.ExcelsheetxlxsUtility;
import ecom_Flashcart_genericUtility_externalfileutility.PropertyUtility;
import listners.ListnerImplementation;




public class ConfigClass extends ConfigDeclaration {	
	
	/**
	 * @param browser
	 * 
	 * this is the configClass all the initialization done here.
	 * and the declaration is done in the config declaration in config package
	 * this class contains launching browser and login action
	 * 
	 * 
	 * 
	 */
	
	public ReportUtility report;
	@Parameters(value="browser")
	@BeforeClass
	public  void beforeClassConfig(@Optional String browser) throws EncryptedDocumentException, IOException
	{
		 report = ListnerImplementation.sreport;
		
	sutil=  new SeleniumUtility();
	 driver = sutil.launchBrowser("chrome", "");
	eutil= new ExcelsheetxlxsUtility(FileInputConstant.FILE_EXCEL_DATA);
	putil=new PropertyUtility(FileInputConstant.FILE_PROPERTY_DATA);
	wutil=new WaitUtility();
	vutil=new VerificationUtility();
	pputil=new PopUpUtility();
	jsutil=new JavaScriptExecutorUtility(driver);
	jutil=new JavaUtility();
	dutil=new DateUtility();
	ddutil=new DropDownUtility();
	cp=new CommonPage(driver);
	//ipp= new InsertproductPage(driver);
	//ipro=new InsertProduct1(driver); 
	ulp=new CreateUserLoginPage(driver);
	soft= new SoftAssert();
	if(browser==null || browser.isBlank() || browser.isEmpty() || browser.equals(""))
	{
		browser=putil.getData(PropertyFileKey.BROWSER);
	}
	this.browser=browser;

	lp=new LoginPage(driver);
	olp=new OrderLoginPage(driver);
	wlp=new WishlistPage(driver);

	}
	@BeforeMethod
	public void bmConfig()
	{
	sutil.maximizeBrowser();
	sutil.launchApplication(putil.getData(PropertyFileKey.URL1));
	//olp.userLoginaction(putil.getData(PropertyFileKey.USERNAME1),putil.getData(PropertyFileKey.PASSWORD1));
		
	}
	@AfterMethod
	public void amTearDown()
	{	
	
	}
	@AfterClass
	public void atTeardown() 
	{
	sutil.closeBrowser();
	soft.assertAll();
	}
	

}

package listners;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ecom_Flashcart_genericUtility.DateUtility;
import ecom_Flashcart_genericUtility.SeleniumUtility;

public class BaseClassPractice {
	public SeleniumUtility sutil;
	public WebDriver driver;
	public DateUtility dutil;
	
	
	
	@Test
	public void test()
	
	{
	
	System.out.println("Testyantra");	
	}
	@BeforeSuite
	public void BeforeSuitSetUp()
	{
	System.out.println("beforeSuit-1");	
	}
@BeforeTest
	public void BeforeTestSetUp()
	{
	System.out.println("beforetest-1");	
	
	
	}
@BeforeClass
	public void BeforeclassSetUp()
	{
	System.out.println("beforeclass-1");
	
	sutil=new SeleniumUtility();
	driver=sutil.launchBrowser("chrome", "");
	dutil=new DateUtility();
	}
@BeforeMethod
	public void BeforemethodSetUp()
	{
	System.out.println("beforemethod-1");	
	}
@AfterMethod
	public void AfterMethodTearUp()
	{
	System.out.println("aftermethod-1");	
	}
@AfterClass
	public void AfterClassTearUp()
	{
	System.out.println("afterclass-1");	
	}
@AfterTest
	public void AfterTestTearUp()
	{
	System.out.println("aftertest-1");	
	}
@AfterSuite
	public void AfterSuitTearUp()
	{
	System.out.println("Aftersuit-1");	
	}
}

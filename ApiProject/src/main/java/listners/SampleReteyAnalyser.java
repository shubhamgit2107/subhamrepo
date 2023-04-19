package listners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecom_Flashcart_genericUtility.SeleniumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleReteyAnalyser extends ListnerImplementation {
	
	
	
	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/index.php");
		Assert.fail();
	}
	@Test
	public void test2()
	{
		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/admin/index.php");
	}
	

}

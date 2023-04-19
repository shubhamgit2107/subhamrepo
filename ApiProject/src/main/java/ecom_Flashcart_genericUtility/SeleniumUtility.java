package ecom_Flashcart_genericUtility;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.google.common.io.Files;
import com.sun.tools.javac.main.Option;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {
	
	private WebDriver driver;
	
	
	public WebDriver launchBrowser(String browser ,String... s)
	{

		/**
		 * @param browser
		 * @param ... s
		 * @author shubh 
		 * this method is used launch the browser and choose between the    browser.
		 * and also use to handle the notification popup .
		 */
		switch(browser)
		{
		case "chrome":
			if(s.length>=1)
			{
				ChromeOptions option= new ChromeOptions();
			option.addArguments("--disable notification--");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(option);
		 break;
			}
			else
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}
		
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		case "ie":
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		break;
			
	}
		return driver;

}
	
	public void maximizeBrowser()
	{
		/**
		 * @author shubh 
		 * this method is used to maximize the browser.
		 *  .
		 */
		driver.manage().window().maximize();
	}
	public void minimizeBrowser()
	{
		/**
		 * @author shubh 
		 * this method is used to minimize the browser.
		 *  .
		 */
	driver.manage().window().maximize();	
	}
	public void reSizeBrowser(int width, int height)
	{
		/**
		 * @param width
		 * @height
		 * @author shubh 
		 * this method is used to resize the browser.
		 *  .
		 */
		driver.manage().window().setSize(new Dimension(width,height));
	}
	public void launchApplication(String url)
	{
		/**
		 * 
		 * @param url
		 * @author shubh 
		 * this method is used to launch the application.
		 *  .
		 */
		driver.get(url);
	}
	public void closeBrowser()
	/**
	 * 
	 * 
	 * @author shubh 
	 * this method is used to close the browser.
	 *  .
	 */
	{
		driver.quit();
	}
	public void closeTab()
	{
		/**
		 * @author shubh 
		 * this method is used to close the tab.
		 *  .
		 */
		driver.close();
	}
	public void openFullSizeBrowser()
	{
		/**
		 * @author shubh 
		 * this method is use to open the browser in fullscreen.
		 *  .
		 */
		driver.manage().window().fullscreen();
	}
	public void forwardBrowser()
	{
		/**
		 * @author shubh 
		 * this method is used to navigate the browser.
		 *  .
		 */
		driver.navigate().forward();
	}
	public void backWardbrowser()
	{
		/**
		 * @author shubh 
		 * this method is used back the browser.
		 *  .
		 */
		driver.navigate().back();
	}
	public void MoveToUrl(String url)
	{
		/**
		 * @author shubh 
		 * this method is used to move to another site .
		 *  .
		 */
		driver.navigate().to( url);
	}
	public void ScrollDownWindow()
	{
		/**
		 * @author shubh 
		 * this method is used to scrolldown  and scrollup the window.
		 *  .
		 */
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<5;i++)
		{
			
		js.executeScript("window.scrollBy(0,500)");
		}
		for(int j=0;j<5;j++)
		{
			js.executeScript("window.scrollBy(0,-500)");
		}
	}
	public String getScreenShot(  String testcasename,DateUtility dateutility) throws IOException
	{
		/**
		 * @param testcasename
		 * @param dateutility
		 * @author shubh
		 * this method is use to take screenshot 
		 */
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./src/main/resources/sceenshot/element"+testcasename+"_" +dateutility.getCurrentDateTime()+".png");
		FileUtils.copyFile(src, trg);
	return	trg.getAbsolutePath();
		
	}
	public String getScreenShot(WebElement element, DateUtility dateUtility) throws IOException
	{
		/**
		 * @param element
		 * @dateUtiltity
		 * @author shubh
		 * this method is use to take screenshot 
		 */
		File scr = element.getScreenshotAs(OutputType.FILE);
		File trg=new File("./src/main/resources/sceenshot/element/"+element+"_"+dateUtility.getCurrentDateTime()+".png");
		FileUtils.copyFile(scr, trg);
	return	trg.getAbsolutePath();
	}
	
	public String getScreenShot() 
		
	{
	TakesScreenshot ts= (TakesScreenshot)driver;
		String path=ts.getScreenshotAs(OutputType.BASE64);
		return path;

	}
	

	
}

	
	
	
	






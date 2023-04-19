package ecom_Flashcart_genericUtility;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {
	public void browserLaunchWebDriverManager(WebDriver driver)
	{
		WebDriverManager.chromedriver().setup();
	}
	public void ChromeLaunch(WebDriver driver)
	{
	WebDriver driver1=new ChromeDriver();	
	}
	public void fullScreen(WebDriver driver)
	{ 
		driver.manage().window().fullscreen();
		
	}
	public void backNavigate(WebDriver driver)
	{
		driver.navigate().back();
	}
	public void forwadNavigation(WebDriver driver)
	{
		driver.navigate().forward();
	}
	public void refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	public void getUrl(WebDriver driver)
	{
		driver.get("");
		
	}
	public void getTitle(WebDriver driver)
	{
		driver.getTitle();
	}
	public void getPageSource(WebDriver driver)
	{
	driver.getPageSource();
	}
	public void getClass(WebDriver driver)
	{
	driver.getClass();	
	}
	public void getQuit(WebDriver driver)
	{
		driver.quit();
	}
	public void getClose(WebDriver driver)
	{
		driver.close();
	}
	
	




	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void miniimizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	

	
		
		
	
	public void handleDropDown(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void handleDropDown(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void alertPopup(WebDriver driver,WebElement element)
	{
	Alert a=driver.switchTo().alert();
	a.accept();
	a.dismiss();
	}
	public void notificationPopUp(WebDriver driver,WebElement element)
	{
	ChromeOptions option= new ChromeOptions();
			option.addArguments("disable notification");
			WebDriver driver2=new ChromeDriver(option);
	}
	
	
	public void handleDropDown( String visibletext,WebElement element)
	
	{

		Select sel=new Select(element);
		sel.selectByVisibleText(visibletext);
	}
	public void handleMouseHoverAction(WebDriver driver, WebElement element)
	{
		Actions act =new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void handleMouseHoverAction(WebDriver driver, WebElement element,int x,int y)
	{
		Actions act =new Actions(driver);
		act.moveToElement(element,x,y).perform();
	}
	public void rightClickAction(WebDriver driver)
	{
		Actions act =new Actions(driver);
		act.contextClick().perform();
		
	}
	public void  rightClickAction(WebDriver driver, WebElement element,int x,int y)
	
	{
		Actions act =new Actions(driver);
		act.contextClick(element).perform();
	}
	public void doubleClickAction(WebDriver driver)
	{
		Actions act =new Actions(driver);
		act.doubleClick().perform();
	}
	public void doubleClickAction(WebDriver driver,WebElement element)
	{
		Actions act =new Actions(driver);
		act.doubleClick(element).perform();
		
	}
	public void dragAndDrop(WebDriver driver,WebElement srcelement,WebElement tarelement)
	{
		Actions act =new Actions(driver);
		act.dragAndDrop(srcelement,tarelement).perform();
	}
	public void pressEnterKey() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	public void releaseEnterKey() throws AWTException
	{
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver, String nameid)
	{
		driver.switchTo().frame(nameid);
	}
	public void switchToFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void switchToFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void scrollAction(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)" ,"");
	}
	public void scrollAction(WebDriver driver ,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int y=element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")" ,element);
	}
		
	public String screenShot(WebDriver driver ,WebElement element ,String screenShotName) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dst =new File(".\\screenshot\\"+screenShotName+".png");
		Files.copy(src, dst);
		 
		return dst.getAbsolutePath();
	}
	public void switchToWindow(WebDriver driver , String partialWinTitle)
	{
		/**
		 * @author shubh 
		 * this method is used to switch the window  from parent to child  .
		 * 
		 *
		 *  .
		 */
		Set<String> allWindows = driver.getWindowHandles();
		for(String Indwindow:allWindows)
		{
			String currentWinTitle = driver.switchTo().window(Indwindow).getTitle();
			if( currentWinTitle.contains(partialWinTitle))
			{
				break;
			}
		}
	}
		
		
	}
			
			
		
	






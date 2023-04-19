package ecom_Flashcart_genericUtility;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public void pause(long milisecond)
	{
		/**
		 * 
		 * @param millisecond
		 * @author shubh 
		 * this method is used to pause the execution of browser.
		 *  .
		 */
		try {
			Thread.sleep( milisecond);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void implicitlyWait(WebDriver driver, long timeout)
	{
		/**
		 * @param driver
		 * @param timeout
		 * @author shubh 
		 * this method is used to implicitly wait the execution of browser.
		 *  it search for the address of element in wait till result if output 
		 *  not come it throw no such element exception.
		 */
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	public void customWaitForSecond(long pollingTime ,int duration,WebElement element) throws InterruptedException
	{
		/**
		 * 
		 * 
		 * @param pollingTime
		 * @param duration
		 * @param elemant
		 * @author shubh 
		 * this method is used to pause the browser according to our requirement.
		 *  .
		 */
		int count=0;
		while(count<duration)
		{
			try 
			{
				element.click();
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(1000);
				count=count+(int)pollingTime/1000;

			}

		}
	}
		public void webvisibilty(WebDriver driver,WebElement element,int second){
			/**
			 * @author shubh 
			 * this method is used to pause the explicitly .
			 * this wait check for the condition if condition matches then it execute otherwise throw no such 
			 * element exception.
			 *  .
			 */
			WebDriverWait wait=new WebDriverWait(driver,second);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		public void ElementTOBeClickable(WebDriver driver, WebElement element,int second )
		{
			/**
			 * @param driver
			 * @param element 
			 * @param second
			 * @author shubh 
			 * this method is used to pause the explicitly .
			 * this wait check for the condition if condition matches then it execute otherwise throw no such 
			 * element exception.
			 *  .
			 */
			WebDriverWait wait=new WebDriverWait(driver,second);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
			
		



	}







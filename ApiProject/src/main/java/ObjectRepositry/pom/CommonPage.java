package ObjectRepositry.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ecom_Flashcart_genericUtility_enums.DynamicTab;

//declaration
public class CommonPage {
	private WebDriver driver;
	String tabpartialxpath="//a[normalize-space()='%s']";
	
		private WebElement convertWebElement(String partialxpath,String replacedata)
		{
			 /**
			  * @param partialxpath
			  * @param replacedata
			  * @author shubh
			  * it store web address for different element
			  * this class is pom  for common page
			  * it as dynamic xpath for different tab
			  *@param partialxpath
			  *@param replacedata 
			  *
			  * 
			  *
			  */
			String xpath = String.format(partialxpath, replacedata);
		return driver.findElement(By.xpath(xpath));
		}
		
		
		public CommonPage(WebDriver driver)
		{
			/**
			 * 
			 * @param driver
			 * @author shubh
			 * @param driver
			 * constructor to initialize element
			 */
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
			
		}
		
		
		public void clickTab(DynamicTab dynamictab)
		{
			/**
			 * 
			 * @param dynamictab
			 * @author shubh
			 * @param dynamitab
			 */
			convertWebElement(tabpartialxpath,dynamictab.getDynamicTab()).click();
		}
		
		
		
	}




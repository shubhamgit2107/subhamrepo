package ecom_Flashcart_genericUtility;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtility {
	JavascriptExecutor js;
	
	public JavaScriptExecutorUtility(WebDriver driver)
	{
		
		/**
		 * @param driver
		 * @author shubh
		 * this method is type casted toJavascriptExecutor
		 */
		js=(JavascriptExecutor)driver;
	}
	public void scrollUp()
	{
		/**
		 * @author shubh
		 * this method is used to scrollup the window.
		 * thisstatement is from javascript library.
		 */
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
	public void scrollDown()
	{
		/**
		 * @author shubh
		 * this method is used to scrolldown the window.
		 * thisstatement is from javascript library.
		 */
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public void scrollTillElement(WebElement element)
	{
		/**
		 * @param element
		 * @author shubh
		 * this method is used to scroll the window according to the need .
		 * this statement is from javascript library.
		 */
		js.executeScript("window.scrollBy(argument[0]).scrollIntoView())",element);
	}
	public void click(WebElement element)
	{
		/**
		 * 
		 * @param element
		 * @author shubh
		 * this method is used to click on the element.
		 * this statement is from javascript library.
		 */
		js.executeScript("argument[0]).click()",element);
	}
	public void sendKeys(WebElement element,String data)
	{
		/**
		 * 
		 * @param element
		 * @param data
		 * @author shubh
		 * this method is used to send the text in the textfield.
		 * this statement is from javascript library.
		 */
		js.executeScript("argument[0].value=argument[1]",element,data);
	}
	public void url(String url)
	{
		/**
		 * @param url
		 * @author shubh
		 * this method is used to launch the browser by entering the url.
		 * this statement is from javascript library.
		 */
		js.executeScript("window.location=argument[0]",url);
	}
	public void highlightElement(WebElement element)
	{
		/**
		 * 
		 * 
		 * @param element
		 * @author shubh
		 * this method is used to feed colour into the web elements .
		 * this statement is from javascript library.
		 */
		js.executeScript("argument[0].setAttribute('style','border: 6px dotted red;');",element);
	}
	
}


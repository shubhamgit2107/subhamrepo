package ecom_Flashcart_genericUtility;


import org.openqa.selenium.WebDriver;

public class PopUpUtility {
	
	public void alertAccept(WebDriver driver)
	{
		/**
		 * @param driver
		 * @author shubh 
		 * this method is used to handle the alert popup.
		 * and it select the accept option .
		 */
		driver.switchTo().alert().accept();
	}
	public void alertDismiss(WebDriver driver)
	{

		/**
		 * 
		 * 
		 * @param driver
		 * @author shubh 
		 * this method is used to handle the alert popup.
		 * and it select the dismiss option .
		 */
		driver.switchTo().alert().dismiss();
	}
	public void alertSendkeys(WebDriver driver,String data)
	{

		/**
		 * 
		 * @param driver
		 * @param data
		 * @author shubh 
		 * this method is used to handle the alert popup.
		 * and it is use to write text using alert popup .
		 */
		driver.switchTo().alert().sendKeys(data);
	}
	public void alertGetText(WebDriver driver,String text)
	{

		/**
		 * 
		 * @param driver
		 * @param text
		 * @author shubh 
		 * this method is used to handle the alert popup.
		 * and it is use to get the text from window
		 */ 
		driver.switchTo().alert().getText();
	}

}


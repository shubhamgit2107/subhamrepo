package ecom_Flashcart_genericUtility;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility {
	
	public void dropDown(WebElement element,String value)
	{
		/**
		 * @param element
		 * @param value
		 * @author shubh
		 * this method is use to handle dropdown by selecting value.
		 * thismethod is overloaded
		 */
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void dropDown(WebElement element,int index)
	{
		/**
		 * @author shubh
		 * @param element
		 * @param index
		 * this method is use to handle dropdown by selecting the index
		 * this method is overloaded.
		 */
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void dropDown(String value,WebElement element)
	{
		/**
		 * 
		 * @param value
		 * @param element
		 * @author shubh
		 * this method is use to handle dropdown by select by visible text.
		 * this method is overloaded
		 */
	
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}

}


package ObjectRepositry.pom;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ecom_Flashcart_genericUtility.FileInputConstant;
import ecom_Flashcart_genericUtility_enums.ExcelFileData;
import ecom_Flashcart_genericUtility_enums.PropertyFileKey;
import ecom_Flashcart_genericUtility_externalfileutility.ExcelsheetxlxsUtility;
import ecom_Flashcart_genericUtility_externalfileutility.PropertyUtility;
import net.bytebuddy.asm.Advice.Enter;

public class InsertproductPage {
	WebDriver driver;
	String partialxpath="//*[@name='%s']";
	@FindBy(xpath="//*[@name='submit']") private RemoteWebElement submit;
	
	
	private WebElement referance(String partialxpath,String replacedata)
	{
	
String xpath=String.format(partialxpath,replacedata);
return driver.findElement(By.xpath(xpath));
}
	public InsertproductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//********************tohandleDropdown***********/
	public void handleDropDown(String tolocatexpath,String visibletext)
	{
		WebElement element= referance(partialxpath,tolocatexpath);
	Select sle=new Select(element);
	sle.selectByVisibleText(visibletext);
	}
	//***************************textfieldinsertproduct*******
	public void insertProduct(Map<String, String> map1,PropertyUtility putil) throws EncryptedDocumentException, IOException
	{
		for(Entry<String,String>m:map1.entrySet())
		{
			referance(partialxpath,m.getKey()).sendKeys(m.getValue()); 
			
		}
		
			InsertproductPage ip= new InsertproductPage(driver);
			ExcelsheetxlxsUtility eutil=new ExcelsheetxlxsUtility(FileInputConstant.FILE_EXCEL_DATA);
			Map<String, String> map = eutil.initializeExcel("category", ExcelFileData.CATEGORY.getSheetName());
			ip.handleDropDown("category", map.get("category"));
			ip.handleDropDown("subcategory", map.get("subcategory"));
			ip.handleDropDown("productAvailability",map.get("productAvailability"));
			uploadFile("productimage1",putil.getData(PropertyFileKey.FILE));
			uploadFile("productimage2",putil.getData(PropertyFileKey.FILE));
			uploadFile("productimage3",putil.getData(PropertyFileKey.FILE));
			submit.click();
			
		}
		
	private void uploadFile(String tolocatexpath,String filetopass)
	{
		referance(partialxpath,tolocatexpath).sendKeys(filetopass);
	}

}


package ObjectRepositry.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertProduct1 {
	 WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Enter category Name']") private WebElement categorynametf;
	@FindBy(xpath="//textarea[@name='description']") private WebElement discriptiontf;
	@FindBy(xpath="//button[@type='submit']") private WebElement submitbtn;
	@FindBy(xpath="//a[text()='Sub Category ']") private WebElement subcartegorybtn;
	
	
	
	@FindBy(xpath="//input[@placeholder='Enter SubCategory Name']") private WebElement subcategorybtn;
		@FindBy(xpath="//button[@type='submit']") private WebElement submittbtn;
	@FindBy(xpath="//a[text()='Insert Product ']") private WebElement insertbtn ;
	
	
	@FindBy(name="productName") private WebElement productnametf;
	@FindBy(name="productCompany") private WebElement productcompanytf;
	@FindBy(name="productpricebd") private WebElement productpricebdtf;
	@FindBy(name="productprice") private WebElement productpricetf;
	@FindBy(name="productDescription") private WebElement productdescriptiontf;
	@FindBy(name="productShippingcharge") private WebElement productshippingchargetf;
	
	
	@FindBy(xpath="//input[@name='productimage1']") private WebElement imagetf1;
	@FindBy(xpath="//input[@name='productimage2']") private WebElement imagetf2;
    @FindBy(xpath="//input[@name='productimage3']") private WebElement imagetf3;
	@FindBy(xpath="") private WebElement submittab;
	
	public InsertProduct1(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

public void catgoryname(String categoryname ,String discription)
{
	categorynametf.sendKeys(categoryname);	
	discriptiontf.sendKeys(discription);
	submitbtn.click();
	subcartegorybtn.click();
	
}
public void subcategory( String subcategory)
{
	subcategorybtn.sendKeys(subcategory);
	submittbtn.click();
	 insertbtn.click();
}
public void textFieldAction(String productname,String productcompany,String productpricebd,String productprice,String productdescription,String productshippingcharge)
{
	 productnametf.sendKeys(productname);
	 productcompanytf.sendKeys(productcompany);
	 productpricebdtf.sendKeys(productpricebd);
	 productpricetf.sendKeys(productprice);
	 productdescriptiontf.sendKeys(productdescription);
	 productshippingchargetf.sendKeys(productshippingcharge);
}
public void imagetab(String filepath1,String filepath2,String filepath3 )
{
	imagetf1.sendKeys(filepath1);
	 imagetf2.sendKeys(filepath2);
	 imagetf3.sendKeys(filepath3);
	 submittab.click();
	 
	
}
}

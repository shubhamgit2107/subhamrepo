package ObjectRepositry.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderLoginPage {
	WebDriver driver;
	@FindBy(linkText="Login")private WebElement loginicon;
	@FindBy(name="email")private WebElement usernametf;
	@FindBy(name="password")private WebElement passwordtf;
	@FindBy(xpath="//button[text()='Login']")private WebElement loginbtn;
	
	@FindBy(xpath="//input[@class='search-field']")private WebElement productnametf;
	@FindBy(xpath="//button[@class='search-button']")private WebElement searchbarbtn;
	@FindBy(xpath="//button[normalize-space()='Add to cart']//preceding::li[@class='add-cart-button btn-group']")private WebElement addToCart;
	
	
	@FindBy(xpath="//button[.='PROCCED TO CHEKOUT']")private WebElement cheakoutbtn;
	@FindBy(xpath="//input[@value='COD']")private WebElement codbtn;
	@FindBy(xpath="//input[@type='submit']")private WebElement submitbtn;
	@FindBy(linkText="Logout")private WebElement logoutbtn;
	
	public OrderLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void userLoginaction(String username,String password)
	{
		loginicon.click();	
		 usernametf.sendKeys(username);
		 passwordtf.sendKeys(password);
		 loginbtn.click();
	}
	public void productNametf(String productname)
	{
		productnametf.sendKeys(productname);
	}
	
	public void seachBtn()
	{
		searchbarbtn.click();;
	}

	public void addToCart()
	{
		addToCart.click();;
	}
	public void cheakOutBtn()
	{
		 cheakoutbtn.click();
	}
	public void codBtn()
	{
		codbtn.click();
	}
	public void submitBtn()
	{
		submitbtn.click();
	}
	public void logoutBtn()
	{
		logoutbtn.click();
	}
	
	
}

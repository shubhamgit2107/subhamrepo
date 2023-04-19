package ObjectRepositry.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	WebDriver driver;
	@FindBy(linkText="Login")private WebElement loginicon;
	@FindBy(name="email")private WebElement usernametf;
	@FindBy(name="password")private WebElement passwordtf;
	@FindBy(xpath="//button[text()='Login']")private WebElement loginbtn;
	
	@FindBy(xpath="//input[@class='search-field']")private WebElement searchfield;
	@FindBy(xpath="//button[@class='search-button']")private WebElement searchbtn;
	@FindBy(xpath="//div[@class='action']//following::ul[@class='list-unstyled']//following::li[@class='add-cart-button btn-group']//following::i[@class='fa fa-shopping-cart']//following::a[@class='add-to-cart']")private WebElement shoppingcartbtn;
	@FindBy(xpath="(//a[text()='Add to cart'])[1]")private WebElement addtocartbtn;
	@FindBy(xpath="//a[normalize-space()='Logout']")private WebElement logoutbtn;
	


public WishlistPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void UserLoginAction(String username,String password)
{
	loginicon.click();
	usernametf.sendKeys(username);
	passwordtf.sendKeys(password);
	loginbtn.click();
	
}
public void wishlistAction(String productname)
{
	searchfield.sendKeys(productname);	
	 searchbtn.click();
	 shoppingcartbtn.click();
}
public void addToCart()
{
	addtocartbtn.click();	
}
public void wishlistLogout()
{
	
	 logoutbtn.click();
}
}
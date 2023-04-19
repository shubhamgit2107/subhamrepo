package ObjectRepositry.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUserLoginPage {

	//declaration
		WebDriver driver;
		@FindBy(linkText="Login") private WebElement login;
		@FindBy(name="email") private WebElement usernameTab;
		@FindBy(name="password") private WebElement passwordTab;
		@FindBy(xpath="//button[text()='Login']") private WebElement loginbtn;

	
	@FindBy (id="inputEmail") private WebElement adusernameTab;
	@FindBy (id="inputPassword") private WebElement adpasswordTab;
	@FindBy(xpath="//button[@type='submit']") private WebElement adloginbtn;
	@FindBy(linkText="My Account") private WebElement myaccountbtn;
	@FindBy(linkText="Shipping / Billing Address") private WebElement billingaddressbtn;
	@FindBy(xpath="//body[@class='cnt-home']")private WebElement ShippingAddresstf;
	@FindBy(xpath="//body[@class='cnt-home']")private WebElement statetf;
	@FindBy(xpath="//body[@class='cnt-home']")private WebElement citytf;
	@FindBy(xpath="//body[@class='cnt-home']")private WebElement piccodetf;
	@FindBy(name="update")private WebElement updatebtn;
	@FindBy(xpath="//a[normalize-space()='Logout']")private WebElement Userlogoutbtn;
	@FindBy(xpath="//i[@class='menu-icon icon-group']")private WebElement menuiconbtn;
	@FindBy(xpath="//a[normalize-space()='Logout']//ancestor::ul[@class='nav pull-right']")private WebElement adsignout;
	@FindBy (xpath="//h2[text()='Shopping Portal']") private WebElement userver;
	@FindBy (xpath="//a[normalize-space()='Shopping Portal | Admin']") private WebElement adminver;
//initialization
public CreateUserLoginPage(WebDriver driver)
{
	/**
	 * 
	 * @param driver
	 * @author shubh
	 * this is the constructor for initialize
	 */
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
//utilization
public void loginAction(String username,String password)
{
	/**
	 * @param username
	 * @param password
	 * @author shubh
	 * this is bussiness library
	 * 
	 */
	login.click();
	usernameTab.sendKeys(username);
	passwordTab.sendKeys(password);
	loginbtn.click();
}
public void adLoginAction(String aduser,String adpass)
{
	adusernameTab.sendKeys(aduser);
	adpasswordTab.sendKeys(adpass);
	adloginbtn.click();
	
}
public void textFieldAction(String shippingaddress,String state,String city,String pincode)
{
	 myaccountbtn.click();
	billingaddressbtn.click();
	 ShippingAddresstf.sendKeys(shippingaddress);
	 statetf.sendKeys(state);
	 citytf.sendKeys(city);
	 piccodetf.sendKeys(pincode);
	 updatebtn.click();
	 
}
public void userLogout()
{
	Userlogoutbtn.click();	
}
public void adsignout()
{
	menuiconbtn.click();
	adsignout.click();
	
}
public String userverification()
{
	
	return userver.getText();
}
public String adminverification()
{
	
	return adminver.getText();
}
}

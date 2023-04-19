package ObjectRepositry.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 /**
	  * 
	  * @author shubh
	  * this class is pom  for common page
	  * it store web address for different element
	  * login 
	  * user
	  *  password
	  * 
	  *
	  * 
	  *
	  */
	WebDriver driver; 
	@FindBy(id="inputEmail") private WebElement usernameTextField;
	@FindBy(id="inputPassword") private WebElement passwordTextField;
	@FindBy(xpath="//button[normalize-space()='Login']") private WebElement loginbtn;
	@FindBy(xpath="//a[normalize-space()='Logout']")private WebElement userlogout;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void loginAction(String username,String password)
	{
		usernameTextField.sendKeys(username);	
		 passwordTextField.sendKeys(password);
		 loginbtn.click();
	}
	public void userLogout()
	{
		userlogout.click();
	}
	
	
	
}

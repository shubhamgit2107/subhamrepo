package ObjectRepositry.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApiHomePage {
	WebDriver driver;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement usernametb;

}

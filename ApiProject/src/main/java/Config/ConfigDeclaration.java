package Config;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import ObjectRepositry.pom.CommonPage;
import ObjectRepositry.pom.CreateUserLoginPage;
import ObjectRepositry.pom.InsertProduct1;
import ObjectRepositry.pom.InsertProduct1;

import ObjectRepositry.pom.InsertproductPage;
import ObjectRepositry.pom.LoginPage;
import ObjectRepositry.pom.OrderLoginPage;
import ObjectRepositry.pom.WishlistPage;
import ecom_Flashcart_genericUtility.DateUtility;
import ecom_Flashcart_genericUtility.DropDownUtility;
import ecom_Flashcart_genericUtility.JavaScriptExecutorUtility;
import ecom_Flashcart_genericUtility.JavaUtility;
import ecom_Flashcart_genericUtility.PopUpUtility;
import ecom_Flashcart_genericUtility.SeleniumUtility;
import ecom_Flashcart_genericUtility.VerificationUtility;
import ecom_Flashcart_genericUtility.WaitUtility;
import ecom_Flashcart_genericUtility_externalfileutility.ExcelsheetxlxsUtility;
import ecom_Flashcart_genericUtility_externalfileutility.PropertyUtility;

public class ConfigDeclaration {
	public SeleniumUtility sutil;
	protected ExcelsheetxlxsUtility eutil;
	public PropertyUtility putil;
	protected WaitUtility wutil;
	protected VerificationUtility vutil;
	protected PopUpUtility pputil;
	protected JavaScriptExecutorUtility jsutil;
	protected JavaUtility jutil;
	public DateUtility dutil;
	protected DropDownUtility ddutil;
	protected CommonPage cp;
	protected CreateUserLoginPage ulp;
	//public InsertproductPage ipp;
	//public InsertProduct1 ipro;
	protected SoftAssert soft;
	protected LoginPage lp;
	protected OrderLoginPage olp;
	protected WishlistPage wlp;
	protected WebDriver driver;
	protected String browser; 
		
	
	//protected InsertProduct1page ipro;

}

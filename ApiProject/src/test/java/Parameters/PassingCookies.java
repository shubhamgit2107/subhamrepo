package Parameters;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Cookie.Builder;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class PassingCookies {
	
	
	@Test
	public void passCookies()
	{
		given().baseUri("").cookie("key","value").when().get("");
		
		
		
	}
	
	@Test
	public void passingMultipleCokkies() 
	{
		given().baseUri("").cookie("key","value").cookie("", "").when().get("");
	}
	@Test
	public void passingMultipleCokkiesvalues() 
	{
		given().baseUri("").cookie("key","value","value","value").cookie("", "").when().get("");
	}
	
	@Test
	public void passingCookiesWithCookiesBuilder()
	{
		
		Cookie requestcookies= new Cookie.Builder("key", "values").isSecure(true).build();
		 
	}

}

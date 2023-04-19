package ecom_Flashcart_genericUtility_enums;

public enum PropertyFileKey {
	/**
	 * @param
	 * @author shubh
	 * this method is crate eneams for property file. 
	 */

	BROWSER("browser"),TIMEOUT("timeout"),URL1("url1"),URL2("url2"),USERNAME1("username1"),FILE("file"),PASSWORD1("password1"),USERNAME2("username2"),BASEURI("BaseUri"),PASSWORD2("password2"),URL3("url3"), REPORTFILEPATH("reportfilepath"),REPORTTITLE("reporttitle"),REPORTNAME("reportname"),OVERRIDEREPORT("overridereport");
String key;

private  PropertyFileKey(String key)
{
	this.key=key;
}
public String getFileKey()
{
	return key;
}

}

package ecom_Flashcart_genericUtility_enums;


public enum ExcelFileData {
	/**
	 *@author shubh
	 *@param key 
	 */
	CATEGORY("category");
	String key;


private ExcelFileData(String key)
/**
 * @param key
 * @return
 * constructor to set the data
 * acting as setter method
 */
{
	this. key=key;
}
public String getSheetName()
/**
 * method acting as getter
 */
{
	return key;
}
}


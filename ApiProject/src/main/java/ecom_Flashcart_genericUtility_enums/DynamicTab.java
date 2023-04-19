package ecom_Flashcart_genericUtility_enums;


public enum DynamicTab {
	/**
	 * 
	 * @author shubh
	 * this method is use create enemas .
	 *  this will reduce the chance of error and improve the code optimization.
	 *  this is the  for handle tabs
	 */
	ORDERMANAGEMENT("Order Management"),MANAGEUSERS("Manage users"),CREATECATEGORY("Create Category"),SUBCATEGORY("Sub Category"),INSERTPRODUCT("Insert Product")
	,MANAGEPRODUCT("Manage Product"),USERLOGINLOG("UserLogin log"),LOGOUT("Logout");
	
private String  Dynamictab;
	
	private DynamicTab(String Dynamictab)
	{
		/**
		 * @author shubh
		 * constructor acting as setter
		 * @param Dynamictab
		 */
		this.Dynamictab=Dynamictab;
	}
	public String getDynamicTab()
	{

		/**
		 * @author shubh
		 * method acting as getter
		 * @param Dynamictab
		 */
		return Dynamictab;
	}
	
}


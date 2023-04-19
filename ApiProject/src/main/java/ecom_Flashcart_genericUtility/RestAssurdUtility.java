package ecom_Flashcart_genericUtility;


import io.restassured.response.Response;

public class RestAssurdUtility {
	
	
	public String getJsonData(Response response,String path)
	{
		
		String jsonData=response.jsonPath().get(path);
		return jsonData;
	}

}

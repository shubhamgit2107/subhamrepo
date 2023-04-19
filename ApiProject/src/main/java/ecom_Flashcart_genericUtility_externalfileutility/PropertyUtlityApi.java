package ecom_Flashcart_genericUtility_externalfileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import PojoUtility.FrameworkConstant;

public class PropertyUtlityApi {
	public PropertyUtlityApi()
	{
		
	}

	
		public String getCommanData(String key, String filepath) throws IOException
		{
			FileInputStream fis=new FileInputStream(FrameworkConstant.filepath );
			Properties pobj= new Properties();
			pobj.load(fis);
			String data = pobj.getProperty(key);
			return data;
		}

	}



package PojoUtility;

import java.util.Random;

public class JavaUtility {
	
	public static int randomNumber(int value)
	{
		Random ran=new Random();
		int randomnumber = ran.nextInt(value);
		return randomnumber;
	}

}

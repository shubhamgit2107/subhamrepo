package ecom_Flashcart_genericUtility;



import java.util.Base64;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber(int value)
	{
		/**
		 * @param value
		 * @author shubh
		 * this method is used to select the random number 
		 */
		return new Random().nextInt(value);
	}
	public void printConsole(Object output)
	{
		/**
		 * 
		 * @param output
		 * @author shubh
		 * this method is use to print output in console
		 */
		System.out.println(output);
	}
	public int parseData(String number)
	{
		/**
		 * 
		 * @param number
		 * @author shubh 
		 * this method is used to convert the data string into integer.
		 */
		return Integer.parseInt(number);
	}
	public String[] splitNumber(String s, String strategy)
	{
		/**
		 * 
		 * @param s
		 * @param strategy
		 * @author shubh 
		 * this method is used to split the string.
		 */
		
		return s.split(strategy);
	}
	
	public String encode(String s)
	{
		/**
		 * 
		 * @param s
		 * @author shubh 
		 * this method is used to encode the data.
		 */
		return new String(Base64.getDecoder().decode(s.getBytes()));
	}
	public String decode(String s)
	{
		/**
		 * 
		 * @param s
		 * @author shubh 
		 * this method is used to decode the data.
		 */
	return new	String(Base64.getDecoder().decode(s.getBytes()));
	}

}


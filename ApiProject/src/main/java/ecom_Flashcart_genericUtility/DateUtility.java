package ecom_Flashcart_genericUtility;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {
	
	public String getCurrentDateTime()
	{
		/**
		 * @author shubh
		 * this method is used to find current date.
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MMM_YYYY_HH_mm_sss");
		return sdf.format(new Date());
	}
	public String getCurrentDateTime(String pattern)
	{
		/**
		 * @author shubh
		 * this method is used to find current date.
		 */
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		return sdf.format(new Date());
	}
	public String addOrSubtractDate(int day)
	{
		/**
		 * @param day
		 * @author shubh
		 * this method is use to add orsubstract date by giving specific date.
		 * this method is overloaded method to following method.
		 */
		SimpleDateFormat sdf= new SimpleDateFormat("dd_MMM_YYYY");
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, day);
		return sdf.format(cal.getTime());
	}
	public String addOrSubtractDate(int day,String date) throws ParseException
	{
		/**
		 * 
		 * @param day
		 * @param date
		 * @author shubh
		 * this method is use to add or substract date by giving specific date.
		 * this method is over loaded method to preceding method.
		 */
		SimpleDateFormat sdf= new SimpleDateFormat("dd_MMM_YYYY");
		Calendar cal=Calendar.getInstance();
		cal.setTime(sdf.parse(date));
		cal.add(Calendar.DAY_OF_MONTH, day);
		return sdf.format(cal.getTime());
		
	}
	
	
	
}



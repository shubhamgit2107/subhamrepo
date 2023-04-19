package ecom_Flashcart_genericUtility;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import ecom_Flashcart_genericUtility_enums.PropertyFileKey;
import ecom_Flashcart_genericUtility_externalfileutility.PropertyUtility;
import listners.InstanceUtilityTransfer;

public class ReportUtility {
	
	private ExtentReports report;
	
	public ReportUtility()
	{
		/**
		 * @param filepath
		 * @param title
		 * @param reportname
		 * @param browsername
		 * @
		 */
		PropertyUtility putil = null;
		try {
			putil = new PropertyUtility(FileInputConstant.FILE_PROPERTY_DATA);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String overrideornot = putil.getData(PropertyFileKey.OVERRIDEREPORT);
		String randomName="";
		if(overrideornot.equalsIgnoreCase("no"))
		{
			randomName=new DateUtility().getCurrentDateTime();
					
		}
		
		ExtentSparkReporter spark=new ExtentSparkReporter(FileInputConstant.EXTENT_REPORT_FILE_PATH+"extentReport"+randomName+".html");
		spark.config().setDocumentTitle(putil.getData(PropertyFileKey.REPORTTITLE));
		spark.config().setReportName(putil.getData(PropertyFileKey.REPORTNAME));
		spark.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(spark);
		
		report.setSystemInfo("Browser", putil.getData(PropertyFileKey.BROWSER));
		report.setSystemInfo("os", System.getProperty("os.name"));
		
		
	}
	public void createTest(String testname)
	{
		/**
		 * @param testname
		 * @author shubh
		 */
		ExtentTest test = report.createTest(testname);
		InstanceUtilityTransfer.setExtenttest(test);
		
	}
	public void fail(ExtentTest test, String message)
	{
		/**
		 * @param message
		 * @author shubh
		 */
		test.fail(message);
		System.out.println(message);
	}
	public void addAuthor(ExtentTest test,String name)
	{
		/**
		 * @param names
		 * @author shubh
		 */
		test.assignAuthor(name);
	}
	
	public void addCategory(ExtentTest test,String name)
	{
		
		/**
		 * @param names
		 * @author shubh
		 */
		test.assignCategory(name);
	}
	public void skip(ExtentTest test,Throwable erromessage)
	{
		/**
		 * @param erromessage
		 * @author shubh
		 */
		test.skip(erromessage);
		System.out.println("erromessage");
	}
	
	public void pass(ExtentTest test, String message)
	{
		/**
		 * @param message
		 * @author shubh
		 */
	test.pass(message);	
	System.out.println(message);
	}
	public void warn(ExtentTest test,String message)
	{
		
		/**
		 * @param message
		 * @author shubh
		 */
	test.warning(message);	
	System.out.println(message);
	}
	
	public void skip(ExtentTest test,String message)
	{
		
		/**
		 * @param message
		 * @author shubh
		 */
	test.skip(message);	
	System.out.println(message);
	}
	
	public void info(ExtentTest test,String message)
	{
		
		/**
		 * @param message
		 * @author shubh
		 */
	test.info(message);	
	System.out.println(message);
	}
	
	
	public void attachScreenShot(ExtentTest test,String screenshotpath, String title,String strategy)
	{
		/**
		 * @param title
		 * @paramstrategy
		 * @author shubh
		 */
		
		if(strategy.equalsIgnoreCase("base64"))
		{
			test.addScreenCaptureFromBase64String(screenshotpath, title);
		}
		else {
			test.addScreenCaptureFromPath(strategy, title);
		}
	}
	public void saveReport()
	{
		report.flush();
		
	}
	public void fail(ExtentTest test, Throwable erormsg) {
		System.out.println("fail");
		
		test.fail(erormsg);
	}

}

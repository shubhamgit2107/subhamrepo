package listners;

import java.io.IOException;

import org.testng.IClass;
import org.testng.IClassListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import annotation.ExtentReporter;
import ecom_Flashcart_genericUtility.ConfigClass;
import ecom_Flashcart_genericUtility.DateUtility;
import ecom_Flashcart_genericUtility.FileInputConstant;
import ecom_Flashcart_genericUtility.ReportUtility;
import ecom_Flashcart_genericUtility_enums.PropertyFileKey;
import ecom_Flashcart_genericUtility_externalfileutility.PropertyUtility;

public class ListnerImplementation implements ITestListener,IClassListener,ISuiteListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart-->test");
		report.createTest(result.getMethod().getMethodName());
		 ExtentReporter reportAnnotation = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(ExtentReporter.class);
		 System.out.println(reportAnnotation.author());
			System.out.println(reportAnnotation.category());
			report.addAuthor(InstanceUtilityTransfer.getExtenttest(),reportAnnotation.author());
			report.addCategory(InstanceUtilityTransfer.getExtenttest(), reportAnnotation.category());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("ontestSucess-->test");
		report.pass(InstanceUtilityTransfer.getExtenttest(),result.getMethod().getMethodName()+"is pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("ontestfailure-->test");
		String scre=null;
		report.fail(InstanceUtilityTransfer.getExtenttest(),result.getMethod().getMethodName()+"is fail");
		report.fail(InstanceUtilityTransfer.getExtenttest(),result.getThrowable());
	 // BaseClassPractice.class.cast(result.getMethod().getMethodName()).sutil.getScreenShot(null, null)
		 scre=ConfigClass.class.cast(result.getMethod().getInstance()).sutil.getScreenShot();
		//Screenshotpath=BaseClassPractice.class.cast(result.getMethod().getInstance()).sutil.getScreenShot();
		report.attachScreenShot(InstanceUtilityTransfer.getExtenttest(),scre, result.getMethod().getMethodName()," base64");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("ontestskipped-->test");
		String scre=null;
		report.fail(InstanceUtilityTransfer.getExtenttest(),result.getMethod().getMethodName()+"is skip");
		report.fail(InstanceUtilityTransfer.getExtenttest(),result.getThrowable());
		String path  =ConfigClass.class.cast(result.getMethod().getInstance()).sutil.getScreenShot();
		report.attachScreenShot(InstanceUtilityTransfer.getExtenttest(),scre, result.getMethod().getMethodName()," base64");
	}

	@Override
	public void onBeforeClass(ITestClass testClass) {
	
		System.out.println("on before class");
	}

	@Override
	public void onAfterClass(ITestClass testClass) {
		System.out.println("onfterClass");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on test failed within succes percentage-->test");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on test failed with timeout-->test");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onstart-->test");
	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish-->test");
		report.saveReport();
		
		
	}
	private ReportUtility report;
	public static ReportUtility sreport;
	@Override
	public void onStart(ISuite suite) {
		
		report=new ReportUtility();
		sreport=report;
	}

	@Override
	public void onFinish(ISuite suite) {
		report.saveReport();
	}

}

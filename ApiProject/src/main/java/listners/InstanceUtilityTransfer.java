package listners;

import com.aventstack.extentreports.ExtentTest;

public class InstanceUtilityTransfer {
	private static ThreadLocal<ExtentTest> extenttest= new ThreadLocal<>();

	public static ExtentTest getExtenttest() {
		return extenttest.get();
	}

	public static void setExtenttest(ExtentTest setExtentTest) {
		extenttest.set(setExtentTest);
	}

}

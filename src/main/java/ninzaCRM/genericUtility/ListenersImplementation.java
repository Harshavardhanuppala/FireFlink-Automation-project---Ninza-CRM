package ninzaCRM.genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener
{
	ExtentReports extentReports;
	ExtentTest extentTest;
	@Override
	public void onTestStart(ITestResult result) {
		String method= result.getMethod().getMethodName();
		System.out.println(method +"======= test is started ===========");
		
		// intimate extent reports for @Test start
		extentTest= extentReports.createTest(method);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String method= result.getMethod().getMethodName();
		System.out.println(method +"======= test is success ===========");
		//log the status of @Test as Pass in extent report
		
		extentTest.log(Status.PASS,method +"======= test is success ===========");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String method= result.getMethod().getMethodName();
		System.out.println(method +"======= test is failed ===========");
		
		// log the status as Fail in extent reports
		extentTest.log(Status.FAIL,method +"======= test is failed ===========");
		
		//capture the exception
		
		System.out.println(result.getThrowable());
		
		//log the exception in extent report
		extentTest.log(Status.INFO, result.getThrowable());
		
		JavaUtility javaUtility=new JavaUtility();
		WebDriverUtility driverUtility=new WebDriverUtility();
		
		//screenshotname -  method name +date n time
		String screenShotName=method+javaUtility.getSystemDate();
		try {
			String path=driverUtility.captureScreenShot(BaseClass.sdriver, screenShotName);
			
			//attach screenshot to report
			extentTest.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String method= result.getMethod().getMethodName();
		System.out.println(method +"======= test is skipped ===========");
		
		//log the skip status
		extentTest.log(Status.SKIP,method +"======= test is skipped ===========");
		
		//capture the exception
		System.out.println(result.getThrowable());
		
		//log the exception status
		extentTest.log(Status.WARNING,result.getThrowable());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("======suite started =========");
		
		// Entents Reports configuration.
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(".\\ExtentReports\\Extent-Report"+new JavaUtility().getSystemDate()+".html");
		extentSparkReporter.config().setDocumentTitle("Ninza CRM Automation script");
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentSparkReporter.config().setReportName("Web Automation Execution Report");
		
		extentReports=new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		extentReports.setSystemInfo("Base browser", "Microsoft Edge");
		extentReports.setSystemInfo("Base platform", "windows");
		extentReports.setSystemInfo("Base URL", "Test ENV");  
		extentReports.setSystemInfo("Reporter name", "harsha");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("======suite ended =========");
		extentReports.flush();
	}
	
}

package ExtentReportDemo;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReport {


	// Are the main object that used to extent report 
	ExtentSparkReporter htmlReport;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	public void  startReport() {
//		ExtentSparkReporter  htmlReport= new ExtentSparkReporter("ExtentReportDemo.html");
//		ExtentReports  reports = new ExtentReports();
//		reports.attachReporter(htmlReport);
	// upar vala method hai bus modify hai
	 htmlReport= new ExtentSparkReporter("ExtentReportDemo.html");
		  reports = new ExtentReports();
		reports.attachReporter(htmlReport);

		// add environment details 
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("os", "window11");
		reports.setSystemInfo("user", "Shubham");
		reports.setSystemInfo("browser", "chrome");


		// configuration to change look and feel 
		htmlReport.config().setDocumentTitle("Extent Report Demo");
		htmlReport.config().setReportName("Test Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("EEE, MMM dd, yyy , hh:mm a'(zzz)'");

	}	
	@Test
	public  void  LaunchBrowserAndOpenURL() {

		//create test
		test= reports.createTest("Launch browser and open url");
		Assert.assertTrue(true);

	}
	@Test
	public  void  verifyTitle() {

		//create test
		test= reports.createTest("VerifyTitle");
		Assert.assertTrue(false);

	}
	@Test
	public  void  verifyLogo() {

		//create test
		test= reports.createTest("Verify Logo");
		Assert.assertTrue(true);

	}
	@Test
	public  void verifyEmail() {

		//create test
		test= reports.createTest("Verify email");
		throw new SkipException("skipping the test case with expection..");

	}
	@Test
	public  void  verifyUsername() {

		//create test
		test= reports.createTest("Verify username");
		Assert.assertTrue(true);

	}

	@AfterMethod
	public  void  getTestResult(ITestResult result) {

		if (result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Fail", ExtentColor.ORANGE));

			// if you want is failed 
			test.fail(result.getThrowable());
		}
		else if (result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Pass", ExtentColor.BLUE));
		}
		else if (result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"skipped", ExtentColor.YELLOW));
		}

	}
	@AfterTest
	public void tearDown() {
		reports.flush();
	}
}

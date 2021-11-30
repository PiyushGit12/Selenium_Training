package ExtentReports;


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
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent; // Specify the location of the report
	ExtentTest logs; // What Details(LOGS) should be populated in the report

	@BeforeTest
	public void startReport() {

		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "LocalHost");
		extent.setSystemInfo("Environment", "Automation Testing");
		extent.setSystemInfo("User Name", "Piyush");
//		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));

		htmlReporter.config().setDocumentTitle("Extent-Reports-Chart");
		htmlReporter.config().setReportName("Extent-Report-Automation");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
	}

	@Test
	public void passTest() {
		logs = extent.createTest("passTest");
		Assert.assertTrue(true);
		logs.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));
	}

	@Test
	public void failTest() {
		logs = extent.createTest("failTest");
		Assert.assertTrue(false);
		logs.log(Status.PASS, "Test Case (failTest) Status is passed");
		logs.log(Status.PASS, MarkupHelper.createLabel("Test Case (failTest) Status is passed", ExtentColor.GREEN));
	}

	@Test
	public void skipTest() {
		logs = extent.createTest("skipTest");
		throw new SkipException("Skipping - This is not ready for testing ");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			// logger.log(Status.FAIL, "Test Case Failed is "+result.getName());
			// MarkupHelper is used to display the output in different colors
			logs.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logs.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SKIP) {
			// logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logs.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		}
	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

}

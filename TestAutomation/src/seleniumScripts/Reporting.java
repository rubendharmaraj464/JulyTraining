package seleniumScripts;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;





public class  Reporting {
	
	
	
	public static ExtentReports extent;

	public static void main(String[] args) 
	{
		
		
	    extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("AutomationTestResults.html"); 
		extent.attachReporter(spark);
		spark.config().setTheme(Theme.DARK);
		
		ExtentTest tc1 = extent.createTest("TC001-Verify Login");
		tc1.pass("Launch Application URL");
		tc1.pass("Enter UserName");
		tc1.pass("Launch Password");
		tc1.pass("Click on Login");
		tc1.pass("Login Success");
		
		ExtentTest tc2 = extent.createTest("TC002-Verify HomePage");
		tc2.pass("Navigate to Homepage");
		tc2.pass("Check all controls are enabled");
		tc2.pass("Verify Data");
		
		
		
		ExtentTest tc3 = extent.createTest("TC003-Create Order");
		tc3.pass("Navigate to Orders page");
		tc3.pass("Click on Create Order");
		tc3.pass("Enter Manditory Data ");
		tc3.pass("Click on Save");
		tc3.fail("Login Success");
		
		
		
		extent.flush();
		
		
		
		
		
	}

}

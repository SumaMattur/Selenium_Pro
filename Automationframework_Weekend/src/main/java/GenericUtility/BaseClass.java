package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;


import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	public static ExtentReports extReport;
	public static WebDriver driver;
	
	public Javautility jutil =new Javautility();
	public WebDriverUtility wUtil=new WebDriverUtility();
	public FileUtility fUtill=new FileUtility();
	
	
	@BeforeSuite
	public void repoertConfig() {
		ExtentSparkReporter spark= new ExtentSparkReporter("./HTML_reports/extentReport_" + jutil.getSystemTime()+".html");
				extReport= new ExtentReports();
		        extReport.attachReporter(spark);
		        
	}
	
	@AfterSuite
	public void reportBackup() {
		extReport.flush();
		
				
	}
	
	
}

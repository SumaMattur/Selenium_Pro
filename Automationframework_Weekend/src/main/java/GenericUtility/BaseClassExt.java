package GenericUtility;

import com.aventstack.extentreports.ExtentReports;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClassExt {

	public static ExtentReports extReport;
	
	Javautility jutil =new Javautility();
	
	@BeforeSuite
	public void repoertConfig() {
		ExtentSparkReporter spark= new ExtentSparkReporter("./HTML_reports/extentReport_"+jutil.getSystemTime()+".html");
				extReport= new ExtentReports();
		        extReport.attachReporter(spark);
		        
	}
	
	@AfterSuite
	public void reportBackup() {
		extReport.flush();
		
				
	}
	
	
}

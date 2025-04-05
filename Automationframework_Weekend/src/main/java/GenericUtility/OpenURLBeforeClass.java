package GenericUtility;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;


import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.WelcomePage;


public class OpenURLBeforeClass {
		
		Javautility jutil =new Javautility();
		WebDriverUtility wutil = new WebDriverUtility();
		FileUtility fUtil=new FileUtility();
		private ExtentReports extReport;
		
		@BeforeClass
		public void openBrowser() {
			
			Object driver = new ChromeDriver();
			wutil.maximize(driver);
			((RemoteWebDriver) driver).manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		@BeforeMethod
		public void login()
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		Loginpage lp = new Loginpage(driver);
		lp.getEmailTextField().sendKeys(fUtil.getDataFromProperty("Email"));
		
		
		@BeforeSuite
		public void repoertConfig() {
			ExtentSparkReporter spark= new ExtentSparkReporter("./HTML_report/extentReport_"+jutil.getSystemTime()+".html");
					ExtentReports extReport = new ExtentReports();
			        extReport.attachReporter(spark);
			      
		
		
		@AfterSuite
		public void reportBackup() {
			extReport.flush();
			
					
		}
		
		
	}




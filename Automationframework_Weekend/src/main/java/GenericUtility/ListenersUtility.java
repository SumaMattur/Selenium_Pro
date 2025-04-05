package GenericUtility;

import java.io.IOException;

import org.apache.commons.compress.harmony.pack200.CPString;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersUtility extends BaseClass implements ITestListener {

	private ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest test = extReport.createTest(result.getName());
		test.log(Status.INFO,"Test execution started");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		Test.addScreenshotCaptureFromBase64String(screenshot);
		
		test.log(Status.FAIL,"Test script is failed");
		try {
			wutil.getphoto(driver);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}

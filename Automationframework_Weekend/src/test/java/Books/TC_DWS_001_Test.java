package Books;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_001_Test extends BaseClass {
	
	@Test
	public void ClickOnBooks() throws IOException {
		ExtentTest test = extReport.createTest("ClickOnBooks");
		test.log(Status.INFO, "Test Execution started");
		

		HomePage hp = new HomePage(driver);
		hp.getBooksLink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo web shop.Book","books page is not displayed");
		test.log(Status.PASS,"books page is displayed");
	

}
}

package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	@FindBy(id= "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath ="//input[@value='Log in']")
	private WebElement loginButton;

	private WebElement emailITextField;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

public WebElement getEmailTextField() {
	return emailITextField;
	
}
public WebElement getPasswordTextField() {
	return passwordTextField;
}
public WebElement getLoginButton() {
	return loginButton;
	
	
}
}

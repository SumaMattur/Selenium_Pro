package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(partialLinkText="Books")
	private WebElement BooksLink;
	
	
	
	public WebElement getBooksLink() {
		return BooksLink;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	

	}
}
package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement usernameTF;
	@FindBy(id="inputPassword")
	private WebElement passwordTF;
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	/**
	 * This method used to perform the login operation with username and password.
	 * @param username
	 * @param password
	 */
	public void loginToApp(String username,String password)
	{
		usernameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		loginButton.click();
	}
	
}

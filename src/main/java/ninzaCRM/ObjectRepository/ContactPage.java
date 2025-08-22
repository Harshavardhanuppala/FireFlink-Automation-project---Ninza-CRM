package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtility.WebDriverUtility;

public class ContactPage extends WebDriverUtility
{
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement dropDownContact;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement selectDropDownContact;
	
	@FindBy(xpath = "//span[text()='Create Contact']")
	private WebElement createContactButton;
	
	@FindBy(xpath = "//div[contains(text(),'Contact') and contains(text(),'Successfully Added')]")
	private WebElement successfullMsg;
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropDownContact() {
		return dropDownContact;
	}

	

	public WebElement getSelectDropDownContact() {
		return selectDropDownContact;
	}

	public WebElement getCreateContactButton() {
		return createContactButton;
	}

	public WebElement getSuccessfullMsg() {
		return successfullMsg;
	}
	
	public void dropDownSelectionAndSearchInContactPage(String typeOfSearch,String search)
	{
		handleDropDown(dropDownContact, typeOfSearch);
		selectDropDownContact.sendKeys(search);
	}
	
	public void clickOnCreateContactButton() {
		createContactButton.click();
	}
}

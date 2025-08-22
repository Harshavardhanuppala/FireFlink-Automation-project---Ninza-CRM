package ninzaCRM.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtility.WebDriverUtility;

public class CreateContactPage extends WebDriverUtility
{
	@FindBy(name="organizationName")
	private WebElement organizationNameTF;
	
	@FindBy(name="title")
	private WebElement titleTF;
	
	@FindBy(name="contactName")
	private WebElement contactNameTF;
	
	@FindBy(name="mobile")
	private WebElement mobileTF;
	
	@FindBy(xpath = "//label[text()='Campaign']/following-sibling::div/button")
	private WebElement selectCampaignButton;
	
	@FindBy(id="search-criteria")
	private WebElement selctiontypeOfCampaignDropDown;
	
	@FindBy(id="search-input")
	private WebElement selectCampaignSearchTF;
	
	@FindBy(xpath = "//button[.='Create Contact']")
	private WebElement createContactButton;
	
	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationNameTF() {
		return organizationNameTF;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getContactNameTF() {
		return contactNameTF;
	}

	public WebElement getMobileTF() {
		return mobileTF;
	}

	public WebElement getSelectCampaignButton() {
		return selectCampaignButton;
	}

	public WebElement getSelctiontypeOfCampaignDropDown() {
		return selctiontypeOfCampaignDropDown;
	}

	public WebElement getSelectCampaignSearchTF() {
		return selectCampaignSearchTF;
	}

	public WebElement getCreateContactButton() {
		return createContactButton;
	}
	
	public void performContactCreationWithMandatoryFields(WebDriver driver, String orgName,String title,String contactName, String mobile,String dymanicData)
	{
		getOrganizationNameTF().sendKeys(orgName);
		getTitleTF().sendKeys(title);
		getContactNameTF().sendKeys(contactName);
		getMobileTF().sendKeys(mobile);
		
		selectCampaignButton.click();
		switchControlToTitleWindow(driver, "Select Campaign");
		moveByOffsetAction(driver, 0, 250);
		driver.findElement(By.xpath("//button[@"+dymanicData+"]")).click();
		
		switchControlToTitleWindow(driver, "Ninza CRM");
		createContactButton.click();
	}
}


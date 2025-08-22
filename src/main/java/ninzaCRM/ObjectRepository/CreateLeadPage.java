package ninzaCRM.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtility.WebDriverUtility;

public class CreateLeadPage extends WebDriverUtility
{
	
	@FindBy(xpath = "//h3[text()='Create Lead']")
	private WebElement createLeadPageText;
	@FindBy(name = "name")
	private WebElement leadNameTF;
	
	@FindBy(name = "company")
	private WebElement companyTF;
	
	@FindBy(name = "leadSource")
	private WebElement leadSourceTF;
	
	@FindBy(name = "industry")
	private WebElement industryTF;
	
	@FindBy(name = "phone")
	private WebElement phoneTF;
	
	@FindBy(name = "leadStatus")
	private WebElement leadStatusTF;
	
	@FindBy(xpath = "//label[text()='Campaign']/following-sibling::div/button")
	private WebElement selectCampaignWindow;
	
	@FindBy(id="search-criteria")
	private WebElement selctiontypeOfCampaignDropDown;
	
	@FindBy(id="search-input")
	private WebElement selectCampaignSearchTF;
	
	@FindBy(xpath = "//button[text()='Create Lead']")
	private WebElement createLeadButton;
	
	
	public CreateLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreateLeadPageText() {
		return createLeadPageText;
	}


	public WebElement getLeadNameTF() {
		return leadNameTF;
	}


	public WebElement getCompanyTF() {
		return companyTF;
	}


	public WebElement getLeadSourceTF() {
		return leadSourceTF;
	}


	public WebElement getIndustryTF() {
		return industryTF;
	}


	public WebElement getPhoneTF() {
		return phoneTF;
	}


	public WebElement getLeadStatusTF() {
		return leadStatusTF;
	}


	public WebElement getSelectCampaignWindow() {
		return selectCampaignWindow;
	}


	public WebElement getSelctiontypeOfCampaignDropDown() {
		return selctiontypeOfCampaignDropDown;
	}


	public WebElement getSelectCampaignSearchTF() {
		return selectCampaignSearchTF;
	}


	public WebElement getCreateLeadButton() {
		return createLeadButton;
	}
	
	public void createLeadWithMandatoryInfo(WebDriver driver,String leadName, String company,String leadSource, String industry,String phoneNum,String leadStatus,String dymanicData)
	{
		getLeadNameTF().sendKeys(leadName);
		getCompanyTF().sendKeys(company);
		getLeadSourceTF().sendKeys(leadSource);
		getIndustryTF().sendKeys(industry);
		getPhoneTF().sendKeys(phoneNum);
		getLeadStatusTF().sendKeys(leadStatus);
		getSelectCampaignWindow().click();
		
		switchControlToTitleWindow(driver, "Select Campaign");
		moveByOffsetAction(driver, 0, 250);
		driver.findElement(By.xpath("//button[@"+dymanicData+"]")).click();
		switchControlToTitleWindow(driver, "Ninza CRM");
		getCreateLeadButton().click();
	}
	
}

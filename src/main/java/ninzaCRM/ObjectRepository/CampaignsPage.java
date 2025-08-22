package ninzaCRM.ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtility.WebDriverUtility;

public class CampaignsPage  extends WebDriverUtility
{
	
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement dropDownCampaign;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement selectDropDownCampaign;
	
	@FindBy(xpath = "//span[text()='Create Campaign']")
	private WebElement createCamapignButton;
	
	@FindBy(xpath = "//div[contains(text(),'Product') and contains(text(),'Successfully Added')]")
	private WebElement successfullMsg;
	
	
	public CampaignsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropDownCampaign() {
		return dropDownCampaign;
	}

	public WebElement getSelectDropDownCampaign() {
		return selectDropDownCampaign;
	}

	public WebElement getCreateCamapignButton() {
		return createCamapignButton;
	}

	public WebElement getSuccessfullMsg() {
		return successfullMsg;
	}

	
	public void dropDownSelectionAndSearchInCampaignsPage(String typeOfSearch,String search)
	{
		handleDropDown(selectDropDownCampaign, typeOfSearch);
		selectDropDownCampaign.sendKeys(search);
	}
	
//	public void vaildateTheSucessfullMsg(WebDriver driver)
//	{
//		
//		try {
//			WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
//			driverWait.until(ExpectedConditions.visibilityOf(successfullMsg));
//			System.out.println(" is displayed");
//		}
//		catch(Exception e)
//		{
//			System.out.println(" is not displayed");
//			System.exit(0);
//		}
//	}
	
	public void clickOnCreateCampaignsPage()
	{
		clickOnWebElement(createCamapignButton);
	}
	
	
}

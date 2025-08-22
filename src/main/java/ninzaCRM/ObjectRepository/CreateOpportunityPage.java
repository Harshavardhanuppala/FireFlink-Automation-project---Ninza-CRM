package ninzaCRM.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtility.WebDriverUtility;

public class CreateOpportunityPage extends WebDriverUtility
{
	
	@FindBy(xpath = "//h3[text()='Create Opportunity']")
	private WebElement createOpportunityPageVisibleText;
	
	@FindBy(name = "opportunityName")
	private WebElement opportunityNameTF;
	
	@FindBy(name = "amount")
	private WebElement amountTF;
	
	@FindBy(name = "businessType")
	private WebElement businessTypeTF;
	
	@FindBy(name = "nextStep")
	private WebElement nextStepTF;
	
	@FindBy(name = "salesStage")
	private WebElement salesStageTF;
	
	@FindBy(xpath = "//label[text()='Lead']/following-sibling::div/button")
	private WebElement leadPageWindowButton;
	
	@FindBy(xpath = "//h3[text()='Select a Lead']")
	private WebElement selectLeadPageVisibleText;
	
	@FindBy(id="search-criteria")
	private WebElement leadSelectionDropDown;
	
	@FindBy(id="search-input")
	private WebElement LeadSearchTF;
	
	@FindBy(xpath = "//button[text()='Create Opportunity']")
	private WebElement createOpportunitySubmitButton;
	
	public CreateOpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOpportunityPageVisibleText() {
		return createOpportunityPageVisibleText;
	}

	public WebElement getOpportunityNameTF() {
		return opportunityNameTF;
	}

	public WebElement getAmountTF() {
		return amountTF;
	}

	public WebElement getBusinessTypeTF() {
		return businessTypeTF;
	}

	public WebElement getNextStepTF() {
		return nextStepTF;
	}

	public WebElement getSalesStageTF() {
		return salesStageTF;
	}

	public WebElement getLeadPageWindowButton() {
		return leadPageWindowButton;
	}

	public WebElement getSelectLeadPageVisibleText() {
		return selectLeadPageVisibleText;
	}

	public WebElement getLeadSelectionDropDown() {
		return leadSelectionDropDown;
	}

	public WebElement getLeadSearchTF() {
		return LeadSearchTF;
	}

	public WebElement getCreateOpportunitySubmitButton() {
		return createOpportunitySubmitButton;
	}
	
	public void createOpportunityFillingMandatoryFields(WebDriver driver, String opportunityname,String amount, String businesstype,String nextstep,String salesStage,String dymanicData)
	{
		getOpportunityNameTF().sendKeys(opportunityname);
		getAmountTF().sendKeys(amount);
		getBusinessTypeTF().sendKeys(businesstype);
		getNextStepTF().sendKeys(nextstep);
		getSalesStageTF().sendKeys(salesStage);
		
		getLeadPageWindowButton().click();
		
		switchControlToTitleWindow(driver, "Select Lead");
		moveByOffsetAction(driver, 0, 250);
		driver.findElement(By.xpath("//button[@"+dymanicData+"]")).click();
		switchControlToTitleWindow(driver, "Ninza CRM");
		getCreateOpportunitySubmitButton().click();
	}
	
	
}

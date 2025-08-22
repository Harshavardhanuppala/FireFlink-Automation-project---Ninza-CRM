package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage 
{
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement searchTypeOfOpportunityDropDown;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement searchOfOpportunityDropDown;
	
	
	@FindBy(xpath = "//span[text()='Create Opportunity']")
	private WebElement createOpportunityButton;
	
	
	@FindBy(xpath = "//b[text()='Opportunities']")
	private WebElement opportunityPageVisibleText;
	
	public OpportunitiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchTypeOfOpportunityDropDown() {
		return searchTypeOfOpportunityDropDown;
	}

	public WebElement getSearchOfOpportunityDropDown() {
		return searchOfOpportunityDropDown;
	}

	public WebElement getCreateOpportunityButton() {
		return createOpportunityButton;
	}

	public WebElement getOpportunityPageVisibleText() {
		return opportunityPageVisibleText;
	}
	
	public void clickOnCreateOpportunity()
	{
		getCreateOpportunityButton().click();
	}
}

package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {

	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement dropDownLeads;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement searchDropDownLeads;
	
	@FindBy(xpath = "//span[text()='Create Lead']")
	private WebElement createLeadButton;
	
	@FindBy(xpath = "//b[text()='Leads']")
	private WebElement leadPageText;
	
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropDownLeads() {
		return dropDownLeads;
	}

	public WebElement getSearchDropDownLeads() {
		return searchDropDownLeads;
	}

	public WebElement getCreateLeadButton() {
		return createLeadButton;
	}

	public WebElement getLeadPageText() {
		return leadPageText;
	}
	
	public void clickOnCreateLeads()
	{
		createLeadButton.click();
	}
	
	
	
}

package ninzaCRM.ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtility.WebDriverUtility;

public class DashBoardPage extends WebDriverUtility
{
	
	@FindBy(xpath = "//a[text()='Campaigns']")
	private WebElement campaignsLink;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsLink;
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leadsLink;
	
	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement opportunitesLink;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productsLink;
	
	@FindBy(xpath = "//a[text()='Quotes']")
	private WebElement quotesLink;
	
	@FindBy(xpath = "//a[text()='Purchase Order']")
	private WebElement purchaseOrderLink;
	
	@FindBy(xpath = "//a[text()='Sales Order']")
	private WebElement salesOrderLink;
	
	@FindBy(xpath = "//a[text()='Invoice']")
	private WebElement invoiceLink;
	
	@FindBy(xpath = "//li[text()='Admin Console']")
	private WebElement adminConsoleLink;
	
	@FindBy(xpath = "//div[@class='user-icon']")
	private WebElement userIconLink;
	
	@FindBy(xpath = "//div[contains(text(),'Logout')]")
	private WebElement logoutButton;
	
	@FindBy(xpath = "//span[text()='Create Campaign']")
	private WebElement createCampaignButton;
	
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement campaignDropDown;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement dropDownSearch;
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOpportunitesLink() {
		return opportunitesLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getQuotesLink() {
		return quotesLink;
	}

	public WebElement getPurchaseOrderLink() {
		return purchaseOrderLink;
	}

	public WebElement getSalesOrderLink() {
		return salesOrderLink;
	}

	public WebElement getInvoiceLink() {
		return invoiceLink;
	}

	public WebElement getAdminConsoleLink() {
		return adminConsoleLink;
	}

	public WebElement getUserIconLink() {
		return userIconLink;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getCreateCampaignButton() {
		return createCampaignButton;
	}

	public WebElement getCampaignDropDown() {
		return campaignDropDown;
	}

	public WebElement getDropDownSearch() {
		return dropDownSearch;
	}
	
	/**
	 * click on campaign link
	 */
	public void clickOnCampaignsLink() {
		campaignsLink.click();;
	}

	/**
	 * click on contacts link
	 */
	public void clickOnContactsLink() {
		contactsLink.click();;
	}
	/**
	 * click on leads link
	 */
	public void clickOnLeadsLink() {
		leadsLink.click();;
	}
	/**
	 * click on opportuntiies link
	 */
	public void clickOnOpportunitesLink() {
		 opportunitesLink.click();;
	}

	/**
	 * click on products link
	 */
	public void clickOnProductsLink() {
		 productsLink.click();;
	}
	
	/**
	 * click on quotes link
	 */
	public void clickOnQuotesLink() {
		quotesLink.click();;
	}
	
	/**
	 * click on purchase order link
	 */
	public void clickOnPurchaseOrderLink() {
		 purchaseOrderLink.click();;
	}

	/**
	 * click on sales order link
	 */
	public void clickOnSalesOrderLink() {
		 salesOrderLink.click();;
	}

	/**
	 * click on invoice link
	 */
	public void clickOnInvoiceLink() {
		 invoiceLink.click();;
	}

	/**
	 * click on admin console link
	 */
	public void clickOnAdminConsoleLink() {
		 adminConsoleLink.click();;
	}

	/**
	 * hover on user icon link
	 */
	public void hoverOnUserIconLink(WebDriver driver) {
		 mouseHoveringAction(driver, userIconLink);
	}

	/**
	 * click on logout button
	 */
	public void clickOnLogoutButton() {
		 logoutButton.click();;
	}

	/**
	 * click on create campaign button
	 */
	public void clickCreateCampaignButton() {
		 createCampaignButton.click();;
	}

	/**
	 * performing the logout operation
	 * @throws InterruptedException 
	 */
	public void performLogOutOperation(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		provideExplicitWaitforElementToBeClickable(driver, userIconLink);
		clickOnWebElement(userIconLink);
		clickOnWebElement(logoutButton);
	}
}

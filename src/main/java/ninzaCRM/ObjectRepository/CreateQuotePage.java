package ninzaCRM.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtility.WebDriverUtility;

public class CreateQuotePage extends WebDriverUtility
{
	@FindBy(name = "subject")
	private WebElement subjectTF;
	
	@FindBy(name = "validTill")
	private WebElement validTillTF;
	
	@FindBy(name = "quoteStage")
	private WebElement quoteStageTF;
	
	@FindBy(xpath = "//label[text()='Opportunity']/following-sibling::div/button")
	private WebElement chooseOpportunityButton;
	
	@FindBy(id="search-criteria")
	private WebElement selctiontypeOfOpportunityDropDown;
	
	@FindBy(id="search-input")
	private WebElement selectOpportunitySearchTF;
	
	
	
	@FindBy(xpath = "//label[text()='Contact']/following-sibling::div/button")
	private WebElement chooseContactButton;
	
	@FindBy(id="search-criteria")
	private WebElement selctiontypeOfContactDropDown;
	
	@FindBy(id="search-input")
	private WebElement selectContactSearchTF;
	
	@FindBy(xpath = "//label[text()='Billing Address']/following-sibling::textarea")
	private WebElement billingAddressTF;
	
	@FindBy(xpath = "//label[text()='Billing PO Box']/following-sibling::input")
	private WebElement billingPOBoxTF;
	
	@FindBy(xpath = "//label[text()='Billing City']/following-sibling::input")
	private WebElement billingCityTF;
	
	@FindBy(xpath = "//label[text()='Billing State']/following-sibling::input")
	private WebElement billingStateTF;
	
	@FindBy(xpath = "//label[text()='Billing Postal Code']/following-sibling::input")
	private WebElement billingPostalCodeTF;
	
	@FindBy(xpath = "//label[text()='Billing Country']/following-sibling::input")
	private WebElement billingCountryTF;
	
	@FindBy(xpath = "//label[text()='Shipping Address']/following-sibling::textarea")
	private WebElement shippingAddressTF;
	
	@FindBy(xpath = "//label[text()='Shipping PO Box']/following-sibling::input")
	private WebElement shippingPOBoxTF;
	
	@FindBy(xpath = "//label[text()='City']/following-sibling::input")
	private WebElement shippingCityTF;
	
	@FindBy(xpath = "//label[text()='State']/following-sibling::input")
	private WebElement shippingStateTF;
	
	@FindBy(xpath = "//label[text()='Postal Code']/following-sibling::input")
	private WebElement shippingPostalCodeTF;
	
	@FindBy(xpath = "//label[text()='Country']/following-sibling::input")
	private WebElement shippingCountryTF;
	
	@FindBy(xpath = "//label[text()='Products']/following-sibling::div/button")
	private WebElement productsPageButton;
	
	@FindBy(id="search-criteria")
	private WebElement selctiontypeOfProductDropDown;
	
	@FindBy(id="search-input")
	private WebElement selectProductSearchTF;
	
	@FindBy(xpath = "//label[text()='Discount in $ (-):']/following-sibling::input")
	private WebElement discountTF;
	
	@FindBy(xpath = "//label[text()='Shipping and Handling Charges in $ (+):']/following-sibling::input")
	private WebElement shippingChargesTF;
	
	@FindBy(xpath = "//button[text()='Create Quote']")
	private WebElement createQuoteButton;
	
	public CreateQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubjectTF() {
		return subjectTF;
	}

	public WebElement getValidTillTF() {
		return validTillTF;
	}

	public WebElement getQuoteStageTF() {
		return quoteStageTF;
	}

	public WebElement getChooseOpportunityButton() {
		return chooseOpportunityButton;
	}

	public WebElement getSelctiontypeOfOpportunityDropDown() {
		return selctiontypeOfOpportunityDropDown;
	}

	public WebElement getSelectOpportunitySearchTF() {
		return selectOpportunitySearchTF;
	}

	public WebElement getChooseContactButton() {
		return chooseContactButton;
	}

	public WebElement getSelctiontypeOfContactDropDown() {
		return selctiontypeOfContactDropDown;
	}

	public WebElement getSelectContactSearchTF() {
		return selectContactSearchTF;
	}

	public WebElement getBillingAddressTF() {
		return billingAddressTF;
	}

	public WebElement getBillingPOBoxTF() {
		return billingPOBoxTF;
	}

	public WebElement getBillingCityTF() {
		return billingCityTF;
	}

	public WebElement getBillingStateTF() {
		return billingStateTF;
	}

	public WebElement getBillingPostalCodeTF() {
		return billingPostalCodeTF;
	}

	public WebElement getBillingCountryTF() {
		return billingCountryTF;
	}

	public WebElement getShippingAddressTF() {
		return shippingAddressTF;
	}

	public WebElement getShippingPOBoxTF() {
		return shippingPOBoxTF;
	}

	public WebElement getShippingCityTF() {
		return shippingCityTF;
	}

	public WebElement getShippingStateTF() {
		return shippingStateTF;
	}

	public WebElement getShippingPostalCodeTF() {
		return shippingPostalCodeTF;
	}

	public WebElement getShippingCountryTF() {
		return shippingCountryTF;
	}

	public WebElement getProductsPageButton() {
		return productsPageButton;
	}

	public WebElement getSelctiontypeOfProductDropDown() {
		return selctiontypeOfProductDropDown;
	}

	public WebElement getSelectProductSearchTF() {
		return selectProductSearchTF;
	}

	public WebElement getDiscountTF() {
		return discountTF;
	}

	public WebElement getShippingChargesTF() {
		return shippingChargesTF;
	}

	public WebElement getCreateQuoteButton() {
		return createQuoteButton;
	}
	
	public void createQuoteWithMandatoryFields(WebDriver driver, String subject,String validDate,String quoteStage,String opportunityDynamicpath,String contactDynamicpath,
			String billingAddress, String billingPO,String billingCity, String billingState, String BillingPostalCode, String billingCountry,
			String shippingAddress,String shippingPO,String shippingCity,String shippingState, String shippingPostalCode,String shippingCountry,String addProductDynamicpath)
	{
		/**
		 * (driver,"vivo", "22-09-2025", "pending", "onclick="selectOpportunity('OPP00001', 'opp_test1')"","onclick="selectContact('CON00001', 'hjk')"","USA","786","new york","New jersey","500023","USA","india","657","HYD","HYD","TS","500072","india","onclick="selectProduct('IM_PROD_001', 'Product_68300', '99.15')"")
		 */
		getSubjectTF().sendKeys(subject);
		getValidTillTF().sendKeys(validDate);
		getQuoteStageTF().sendKeys(quoteStage);
		getChooseOpportunityButton().click();
		
		switchControlToTitleWindow(driver, "Select Opportunity");
		moveByOffsetAction(driver, 0, 250);
		driver.findElement(By.xpath("//button[@"+opportunityDynamicpath+"]")).click();
		switchControlToTitleWindow(driver, "Ninza CRM");
		
		getChooseContactButton().click();
		
		switchControlToTitleWindow(driver, "Select Contact");
		moveByOffsetAction(driver, 0, 250);
		driver.findElement(By.xpath("//button[@"+contactDynamicpath+"]")).click();
		switchControlToTitleWindow(driver, "Ninza CRM");
		
		getBillingAddressTF().sendKeys(billingAddress);
		getBillingPOBoxTF().sendKeys(billingPO);
		getBillingCityTF().sendKeys(billingCity);
		getBillingStateTF().sendKeys(billingState);
		getBillingPostalCodeTF().sendKeys(BillingPostalCode);
		getBillingCountryTF().sendKeys(billingCountry);
		
		getShippingAddressTF().sendKeys(shippingAddress);
		getShippingPOBoxTF().sendKeys(shippingPO);
		getShippingCityTF().sendKeys(shippingCity);
		getShippingStateTF().sendKeys(shippingState);
		getShippingPostalCodeTF().sendKeys(shippingPostalCode);
		getShippingCountryTF().sendKeys(shippingCountry);
		
		getProductsPageButton().click();
		switchControlToTitleWindow(driver, "Select Product");
		driver.findElement(By.xpath("//button[@"+addProductDynamicpath+"]")).click();
		switchControlToTitleWindow(driver, "Ninza CRM");
		
		getCreateQuoteButton().click();
	}
	
}

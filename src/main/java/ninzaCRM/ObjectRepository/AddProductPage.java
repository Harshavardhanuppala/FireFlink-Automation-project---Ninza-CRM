package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtility.WebDriverUtility;

public class AddProductPage extends WebDriverUtility
{
	@FindBy(name = "productName")
	private WebElement productNameTF;
	
	@FindBy(name = "quantity")
	private WebElement quantityTF;
	
	@FindBy(name = "price")
	private WebElement priceTF;
	
	@FindBy(name = "productCategory")
	private WebElement productCategoryDropDown;
	
	@FindBy(name = "vendorId")
	private WebElement vendorIdDropDown;
	
	@FindBy(xpath = "//h3[text()='Add Product']")
	private WebElement addProductPageText;
		
	@FindBy(xpath = "//button[text()='Add']")
	private WebElement addProductSubmitButton;
	
	public AddProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductNameTF() {
		return productNameTF;
	}

	public WebElement getQuantityTF() {
		return quantityTF;
	}

	public WebElement getPriceTF() {
		return priceTF;
	}

	public WebElement getProductCategoryDropDown() {
		return productCategoryDropDown;
	}

	public WebElement getVendorIdDropDown() {
		return vendorIdDropDown;
	}

	public WebElement getAddProductPageText() {
		return addProductPageText;
	}

	public WebElement getAddProductSubmitButton() {
		return addProductSubmitButton;
	}
	
	 public void AddProductwithMandatoryFields(String quantity,String productName,String price,String productCategory,String vendor) {
		 	quantityTF.clear();
	        quantityTF.sendKeys(quantity);
	        productNameTF.sendKeys(productName);
	        priceTF.clear();
	        priceTF.sendKeys(price);
	        handleDropDown(productCategory, productCategoryDropDown);
	        handleDropDown(vendorIdDropDown,vendor);
	        addProductSubmitButton.click();
	    }
}

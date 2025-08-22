package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage 
{
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement dropDownProducts;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement searchDropDownInProducts;
	
	@FindBy(xpath = "//span[text()='Add Product']")
	private WebElement addProductButton;
	
	@FindBy(xpath = "//b[text()='Products']")
	private WebElement productPageText;
	
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropDownProducts() {
		return dropDownProducts;
	}

	public WebElement getSearchDropDownInProducts() {
		return searchDropDownInProducts;
	}

	public WebElement getAddProductButton() {
		return addProductButton;
	}

	public WebElement getProductPageText() {
		return productPageText;
	}
	
	
	public void clickOnAddProductButton()
	{
		addProductButton.click();
	}
	
}

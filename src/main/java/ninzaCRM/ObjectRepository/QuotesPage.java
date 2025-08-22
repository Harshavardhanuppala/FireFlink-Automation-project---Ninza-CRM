package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesPage 
{
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement dropDownQuote;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement searchDropDownQuotes;
	
	@FindBy(xpath = "//span[text()='Create Quote']")
	private WebElement createQuoteButton;
	
	@FindBy(xpath = "//b[text()='Quotes']")
	private WebElement quotesPageText;
	
	public QuotesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropDownQuote() {
		return dropDownQuote;
	}

	public WebElement getSearchDropDownQuotes() {
		return searchDropDownQuotes;
	}

	public WebElement getCreateQuoteButton() {
		return createQuoteButton;
	}

	public WebElement getQuotesPageText() {
		return quotesPageText;
	}
	
	public void clickOnCreateQuoteButton()
	{
		createQuoteButton.click();
	}
}

package CreationImplementation;

import org.testng.annotations.Test;

import ninzaCRM.ObjectRepository.CreateQuotePage;
import ninzaCRM.ObjectRepository.DashBoardPage;
import ninzaCRM.ObjectRepository.QuotesPage;
import ninzaCRM.genericUtility.BaseClass;

public class CreateQuoteTest extends BaseClass
{
	@Test
	public void createQuoteTest_IN_001()
	{
		DashBoardPage boardPage=new DashBoardPage(driver);
		boardPage.clickOnQuotesLink();
		
		QuotesPage quotesPage=new QuotesPage(driver);
		quotesPage.clickOnCreateQuoteButton();
		
		CreateQuotePage createQuotePage=new CreateQuotePage(driver);
		createQuotePage.createQuoteWithMandatoryFields(driver,"vivo", "22-09-2025", "pending", "onclick=\"selectOpportunity('OPP00001', 'Dell Project')\"","onclick=\"selectContact('CON00001', 'Garbani3')\"","USA","786","new york","New jersey","500023","USA","india","657","HYD","TS","500072","india","onclick=\"selectProduct('IM_PROD_001', 'Product_68300', '99.15')\"");
	}
}

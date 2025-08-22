package CreationImplementation;

import org.testng.annotations.Test;

import ninzaCRM.ObjectRepository.ContactPage;
import ninzaCRM.ObjectRepository.CreateContactPage;
import ninzaCRM.ObjectRepository.DashBoardPage;
import ninzaCRM.genericUtility.BaseClass;

public class CreateContactTest extends BaseClass
{
	@Test(groups = "regressionSuite")
	public void createcotactTc_IN_OO1_Test()
	{
		DashBoardPage boardPage=new DashBoardPage(driver);
		boardPage.clickOnContactsLink();
		
		ContactPage contactPage=new ContactPage(driver);
		contactPage.clickOnCreateContactButton();
		
		CreateContactPage createContactPage=new CreateContactPage(driver);
		createContactPage.performContactCreationWithMandatoryFields(driver, "Jsipders", "campaign", "hjk", "9876543216", "onclick=\"selectCampaign('CAM00001', 'Campaigntest')\"");
		
		
	}
}

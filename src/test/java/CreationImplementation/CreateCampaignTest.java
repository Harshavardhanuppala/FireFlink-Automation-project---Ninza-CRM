package CreationImplementation;

import org.testng.annotations.Test;

import ninzaCRM.ObjectRepository.CampaignsPage;
import ninzaCRM.ObjectRepository.CreateCampaignPage;
import ninzaCRM.ObjectRepository.DashBoardPage;
import ninzaCRM.genericUtility.BaseClass;

public class CreateCampaignTest extends BaseClass
{
	@Test(groups = "smokeSuite")
	public void createCampaignTC_IN_001Test()
	{
		
		DashBoardPage boardPage=new DashBoardPage(driver);
		boardPage.clickOnCampaignsLink();
		
		CampaignsPage campaignsPage=new CampaignsPage(driver);
		campaignsPage.clickOnCreateCampaignsPage();
		
		CreateCampaignPage campaignPage=new CreateCampaignPage(driver);
		campaignPage.sendDataIntoMandatoryFields("harsha", 23);
		
	}
	
}

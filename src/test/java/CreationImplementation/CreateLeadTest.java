package CreationImplementation;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ninzaCRM.ObjectRepository.CreateLeadPage;
import ninzaCRM.ObjectRepository.DashBoardPage;
import ninzaCRM.ObjectRepository.LeadsPage;
import ninzaCRM.genericUtility.BaseClass;
import ninzaCRM.genericUtility.ListenersImplementation;

@Listeners(ListenersImplementation.class)
public class CreateLeadTest extends BaseClass
{
	@Test
	public void createLeadTest_IN_001()
	{
		DashBoardPage boardPage=new DashBoardPage(driver);
		boardPage.clickOnLeadsLink();
		
		LeadsPage leadsPage=new LeadsPage(driver);
		leadsPage.clickOnCreateLeads();
		
		CreateLeadPage createLeadPage=new CreateLeadPage(driver);
		createLeadPage.createLeadWithMandatoryInfo(driver, "sumit", "capgemini", "manager", "SOftware", "9876543214", "pending", "onclick=\"selectCampaign('CAM00t001', 'Campaigntest')\"");
		
	}
}

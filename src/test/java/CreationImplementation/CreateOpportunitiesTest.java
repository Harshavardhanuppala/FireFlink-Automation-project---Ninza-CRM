package CreationImplementation;

import org.testng.annotations.Test;

import ninzaCRM.ObjectRepository.CreateOpportunityPage;
import ninzaCRM.ObjectRepository.DashBoardPage;
import ninzaCRM.ObjectRepository.OpportunitiesPage;
import ninzaCRM.genericUtility.BaseClass;

public class CreateOpportunitiesTest extends BaseClass
{
	@Test
	public void createOpportunitiesTest_IN_001()
	{
		DashBoardPage boardPage=new DashBoardPage(driver);
		boardPage.clickOnOpportunitesLink();
		
		OpportunitiesPage opportunitiesPage=new OpportunitiesPage(driver);
		opportunitiesPage.clickOnCreateOpportunity();
		
		CreateOpportunityPage createOpportunityPage=new CreateOpportunityPage(driver);
		createOpportunityPage.createOpportunityFillingMandatoryFields(driver, "opportunity", "3000", "business", "next", "sales", "onclick=\"selectLead('LEAD00001', 'Alex andre Johnson')\"");
	}
}

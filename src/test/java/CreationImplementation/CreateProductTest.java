package CreationImplementation;

import org.testng.annotations.Test;

import ninzaCRM.ObjectRepository.AddProductPage;
import ninzaCRM.ObjectRepository.DashBoardPage;
import ninzaCRM.ObjectRepository.ProductsPage;
import ninzaCRM.genericUtility.BaseClass;

public class CreateProductTest extends BaseClass
{
	@Test
	public void createProductTest_IN_001()
	{
		DashBoardPage boardPage=new DashBoardPage(driver);
		boardPage.clickOnProductsLink();
		
		ProductsPage productsPage=new ProductsPage(driver);
		productsPage.clickOnAddProductButton();
		
		AddProductPage addProductPage=new AddProductPage(driver);
		addProductPage.AddProductwithMandatoryFields("20", "Airtel", "3000", "Electronics", "Vendor_68300 - (Electronics)");
	}
}

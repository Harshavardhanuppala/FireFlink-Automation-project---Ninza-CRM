package practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ninzaCRM.ObjectRepository.LoginPage;
import ninzaCRM.genericUtility.FileUtility;
import ninzaCRM.genericUtility.JavaUtility;
import ninzaCRM.genericUtility.WebDriverUtility;

public class CreatePurchaseOrderWithProductAndContact_E2E_01_Test
{
	@Test
	public static void CreatePurchaseOrderWithProductAndContactTest() throws IOException
	{
		FileUtility fileUtility=new FileUtility();
		JavaUtility javaUtility=new JavaUtility();
		WebDriverUtility driverUtility=new WebDriverUtility();
		
		String[] arr=fileUtility.readMultipleDataFromExcelFile("Campaign", 1);
		System.out.println(Arrays.toString(arr));
		
		String BROWSER=fileUtility.readDataFromPropertyFile("browser");
		String URL=fileUtility.readDataFromPropertyFile("url");
		String USERNAME=fileUtility.readDataFromPropertyFile("username");
		String PASSWORD=fileUtility.readDataFromPropertyFile("password");
		
		String CONTACTNAME = arr[4];
        String ORGANIZATION = arr[5];
        String MOBILE = arr[6];
        String TITLE = arr[7];
        String CAMPAIGN_ID = arr[8];
        String PRODUCT_NAME = arr[9];
        int QUANTITY = Integer.parseInt(arr[10]);
        double PRICE_PER_UNIT = Double.parseDouble(arr[11]);
        String CATEGORY = arr[12];
        String VENDOR = arr[13];
        String SUBJECT = arr[14];
        String DATE = arr[15];
        String MONTH = arr[16];
        int YEAR = Integer.parseInt(arr[17]);
        String BILLING_ADDRESS = arr[18];
        String BILLING_PO_BOX = arr[19];
        String BILLING_CITY = arr[20];
        String BILLING_STATE = arr[21];
        String BILLING_CODE = arr[22];
        String BILLING_COUNTRY = arr[23];
        String SHIPPING_ADDRESS = arr[24];
        String SHIPPING_PO_BOX = arr[25];
        String SHIPPING_CITY = arr[26];
        String SHIPPING_STATE = arr[27];
        String BILLING_POSTAL_CODE = arr[28];
        String COUNTRY = arr[29];
        String CONTACT_NAME = arr[30];  
        String CATEGORY_SEARCH = arr[31];
        
        WebDriver driver;
		
        
		if(BROWSER.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(BROWSER.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		else if(BROWSER.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else
			driver=new ChromeDriver();
		driverUtility.maximizeWindow(driver);
		
        driver.get(URL);
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginToApp(USERNAME, PASSWORD);
	}
}

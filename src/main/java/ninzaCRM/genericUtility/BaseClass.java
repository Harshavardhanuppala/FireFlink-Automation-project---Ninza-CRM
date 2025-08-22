package ninzaCRM.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.xml.XmlTest;

import ninzaCRM.ObjectRepository.DashBoardPage;
import ninzaCRM.ObjectRepository.LoginPage;

/**
 * @author Uppala Harshavardhan
 * This is the base class.
 */
public class BaseClass 
{
	public FileUtility fileUtility=new FileUtility();
	public JavaUtility javaUtility=new JavaUtility();
	public WebDriverUtility driverUtility=new WebDriverUtility();
	public WebDriver driver;
	
	public static WebDriver sdriver;
	
	/**
	 * Before suite configuration
	 */
	@BeforeSuite(alwaysRun = true)
	public void bsConfig()
	{
		System.out.println("====== before suite is successfully ======");
	}
	/*
	 * before class lanuch browser and url
	 */
	@Parameters("browser")
	@BeforeTest
	@BeforeClass(alwaysRun = true)
	//public void bcConfig(String BROWSER) throws IOException
	public void bcConfig() throws IOException
	{
		String BROWSER=fileUtility.readDataFromPropertyFile("browser");
		String URL=fileUtility.readDataFromPropertyFile("url");
		
	
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
        driverUtility.provideImplicitWait(driver);
        sdriver=driver;
        
        System.out.println("===== before class launch browser is executed ========");
	}
	
	/**
	 * Before executing the test login with credientials
	 * @throws IOException
	 */
	@BeforeMethod(alwaysRun = true)
	public void bmconfig() throws IOException
	{
		String USERNAME=fileUtility.readDataFromPropertyFile("username");
		String PASSWORD=fileUtility.readDataFromPropertyFile("password");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginToApp(USERNAME, PASSWORD);
		 System.out.println("===== before method login  is executed ========");

	}
	/**
	 * after test logout the account
	 * @throws InterruptedException 
	 */
	@AfterMethod(alwaysRun = true)
	public void amConfig() throws InterruptedException
	{
		DashBoardPage boardPage=new DashBoardPage(driver);
		boardPage.performLogOutOperation(driver);
		 System.out.println("===== after method logout is executed ========");
	}
	/**
	 * After the class execution closing the browser
	 */
	@AfterTest
	//@AfterClass(alwaysRun = true)
	public void acConfig()
	{
		driver.quit();
		 System.out.println("===== before class  browser is closed ========");
	}
	
	/**
	 * after the suite is closing the connections.
	 */
	@AfterSuite(alwaysRun = true)
	public void asConfig()
	{
		System.out.println("After suite is closed");
	}
}

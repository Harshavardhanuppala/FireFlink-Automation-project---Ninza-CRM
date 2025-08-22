package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ninzaCRM.genericUtility.JavaUtility;

public class VerifyPurchaseOrderWithUpdatedProduct_E2E_002 
{
	public static void checkElementDisplayedOrNot(WebDriver driver,String xpath,String msg)
	{
		
		try {
			WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
			driverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
			System.out.println(msg+" is displayed");
		}
		catch(Exception e)
		{
			System.out.println(msg+" is not displayed");
			System.exit(0);
		}
	}
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		JavaUtility javaUtility=new JavaUtility();
		FileInputStream fileInputStream=new FileInputStream(".//src//test//resources//CommonData.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		String URL=properties.getProperty("url");
		String BROWSER=properties.getProperty("browser");
		String PASSWORD=properties.getProperty("password");
		String USERNAME=properties.getProperty("username");
		
		Random random=new Random();
	
		
		WebDriver driver;
		Select select;
		String mainwindow;
		if(BROWSER.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(BROWSER.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		else if(BROWSER.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else
			driver=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream(".//src//test//resources//TestDataEndToEnd.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Campaign");
		Row row=sheet.getRow(4);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		
		Actions actions=new Actions(driver);
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.id("inputPassword")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		checkElementDisplayedOrNot(driver, "//b[text()='Campaigns']", "dash board");
		
		driver.findElement(By.xpath("//a[text()='Purchase Order']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Create Order']")).click();
		checkElementDisplayedOrNot(driver, "//h3[text()='Create Purchase-Order']", "Create Purchase order ");
		mainwindow=driver.getWindowHandle();
		System.out.println(javaUtility.getNextDay()+" "+javaUtility.getNextMonth()+" "+ javaUtility.getNextYear());
		actions.sendKeys(driver.findElement(By.xpath("//input[@name='subject']")),row.getCell(5).toString(),Keys.TAB,javaUtility.getNextDay(),javaUtility.getNextMonth(),javaUtility.getNextYear(),Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		for(String window:driver.getWindowHandles())
		{
			if(!mainwindow.equals(window))
			{
				driver.switchTo().window(window);
				String search=row.getCell(4).toString();
				Thread.sleep(2000);
				actions.sendKeys(driver.findElement(By.xpath("//input[@id='search-input']")),search).perform();
				Thread.sleep(2000);
				actions.sendKeys(Keys.BACK_SPACE).perform();
				driver.findElement(By.xpath("//button[@onclick=\"selectContact('CON00733', 'Sumit Ghosh')\"]")).click();
			}
		}
		driver.switchTo().window(mainwindow);
		actions.sendKeys(driver.findElement(By.xpath("//label[text()='Billing Address']/following-sibling::textarea")),row.getCell(9).toString(),Keys.TAB,row.getCell(10).toString(),Keys.TAB,row.getCell(11).toString(),Keys.TAB,row.getCell(12).toString(),Keys.TAB,row.getCell(13).toString(),Keys.TAB,row.getCell(14).toString(),Keys.TAB,row.getCell(15).toString(),Keys.TAB,row.getCell(16).toString(),Keys.TAB,row.getCell(17).toString(),Keys.TAB,row.getCell(18).toString(),Keys.TAB,row.getCell(19).toString(),Keys.TAB,row.getCell(20).toString(),Keys.TAB,Keys.ENTER).perform();
		for(String window:driver.getWindowHandles())
		{
			if(!mainwindow.equals(window))
			{
				driver.switchTo().window(window);
				checkElementDisplayedOrNot(driver, "//h3[text()='Select a Product']", "select product page");
				Thread.sleep(2000);
				String search=row.getCell(22).toString();
				select=new Select(driver.findElement(By.xpath("//select[@id='search-criteria']")));
				select.selectByContainsVisibleText(row.getCell(21).toString());
				driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys(search);
				WebElement element= driver.findElement(By.xpath("//button[@onclick=\"selectProduct('IM_PROD_1079', 'VivoBook918', '80000')\"]"));
				WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
				driverWait.until(ExpectedConditions.visibilityOf(element));
				element.click();
			}
		}
		driver.switchTo().window(mainwindow);
		driver.findElement(By.xpath("//button[text()='Create Purchase Order']")).click();
		checkElementDisplayedOrNot(driver, "//div[contains(text(),'Purchase') and contains(text(),'Successfully Added')]", "Purchase added successfully");
		Thread.sleep(2000);
		
	}
}

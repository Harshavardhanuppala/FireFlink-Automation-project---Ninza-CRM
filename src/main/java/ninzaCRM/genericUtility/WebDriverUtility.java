package ninzaCRM.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class consists of generic methods related to WebDriver
 * @author Uppala Harshavardhan
 */
public class WebDriverUtility {
	
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	/**
	 * This method will full screen the window
	 * @param driver
	 */
	public void fullScreenWindow(WebDriver driver)
	{
		driver.manage().window().fullscreen();
	}
	/**
	 * This method will provide the implicit wait of 10 seconds
	 * @param driver
	 */
	public void provideImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * This method will add expilict wait of 10 seconds and until the element is visible
	 * @param driver
	 * @param element
	 */
	public void provideExplicitWaitforElementToBeVisible(WebDriver driver,WebElement element)
	{
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method will add expilict wait of 10 seconds and until the element is clickable
	 * @param driver
	 * @param element
	 */
	public void provideExplicitWaitforElementToBeClickable(WebDriver driver,WebElement element)
	{
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * Handle dropdown of an web element by visible text.
	 * @param element
	 * @param visibleText
	 */
	public void handleDropDown(WebElement element,String visibleText)
	{
		new Select(element).selectByContainsVisibleText(visibleText);
	}
	/**
	 * Handle dropdown of an web element by index.
	 * @param element
	 * @param index
	 */
	public void handleDropDown(WebElement element,int index)
	{
		new Select(element).selectByIndex(index);
	}
	/**
	 * Handle dropdown of an web element by value.
	 * @param element
	 * @param value
	 */
	public void handleDropDown(String value,WebElement element)
	{
		new Select(element).selectByValue(value);
	}
	/**
	 * Making action of mouse hovering to a webelement
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringAction(WebDriver driver,WebElement element)
	{
		new Actions(driver).moveToElement(element).perform();
	}
	/**
	 * performing dragging an webelement and drop webelement
	 * @param driver
	 * @param dragElement
	 * @param dropElement
	 */
	public void dragAndDropAction(WebDriver driver,WebElement dragElement,WebElement dropElement)
	{
		new Actions(driver).dragAndDrop(dragElement, dropElement).perform();
	}
	/**
	 * performing click and hold operation on an web element
	 * @param driver
	 * @param element
	 */
	public void clickAndHoldAction(WebDriver driver,WebElement element)
	{
		new Actions(driver).clickAndHold(element).perform();
	}
	/**
	 * performing releasing operation on an weblement
	 * @param driver
	 * @param element
	 */
	public void releaseAction(WebDriver driver,WebElement element)
	{
		new Actions(driver).release(element);
	}
	/**
	 * performing moving operation on cursor to a particular element
	 * @param driver
	 * @param xOffset
	 * @param yOffset
	 */
	public void moveByOffsetAction(WebDriver driver,int xOffset,int yOffset)
	{
		new Actions(driver).moveByOffset(xOffset, yOffset).perform();
	}
	/**
	 * Performing double click operation on an webelement
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver,WebElement element)
	{
		new Actions(driver).doubleClick(element);
	}
	/**
	 * Performing right click operation on an webelement
	 * @param driver
	 * @param element
	 */
	public void contextClickAction(WebDriver driver,WebElement element)
	{
		new Actions(driver).contextClick(element);
	}
	/**
	 * This method will switch control to specified index frame
	 * @param driver
	 * @param index
	 */
	public void switchControlToFrameByIndex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * This method will switch control to specified webElement frame
	 * @param driver
	 * @param element
	 */
	public void switchControlToFrameByWebElement(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	/**
	 * This method will switch control to specified String name frame
	 * @param driver
	 * @param name
	 */
	public void SwitchControlToFrameByName(WebDriver driver,String name)
	{
		driver.switchTo().frame(name);
	}
	/**
	 * This method will switch control to parent frame
	 * @param driver
	 */
	public void switchControlToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	/**
	 * This method will switch control to main window
	 * @param driver
	 */
	public void switchControlToMainWindow(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is used to accept the alert 
	 * @param driver
	 */
	public void acceptTheAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * This method is used to decline the alert
	 * @param driver
	 */
	public void declineTheAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * this method is used to send the data into alert
	 * @param driver
	 * @param data
	 */
	public void sendDataIntoTheAlert(WebDriver driver,String data)
	{
		driver.switchTo().alert().sendKeys(data);
	}
	/**
	 * This method is used to get the alert message
	 * @param driver
	 * @return
	 */
	public String getTextFromAlert(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	/**
	 * switch the window to specified window
	 * @param driver
	 * @param windowhandle
	 */
	public void switchControltoSpecficWindow(WebDriver driver,String windowhandle)
	{
		driver.switchTo().window(windowhandle);
	}
	/**
	 * switch control to specific title.                  
	 * @param driver
	 * @param title
	 */
	public void switchControlToTitleWindow(WebDriver driver,String title)
	{
		Set<String> set=driver.getWindowHandles();
		for(String window:set)
		{
			driver.switchTo().window(window);
			if(driver.getTitle().contains(title))
				break;
		}
	}
	
	public void clickOnWebElement(WebElement element)
	{
		element.click();
	}
	/**
	 * This method will capture the screenshot and return the path to caller
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */
	public String captureScreenShot(WebDriver driver,String screenshotName) throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		File des= new File(".\\ScreenShots\\"+screenshotName+".png");
		FileHandler.copy(src, des);
		
		return des.getAbsolutePath(); //for extents reports.
	}
}

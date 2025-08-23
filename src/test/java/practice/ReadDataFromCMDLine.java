package practice;

import org.testng.annotations.Test;

public class ReadDataFromCMDLine 
{
	@Test
	public void readData()
	{
		String browser=System.getProperty("browser");
		System.out.println(browser);
		
		String UN=System.getProperty("username");
		System.out.println(UN);
		System.out.println("hi");
		String Pass=System.getProperty("password");
		System.out.println(Pass);
	}
}

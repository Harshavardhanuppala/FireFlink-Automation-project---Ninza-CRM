package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGPractice 
{
	@Test
	public void sampleTest()
	{
		Reporter.log("Method is executing",true);
		System.out.println("hi");
		Assert.fail();
		Reporter.log("method executed",true);
	}
}

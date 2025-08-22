package CreationImplementation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsPractice 
{
	@Test
	public void sampleTest()
	{
		SoftAssert asserts=new SoftAssert();
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		
		Assert.assertEquals(1, 1);
		asserts.assertEquals(false, true);
		System.out.println("Step 4");
		
		Assert.assertEquals("ab", "a");
		System.out.println("step 5");
		asserts.assertAll();
	}
}

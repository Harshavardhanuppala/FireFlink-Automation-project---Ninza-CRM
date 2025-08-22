package CreationImplementation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMethodAttributes 
{
	@Test(priority = 1)
	public void create()
	{
		Assert.fail();
		System.out.println("create");
	}
	
	//@Test(priority = -1, invocationCount = 2,enabled = false)
	@Test(dependsOnMethods = "create")
	public void modify()
	{
		System.out.println("modify");
	}
	
	@Test
	public void delete()
	{
		System.out.println("delete");
	}
}

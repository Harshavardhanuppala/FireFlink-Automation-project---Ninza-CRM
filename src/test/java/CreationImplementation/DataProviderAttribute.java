package CreationImplementation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAttribute 
{
	@Test(dataProvider = "customerInfo")
	public void create(String name,int id)
	{
		System.out.println(name+" "+id+" ");
	}
	@DataProvider(name="customerInfo")
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="harsha";
		data[0][1]=1;
		
		data[1][0]="vardhan";
		data[1][1]=2;
		
		data[2][0]="harsha";
		data[2][1]=3;
		return data;
	}
}

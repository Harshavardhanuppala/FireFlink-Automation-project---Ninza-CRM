package CreationImplementation;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ninzaCRM.genericUtility.FileUtility;

public class GetMultiRowDataFromExcel 
{
	@Test(dataProvider = "getMultiData")
	public void getMultiRowData(String name,String id,String num)
	{
		System.out.println(name+" "+id+" "+num);
	}
	
	@DataProvider
	public  Object[][] getMultiData() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		FileUtility fileUtility=new FileUtility();
		return fileUtility.readMultiRowDataFromExcelFile("Sheet1");
	}
}

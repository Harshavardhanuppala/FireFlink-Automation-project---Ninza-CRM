package ninzaCRM.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consists of generic methods related to File operations like property file ,excel file
 * @author Uppala Harshavardhan
 */
public class FileUtility 
{
	
	/**
	 * This method will read data from property file 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fileInputStream=new FileInputStream(".//src//test//resources//CommonData.properties");
		
		Properties properties=new Properties();
		properties.load(fileInputStream);
		return properties.getProperty(key);
	}
	
	/**
	 * Read particular column data by specifing column index,row index and sheet name.
	 * @param sheetName
	 * @param rowNum
	 * @param colNum
	 * @return
	 * @throws IOException
	 */
	public String readDataFromExcelFile(String sheetName,int rowNum,int colNum) throws IOException
	{
		return WorkbookFactory.create(new FileInputStream(".//src//test//resources//TestDataEndToEnd.xlsx")).getSheet(sheetName).getRow(rowNum).getCell(colNum).toString();
	}
	
	/**
	 * Store This method will read all the data from entire row and store the data in string array.
	 * @param sheetName
	 * @param rowNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String[] readMultipleDataFromExcelFile(String sheetName,int rowNum) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Row row=WorkbookFactory.create(new FileInputStream(".//src//test//resources//TestDataEndToEnd.xlsx")).getSheet(sheetName).getRow(rowNum);
		int size=row.getLastCellNum();
		String[] result=new String[size];
		for(int i=0;i<size;i++)
		{
			result[i]=row.getCell(i).toString();
		}
		return result;
	}
	
	public Object[][] readMultiRowDataFromExcelFile(String sheetName) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Sheet sheet=WorkbookFactory.create(new FileInputStream(".//src//test//resources//SampleData.xlsx")).getSheet(sheetName);
		int rowNum= sheet.getLastRowNum();
		Object[][] res=new Object[rowNum+1][];
		for(int i=0;i<=rowNum;i++)
		{
			Row row=sheet.getRow(i);
			int size=row.getLastCellNum();
			 res[i] = new Object[size]; 
			for(int j=0;j<size;j++)
			{
				res[i][j]=row.getCell(j).toString();
			}
		}
		return res;
	}
	
}

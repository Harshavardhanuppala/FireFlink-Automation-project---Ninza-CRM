package ninzaCRM.genericUtility;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

/**
 * This class will consist of generic methods related to perform All java related operations
 * @author Uppala Harshavardhan
 */
public class JavaUtility 
{
	/**
	 * This method will return the random number based on the last number 
	 * @param uptoLastNum
	 * @return random number
	 */
	public int getRandomNumber(int uptoLastNum)
	{
		Random random=new Random();
		return random.nextInt(uptoLastNum);
	}
	
	/**
	 * This method will return the curr date and time in the form of string and dd-MM-yyyy_hh-mm-ss
	 * @return date as a string
	 */
	public String getSystemDate()
	{
		Date date=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
		return dateFormat.format(date);
	}
	
	public int getCurrentDay()
	{
		return LocalDate.now().getDayOfMonth();

	}
	public int getCurrentMonth()
	{
		return LocalDate.now().getMonthValue();

	}
	public int getCurrentYear()
	{
		return LocalDate.now().getYear();

	}
	
	public String getNextDay()
	{
		return  ""+LocalDate.now().plusDays(1).getDayOfMonth();
        
	}
	public String getNextMonth()
	{
		return  ""+LocalDate.now().plusMonths(1).getMonthValue();
	}
	public String getNextYear()
	{
		return  ""+LocalDate.now().plusYears(1).getYear();

	}
	
}

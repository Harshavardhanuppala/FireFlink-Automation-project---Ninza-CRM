package ninzaCRM.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DatabaseUtility 
{
	
	private static Connection connection;
	/**
	 * making the connection between java application and DB
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public static void getDBConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/work", "root", "root");
	}
	/**
	 * closing the connection betwen the java application and DB
	 * @throws SQLException
	 */
	public static void closeConnection() throws SQLException
	{
		connection.close();
	}
	/**
	 * check the username is present in the DB or not
	 * @param user
	 * @throws SQLException
	 */
	public void checkUserDetails(String user) throws SQLException
	{
		
		PreparedStatement statement=connection.prepareStatement("select * from user_details where username='"+user+"'");
		ResultSet set=statement.executeQuery();
		if(set.next())
		{
			System.out.println("Data if found");
		}
		else
		{
			System.out.println("Data is not found");
			org.testng.Assert.fail();
		}
	}
	/**
	 * inserting the default details from the user.
	 * @throws SQLException
	 */
	public void insertUserDetails() throws SQLException
	{
		PreparedStatement statement=connection.prepareStatement("insert into user_details values('harsha','harsha','uppala','Male','123456',1");
		int set=statement.executeUpdate();
		if(set!=0)
			System.out.println("details added");
		else
			System.out.println("Details not added");
	}
}

package ninzaCRM.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DatabaseUtility 
{
	private Connection connection;
	public Connection getDBConnection() throws SQLException
	{
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/work", "root", "root");
		return connection;
	}
	
	public void closeConnection() throws SQLException
	{
		connection.close();
	}
}

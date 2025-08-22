package ninzaCRM.genericUtility;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


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
	public ResultSet getUserDetails(String user) throws SQLException
	{
		PreparedStatement statement=connection.prepareStatement("select * from user_details where username='"+user+"'");
		ResultSet set=statement.executeQuery();
		return set;
	}
}

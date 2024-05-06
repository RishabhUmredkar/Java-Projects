package jdbcwithui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectivity {

	String dbname = "rishabh";
	String url = "jdbc:mysql://localhost:3306/"+dbname;
	String uname = "root";
	String pass = "abc123";
	
	Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		return null;
		
	}
}

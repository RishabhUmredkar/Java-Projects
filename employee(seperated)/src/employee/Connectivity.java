package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
	static String dbname = "rishabh00";
	static String url="jdbc:mysql://localhost:3306/"+dbname;
	static String uname="root";
	static String pass="abc123";

static	Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		return con;
	}
}

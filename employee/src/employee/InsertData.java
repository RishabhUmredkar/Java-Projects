package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData 
{
	
	static public int insertemp(emp e) throws ClassNotFoundException, SQLException 
	{
	Connection con = Connectivity.getConnection();
	PreparedStatement ps = con.prepareStatement("Insert into Rishabh00.tb values(?,?,?)");
	ps.setInt(1, e.getEmpno());
	ps.setString(2, e.getEmpName());
	ps.setString(3, e.getSalary());
	
	int x = ps.executeUpdate();
	con.close();
	return x;
	}

}



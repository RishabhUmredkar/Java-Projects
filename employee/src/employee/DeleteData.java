package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

	static public int deleteemp(emp e) throws ClassNotFoundException, SQLException 
	{
	Connection con = Connectivity.getConnection();
	PreparedStatement ps = con.prepareStatement("delete from Rishabh00.tb where empno =?");
	ps.setInt(1, e.getEmpno());
	
	int x = ps.executeUpdate();
	con.close();
	return x;
	}

}

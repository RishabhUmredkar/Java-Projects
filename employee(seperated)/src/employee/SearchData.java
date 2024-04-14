package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchData {

	static public int searchemp(emp e) throws ClassNotFoundException, SQLException 
	{
		Connection con = Connectivity.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from Rishabh00.tb where empno = ?");
		System.out.println("statement Created");
		ps.setInt(1, e.getEmpno());
		ResultSet r1 = null;
		r1 = ps.executeQuery();
	int x = ps.executeUpdate();
	con.close();
	return x;
	
	
	//PreparedStatement ps = con.prepareStatement("delete from Rishabh00.tb where empno =?");
	//ps.setInt(1, e.getEmpno());
	
	}


s.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int roll=Integer.parseInt(tx2.getText());
		String sql="SELECT * FROM Proj145.Snehacom where roll="+roll+"";
		PreparedStatement st = null;	
        ResultSet rs1 = null;
      	try {
      		rs1=st.executeQuery(sql);
			while(rs1.next())
			{
				try {
					System.out.println("roll:"+rs1.getInt("roll")+"\n name:"+rs1.getString("name"));
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}	
	    int a=0;
        if(a>0)
		{
		 System.out.println("searched");
		 JOptionPane.showMessageDialog(f, "Data Searched");
		 }
		 else
		 {
			 System.out.println("Not searched");
			 JOptionPane.showMessageDialog(f, "Not found");
		 } 
		}
           });}

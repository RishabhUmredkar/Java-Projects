package employee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame {
	
	static void myframe()
	{

		JFrame jf = new JFrame("Employee Entry");
		JLabel lb0 = new JLabel();
		lb0.setBounds(200, 280, 231, 20);
		
		JLabel lb1 = new JLabel("Enter Id ");
		lb1.setBounds(63, 90, 117, 35);
		JTextField tx1 = new JTextField();
		tx1.setBounds(208, 100, 231, 20);
		
		JLabel lb2 = new JLabel("Enter Name ");
		lb2.setBounds(63, 125, 117, 35);
		JTextField tx2 = new JTextField();
		tx2.setBounds(208, 135, 231, 20);

		JLabel lb3 = new JLabel("Enter Address ");
		lb3.setBounds(63, 170, 117, 35);
		JTextField tx3 = new JTextField();
		tx3.setBounds(208, 175, 231, 20);
		
		JLabel lb4 = new JLabel("Status");
		lb4.setBounds(63, 200, 117, 35);
		JTextField tx4 = new JTextField();
		tx4.setBounds(208, 205, 231, 20);

		JButton b1 = new JButton("click for Insert");
		b1.setBounds(50, 260, 150, 40);
	
		
		

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				emp e = new emp(Integer.parseInt(tx1.getText()),tx2.getText(),tx3.getText());
								
				try {
					int x = InsertData.insertemp(e);
					if (x>0)
					{
						lb4.setText("status : INSERTED !");
						tx1.setText("");
						tx2.setText("");
						tx3.setText("");
					}
					else
					{
						lb4.setText("Status : data not Inserted");
					}
				}
				catch (ClassNotFoundException |SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
			}
		});
		

		JLabel lb5 = new JLabel("Enter Id ");
		lb5.setBounds(330, 90, 117, 35);
		JTextField tx5 = new JTextField();
		tx5.setBounds(380, 100, 231, 20);
		
		JButton b2 = new JButton("click for Delete");
		b2.setBounds(50, 300, 150, 40);
	
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				emp e = new emp(Integer.parseInt(tx5.getText()));
				 try {
						int x = DeleteData.deleteemp(e);
						if(x>0)
						{
							lb4.setText("status : DELETED !");
							tx1.setText("");
							tx2.setText("");
							tx3.setText("");
						}
						else
						{
							lb4.setText("Status : ERROR 999");
						}
						
				}
					catch (ClassNotFoundException |SQLException e1) {
						// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
		
		jf.add(lb0);
		jf.add(lb1);
		jf.add(tx1);

		
		jf.add(lb2);
		jf.add(tx2);
		
		jf.add(lb3);
		jf.add(tx3);

		jf.add(lb4);
		jf.add(tx4);

		jf.add(lb5);
		jf.add(tx5);

		jf.add(b1);
		jf.add(b2);
		
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
	}

}


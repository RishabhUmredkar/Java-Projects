package arraylistpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Student{
	private int roll;
	private String name;
	private String adress;
	Student(int roll,String name,String adress){
		this.roll=roll;
		this.name=name;
		this.adress=adress;
	}
	public int getRoll(){
		
		return roll;
	}
public String getName(){
		
		return name;
	}
public String getAdress(){
	
	return adress;
}
public String toString(){
	
	return roll+" "+name+" "+adress;
}

}
public class test {

	public static void main(String[] args) {
		
		List<Student>c=new ArrayList<Student>();
		Scanner s=new Scanner (System.in);
		int choice=0;
		do{
			System.out.println("1.Add Student ");
			System.out.println("2.Show Student ");
			System.out.println("3.Search Student ");
			System.out.println("4.Delete  Student ");
			System.out.println("5.Update Student ");
			System.out.println("Enter the Choice");
			choice=Integer.parseInt(s.nextLine());
			switch (choice){
			case 1:
				System.out.println("Enter the no of student");
				int no=Integer.parseInt(s.nextLine());
				for(int i=1;i<=no;i++){
				System.out.println(i+" :Enter the roll no");
			int	roll=Integer.parseInt(s.nextLine());
			System.out.println("Enter the name");
			String	name=s.nextLine();
			System.out.println("Enter the adress");
			String	adress=s.nextLine();
			c.add(new Student(roll,name,adress));
				}
		break;
			case 2:
				Iterator<Student>i=c.iterator();
				while(i.hasNext()){
					Student st=i.next();
					System.out.println(st);
					
				}
			break;
			case 3:
				boolean found=false;
				System.out.println("Enter he roll no");
			int	roll=Integer.parseInt(s.nextLine());
				i=c.iterator();
				while(i.hasNext())
				{
					Student st=i.next();
					if(st.getRoll() == roll)
					{
						System.out.println(st);
						found =true;
					}
				}
				if(!found){
					System.out.println("Student is not found");
				}
			break;
			case 4:
				 found=false;
				System.out.println("Enter he roll no");
				roll=Integer.parseInt(s.nextLine());
				i=c.iterator();
				while(i.hasNext()){
					Student st=i.next();
					if(st.getRoll()==roll)
					{
						i.remove();
						found =true;
					}
				}
				if(!found){
					System.out.println("Student is not found");
				}
				else{
					
					System.out.println("Student deleted succecfully");
					
				}
			break;
			case 5:
				 found=false;
				System.out.println("Enter he roll no");
				roll=Integer.parseInt(s.nextLine());
				ListIterator<Student>li=c.listIterator();
				
				while(li.hasNext()){
					Student st=li.next();
					if(st.getRoll()==roll)
					{
						System.out.println("Enter the name");
					String name=s.nextLine();
						System.out.println("Enter the adress");
				String adress=s.nextLine();
						li.set(new Student(roll,name,adress));
						found =true;
					}
				}
				if(!found){
					System.out.println("Student is not found");
				}
				else{
					
					System.out.println("Student updated succecfully");
					
				}
			break;
			
			
			
			
			
			
			
			
			}
			
			
			
			
		
			
			
			
		}while(choice!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

/*

public class test{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("hello");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Registerd");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Rishabh00","root","abc123");
		System.out.println("connected");
		boolean j = true;
		while (j)
		{
		Statement stmt = con.createStatement();
		System.out.println("1. Insert");
		System.out.println("2. show");
		System.out.println("3. Search");
		System.out.println("4. Delete");
		System.out.println("5. Update");
		System.out.println("0. exit");
		System.out.println("enter your choice");
		int ch= Integer.parseInt(sc.nextLine());
		switch(ch)
		{
		case 1:
			 System.out.println("enter empno");
			 int empno = Integer.parseInt(sc.nextLine());
			 System.out.println("enter empname");
			 String empname = sc.nextLine();
			 System.out.println("enter empsal");
			 String sal = sc.nextLine();
			 int a = stmt.executeUpdate("insert into rishabh.tb1 (empno,empname,empsal)values("+empno+",'"+empname+"','"+sal+"')");
			 if(a>0){
				 System.out.println("Inserted");
			 }
			 else
			 {
				 System.out.println("error");
			 }
			 break;
			 
			 
		case 2:
			String query = "Select * from Rishabh.tb1";
			ResultSet r = stmt.executeUpdate(query);
			while(r.hasNext())
			{
				empno = r.getInt("emono");
				empname = r.getString("empname");
				sal = r.getString("empsal");
				System.out.println("("+empno+",'"+empname+"','"+sal+"')");
			}
			break;
			
			
		case 3:
			System.out.println("enter the empno th search");
			empno = Integer.parseInt(sc.nextLine());
			String sql= "Select * from rishabh.tb1 where empno ="+empno+"";
			ResultSet r1 = null;
			r1= stmt.executeUpdate(sql);
			while(r1.next())
			{
				System.out.println("empno :"+r1.getInt("empno")+"\nempname :"+r1.getString("empname")+"\nempsal : "+r1.getInt("sal"));            
			}
			break;
			
			
		case 4:
			System.out.println("enter empno to delete data");
			empno = Integer.parseInt(sc.nextLine());
			int a1 = stmt.executeUpdate("delete from rishabh.tb1 wahere empno = "+empno+"");
			break;
			
			
		case 5:
			System.out.println("enter empno to update data");
			empno = Integer.parseInt(sc.nextLine());
			System.out.println("enter empname ");
			empname = sc.nextLine();
			int a2 = stmt.executeUpdate("update rishabh.tb1 set empname = '"+empname+"'where empno="+empno+"");
			break;
		}
		}
		
	}
}



*/
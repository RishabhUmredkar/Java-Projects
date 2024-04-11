	import java.util.Scanner;
	
class Address
	{
		String add,name,rollno,mobno,plotno,area,city;
	
	void add1()
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter name of the student: ");
		name=a.nextLine();
		
		System.out.println("Enter roll no. of the student: ");
		rollno=a.nextLine();
		
		System.out.println("Enter phone no. of the student: ");
		mobno=a.nextLine();
		
		System.out.println("Enter plot no. of the student: ");
		plotno=a.nextLine();
		
		System.out.println("Enter area of the student: ");
		area=a.nextLine();
		
		System.out.println("Enter city of the student: ");
		city=a.nextLine();
	}
		
	void show1()
	{
		System.out.println("");
	System.out.println("**********Details of the student*********** ");
	System.out.println("Name of the student: "+name);
	System.out.println("Roll no. of the student: "+rollno);
	System.out.println("Phone no. of the student: "+mobno);
	System.out.println("Address of the student:  ");
	System.out.println("  "+plotno+", "+area+", "+city+" ");
	}
	
	}
	
class Student
	{
	Address c=new Address();
	
	void show()
	{	c.add1();
		System.out.println("Name of the student: "+c.name);
	  System.out.println("Roll no. of the student: "+c.rollno);
	  System.out.println("Phone no. of the student: "+c.mobno);
	  System.out.println("Address of the student:  ");
	  System.out.println("  "+c.plotno+", "+c.area+", "+c.city+" ");
	  
	  }
	}
	    
	public class emp {
	public static void main(String[] args) {
	Student s=new Student();
	s.show();
	
	}}
	
	
	

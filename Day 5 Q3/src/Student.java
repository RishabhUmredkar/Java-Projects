import java.util.Scanner;
class Info
{String name,mobno;
int rollno;
	void Input()
	{Scanner v=new Scanner(System.in);
	System.out.print("Enter Name:");
	name=v.nextLine();
	System.out.print("Enter Roll number :");
	rollno= Integer.parseInt(v.nextLine());
	System.out.print("Enter Mobile number :");
	mobno= v.nextLine();
	}
	void display()
	{
	System.out.println("");
	System.out.println("Details are: ");
	System.out.println(" Roll number: "+rollno);
	System.out.println(" Name: "+name);
	System.out.println("Mobile number :" +mobno);
	}
}
public class Student {
public static void main(String[] args) {
        Info s1=new Info();
		Info s2=new Info();
		s1.Input();
		s2.Input();
		s1.display();
		s2.display();
	}
}
	



import java.util.Scanner;
class Info
{
int roll;
String name;
void stuinfo()
	{Scanner v=new Scanner(System.in);
	System.out.print("Enter Roll number :");
	 roll= Integer.parseInt(v.nextLine());
	System.out.print("Enter Name:");
	name=v.nextLine();}
void display()
{System.out.println();
	System.out.println(" Roll number: "+roll);
	System.out.println(" Name: "+name);
	}
	}
public class Student {
	
	public static void main(String[] args) {
	Info s=new Info();	
	s.stuinfo();
	s.display();
	}}

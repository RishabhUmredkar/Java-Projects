import java.util.Scanner;
class A
{int l ,b;
	void set()
{Scanner v=new Scanner(System.in);
System.out.print("Enter length: ");
l =v.nextInt();
System.out.print("Enter breadth: ");
 b =v.nextInt();}

void get()
{
System.out.println("Area of rectangle is "+(l*b));}
}

public class Rectangle 
{
public static void main(String[] args) 
{   A a1=new A();
	a1.set();
	a1.get();
	}}


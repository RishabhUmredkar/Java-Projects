package inheritance;

import java.util.Scanner;

class A
{ 
	int a,b;
	Scanner sc= new Scanner(System.in);
	void add()
	{ 
		System.out.println("Enter any 2 number:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition="+(a+b));
	}
	
	void mul()
	{
		System.out.println("Enter any 2 number:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Product ="+(a*b));
	}
	
}

public class inheri {
	
	public static void main(String[] args) {
A a1=new A();
a1.add();
a1.mul();
	}}

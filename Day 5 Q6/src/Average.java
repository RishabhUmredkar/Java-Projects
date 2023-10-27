import java.util.Scanner;

class A
{int a,b,c,Avge;
	void cal()
	{Scanner c1=new Scanner(System.in);
	 System.out.println("Enter first value: ");
	 a=c1.nextInt();
	 System.out.println("Enter second value: ");
	 b=c1.nextInt();
	 System.out.println("Enter third value: ");
	 c=c1.nextInt();}
	void avg()
	{ Avge=(a+b+c)/3;
		System.out.println("Average= "+Avge);
	}}
public class Average {

	public static void main(String[] args) {
A c1= new A();
c1.cal();
c1.avg();
	}}

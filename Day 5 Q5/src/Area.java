import java.util.Scanner;

class A   //not taught
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

public class Area
{
public static void main(String[] args) 
{   A a1=new A();
a1.set();
a1.get();
}}

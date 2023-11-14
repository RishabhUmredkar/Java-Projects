import java.util.Scanner;

public class Array {
public static void main(String[] args) {

System.out.println("Enter 5 number : ");
int a[]=new int [5];

for(int i=0;i<a.length;i++)
{
	Scanner v=new Scanner(System.in);
  a[i]=Integer.parseInt(v.nextLine());
}

for(int i=0;i<a.length;i++)
{System.out.println("You entered array is: "+a[i]);
}

}}
	



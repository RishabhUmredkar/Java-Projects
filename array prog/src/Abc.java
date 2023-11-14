import java.util.Scanner;

public class Abc {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter number of integer value: ");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter "+n+" values are: ");
for(int i=0;i<a.length;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<a.length;i++)
{System.out.println("You enter "+(i+1)+" value is: "+a[i]);
}
}
}
// n number of arrays we can take here.
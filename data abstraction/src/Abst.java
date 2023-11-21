import java.util.Scanner;

abstract class Bank
{int acc;

String name,add,phone;
Scanner s=new Scanner(System.in);
	abstract void setCustDetails();
	
	void setInterest()
	{
		System.out.println("Interest");
	}
	Bank()
	{
		System.out.println("Im Constructor ");
	}
}
 class Axis extends Bank
 {
	 void setCustDetails()
	 { 
	 System.out.println();
		 System.out.println("Axis Input details of the customer:");
		 System.out.println("Enter customer name :");
		 name=s.nextLine();
		 System.out.println("Enter acc no:");
		  acc=Integer.parseInt(s.nextLine());
		 System.out.println("Enter phone number:");
		 phone=s.nextLine();
		 System.out.println("Enter address:");
		 add=s.nextLine();
	 }
	 void showDetails()
	 {System.out.println();
		 System.out.println("****Axis Details of the customer****");
		 System.out.println("-------------------------------------------------------------------");
		 System.out.println("Name\t\t Acc no\t\t Mob no.\t\t Address");
		 System.out.println(name+ "\t\t"+acc+"\t\t"+phone+"\t\t"+add);
		 System.out.println("-------------------------------------------------------------------");
	 }
 }
 class Sbi extends Bank
 {
	 void setCustDetails()
	 {
		 System.out.println("Sbi data set");
		 System.out.println("Axis Input details of the customer:");
		 System.out.println("Enter customer name :");
		 name=s.nextLine();
		 System.out.println("Enter acc no:");
		  acc=Integer.parseInt(s.nextLine());
		 System.out.println("Enter phone number:");
		 phone=s.nextLine();
		 System.out.println("Enter address:");
		 add=s.nextLine();
	 }

 void showCustdetails()
 {
	 System.out.println();
	 System.out.println(" Sbi data show");
 System.out.println("****SBI Details of the customer****");
 System.out.println("-------------------------------------------------------------------");
 System.out.println("Name\t\t Acc no\t\t Mob no.\t\t Address");
 System.out.println(name+ "\t\t"+acc+"\t\t"+phone+"\t\t"+add);
 System.out.println("-------------------------------------------------------------------");
	 
 }
 }

public class Abst {
public static void main(String[] args) {
		Axis a=new Axis();
		Sbi b=new Sbi();
		b.setCustDetails();
		b.showCustdetails();
		a.setCustDetails();
		a.showDetails();
	}

}
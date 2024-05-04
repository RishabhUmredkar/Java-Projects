class Gparent
{
	void fun()
	{
		System.out.println("Hello Gparent");
	}
}

class Parent extends Gparent //multi-level inheritance
{
	void myfun()
		{
		System.out.println("Hello Parent ");
		}
	
class Child extends Parent
	{
	void chil()
	{
		System.out.println("Hello Child Parent");
	}
	}
}
public class inheri {

	public static void main(String[] args) {
		
		Gparent b1=new Gparent();
		Parent c1=new Parent();
		c1.myfun();
		b1.fun();
	}}

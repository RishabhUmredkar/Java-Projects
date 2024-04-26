class A
{
	void fun()
	{
		System.out.println("Hello fun");
	}
}

class B extends A //single level inheritance
{
	void myfun()
		{
		System.out.println("Hello B ");
		}
}

public class Inhe {

	public static void main(String[] args) {
	B b1=new B();
	b1.fun();
	b1.myfun();}

	}

package hierarchical;
class A
{
	void display()
	{
		System.out.println("Hello A");
	}
}

class B extends A
{
	void dis1()
	{
		System.out.println("Hello B");
	}
}

class C extends A
{
	void dis2()
	{
		System.out.println("Hello C");
	}
}

class D extends A
{
	void dis3()
	{
		System.out.println("Hello D");
	}
}

public class hie {

	public static void main(String[] args) {
		B b1=new B();
		C c1=new C();
		D d1=new D();
		b1.display();
		c1.dis2();
		d1.dis3();
		b1.dis1();
	}

}

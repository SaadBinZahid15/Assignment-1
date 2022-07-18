class A
{
	int i,j;
	void show()
	{
		System.out.println("As show");
	}
}
class B extends A
{
	int k;
	void show()
	{
		System.out.println("Bs show");
	}
}
class C extends A
{
	int l;
	void show()
	{
		System.out.println("Cs show");
	}
}
class DMpoly
{
	public static void main(String[] arg)
	{
		A aa=new A();
		B bb=new B();
		C cc=new C();
		aa.show();
		bb.show();
		cc.show();
		A ref;
		ref=new B();
		ref.show();
		ref=new C();
		ref.show();
		ref=new A();
		ref.show();
		ref=bb;
		ref.show();
	}
}
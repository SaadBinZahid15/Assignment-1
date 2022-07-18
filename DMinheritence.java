class A
{
	int i;
	int j;
	void show()
	{
		System.out.println("i="+i+"j="+j);
	}
	int sum()
	{
		return i+j;
	}
}
class B extends A
{
	int k;
	void showk()
	{
		System.out.println("i="+i+"j="+j+"k="+k);
	}
	int sumk()
	{
		return i+j+k;
	}
}
class DMinheritence
{
	public static void main(String[] arg)
	{
		A objA=new A();
		B objB=new B();
		objA.i=1;
		objA.j=2;
		objB.i=10;
		objB.j=20;
		objB.k=30;
		objA.show();
		objB.showk();
		int dA=objA.sum();
		int dB=objB.sumk();
		System.out.println(dA+" "+dB);
	}
}
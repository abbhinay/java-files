//factory class
class A
{
	int a,b;
	private A()
	{
		a=10;
		b=20;
	}
	private A(int x,int y)
	{
		a=x;
		b=y;	
	}
	public void show()
	{
		System.out.println(a+" "+b);
	}
	//factory methods
	public static A getA()
	{
		return new A();
	}
	public static A getA1()
	{
		return new A(2,3);
	}
}
class FactoryDemo
{
	public static void main(String[] arr)	
	{
		A x=A.getA();
		A y=A.getA1();		
		x.show();
		y.show();
	}
}
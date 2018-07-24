class A
{
	int a,b;
	public A()
	{
		a=2;
		b=4;
	}	
	public A(int x,int y)
	{
		a=x;
		b=y;
	}
	public void show()
	{
		System.out.println(a+" "+b);
	}
	//factory methods
	public static A getA1()
	{
		return new A();	
	}
	public static A getA2(int x,int y)	
	{
		return new A(x,y);
	}
}
class FactoryDemo
{
	public static void main(String[] arr)
	{
		A x=A.getA1();
		A y=A.getA2(5,6);
		x.show();
		y.show();
	}
}
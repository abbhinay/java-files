class A
{
	public String toString()
	{
		return "from A";
	}	
}
class B
{
	public String toString()
	{
		return "from B";
	}	
}
class C
{
	public String toString()
	{
		return "from C";
	}	
}
class Testing
{
	public static void main(String[] arrr)
	{
		A x=new A();
		B y=new B();
		C z=new C();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

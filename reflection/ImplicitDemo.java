class A
{
	static{
		System.out.println("A is loaded");
	}
}
class ImplicitDemo
{
	static{
		System.out.println("main class is loaded");
	}
	public static void main(String[] arr)
	{
		A x=new A();
	}
}

final class A
{
	private final int a;
	private static A ref;
	private A()
	{
		a=10;
	}
	public int getA()
	{
		return a;
	}
	public static A getObject()
	{
		if(ref==null)
		return new A();
		else	
		return ref;
	}
}
class ImmutableTest
{
	public static void main(String[] ar)
	{
		A x=A.getObject();
		System.out.println(x.getA());
		x.a=20;	
	}
}

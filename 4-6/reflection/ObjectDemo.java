class A
{
	static{
		System.out.println("A is loaded");
	}
	public A()
	{
		System.out.println("A is instatiated");
	}
}
class B
{
	static{
		System.out.println("B is loaded");
	}
	public B()
	{
		System.out.println("B is instatiated");
	}
}
class C
{
	static{
		System.out.println("C is loaded");
	}
	public C()
	{
		System.out.println("C is instatiated");
	}
}
class ObjectDemo
{
	static{
		System.out.println("main is loaded");
	}
	public static void main(String[] arr)
	{
		try{
		Class c=Class.forName(arr[0]);
		Object o=c.newInstance();
		System.out.println("indirectly creating an obj of a class: "+c.getName());
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}




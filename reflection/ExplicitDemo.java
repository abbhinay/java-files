class A
{
	static{
		System.out.println("A is loaded");
	}
}
class B
{
	static{
		System.out.println("B is loaded");
	}
}
class C
{
	static{
		System.out.println("C is loaded");
	}
}
class ExplicitDemo
{
	static{
		System.out.println("main is loaded");
	}
	public static void main(String[] arr)
	{
		try{
		Class c=Class.forName(arr[0]);
		System.out.println("explicitly load a class: "+c.getName());
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}




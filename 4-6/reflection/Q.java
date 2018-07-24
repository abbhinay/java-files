import java.lang.reflect.*;
class P
{
	private void show()
	{
		System.out.println("show invoked");
	}
}
class Q
{
	public static void main(String[] arr)
	{
		try{
		Class c=Class.forName(arr[0]);
		Object o=c.newInstance();
		Method m=c.getDeclaredMethod("show",null);
		m.setAccessible(true);
		m.invoke(o,null);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
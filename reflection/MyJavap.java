import java.lang.reflect.*;
class MyJavap
{
	public static void main(String[] arr)
	{
		try{
		Class c=Class.forName(arr[0]);
		Field[] f=c.getDeclaredFields();
		Constructor[] con=c.getDeclaredConstructors();
		Method[] m=c.getDeclaredMethods();
		int i;
		for(i=0;i<f.length;i++)
		System.out.println(f[i]);
		
		for(Constructor r:con)//enhanced forr loop
		System.out.println(r);

		for(i=0;i<m.length;i++)
		System.out.println(m[i]);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
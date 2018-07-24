import java.io.*;
class DirDemo
{
	public static void main(String[] arr)
	{
		try{
		File f=new File(arr[0]);
		if(f.isFile())
		{
			System.out.println("It is not a dir");
		}
		else
		{
			String [] a=f.list();
			for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
 

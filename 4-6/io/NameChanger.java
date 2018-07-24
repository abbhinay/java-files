import java.io.*;
class NameChanger
{
	public static void main(String[] arr)
	{
		try{
		File f=new File(arr[0]);
		if(!f.exists())
		{
			System.out.println("Does not exists");
		}
		else
		{
			if(f.renameTo(new File(arr[1])))
			System.out.println("successfully renamed");
			else
			System.out.println("sorry can't be renamed");
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
 

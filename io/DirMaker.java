import java.io.*;
class DirMaker
{
	public static void main(String[] arr)
	{
		try{
		File f=new File(arr[0]);
		if(f.exists())
		{
			System.out.println("Already exists");
		}
		else
		{
			if(f.mkdir())
			System.out.println("successfully created");
			else
			System.out.println("sorry can't be created");
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
 

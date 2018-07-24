import java.io.*;
class ReadDemo2
{
	public static void main(String[] arrr)
	{
		try{
		FileInputStream f=new FileInputStream(arrr[0]);
		byte[] b=new byte[f.available()];
		f.read(b);
		System.out.println(new String(b));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
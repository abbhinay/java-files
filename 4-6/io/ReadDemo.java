import java.io.*;
class ReadDemo
{
	public static void main(String[] arr)
	{
		try{	
		FileInputStream fin=new FileInputStream(arr[0]);
		int ch;
		while(true)
		{
			ch=fin.read();
			if(ch==-1)//EOF
			break;
			System.out.print((char)ch);
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
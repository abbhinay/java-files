import java.io.*;
class SequenceDemo
{
	public static void main(String[] arr)
	{
		try{	
		SequenceInputStream fin=new SequenceInputStream
		(new FileInputStream(arr[0]),new FileInputStream(arr[1]));
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
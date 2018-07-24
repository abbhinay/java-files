import java.io.*;
class ReadDemo1
{
	public static void main(String[] arr)
	{
		try{	
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(arr[0])));
		String line;
		while(true)
		{
			line=br.readLine();
			if(line==null)//EOF
			break;
			System.out.println(line);
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
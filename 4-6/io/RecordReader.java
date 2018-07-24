import java.io.*;
import java.util.*;
class RecordReader
{
	public static void main(String[] arrr)
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("student.txt")));
		String data;
		while(true)
		{
			data=br.readLine();
			if(data==null)
			break;
			show(data);
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void show(String s)
	{
		StringTokenizer st=new StringTokenizer(s,",");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken()+" "+st.nextToken()+" "+st.nextToken());
		}
	}
}
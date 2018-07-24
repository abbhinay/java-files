import java.util.*;
import java.io.*;
class PropReader
{
	public static void main(String[] arr)throws IOException
	{
		Properties p=new Properties();
		FileInputStream f=new FileInputStream("student.properties");
		p.load(f);
		Set s=p.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}

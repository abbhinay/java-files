import java.util.*;
import java.io.*;
class MapDemo1
{
	public static void main(String[] arr)throws IOException
	{
		HashMap hs=new HashMap();
		hs.put("anmol","developer");
		hs.put("ravi","DBA");
		hs.put("sachin","app-devp");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name, to find the profile,end to finish");
		while(true)
		{
			String name=br.readLine();
			if(name.equals("end"))
			break;
			System.out.println("proofile is: "+hs.get(name));
		}
	}
}
import java.util.*;
import java.io.*;
class PropSaver
{
	public static void main(String[] arr)throws IOException
	{
		Properties p=new Properties();
		FileOutputStream out=new FileOutputStream("emp.properties");
		p.setProperty("ravi","developer");
		p.setProperty("anmol","DBA");
		p.put("sachin","app-devp");
		p.store(out,"EMP");
		System.out.println("successfully stored");
	}
}

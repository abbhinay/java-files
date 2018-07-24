import java.io.*;
class SerializeDemo
{
	public static void main(String[] arr)
	{
		try
		{
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.txt"));
			System.out.println("creating obj to be serialize");
			Emp e=new Emp(101,"abc",10000);
			Emp f=new Emp(102,"xyz",12000);
			System.out.println("details....");
			e.show();
			f.show();
			out.writeObject(e);
			out.writeObject(f);
			Thread.sleep(2000);
			System.out.println("successfully serialized...");
			out.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
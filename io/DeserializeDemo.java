import java.io.*;
class DeserializeDemo
{
	public static void main(String[] arr)
	{
		try{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.txt"));
		System.out.println("following obj are deserialized");
		Emp p=(Emp)in.readObject();
		Emp q=(Emp)in.readObject();
		p.show();
		q.show();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
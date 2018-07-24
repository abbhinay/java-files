import java.io.*;
class WriteDemo
{
	public static void main(String[] arrr)
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new FileOutputStream("abc.txt"));
		String data;
		System.out.println("enter data,press end to finish");
		while(true)
		{
				data=br.readLine();
				if(data.equals("end"))
					break;
				pw.println(data);
		}
		pw.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
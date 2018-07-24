import java.io.*;
class RecordSaver
{
	public static void main(String[] arrr)
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new FileOutputStream("student.txt",true));
		String data;
		System.out.println("enter name,course,fees of a student seprated by comma,press end to finish");
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
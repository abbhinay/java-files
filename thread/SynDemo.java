class Buffer
{
	public synchronized void print(char ch)
	{
		//half line is print
		for(int i=1;i<=30;i++)
		{
			System.out.print(ch);
		}
		try{
			Thread.sleep(2000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		//remaining half line print
		for(int j=1;j<=30;j++)
		{
			System.out.print(ch);
		}
		//new line printed
		System.out.println();
	}
}
class StarPrinter extends Thread
{
	Buffer b;
	public StarPrinter(Buffer b)	
	{
		this.b=b;
	}
	public void run()
	{
		System.out.println("starprinter starts");
		b.print('*');
		System.out.println("starprinter finished");
	}
}
class HashPrinter extends Thread
{
	Buffer b;
	public HashPrinter(Buffer b)	
	{
		this.b=b;
	}
	public void run()
	{
		System.out.println("hashprinter starts");
		b.print('#');
		System.out.println("hashprinter finished");
	}
}
class SynDemo
{
	public static void main(String[] arr)
	{
		System.out.println("creating Buffer,starting star&hash printer");
		Buffer b=new Buffer();
		StarPrinter st=new StarPrinter(b);
		HashPrinter hs=new HashPrinter(b);
		st.start();
		hs.start();
	}
}
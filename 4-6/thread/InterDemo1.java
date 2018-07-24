class Buffer
{
	int a;
	boolean flag=false;
	public synchronized void write(int x)
	{
		if(flag)
		{
			System.out.println("writer enter monitor trun out of suspending...");
			try{
				wait();
			}catch(Exception e){}
		}
		a=x;
		System.out.println(a+" is written");
		flag=true;
		notify();
	}
	public synchronized void read()
	{
		if(!flag)
		{
			System.out.println("reader enter monitor trun out of suspending...");
			try{
				wait();
			}catch(Exception e){}
		}	
		System.out.println(a+" is read");
		flag=false;
		notify();
	}
}
class WriterThread extends Thread
{
	Buffer b;
	public WriterThread(Buffer b)
	{
		this.b=b;
	}
	public void run()
	{
		System.out.println("writer starts");
		for(int i=1;i<=10;i++)
		b.write(i);
	}
}
class ReaderThread extends Thread
{
	Buffer b;
	public ReaderThread(Buffer b)
	{
		this.b=b;
	}
	public void run()
	{
		System.out.println("reader starts");
		for(int i=1;i<=10;i++)
		b.read();
	}
}
class InterDemo1
{
	public static void main(String[] arr)
	{
		System.out.println("creating Buffer,Writer&Reader thread");
		Buffer b=new Buffer();
		WriterThread wt=new WriterThread(b);
		ReaderThread rt=new ReaderThread(b);
		wt.start();
		rt.start();
	}
}
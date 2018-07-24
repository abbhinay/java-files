class Buffer
{
	int a;
	public synchronized void write(int x)
	{
		a=x;
		System.out.println(a+" is written");
	}
	public synchronized void read()
	{
		System.out.println(a+" is read");
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
class InterDemo
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
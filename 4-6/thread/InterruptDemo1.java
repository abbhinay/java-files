class MyThread extends Thread
{
	public MyThread(String s)
	{	
		super(s);
	}
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" thread starts");
		System.out.println(name+" thread suspend");
		try{
			Thread.sleep(1000);
			System.out.println(name+" thread resumed");
			System.out.println(name+" thread exited");
		}catch(Exception e)
		{
			System.out.println(name+" thread interrupted");
		}
	}
}
class InterruptDemo1
{
	public static void main(String[] arr)
	{
		System.out.println("starting two lazy thread & give 5sec to complete");
		MyThread t1=new MyThread("lucifer");
		MyThread t2=new MyThread("fred");
		t1.start();
		t2.start();
		try{
			Thread.sleep(5000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		if(t1.isAlive())
		{
			System.out.println("lazy taking too long interrupt it");
			t1.interrupt();
			t2.interrupt();
		}
	}
}
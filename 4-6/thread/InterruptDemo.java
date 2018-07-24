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
class InterruptDemo
{
	public static void main(String[] arr)
	{
		System.out.println("starting a lazy thread & give 5sec to complete");
		MyThread t=new MyThread("lucifer");
		t.start();
		try{
			Thread.sleep(5000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		if(t.isAlive())
		{
			System.out.println("lazy taking too long interrupt it");
			t.interrupt();
		}
	}
}
class DaemonDemo extends Thread
{
	public void run()
	{
		Thread t=Thread.currentThread();
		if(t.isDaemon())
		System.out.println("It is daemon thread");
		else
		System.out.println("It is not daemon thread");
	}
	public static void main(String[] arr)
	{
		DaemonDemo t1=new DaemonDemo();
		DaemonDemo t2=new DaemonDemo();
		DaemonDemo t3=new DaemonDemo();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}
}




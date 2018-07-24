class MyThread extends Thread
{
	public void run()	
	{
		System.out.println("child thread starts");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try{
				Thread.sleep(2000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("child thread finished");
	}	
}
class MultiDemo
{
	public static void main(String[] arr)
	{
		System.out.println("starting a main & child thread");
		MyThread t=new MyThread();
		t.start();
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
			try{
			//Thread.sleep(2000);
			t.join();
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("main thread finished");
	}
}
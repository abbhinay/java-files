class MyThread extends Thread
{
	public MyThread(ThreadGroup g,String s)
	{	
		super(g,s);
	}
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" thread starts");
		System.out.println(name+" thread suspend");
		try{
			Thread.sleep(10000);
			System.out.println(name+" thread resumed");
			System.out.println(name+" thread exited");
		}catch(Exception e)
		{
			System.out.println(name+" thread interrupted");
		}
	}
}
class GrpDemo
{
	public static void main(String[] arr)
	{
		System.out.println("starting two lazy thread & give 5sec to complete");
		ThreadGroup g=new ThreadGroup("mygrp");
		MyThread t1=new MyThread(g,"lucifer");
		MyThread t2=new MyThread(g,"fred");
		t1.start();
		t2.start();
		try{
			Thread.sleep(5000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		if(g.activeCount()>0)
		{
			System.out.println("lazy taking too long interrupt it");
			g.interrupt();
		}
	}
}
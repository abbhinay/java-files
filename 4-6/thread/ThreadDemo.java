class ThreadDemo
{
	public static void main(String[] arr)
	{
		System.out.println("Obtain the reference of current thread");
		Thread t=Thread.currentThread();
		System.out.println("It is "+t.getName()+" & its priority is "+t.getPriority());
		System.out.println("change its name & priority");
		t.setName("lucifer");
		t.setPriority(7);
		System.out.println("sleep it for 5 sec");
		try{
			Thread.sleep(2000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(t.getName()+" thread is resumed with priority "+t.getPriority());
	}
}

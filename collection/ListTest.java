import java.util.*;
class ListTest
{
	static Iterator e;
	public static void main(String[] arr)
	{
		ArrayList list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("There are "+list.size()+" elements in listector");
		System.out.println("Creating a thread to traverse elements of list");
		e=list.iterator();
		Thread t=new Thread()//anonymous starts
		{
			public void run()
			{
				while(e.hasNext())
				{
					System.out.println(e.next());
					try{
						Thread.sleep(2000);
					}catch(Exception e)
					{
					System.out.println(e);
					}
				}
			}
		};//anonymous ends
		System.out.println("starting thread to display elements");
		t.start();
		try{
			Thread.sleep(2000);
		}catch(Exception e)
		{
		System.out.println(e);
		}
		System.out.println("remove D & add E in the list");
		list.remove("D");
		list.add("E");
	}
}

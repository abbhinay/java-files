import java.util.*;
class VectorTest
{
	static Enumeration e;
	public static void main(String[] arr)
	{
		Vector v=new Vector();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		v.addElement("D");
		System.out.println("There are "+v.size()+" elements in vector");
		System.out.println("Creating a thread to traverse elements of vector");
		e=v.elements();
		Thread t=new Thread()//anonymous starts
		{
			public void run()
			{
				while(e.hasMoreElements())
				{
					System.out.println(e.nextElement());
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
		System.out.println("removing D & add E in the vector");
		v.removeElement("D");
		v.addElement("E");
	}
}

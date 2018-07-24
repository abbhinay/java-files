import java.util.*;
class SetDemo
{
	public static void main(String[] arr)
	{
		HashSet hs=new HashSet();
		     System.out.println("There are "+hs.size()+" elements in hs");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		TreeSet ts=new TreeSet();
		ts.addAll(hs);
		itr=ts.iterator();
		System.out.println("elements of treeset");	
		while(itr.hasNext())
		System.out.println(itr.next());
	}
}



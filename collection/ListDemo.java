import java.util.*;
class ListDemo
{
	public static void main(String[] arr)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("anmol");
		list.add("sachin");
		list.add("zaid");
		list.add("ravi");
		list.add("sachin");
		//list.add(new Integer("2"));
		System.out.println("There are "+list.size()+" elements in list");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*System.out.println("searching of ravi in the list is: "+list.contains("ravi"));
		System.out.println("remove ravi in the list");
		list.remove("ravi");
		System.out.println("now search result of sachin in list is: "+list.contains("ravi"));*/
		ListIterator ltr=list.listIterator(list.size());
		System.out.println("elements in reverse order");
		while(ltr.hasPrevious())
		System.out.println(ltr.previous());
	}
}



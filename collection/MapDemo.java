import java.util.*;
class MapDemo
{
	public static void main(String[] arr)
	{
		HashMap hs=new HashMap();
		hs.put("anmol","developer");
		hs.put("ravi","DBA");
		hs.put("sachin","app-devp");
		System.out.println("There are "+hs.size()+" value in Map");
		Set s=hs.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
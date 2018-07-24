import java.util.*;
class VectorDemo
{
	public static void main(String[] arr)
	{
		Vector v=new Vector();
		v.addElement("anmol")	;
		v.addElement("ravi");
		v.add("sachin");
		v.add(1,"zaid");
		v.add("ravi");
		System.out.println("There are "+v.size()+" elements in vector");
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}

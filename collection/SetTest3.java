import java.util.*;
class Student implements Comparable
{
	String name,course;
	int fees;
	public Student(String x,String y,int z)
	{
		name=x;
		course=y;
		fees=z;
	}
	public void show()
	{
		System.out.println(name+" "+course+" "+fees);
	}
	public boolean equals(Object o)
	{
		Student s=(Student)o;	
		return name.equals(s.name)&&course.equals(s.course)&&fees==s.fees;
	}
	public int hashCode()
	{
		return name.hashCode()+course.hashCode()+fees;
	}
	public int compareTo(Object o)
	{
		Student t=(Student)o;
		return course.compareTo(t.course);
	}

}
class SetTest3
{
	public static void main(String[] arr)
	{
		TreeSet list=new TreeSet();
		list.add(new Student("zaid","android",5000));
		list.add(new Student("anmol","spring",6000));
		list.add(new Student("sachin","hibernate",7000));
		System.out.println("There are "+list.size()+" elements in list");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Student s=(Student)itr.next();
			System.out.println(s.hashCode());
			s.show();
		}
		Student temp=new Student("sachin","hibernate",7000);
		System.out.println("details of temp");
		System.out.println(temp.hashCode());
		temp.show();
		System.out.println("searching result of temp in the list is: "+list.contains(temp));
	}
}
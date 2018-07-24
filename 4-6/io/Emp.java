import java.io.*;
class Emp implements Serializable
{
	int id;
	String n;
	int sal;
	int telno;
	private static final long serialVersionUID=12l;
	public Emp(int x,String y,int z)	
	{
		id=x;
		n=y;
		sal=z;
	}
	public void show()
	{
		System.out.println(id+" "+n+" "+sal);
	}
}
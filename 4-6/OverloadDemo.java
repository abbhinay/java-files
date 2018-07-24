import java.util.*;
class Shape
{
	public void area()
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter radius");
		int r=sc.nextInt();
		double a=3.14*r*r;
		System.out.println("area of circle="+a);
	}
	public void area(int x)
	{
		System.out.println("area of squ is: "+(x*x));
	}
	public void area(int x,int y)
	{
		System.out.println("area of tri is: "+(0.5*x*y));
	}
}
class OverloadDemo
{
	public static void main(String[] arr)
	{
		Shape s=new Shape();
		s.area();
		s.area(4);
		s.area(5,4);
	}
}
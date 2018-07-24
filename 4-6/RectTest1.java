import java.util.Scanner;
class Rectangle
{
	//attribute
	private int l,b;
	//behavior
	public void show()
	{
		System.out.println("length="+l);
		System.out.println("breadth="+b);
	}
	public int area()
	{
		return l*b;
	}
	public void setDimension(int x,int y)//definition
	{
		l=x;
		b=y;
	}
}
class RectTest1
{	
	public static void main(String[] arr)
	{
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length & breadth");
		int a=sc.nextInt();
		int b=sc.nextInt();
		r.setDimension(a,b);//method call
		r.show();
		System.out.println("area of the rect is: "+r.area());
	}
}  
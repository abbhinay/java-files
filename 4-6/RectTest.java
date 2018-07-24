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
class RectTest
{	
	public static void main(String[] arr)
	{
		Rectangle r=new Rectangle();
		r.setDimension(2,5);//method call
		r.show();
		System.out.println("area of the rect is: "+r.area());
	}
}  
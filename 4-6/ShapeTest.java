class Common
{
	int l,b;
	public Common(int x,int y)
	{
		l=x;
		b=y;
	}
	public void show()
	{
		System.out.println("length="+l);
		System.out.println("breadth="+b);
	}
}
class Rect extends Common
{
	public Rect(int x,int y)
	{
		super(x,y);
	}
	public void area()
	{
		System.out.println("area of the rect is: "+(l*b));
	}
}
class Cuboid extends Common
{
	int l;
	public Cuboid(int x,int y,int z)
	{
		super(x,y);
		l=z;
	}	
	public void show()
	{
		super.show();
		System.out.println("height="+l);
	}
	public void volume()
	{
		System.out.println("volume of cuboid is: "+(super.l*b*l));
	}
}
class ShapeTest
{
	public static void main(String[] arr)
	{
		Rect r=new Rect(2,4);
		r.show();
		r.area();
		Cuboid c=new Cuboid(4,5,6);
		c.show();
		c.volume();
	}
}
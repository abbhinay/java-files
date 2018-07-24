class Outer
{
	private  int a;
	public Outer()
	{
		a=10;
	}
	public void show()
	{
		System.out.println("a in outer="+a);
	}
	public int getA()
	{
		return a;
	}
	//inner class starts
	class Inner
	{
		int b;
		Outer ref;
		public Inner(int x)
		{
			b=x;
			ref=new Outer();
		}
		public void display()
		{
			System.out.println("a in inner="+ref.getA());
			System.out.println("b="+b);
		}
	}//inner finish
}
class InnerDemo3
{
	public static void main(String[] arr)
	{
		Outer x=new Outer();
		x.show();
		Outer.Inner y=x.new Inner(20);
		y.display();	
	}
}
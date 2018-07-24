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
	//inner class starts
	class Inner
	{
		int b;
		public Inner(int x)
		{
			b=x;
		}
		public void display()
		{
			System.out.println("a in inner="+a);
			System.out.println("b="+b);
		}
	}//inner finish
}
class InnerDemo2
{
	public static void main(String[] arr)
	{
		Outer x=new Outer();
		x.show();
		Outer.Inner y=x.new Inner(20);
		y.display();	
	}
}
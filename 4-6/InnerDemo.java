class Outer
{
	private static int a;
	static{
		a=10;
	}
	public static void show()
	{
		System.out.println("a in outer="+a);
	}	
	//inner class starts
	static class Inner
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
class InnerDemo
{
	public static void main(String[] arr)
	{
		Outer.show();
		Outer.Inner ref=new Outer.Inner(20);
		ref.display();		
	}
}
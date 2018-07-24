class Swapper
{
	int a,b;
	public Swapper(int x,int y)
	{
		a=x;
		b=y;
		//return this implicitly
	}
	public Swapper show()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		return this;//to facilitate method chaining
	}
	public Swapper swap()
	{	
		int t;
		t=a;
		a=b;
		b=t;
		return this;//to facilitate method chaining
	}
}
class SwapperTest
{
	public static void main(String[] arr)
	{
		//Swapper s=new Swapper(10,20);
		//conventional approach
		/*s.show();
		s.swap();
		s.show();*/
		//method chaining approach
		//s.show().swap().show();
		//constructor & method chaining together
		new Swapper(10,20).show().swap().show();
	}
}
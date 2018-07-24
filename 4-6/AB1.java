class AB1
{
	int a,b;
	public AB1()
	{
		this(2,4);
		System.out.println("default const invoked");
		
	}
	public AB1(int a)
	{
		this(a,4);
		System.out.println("one arg const invoked");	
	}
	public AB1(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("two arg const invoked");
	}
	public void show()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String[] arr)
	{
		AB1 x=new AB1();
		x.show();
		AB1 y=new AB1(3);
		y.show();
		AB1 z=new AB1(5,6);
		z.show();
	}	
}
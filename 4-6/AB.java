class AB
{
	int a,b;
	public AB(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void show()
	{	
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
	public static void main(String[] arr)
	{
		AB x=new AB(2,4);
		x.show();
	}
}

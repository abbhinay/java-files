class BoxingDemo
{
	public static void main(String[] arr)
	{
		int a=10;
		Integer i=new Integer(a);
		System.out.println(i+" "+i.intValue());
		int b=i;
		System.out.println(b);
	}
}
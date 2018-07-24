class StringDemo2
{
	public static void main(String[] arr)
	{
		int a=10;
		byte b=3;
		short c=12;
		long d=45l;
		char e='Q';
		float f=12.3f;
		double g=2.5;
		Integer i=new Integer(a);
		//show(String.valueOf(a));
		show(i.toString());
		show(String.valueOf(b));	
		show(String.valueOf(c));
		show(String.valueOf(d));
		show(String.valueOf(e));
		show(String.valueOf(f));
		show(String.valueOf(g));
	}
	public static void show(String s)
	{
		System.out.println(s);
	}
}
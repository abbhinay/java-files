class StringDemo
{
	public static void main(String[] arr)
	{
		String s1=new String();
		String s2=new String("aligarh");
		char[] c={'a','b','c','d','e'};
		String s3=new String(c);
		String s4=new String(c,0,3);
		byte[] b={65,66,67,68,69};
		String s5=new String(b);
		String s6=new String(b,1,2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
}
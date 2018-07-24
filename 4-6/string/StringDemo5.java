class StringDemo5
{
	public static void main(String[] arr)
	{
		String s1="aligarh";
		String s2=new String("aligarh");
		String s3="aligarh";
		String s4=new String("aligarh").intern();
		String s5=new String("aligarh");
		System.out.println("......compare with s1.........");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println("......compare with s2.........");
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s5);
		System.out.println("......compare with s3.........");
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println("......compare with s4.........");
		System.out.println(s4==s5);		
	}
}
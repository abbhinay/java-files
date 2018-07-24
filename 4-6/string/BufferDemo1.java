class BufferDemo1
{
	public static void main(String[] arr)
	{
		StringBuffer s2=new StringBuffer("aligarh");
		StringBuffer s3=new StringBuffer(10);
		s2.append("city");
		System.out.println(s2);
		System.out.println(s2.reverse().reverse().insert(1,2.5f));
		String str=s2.toString();
		System.out.println(str);
		s3.append("aaaaaaaaaaavvvvvvvvvvvk");
		System.out.println(s3.capacity()+"\t"+s3.length());
	}
}
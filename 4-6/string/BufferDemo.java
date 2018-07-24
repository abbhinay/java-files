class BufferDemo
{
	public static void main(String[] arr)
	{
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer("aligarh");
		StringBuffer s3=new StringBuffer(10);
		System.out.println(s1.capacity());
		System.out.println(s2.capacity());
		System.out.println(s3.capacity());
	}
}
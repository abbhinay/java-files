class First
{
	static{
		main();
	}
	public static void main(String arr[])
	{
		System.out.println("jre specific main invoked");	
	}
	public static void main()
	{
		System.out.println("my main invoked");
	}
}
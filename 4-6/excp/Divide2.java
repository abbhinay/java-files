class Divide2
{
	public static int divide(int x,int y)
	{
		try{
			return x/y;
		}catch(ArithmeticException e)
		{
			System.out.println("excp caught in divide rethrow it...");
			throw(e);
		}
	}
	public static void main(String[] arr)
	{
		try{
		int a=Integer.parseInt(arr[0]);
		int b=Integer.parseInt(arr[1]);
		int c=divide(a,b);
		System.out.println("result="+c);
		}catch(Exception e)
		{
			System.out.println("excp caught in main");
			System.out.println(e);
		}
	}
}
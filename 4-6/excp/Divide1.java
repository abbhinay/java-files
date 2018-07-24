class Divide1
{
	public static void main(String[] arr)
	{
		try{
		if(arr.length<2)
		throw(new ArrayIndexOutOfBoundsException());
		int a=Integer.parseInt(arr[0]);
		int b=Integer.parseInt(arr[1]);
		if(b==0)
		throw(new ArithmeticException("dusara number zero pass mat kr"));
		int c=a/b;
		System.out.println("result="+c);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
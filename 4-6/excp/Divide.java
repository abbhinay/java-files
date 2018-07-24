class Divide
{
	public static void main(String[] arr)
	{
		try{
		int a=Integer.parseInt(arr[0]);
		int b=Integer.parseInt(arr[1]);
		int c=a/b;
		System.out.println("result="+c);	
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("second no should not be zero");
		}	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("plz provide two arguments");
		}
		catch(NumberFormatException e)
		{
			System.out.println("provide only numbers");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}	
		finally{	
			System.out.println("finally invoked");
		}
	}
}
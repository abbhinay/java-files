class MyException extends Exception
{
	String msg;
	public MyException()
	{
		msg="my deault excp";
	}
	public MyException(String a)
	{
		msg=a;
	}
	public String toString()
	{
		return msg;
	}
}
class CustomDemo
{
	public static void main(String[] arr)
	{
		try{
			System.out.println("throwing custom excp...");
			throw(new MyException("my arg excp"));
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
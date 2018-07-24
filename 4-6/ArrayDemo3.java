class ArrayDemo3
{
	public static void main(String[] arr)	
	{
		show(new String[]{"aligarh","delhi","noida","pune"});
	}
	public static void show(String[] a)
	{
		/*for(int i=0;i<a.length;i++)		
		{
			System.out.println(a[i]);
		}*/
		for(String t:a)//enhanced for loop
		System.out.println(t);
	}
}
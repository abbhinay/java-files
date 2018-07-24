class B extends A
{
	public void show()
	{
		xl("from B");//
	}
}
class BindingDemo
{
	public static void main(String[] arr)
	{
		A x=new A();//
		A y=new B();//
		A.display(x);//
		A.display(y);//
	}
}
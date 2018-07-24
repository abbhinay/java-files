package P5;
import P4.A;
class B extends A
{
	public void show()
	{
		super.show();
	}		
}
public class C
{
	public static void main(String[] arr)
	{
		B x=new B();
		x.show();
	}
}
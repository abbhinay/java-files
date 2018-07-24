import java.util.*;
class Account
{
	//attributes
	int acno,bal;
	String n;
	//behavior
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data");
		acno=sc.nextInt();
		n=sc.next();
		bal=sc.nextInt();
	}	
	public void showData()
	{
		System.out.println(acno+" "+n+" "+bal);
	}
}
class BAnkDemo
{
	public static void main(String[] arr)
	{
		Account t=new Account();
		t.setData();
		t.showData();
	}
}
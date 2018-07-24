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
class BAnkDemo1
{
	public static void main(String[] arr)
	{
		Account[] t=new Account[3];//account type refrence variables array
		int i;
		for(i=0;i<3;i++)
		{
			t[i]=new Account();
			t[i].setData();
		}
		for(i=0;i<3;i++)
		{
			t[i].showData();
		}
	}
}
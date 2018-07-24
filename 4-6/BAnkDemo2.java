import java.util.*;
class Account
{
	//attributes
	private int acno,bal;
	private String n;
	Scanner sc=new Scanner(System.in);
	//behavior
	public void setData()
	{
		System.out.println("enter data");
		acno=sc.nextInt();
		n=sc.next();
		bal=sc.nextInt();
	}	
	public void showData()
	{
		System.out.println(acno+" "+n+" "+bal);
	}
	public int getacno()
	{
		return acno;
	}
	public void withdraw()	
	{
		System.out.println("enter amount to withdraw");
		int amt=sc.nextInt();
		if(bal-amt>=500)
		{
			bal=bal-amt;
			System.out.println("successfully withdrawled");
		}
		else
		System.out.println("not enough bal to withdrawl");
	}
	public void deposit()
	{
		System.out.println("enter amount to deposit");
		int amt=sc.nextInt();	
		bal=bal+amt;
		System.out.println("successfully deposited");
	}
}
class BAnkDemo2
{
	public static void main(String[] arr)
	{
		Account[] t=new Account[3];//account type refrence variables array
		int i,n,f,choice;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("1:Add Account\n2:Show Accounts Data\n3:Withdrawl\n4:Deposit\n5:Exit\nEnter ur choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				for(i=0;i<3;i++)
				{
					t[i]=new Account();
					t[i].setData();
				}
				break;
			case 2:
				for(i=0;i<3;i++)
				{
					t[i].showData();
				}
				break; 
			case 3:
				f=0;
				System.out.println("enter acno to withdraw money");
				n=sc.nextInt();
				for(i=0;i<3;i++)
				{
					if(n==t[i].getacno())
					{
						f=1;
						t[i].withdraw();
						break;
					}
				}
				if(f==0)
				System.out.println("acno not not matched");
				break;
			case 4:
				f=0;
				System.out.println("enter acno to deposit money");
				n=sc.nextInt();
				for(i=0;i<3;i++)
				{
					if(n==t[i].getacno())
					{
						f=1;
						t[i].deposit();
						break;
					}
				}
				if(f==0)
				System.out.println("acno not matched");
				break;

		}
		}while(choice!=5);		
	}
}
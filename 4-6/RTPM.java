abstract class Account
{
	double bal;
	String n;
	public Account(String x,double y)
	{
		n=x;
		bal=y;	
	}
	public final void deposit(double amt)
	{
		bal=bal+amt;
	}
	public final void show()
	{
		System.out.println("account_name="+this.n);
		System.out.println("bal="+this.bal);
		System.out.println("type="+this.getClass().getName());
		System.out.println("rate="+this.getIntrestRate());
	}
	public abstract double getIntrestRate();
	//generalized method for all the account family
	public static void creditIntrest(Account t)
	{
		double ir=t.getIntrestRate();
		ir=((t.bal*(ir/4))/100);
		t.deposit(ir);
	}
}
class Saving extends Account
{
	public Saving(String x,double y)
	{
		super(x,y);
	}	
	public double getIntrestRate()
	{
		return 4;
	}
}
class Fixed extends Account
{
	public Fixed(String x,double y)
	{
		super(x,y);
	}	
	public double getIntrestRate()
	{
		return 7;
	}
}
class RTPM
{
	public static void main(String[] arr)
	{
		System.out.println("creating some account objects...");
		Saving r=new Saving("abc",10000);
		Fixed s=new Fixed("xyz",12000);
		Saving t=new Saving("pqr",14000);
		r.show();
		s.show();
		t.show();	
		System.out.println("crediting intrest in accounts");
		Account.creditIntrest(r);
		Account.creditIntrest(s);
		Account.creditIntrest(t);
		System.out.println("details after intrest credited");
		r.show();
		s.show();
		t.show();	
	}
}
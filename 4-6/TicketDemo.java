class Ticket
{
	//instance attribute
	int no;
	//static member(attribute)
	 static int counter;
	//static initialization
	static{
		counter=0;
	}
	//instance initialization
	public Ticket()
	{
		no=++counter;
	}
	public static void showCounter()
	{
		System.out.println("total count of tickets="+counter);
	}	
	public void showTicketNo()
	{
		System.out.println("It is ticket no="+no);
	}
}
class TicketDemo
{
	public static void main(String[] arr)
	{
		System.out.println("creating some ticket objects");
		Ticket t1=new Ticket();
		Ticket t2=new Ticket();
		Ticket t3=new Ticket();
		Ticket t4=new Ticket();
		t1.showTicketNo();
		t2.showTicketNo();
		Ticket.showCounter();
	}
}
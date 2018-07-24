class Room
{	
	int door,area;
	public Room(int x,int y)
	{
		door=x;
		area=y;
	}
	public void show()
	{
		System.out.println("door="+door);
		System.out.println("area="+area);
	}
}
class House
{
	int area;
	Room br,dr;
	//composite obj
	public House(int x)
	{
		area=x;
		br=new Room(2,400);
		dr=new Room(3,600);
	}
	public void display()
	{
		System.out.println("area of the house is "+area+" sq.feet");
		System.out.println("It has one bed-rrom with following description");
		br.show();
		System.out.println("it has one drawing room with following description");
		dr.show();
	}
}
class CompositionDemo
{
	public static void main(String[] arr)
	{
		House h=new House(1000);
		h.display();
	}
}
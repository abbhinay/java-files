import java.net.*;
class IpFinder
{
	public static void main(String[] arr)
	{
	try{
		InetAddress add=InetAddress.getLocalHost();
		System.out.println("machine name="+add.getHostName());
		System.out.println("machine address="+add.getHostAddress());
	}catch(Exception e)	
	{
		System.out.println(e);
	}
	}
}

import java.net.*;
class IpFinder
{
	public static void main(String[] arr)
	{
		try{
		InetAddress x=InetAddress.getLocalHost();
		System.out.println("machine name="+x.getHostName());
		System.out.println("ip="+x.getHostAddress());
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}



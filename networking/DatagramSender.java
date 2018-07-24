import java.io.*;
import java.net.*;
class DatagramSender
{
  public static void main(String s[])
  {
    try
    {
	DatagramSocket sender=new DatagramSocket(3000);
	System.out.println("Sender is ready...");

	BufferedReader br=new BufferedReader(new
	InputStreamReader(System.in));

	while(true)
	{
		System.out.println("Enter msg, (end to terminate): ");
		String str=br.readLine();

		DatagramPacket packet=new DatagramPacket(str.getBytes(), str.length(), InetAddress.getLocalHost(), 4000);

		sender.send(packet);

		if(str.equals("end"))
			break;

		System.out.println("Packet Successfully send");
	}
	sender.close();
    }
    catch(Exception e){ System.out.println(e); }
  }
}
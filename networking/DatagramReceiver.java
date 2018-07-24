import java.io.*;
import java.net.*;
class DatagramReceiver
{
  public static void main(String s[])
  {
    try
    {
	DatagramSocket receiver=new DatagramSocket(4000);
	System.out.println("Receiver is ready, (press ' Ctrl + C ' to terminate) ...");
	while(true)
	{
		System.out.println("Waiting for message...");
		byte msg[]=new byte[100];
		DatagramPacket packet=new DatagramPacket(msg, 100);
		receiver.receive(packet);
		String str=new String(packet.getData());
		String st=new String(str.trim());
		if(st.equals("end"))
		{
			System.out.println("End packet is received...");
			break;
		}
		System.out.println("following packet is received:  "+st);

	}
    }
    catch(Exception e){ System.out.println(e); }
  }
}
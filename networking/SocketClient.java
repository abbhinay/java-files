import java.net.*;
class SocketClient{
	public static void main(String arr[]){
		try{
			System.out.println("Sending connection request...");
			Thread.sleep(5000);
			Socket s=new Socket("localhost",2001);
			Thread.sleep(2000);
 			System.out.println("Request granted, sending message to the server");
			Thread.sleep(5000);
			s.close();
			System.out.println("Connection is closed...");
		}
		catch(Exception e)
		{	 System.out.println(e);	}
	}
}				
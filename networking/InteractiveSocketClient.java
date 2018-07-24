import java.net.*;
import java.io.*;
class InteractiveSocketClient{
	public static void main(String arr[]){
		try{
			System.out.println("Sending connection request...");
			Thread.sleep(5000);
			Socket s=new Socket("localhost",2000);
			Thread.sleep(2000);
 			System.out.println("Request granted, sending message to the server");

			PrintWriter out=new PrintWriter(s.getOutputStream());
			Thread.sleep(5000);
			out.println("Hello Server...");
			out.flush();
 			System.out.println("Message is send and wait for ACK...");

			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg=br.readLine();
			Thread.sleep(1000);
			System.out.println("Server sent following ACK...  " +msg);


			Thread.sleep(5000);
			s.close();
			System.out.println("Connection is closed...");
		}
		catch(Exception e)
		{	 System.out.println(e);	}
	}
}
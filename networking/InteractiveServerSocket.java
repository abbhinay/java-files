import java.io.*;
import java.net.*;

class InteractiveServerSocket{
	public static void main(String s[]){
		try{
			ServerSocket server=new ServerSocket(2000);
			System.out.println("Server is started and wait for a connection request");
			Socket t=server.accept();
			System.out.println("Request received and Connection accepted");

			BufferedReader br=new BufferedReader(new InputStreamReader(t.getInputStream()));
			String msg=br.readLine();
			Thread.sleep(3000);
			System.out.println("Client's Message: "+msg);
			Thread.sleep(2000);
			System.out.println("Sending ACK...");

			PrintWriter out=new PrintWriter(t.getOutputStream());
			Thread.sleep(5000);
			out.println("Hi, client your message is recieved...");
			out.flush();
			System.out.println("ACK Sent...");
			
			Thread.sleep(2000);
			 System.out.println("Connection is closed...");
		}
		catch(Exception e)
		{	 System.out.println(e);	}
	}
}				
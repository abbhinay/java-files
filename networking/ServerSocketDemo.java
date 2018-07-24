import java.io.*;
import java.net.*;

class ServerSocketDemo{
	public static void main(String s[]){
		try{
			ServerSocket server=new ServerSocket(2000);
			Socket t=server.accept();
			System.out.println("Request received and Connection accepted");
			Thread.sleep(2000);
			 System.out.println("Connection is closed...");
		}
		catch(Exception e)
		{	 System.out.println(e);	}
	}
}				
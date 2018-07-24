import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet
{
	public void init()
	{
		setBackground(Color.RED);
		setForeground(Color.BLUE);
		setFont(new Font("Arial",Font.BOLD,25));
	}	
	public void start()
	{
		System.out.println("start invoked");
	} 
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Applet",20,40);
	}
	public void stop()
	{
	System.out.println("stop invoked");
	}
	public void destroy()
	{
	System.out.println("destroy invoked");
	}
}
	

import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet
{
	public void init()
	{
		setBackground(Color.BLUE);
		setForeground(Color.RED);
		setFont(new Font("Arial",Font.BOLD,30));
	}
	public void start()
	{
		System.out.println("start invoked");
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello Applet",30,50);
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

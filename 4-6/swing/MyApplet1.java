import java.awt.*;
import java.applet.*;
public class MyApplet1 extends Applet
{
	String str;
	public void init()
	{
		setBackground(Color.BLUE);
		setForeground(Color.RED);
		setFont(new Font("Arial",Font.BOLD,30));
	}
	public void start()
	{
		str=getParameter("msg");
	}
	public void paint(Graphics g)
	{
		g.drawString(str,30,50);
	}
	
	
}

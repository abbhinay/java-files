import java.awt.*;
import java.applet.*;
public class MyApplet1 extends Applet
{
	String str;
	public void init()
	{
		setBackground(Color.RED);
		setForeground(Color.BLUE);
		setFont(new Font("Arial",Font.BOLD,25));
	}	
	public void start()
	{
		str=getParameter("msg");
	} 
	public void paint(Graphics g)
	{
		g.drawString(str,20,40);
	}
	
}
	

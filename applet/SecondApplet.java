import java.awt.*;
import java.applet.*;
public class SecondApplet extends Applet
{
	public void init()
	{
		setBackground(Color.PINK);
		setForeground(Color.BLACK);
		setFont(new Font("Arial",Font.BOLD,25));
	}
	public void paint(Graphics g)
	{
		g.drawString("To Change the color of this Applet",20,40);
		g.drawString("Select color from first applet",40,60);
	}
}
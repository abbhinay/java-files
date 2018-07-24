import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class FirstApplet extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	SecondApplet target;
	public void init()
	{
		CheckboxGroup g=new CheckboxGroup();
		c1=new Checkbox("red",g,false);
		c2=new Checkbox("green",g,false);
		c3=new Checkbox("blue",g,false);
		add(c1);add(c2);add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		AppletContext ctx=getAppletContext();
		target=(SecondApplet)ctx.getApplet("second");
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(c1.getState())
		target.setBackground(Color.RED);
		else if(c2.getState())
		target.setBackground(Color.GREEN);
		else
		target.setBackground(Color.BLUE);
	}
	
}
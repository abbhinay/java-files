import java.awt.*;
import javax.swing.*;
import java.util.*;
class BundleDemo extends JFrame
{
	static Locale l;
	JButton b1,b2;
	public BundleDemo()
	{
		setLayout(new FlowLayout());
		ResourceBundle b=ResourceBundle.getBundle("MyResource",l);
		b1=new JButton(b.getString("btn1"));
		b2=new JButton(b.getString("btn2"));
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(b1);add(b2);
		setTitle(b.getString("title"));
	}
	public static void main(String[] arr)
	{
	try{
		l=new Locale(arr[0],arr[1]);
		new BundleDemo();
	}catch(Exception e)
	{
		System.out.println("specify langcode & countrycode as arg");
	}
	}
}
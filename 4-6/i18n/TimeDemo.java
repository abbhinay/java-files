import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
class TimeDemo extends JFrame implements ActionListener
{
	JLabel l1,l2,l4;
	JTextField t1,t2,t4;
	JButton b1,b2;
	public TimeDemo()
	{
		super("TimeDemo");
		setLayout(new FlowLayout());
		l1=new JLabel("Lang-Code");
		l2=new JLabel("Countrycode");
		
		l4=new JLabel("Format");
		t1=new JTextField(10);
		t2=new JTextField(10);
		
		t4=new JTextField(10);
		b1=new JButton("date");
		b2=new JButton("time");
		add(l1);add(t1);
		add(l2);add(t2);
		add(l4);add(t4);
		add(b1);add(b2);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		DateFormat nf;
		Locale l=new Locale(t1.getText(),t2.getText());
		if(e.getSource()==b1)
		{
			nf=DateFormat.getDateInstance(DateFormat.SHORT,l);
		}
		else
		{
			nf=DateFormat.getTimeInstance(DateFormat.LONG,l);
		}
		Date d=new Date();
		t4.setText(nf.format(d));		
	}
	public static void main(String[] arr)
	{
		new TimeDemo();
	}
}  
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
class I18NDemo extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	public I18NDemo()
	{
		super("I18NDemo");
		setLayout(new FlowLayout());
		l1=new JLabel("Lang-Code");
		l2=new JLabel("Countrycode");
		l3=new JLabel("Number");
		l4=new JLabel("Format");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		
		b1=new JButton("number");
		b2=new JButton("currency");
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(l4);add(t4);
		add(b1);add(b2);
		setSize(400,400);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		NumberFormat nf;
		Locale l=new Locale(t1.getText(),t2.getText());
		if(e.getSource()==b1)
		{
			nf=NumberFormat.getNumberInstance(l);
		}
		else
		{
			nf=NumberFormat.getCurrencyInstance(l);
		}
		long d=Long.parseLong(t3.getText());
		t4.setText(nf.format(d));		
	}
	public static void main(String[] arr)
	{
		new I18NDemo();
	}
}
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyFrame1 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	public MyFrame1()
	{
		l1=new JLabel("No1");
		l2=new JLabel("No2");
		l3=new JLabel("Result");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		b1=new JButton("add");
		b2=new JButton("sub");
		b3=new JButton("mult");
		b4=new JButton("div");
		setLayout(new FlowLayout());
		setSize(300,300);
		setVisible(true);
		setTitle("MyApp");
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);add(b3);add(b4);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		try{
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c;
		if(e.getSource()==b1)
		c=a+b;
		else if(e.getSource()==b2)
		c=a-b;
		else if(e.getSource()==b3)
		c=a*b;
		else
		c=a/b;
		t3.setText(String.valueOf(c));
		}catch(Exception ex)
		{
			t3.setText("invalid arg");
		}
	}
	public static void main(String[] arr)
	{
		MyFrame1 f=new MyFrame1();
	}
}
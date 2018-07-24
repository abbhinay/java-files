import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyFrame2 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	public MyFrame2()
	{
		setLayout(new FlowLayout());
		l1=new JLabel("No1");
		l2=new JLabel("No2");
		l3=new JLabel("Result");
		l1.setFont(new Font("Arial",Font.BOLD,30));
		l2.setFont(new Font("Arial",Font.BOLD,30));
		l3.setFont(new Font("Arial",Font.BOLD,30));
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t3.setEditable(false);
		t1.setFont(new Font("Arial",Font.BOLD,30));
		t2.setFont(new Font("Arial",Font.BOLD,30));
		t3.setFont(new Font("Arial",Font.BOLD,30));
		b1=new JButton("add");
		b2=new JButton("sub");
		b3=new JButton("mult");
		b4=new JButton("div");
		b1.setFont(new Font("Arial",Font.BOLD,30));
		b2.setFont(new Font("Arial",Font.BOLD,30));
		b3.setFont(new Font("Arial",Font.BOLD,30));
		b4.setFont(new Font("Arial",Font.BOLD,30));
		setSize(300,400);
		setVisible(true);
		setTitle("MyApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);add(b3);add(b4);
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
		if(b1==e.getSource())
		c=a+b;
		else if(b2==e.getSource())
		c=a-b;
		else if(b3==e.getSource())
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
		MyFrame2 f=new MyFrame2();
	}
}
   

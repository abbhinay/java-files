import java.awt.*;
import javax.swing.*;
class MyFrame extends JFrame
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1;
	public MyFrame()
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
		t1.setFont(new Font("Arial",Font.BOLD,30));
		t2.setFont(new Font("Arial",Font.BOLD,30));
		t3.setFont(new Font("Arial",Font.BOLD,30));
		b1=new JButton("add");
		b1.setFont(new Font("Arial",Font.BOLD,30));
		setSize(300,400);
		setVisible(true);
		setTitle("MyApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);
	}
	public static void main(String[] arr)
	{
		MyFrame f=new MyFrame();
	}
}
   

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class DialogDemo extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1;
	JButton b1,b2,b3;
	public DialogDemo()
	{
		super("DialogApp");
		setLayout(new FlowLayout());
		l1=new JLabel("msg");
		t1=new JTextField(20);
		t1.setFont(new Font("Arial",Font.BOLD,20));
		b1=new JButton("msg");
		b2=new JButton("input");
		b3=new JButton("confirm");
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(l1);add(t1);add(b1);add(b2);add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		JOptionPane.showMessageDialog(this,t1.getText());
		else if(e.getSource()==b2)
		{
		String s=JOptionPane.showInputDialog(this,"enter ur name");
		t1.setText("hello: " +s);
		}
		else
		{
		int a=JOptionPane.showConfirmDialog(this,"AMU is the best");
		if(a==JOptionPane.YES_OPTION)
		t1.setText("Ya u r rite");
		else if(a==JOptionPane.NO_OPTION)
		t1.setText("NO u r wrong");
		else
		t1.setText("no u dnt know anything");
		}
	
	}
	public static void main(String[] arr)
	{
		new DialogDemo();
	}
}
	
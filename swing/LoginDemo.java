import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LoginDemo extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1;
	public LoginDemo()
	{
		super("LoginFrame");
		setLayout(null);
		l1=new JLabel("UserName");
		l2=new JLabel("Password");
		t1=new JTextField(10);
		t2=new JPasswordField(10);
		b1=new JButton("login");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(b1);add(l2);add(t1);add(t2);add(l1);
		b1.addActionListener(this);
		l1.setBounds(20,20,80,30);
		t1.setBounds(140,20,150,30);
		l2.setBounds(20,90,80,30);
		t2.setBounds(140,90,150,30);
		b1.setBounds(60,160,100,50);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		if(s1.equalsIgnoreCase("ZHCET")&& s2.equalsIgnoreCase("ALIGARH"))
		{
			JOptionPane.showMessageDialog(this,"Successfully-login");
			new DialogDemo();
			this.dispose();	 	
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Login Failed");
			t1.setText("");
			t2.setText("");
		}
	}
	public static void main(String[] arr)
	{
		new LoginDemo();
	}
}
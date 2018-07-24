import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class PadDemo extends JFrame implements ActionListener
{
	JMenuBar jmb;
	JMenu m1,m2;
	JMenuItem i1,i2,i3,i4,i5,i6;
	JTextArea jta;
	public PadDemo()
	{
		super("PadDemo");
		jmb=new JMenuBar();
		m1=new JMenu("File");
		m2=new JMenu("Edit");
		i1=new JMenuItem("open");
		i2=new JMenuItem("save");
		i3=new JMenuItem("exit");
		i4=new JMenuItem("cut");
		i5=new JMenuItem("copy");
		i6=new JMenuItem("paste");
		m1.add(i1);m1.add(i2);m1.add(i3);
		m2.add(i4);m2.add(i5);m2.add(i6);
		jmb.add(m1);jmb.add(m2);
		setJMenuBar(jmb);
		jta=new JTextArea();
		JScrollPane jsp=new JScrollPane(jta);
		jta.setFont(new Font("Viner HAND ITC",Font.BOLD,25));
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
		i6.addActionListener(this);
		add(jsp);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==i1)
		{
		JFileChooser jfc=new JFileChooser();
		jfc.showOpenDialog(this);
		File f=jfc.getSelectedFile();
		try{
		FileInputStream fin=new FileInputStream(f);
		byte[] b=new byte[fin.available()];
		fin.read(b);
		String s1=new String(b);
		jta.setText(s1);
		}catch(Exception ex)
		{}
		}
		else if(e.getSource()==i2)
		{
		JFileChooser jfc=new JFileChooser();
		jfc.showSaveDialog(this);
		File f=jfc.getSelectedFile();
		try{
		FileOutputStream out=new FileOutputStream(f);
		String s1=jta.getText();
		byte[] b=s1.getBytes();
		out.write(b);
		}catch(Exception ex)
		{}	
		}
		else if(e.getSource()==i3)
		this.dispose();
		else 
		JOptionPane.showMessageDialog(this,"Sorry");
	}
	public static void main(String[] arr)
	{
		new PadDemo();
	}
}
		
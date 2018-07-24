import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
class ListDemo extends JFrame implements ListSelectionListener
{
	JLabel l1,l2;
	JTextField t1;
	JList list;
	public ListDemo()
	{
		super("ListApp");
		setLayout(null);
		l1=new JLabel("Select values form the list");
		l2=new JLabel("Selected Values");
		t1=new JTextField(20);
		String[] data={"Vibhu","Ayush","Mohit","Piyush","Guitarist","sagar","yash","rahul"};
		list=new JList(data);
		JScrollPane jsp=new JScrollPane(list);
		list.setVisibleRowCount(4);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(l1);add(l2);add(t1);add(jsp);
		l1.setBounds(20,20,200,30);
		jsp.setBounds(50,80,150,100);
		l2.setBounds(20,220,150,30);
		t1.setBounds(200,220,150,30);
		list.addListSelectionListener(this);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
	}
	public void valueChanged(ListSelectionEvent e)
	{
		Object[] o=list.getSelectedValues();
		StringBuffer b=new StringBuffer();
		for(int i=0;i<o.length;i++)
		b.append((String)o[i]+",");
		t1.setText(b.toString());
		
	}
	public static void main(String[] arr)
	{
		new ListDemo();
	}
}
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
class SliderDemo extends JFrame implements ChangeListener
{
	JSlider js1,js2,js3;
	JLabel l1,l2,l3;
	Panel p1;
	public SliderDemo()
	{
		super("SliderApp");
		setLayout(null);
		l1=new JLabel("red");
		l2=new JLabel("green");
		l3=new JLabel("blue");
		p1=new Panel();
		
		js1=new JSlider();
		js2=new JSlider();
		js3=new JSlider();
		
		js1.setMinimum(0);
		js1.setMaximum(255);
		js1.setMinorTickSpacing(5);
		js1.setMajorTickSpacing(15);
		js1.setPaintLabels(true);
		js1.setPaintTicks(true);

		
		js2.setMinimum(0);
		js2.setMaximum(255);
		js2.setMinorTickSpacing(5);
		js2.setMajorTickSpacing(15);
		js2.setPaintLabels(true);
		js2.setPaintTicks(true);
		
		
		js3.setMinimum(0);
		js3.setMaximum(255);
		js3.setMinorTickSpacing(5);
		js3.setMajorTickSpacing(15);
		js3.setPaintLabels(false);
		js3.setPaintTicks(false);
		
		js1.setFont(new Font("Arial",Font.BOLD,14));
		js2.setFont(new Font("Arial",Font.BOLD,14));
		js3.setFont(new Font("Arial",Font.BOLD,14));
		setSize(600,600);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(l1);add(l2);add(p1);add(js1);add(js2);
		add(js3);add(l3);
		js1.addChangeListener(this);
		js2.addChangeListener(this);
		js3.addChangeListener(this);

		p1.setBounds(20,20,300,200);
		l1.setBounds(20,280,70,20);
		js1.setBounds(120,280,650,50);
		l2.setBounds(20,370,70,20);
		js2.setBounds(120,370,650,50);
		l3.setBounds(20,470,70,20);
		js3.setBounds(120,470,650,50);
	}
	public void stateChanged(ChangeEvent e)
	{
		int r=js1.getValue();
		int g=js2.getValue();
		int b=js3.getValue();
		p1.setBackground(new Color(r,g,b));
	}
	public static void main(String[] arr)
	{
		new SliderDemo();
	}
}
package Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class search extends JFrame implements ActionListener {

	JFrame f;
	JTextField tf,tf2;
	JLabel l1,l2;
	JButton b1,b2;
	
	search()
	{
		f=new JFrame("View");
		f.setBackground(Color.GREEN);
		f.setLayout(null);
		
		l1=new JLabel("Staff Name");
		l1.setBounds(40,60,250,30);
		l1.setForeground(Color.BLACK);
		Font F1 = new Font("serif",Font.BOLD,30);
		l1.setFont(F1);
		f.add(l1);
		
		tf=new JTextField();
        tf.setBounds(300,60,220,30);
        f.add(tf);
        
        l2=new JLabel("Branch Name");
		l2.setBounds(40,120,250,30);
		l2.setForeground(Color.BLACK);
		Font F2 = new Font("serif",Font.BOLD,30);
		l2.setFont(F2);
		f.add(l2);
		
		tf2=new JTextField();
        tf2.setBounds(300,120,220,30);
        f.add(tf2);

        b1=new JButton("Search");
        b1.setBounds(240,200,100,30);
        b1.addActionListener(this);
        f.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(360,200,100,30);
        b2.addActionListener(this);
        f.add(b2);

        f.setVisible(true);
	    f.setSize(900,700);
	    f.getContentPane().setBackground(Color.cyan);
	    f.setLocation(400,150);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String a=tf.getText();
		String b=tf2.getText();
		
		if(ae.getSource() == b2)
		{
			f.setVisible(false);
			options o=new options();
		}
		if(ae.getSource() == b1)
		{
			f.setVisible(false);
			display c=new display(a,b);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		search p=new search();

	}

}

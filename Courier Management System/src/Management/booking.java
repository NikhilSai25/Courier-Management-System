package Management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class booking extends JFrame implements ActionListener {
	
	JFrame f;
	JLabel l,l1,lt1,l2,lt2,l3,lt3,l4,l5,l6,l7,l8,y,z;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b1,b2;
	String name,address,contact;
	
	booking()
	{
				
		f=new JFrame("Booking");
        f.setBackground(Color.white);
        f.setLayout(null);

		
		l=new JLabel("Booking Details");
		l.setBounds(200,10,250,30);
		l.setFont(new Font("serif",Font.BOLD,25));
		f.add(l);
		

		y=new JLabel("Send To");
		y.setBounds(200,100,250,30);
		y.setFont(new Font("serif",Font.BOLD,25));
		f.add(y);
		
		l1=new JLabel("Name");
		l1.setBounds(50,150,150,30);
		l1.setFont(new Font("serif",Font.ITALIC,25));
		l1.setForeground(Color.BLACK);
		f.add(l1);
		
		t1=new JTextField();
		t1.setBounds(220,150,150,30);
		f.add(t1);
		
		l2=new JLabel("Address");
		l2.setBounds(50,200,150,30);
		l2.setFont(new Font("serif",Font.ITALIC,25));
		l2.setForeground(Color.BLACK);
		f.add(l2);
		
		t2=new JTextField();
		t2.setBounds(220,200,150,30);
		f.add(t2);
		
		l3=new JLabel("Contact No");
		l3.setBounds(50,250,150,30);
		l3.setFont(new Font("serif",Font.ITALIC,25));
		l3.setForeground(Color.BLACK);
		f.add(l3);
		
		t3=new JTextField();
		t3.setBounds(220,250,150,30);
		f.add(t3);
		

		z=new JLabel("Receive From");
		z.setBounds(200,300,250,30);
		z.setFont(new Font("serif",Font.BOLD,25));
		f.add(z);
		
		l4=new JLabel("Name");
		l4.setBounds(50,350,150,30);
		l4.setFont(new Font("serif",Font.ITALIC,25));
		l4.setForeground(Color.BLACK);
		f.add(l4);
		
		t4=new JTextField();
		t4.setBounds(220,350,150,30);
		f.add(t4);
		
		l5=new JLabel("Address");
		l5.setBounds(50,400,180,30);
		l5.setFont(new Font("serif",Font.ITALIC,25));
		l5.setForeground(Color.BLACK);
		f.add(l5);
		
		t5=new JTextField();
		t5.setBounds(250,400,150,30);
		f.add(t5);
		
		l6=new JLabel("Contact No");
		l6.setBounds(50,450,150,30);
		l6.setFont(new Font("serif",Font.ITALIC,25));
		l6.setForeground(Color.BLACK);
		f.add(l6);
		
		t6=new JTextField();
		t6.setBounds(220,450,150,30);
		f.add(t6);
		
		l7=new JLabel("Courier Weight");
		l7.setBounds(50,500,180,30);
		l7.setFont(new Font("serif",Font.ITALIC,25));
		l7.setForeground(Color.BLACK);
		f.add(l7);
		
		t7=new JTextField();
		t7.setBounds(220,500,150,30);
		f.add(t7);
		
		l8=new JLabel("Courier Type");
		l8.setBounds(50,550,150,30);
		l8.setFont(new Font("serif",Font.ITALIC,25));
		l8.setForeground(Color.BLACK);
		f.add(l8);
		
		t8=new JTextField();
		t8.setBounds(220,550,150,30);
		f.add(t8);
		
		
		
	
		b1 = new JButton("Submit");
	    b1.setBackground(Color.BLACK);
	    b1.setForeground(Color.WHITE);
	    b1.setBounds(250,650,150,40);
	    
	    f.add(b1);
	
	    b2=new JButton("Cancel");   
	    b2.setBackground(Color.BLACK);
	    b2.setForeground(Color.WHITE);
	    b2.setBounds(450,650,150,40);
	    
	    f.add(b2);
	    
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    
	    
	    f.setVisible(true);
	    f.setSize(900,700);
	    f.getContentPane().setBackground(Color.YELLOW);
	    f.setLocation(400,150);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String a=t1.getText();
		String b=t2.getText();
		String c=t3.getText();
		String d=t4.getText();
		String e=t5.getText();
		String f=t6.getText();
		String g=t7.getText();
		String h=t8.getText();

		
		
		if(ae.getSource() == b1)
		{
			try {
			conn c1=new conn();
			String q="insert into booking(name, address, contact, rname, raddress, rcontact,courierwgt,couriertype) values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"')";
			c1.s.executeUpdate(q);
			JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			this.setVisible(false);
			new options();

			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		if(ae.getSource() == b2)
		{
			this.setVisible(false);
			new options();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		booking b=new booking();
		
	}

}

package Management;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class display extends JFrame implements ActionListener{

	JFrame f;
	JLabel l,l1,lt1,l2,lt2,l3,lt3,l4,lt4,l5,lt5;
	String name,receiver,date;
	JTable jt;
	JButton b;
	display(String sn,String ba)
	{
		f=new JFrame("Booking");
        f.setBackground(Color.white);
        f.setLayout(null);
        

		try {
			conn con=new conn();
			String str="select * from delivery where staffname= '"+ sn +"' and branchname='" + ba + "'";
			System.out.println(str);
			ResultSet rs=con.s.executeQuery(str);
	
			String[] columnNames = {"couriernumber", "deliveredto", "deliveredon"};
			DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
			while(rs.next())
			{
				name=rs.getString("couriernumber");
				receiver=rs.getString("deliveredto");
				date=rs.getString("deliveredon");
				
				
				
				String[] data = { name,receiver,date } ;
				
			
			    // and add this row of data into the table model
			    tableModel.addRow(data);

			
			}
			
			jt = new JTable(tableModel);
			jt.setPreferredScrollableViewportSize(new Dimension(450, 63));
	        jt.setFillsViewportHeight(true);
	        
						
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JScrollPane jps = new JScrollPane(jt);
		jps.setVisible(true);
        jps.setBounds(80, 15, 300, 200);
        f.add(jps);
        
        b = new JButton("Back");
	    b.setBackground(Color.BLACK);
	    b.setForeground(Color.WHITE);
	    b.setBounds(150,400,150,40);
	    
	    f.add(b);
	    
	    b.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(595,642);
        f.getContentPane().setBackground(Color.YELLOW);
        f.setLocation(450,200);

				
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b)
		{
			this.setVisible(false);
			new options();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display d=new display("Hello","Hello");
	}

}

package SwingExtra;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutManagerGUI {
	public  static void main(String args[]) {
//		Y obj=new Y();
		
		Z obj=new Z();
	}
}

class S extends JFrame implements ActionListener{
	JButton b;
	S(){
		
		b=new JButton("Hello");
		b.setBounds(100,100,140,50);
		b.setFocusable(false);
		b.addActionListener(this);
		
		
		add(b);
		setLayout(null);
		setVisible(true);
		setSize(550, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b) {
			Abc frame=new Abc();
			this.dispose();
		}
		
	}
}

class Z extends JFrame{
	Z(){

		
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.setPreferredSize(new Dimension(200,300));
		panel1.setBackground(Color.DARK_GRAY);
		
		panel1.add(new JButton("1"));
		panel1.add(new JButton("1"));
		panel1.add(new JButton("1"));
		panel1.add(new JButton("1"));
		panel1.add(new JButton("1"));
		panel1.add(new JButton("1"));
		panel1.add(new JButton("1"));
		panel1.add(new JButton("1"));
		panel1.add(new JButton("1"));
	
		
		
		
		add(panel1);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		setVisible(true);
		setSize(550, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class Y extends JFrame{
	Y(){		
//FlowLayout Manager makes sure that if the Components runs oyt if Space it pushes other items downwards!!!
//		getContentPane().setBackground(new Color(0x123456));
		
	    setLayout(new BorderLayout(10,10));
	    setVisible(true);
	    setSize(550, 550);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.YELLOW);
		panel3.setBackground(Color.CYAN);
		panel4.setBackground(Color.DARK_GRAY);
		panel5.setBackground(Color.BLACK);
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.SOUTH);
		add(panel3,BorderLayout.EAST);
		add(panel4,BorderLayout.WEST);
		add(panel5,BorderLayout.CENTER);
		
//		
	}
}

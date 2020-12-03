package SwingExtra;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonsGUI {
public static void  main(String args[]) {
	X obj=new X();
}

}

class X extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	
	X(){
		label =new JLabel();
		label.setText("Hello!!");
		label.setBounds(0,0,30,30);
		label.setVisible(false);
		
		button=new JButton();
		button.setText("Click!!");	
		button.setBounds(200, 100, 120, 50);
		button.addActionListener(this);
		button.setFocusable(false);
		button.setBackground(Color.LIGHT_GRAY);
		button.setFont(new Font("Comic Sans",Font.ITALIC,20));
		
		add(button);
		add(label);
		getContentPane().setBackground(new Color(0x123456));
	    setResizable(false);
	    setLayout(null);
	    setVisible(true);
	    setSize(550, 550);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
	
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == button){
			System.out.println("Nice!");
			button.setEnabled(false);
			label.setVisible(true);
		}
		
	}
	
}


























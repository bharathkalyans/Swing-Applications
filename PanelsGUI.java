package SwingExtra;

import javax.swing.*;
import java.awt.*;

public class PanelsGUI {
    public static void main(String[] args) {
        Xyz obj=new Xyz();
    }
}
class Xyz extends JFrame {

    Xyz(){
    	//JPanel is a Container that can Hold things!!!
    	
    	
    	//Use setVerticalAlignment when you are using BorderLayout !!!
    	JLabel label=new JLabel("Hello");
//    	label.setVerticalAlignment(JLabel.TOP);
    	//Use setVertical
    	JPanel redPanel=new JPanel();
    	redPanel.setBackground(Color.RED);//Gives the Color
    	redPanel.setBounds(0, 0, 250, 250);//Sets the Size as a Square!!
    	
//    	redPanel.setLayout(new BorderLayout());
    	
    	JPanel bluePanel=new JPanel();
    	bluePanel.setBackground(Color.BLUE);
    	bluePanel.setBounds(250,0,250,250);
    	
    	JPanel yellowPanel=new JPanel();
    	yellowPanel.setBackground(Color.YELLOW);
    	yellowPanel.setBounds(0,250,500,250);
    	
				    	    	
    	ImageIcon imageIcon=new ImageIcon("apple.png");
        setIconImage(imageIcon.getImage());//Sets the image Icon!!
        
        redPanel.add(label);
        add(redPanel);//Adding the Panel
        add(bluePanel);
        add(yellowPanel);
        redPanel.add(label);
        
        getContentPane().setBackground(new Color(0x123456));
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setSize(750, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


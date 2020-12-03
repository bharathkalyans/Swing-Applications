package SwingExtra;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame {
    public static void main(String[] args) {
        Abc obj=new Abc();
    }
}

class Abc extends JFrame{

    Abc(){
        ImageIcon imageIcon=new ImageIcon("apple.png");
        setIconImage(imageIcon.getImage());//Sets the image Icon!!
        Border border=BorderFactory.createLineBorder(Color.green,3);
        JLabel l=new JLabel("I Code a lot,Seriously!!");
        l.setIcon(imageIcon);
        l.setHorizontalTextPosition(JLabel.CENTER);
        l.setVerticalTextPosition(JLabel.TOP);
        l.setForeground(Color.CYAN);
        l.setFont(new Font("MV Boli",Font.ITALIC,20));
        l.setVerticalAlignment(JLabel.CENTER);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBorder(border);
        add(l);

        getContentPane().setBackground(new Color(64, 42, 71));
//        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
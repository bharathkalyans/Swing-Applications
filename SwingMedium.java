package SwingExtra;

import javax.swing.*;
import java.awt.*;

public class SwingMedium {
    public static void main(String[] args) {
        JFrame frame=new JFrame();


        ImageIcon imageIcon=new ImageIcon("apple.png");
        frame.setIconImage(imageIcon.getImage());//Sets the image Icon!!

        frame.getContentPane().setBackground(new Color(0x123456));
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

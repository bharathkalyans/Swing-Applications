package SwingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseDemoGUI {
    public static void main(String[] args) {
        MD ob=new MD();
    }
}

class MD extends JFrame{
    MD(){

        //Using Mouse Adapter instead of MouseListener because in Mouse Listener we have to implement
        //all the methods in the interface.


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x=e.getX();
                int y=e.getY();
                System.out.println("( "+x+" ,"+ y +" )");
            }
        });


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
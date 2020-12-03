package SwingDemo;

import javax.swing.*;
import java.awt.*;

/*1.Create a Class file.
2.Create an Extra Class which extends JFrame.
3.setVisible to true;
4.To set six=ze of the Panel use setSize(width,height);
5.To add label use JLabel Object.
6.To set Layout use setLayout(new FlowLayout())---> You can use GrideLayout or Null too;
7.To close the Layout (CROSS BUTTON) setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
-------------------------------------------------------------------------------------
Required for all Forms.
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
-------------------------------------------------------------------------------------
* */
public class FirstGUI {
    public static void main(String[] args) {
        Abc obj=new Abc();

    }
}

class Abc extends JFrame{
    public Abc(){


        JLabel l=new JLabel("Hello World!!");
        JLabel l1=new JLabel("Welcome Bharath");

        add(l);
        add(l1);


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

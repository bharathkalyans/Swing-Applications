package SwingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionGUI {
    public static void main(String[] args) {
        Addition obj=new Addition();


    }
}

class Addition extends JFrame {
    JTextField t1,t2;
    JButton b1;
    JLabel l;

    Addition(){
         t1=new JTextField(20);
         t2=new JTextField(20);
         l=new JLabel("Result");
         b1=new JButton("OK");

        add(t1);
        add(t2);
        add(l);
        add(b1);

//        ActionListener al=new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int num1,num2;
//                num1=Integer.parseInt(t1.getText());
//                num2=Integer.parseInt(t2.getText());
//                int sum=num1+num2;
//                l.setText(sum +"");
//            }
//        })//You can use ActionListener as an Interface but doing this way its no problem!!

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1,num2;
                num1=Integer.parseInt(t1.getText());
                num2=Integer.parseInt(t2.getText());
                int sum=num1+num2;
                l.setText("Sum is "+sum +"");
            }
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}

package SwingDemo;

import javax.swing.*;
import java.awt.*;

public class CalcGUI {
    public static void main(String[] args) {

        AddSub ob=new AddSub();


    }
}

class AddSub extends JFrame {
    JTextField t1,t2;
    JButton b1,b2;
    JLabel l;

    AddSub(){

        t1=new JTextField(20);
        t2=new JTextField(20);
        l=new JLabel("Result");
        b1=new JButton("ADD");
        b2=new JButton("SUB");

        add(t1);
        add(t2);
        add(l);
        add(b1);
        add(b2);


        b1.addActionListener(ae ->{
            int num1,num2;
            num1=Integer.parseInt(t1.getText());
            num2=Integer.parseInt(t2.getText());
            int sum=num1+num2;
            l.setText("Sum is "+sum +"");
        });
        b2.addActionListener(ae ->{
            int num1,num2;
            num1=Integer.parseInt(t1.getText());
            num2=Integer.parseInt(t2.getText());
            int sub=num1-num2;
            l.setText("Sum is "+sub +"");
        });


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(220, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

/*
* 1.import java.sq;.*;
* 2.Load the connection Class.forName("com.mysql.jdbc.driver");
* 3.Create  a cOnnection.
* 4.Statement.
* 5.ResultSet.
* 6.Execute the Query.
* 7.Close the Connection!!!!
*
* */

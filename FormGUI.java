package SwingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FormGUI {
    public static void main(String[] args) {
        Form ob=new Form();
    }

}
class Form extends JFrame{

    JTextField t1;
    JButton b1;
    JRadioButton rb1,rb2;
    JLabel l1,l2;
    JCheckBox jcb1,jcb2,jcb3;
    Form(){
        t1=new JTextField(20);
        b1=new JButton("Submit");
        rb1=new JRadioButton("Male");
        rb2=new JRadioButton("Female");
        l1=new JLabel("Enter the Details!!");
        l2=new JLabel("");
        jcb1=new JCheckBox("Singing");
        jcb2=new JCheckBox("Dancing");
        jcb3=new JCheckBox("Killing");

        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        add(l1);
        add(t1);
        add(b1);
        add(rb1);
        add(rb2);
        add(jcb1);
        add(jcb2);
        add(jcb3);
        add(l2);

       /* For  Normal JButtons we use ActionListener as the Event Handler's
        But in case of JCheckBox we use Item Listener as Event Handlers!!*/

        jcb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Danceer");
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gender="";
                String name=t1.getText();
                if(rb1.isSelected())
                    name= "Mr."+name;
                else if (rb2.isSelected())
                    name="Mrs."+name;

                if (jcb1.isSelected())
                    name=name+" Dancer!";
                if (jcb2.isSelected())
                    name=name+" Singer!";
                if (jcb3.isSelected())
                    name=name+" Killer!";

                l2.setText(name+"");

            }
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

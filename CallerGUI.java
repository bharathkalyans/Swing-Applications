package SwingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CallerGUI {
    public static void main(String[] args) {
        X ob=new X();
    }
}

class X extends JFrame implements ActionListener{
    int i=0;
    JProgressBar p;
    X(){
        JButton b=new JButton("Call other frame!");
        add(b);
        p=new JProgressBar(0,20);
        add(p);

        Timer t=new Timer(500,this);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.start();
            }
        });




        setResizable(false);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(i==20){
            new Addition();
            dispose();
        }
        i++;
        p.setValue(i);
    }
}

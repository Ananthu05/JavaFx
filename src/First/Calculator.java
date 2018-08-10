package First;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator implements ActionListener {
    JLabel label;
    JButton button1;
    JButton button2;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;

    Calculator() {
        JFrame f = new JFrame("First Window");
        f.setLayout(null);
        f.setSize(500, 500);
        label = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        button1 = new JButton("+");
        button2 = new JButton("-");
        f.add(label);
        f.add(button1);
        f.add(button2);
        f.add(textField1);
        f.add(textField2);
        f.add(textField3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        label.setBounds(20, -200, 500, 500);
        button1.setBounds(150, 50, 50, 50);
        button2.setBounds(250, 350, 50, 50);
        textField1.setBounds(100, 150, 50, 50);
        textField2.setBounds(200, 250, 50, 50);
        textField3.setBounds(300, 450, 50, 50);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new sampleform();
    }
    @Override
    public void actionPerformed(ActionEvent e){
     Integer x= Integer.parseInt(textField1.getText());
     Integer y= Integer.parseInt(textField2.getText());
int c=0;
        if(e.getSource()== button1) {
             c = x + y;
        }
            else
        {

           c=x-y;

String textField3=String.valueOf(c);



        }


    }
}





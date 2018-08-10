package First;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sampleform implements ActionListener {
    JLabel label;
   JButton button;
   JTextField textField;
    sampleform()
    {
        JFrame f = new JFrame("First Window");
        f.setLayout(null);
        f.setSize(500, 500);
        label=new JLabel();
        textField=new JTextField();
        button=new JButton("click");
        f.add(label);
        f.add(button);
        f.add(textField);
        button.addActionListener(this);
        label.setBounds(20,-200,500,500);
        button.setBounds(150,150,50,50);
        textField.setBounds(100,150,50,50);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new sampleform();
    }
        @Override
                public void actionPerformed(ActionEvent e){
        label.setText("hello");
        label.setText(textField.getText());

    }
    }


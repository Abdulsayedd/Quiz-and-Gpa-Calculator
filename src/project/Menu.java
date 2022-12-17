package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    public JFrame jframe;
    public JButton btn1, btn2;
    public JLabel label;
    public Container con;

    public void setMenu() {
        jframe = new JFrame("Main Menu");
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setBounds(100, 100, 500, 500);
        jframe.setResizable(false);
        jframe.setLayout(null);

        con = jframe.getContentPane();
        con.setBackground(Color.lightGray);

        Font font = new Font("Cambria Math", Font.BOLD, 18);
        label = new JLabel("Quiz and GPA calculator");
        label.setFont(font);
        con.add(label);
        label.setBounds(140, 30, 400, 30);

        btn1 = new JButton("Quiz");
        btn2 = new JButton("GPA Calculator");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        con.add(btn1);
        con.add(btn2);
        btn1.setBounds(195, 180, 80, 50);
        btn2.setBounds(160, 240, 150, 50);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1)
        {
            new Quiz(" Quiz ");//constructor
        }
        if (e.getSource()==btn2){
            GPA obj = new GPA();//call object
            obj.gpa();
        }
    }

}

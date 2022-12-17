package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPA implements ActionListener {
    public JFrame frame;
    public JButton btn;
    public JTextField degree1, degree2, degree3, degree4, degree5;
    public JLabel label1, label2, label3, label4, label5, label6, label7, head1, head2;
    public Container container;

    public void gpa() {
        frame = new JFrame("Gpa Calculator");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        container = frame.getContentPane();
        container.setBackground(Color.lightGray);
        degree1 = new JTextField();
        degree2 = new JTextField();
        degree3 = new JTextField();
        degree4 = new JTextField();
        degree5 = new JTextField();
        container.add(degree1);
        container.add(degree2);
        container.add(degree3);
        container.add(degree4);
        container.add(degree5);
        degree1.setBounds(350, 80, 50, 30);
        degree2.setBounds(350, 130, 50, 30);
        degree3.setBounds(350, 180, 50, 30);
        degree4.setBounds(350, 230, 50, 30);
        degree5.setBounds(350, 280, 50, 30);
        Font font = new Font("Cambria Math", Font.BOLD, 18);
        label1 = new JLabel("Operating Systems :");
        label1.setFont(font);
        label2 = new JLabel("Advanced Programming :");
        label2.setFont(font);
        label3 = new JLabel("Databases :");
        label3.setFont(font);
        label4 = new JLabel("Simulation :");
        label4.setFont(font);
        label5 = new JLabel("HCI :");
        label5.setFont(font);
        label6 = new JLabel();
        label6.setFont(font);
        label7 = new JLabel();
        label7.setFont(font);

        head1 = new JLabel("Subject Name");
        head1.setFont(font);
        head2 = new JLabel("Degree");
        head2.setFont(font);


        container.add(label1);
        container.add(label2);
        container.add(label3);
        container.add(label4);
        container.add(label5);
        container.add(label6);
        container.add(label7);

        container.add(head1);
        container.add(head2);

        label1.setBounds(40, 80, 250, 30);
        label2.setBounds(40, 130, 250, 30);
        label3.setBounds(40, 180, 250, 30);
        label4.setBounds(40, 230, 250, 30);
        label5.setBounds(40, 280, 250, 30);
        label6.setBounds(50, 330, 300, 30);
        label7.setBounds(110, 350, 300, 30);
        head1.setBounds(30, 30, 300, 30);
        head2.setBounds(350, 30, 300, 30);

        btn = new JButton("Result");
        btn.addActionListener(this);
        container.add(btn);
        btn.setBounds(180, 400, 80, 30);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        int deg1,deg2,deg3,deg4,deg5;
        if (e.getSource() == btn)
        {
            if(check(degree1.getText()) || check(degree2.getText()) || check(degree3.getText()) || check(degree4.getText())|| check(degree5.getText()))
            {
                JOptionPane.showMessageDialog(null,"No Characters Allowed");
                degree1.setText("");
                degree2.setText("");
                degree3.setText("");
                degree4.setText("");
                degree5.setText("");
            }
            else
            {
                if(degree1.getText().isEmpty())
                    deg1=0;
                else
                    deg1=Integer.parseInt(degree1.getText());
                if(degree2.getText().isEmpty())
                    deg2=0;
                else
                    deg2=Integer.parseInt(degree2.getText());
                if(degree3.getText().isEmpty())
                    deg3=0;
                else
                    deg3=Integer.parseInt(degree3.getText());
                if(degree4.getText().isEmpty())
                    deg4=0;
                else
                    deg4=Integer.parseInt(degree4.getText());
                if(degree5.getText().isEmpty())
                    deg5=0;
                else
                    deg5=Integer.parseInt(degree5.getText());
                if(deg1>100 || deg2>100 || deg3>100 || deg4>100 || deg5>100)
                    {

                        JOptionPane.showMessageDialog(null,"Degree Can't exceed 100!");
                        degree1.setText("");
                        degree2.setText("");
                        degree3.setText("");
                        degree4.setText("");
                        degree5.setText("");
                    }
                else
                {
                    double sum = (deg1 + deg2 + deg3 + deg4 + deg5);
                    label6.setText("Total Degree         =           " + sum);
                    double summ = sum / 5;
                    double gpa = (summ / 20) - 1;
                    label7.setText("GPA         =           " + String.format("%.02f", gpa));
                }

            }
        }
    }
    boolean check(String x)
    {
        int chars=0;
        for(int i = 0 ; i < degree1.getText().length(); i++)
        {
            for(char k = 'a' ; k <='z';k++)
            {
                if(degree1.getText().charAt(i)==k)
                {
                    chars++;
                    break;
                }
            }
            for(char k = 'A' ; k <='Z';k++)
            {
                if(degree1.getText().charAt(i)==k)
                {
                    chars++;
                    break;
                }
            }

            if(chars>0)break;
        }
        return chars>0;
    }
}

package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {
    JLabel l;
    JRadioButton ans[] = new JRadioButton[5];
    JButton b1, b2;
    ButtonGroup bg;
    int count = 0, current = 0,ques, x = 1, y = 1, now = 0;
    int[] anss = new int[30];
    boolean[] vis = new boolean[30];
    String[][] q =new String[30][5];

    Quiz(String s) {
        super(s);
        l = new JLabel();
        add(l);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            ans[i] = new JRadioButton();
            add(ans[i]);
            bg.add(ans[i]);
        }
        b1 = new JButton("Next");
        b2 = new JButton("Result");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        l.setBounds(30, 40, 850, 20);
        for(int i=80,j=0 ; i <=170 && j<4 ; i+=30 , j++)
        {
            ans[j].setBounds(50,i,300,20);
        }
        b1.setBounds(100, 240, 100, 30);
        b2.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(350, 150);
        setVisible(true);
        setSize(1000, 400);
        for(int i = 0 ; i < 30 ; i++)vis[i]=false;
        b2.setEnabled(false);
        make_questions_for_quiz();
        set();
    }
    public void make_questions_for_quiz()
    {
        //questions

        q[0][4]="what is hardware?";
        q[1][4]="what does counter++; do?";
        q[2][4]="what is a loop that never stops?";
        q[3][4]="in a while loop, if the boolean expression is true, what will the loop do?";
        q[4][4]="what special value is designated for controlling a loop?";
        q[5][4]="What is a method?";
        q[6][4]="What is an object?";
        q[7][4]="What is an array?";
        q[8][4]="You use this statement to throw an exception manually?";
        q[9][4]="When an exception is generated, it is said to have been what?";
        q[10][4]="Package in Java is a mechanism to encapsulate a________.";
        q[11][4]="Which of these keywords is used to define packages in Java?";
        q[12][4]="Package names and directory structure are closely related.";
        q[13][4]="An _____statement can be used to access the classes and interface of a different package?";
        q[14][4]="Java Source Code is compiled into ?";
        q[15][4]="Enums were introduced in?";
        q[16][4]="Which of the following is smallest integer data type?";
        q[17][4]="Which of the following integer data type in byte?";
        q[18][4]="Integer data type does not include following primitive data type?";
        q[19][4]="Which of the following data types comes under floating data types?";
        q[20][4]="Which of the following can be operands of arithmetic operators?";
        q[21][4]="Modulus operator, % , can be applied to which of these?";
        q[22][4]="Package in java is a mechanism to encapsulate a_____.";
        q[23][4]="Single line comment starts with_____in java?";
        q[24][4]="How to run java program in command prompt?";
        q[25][4]="What is the Time Zone of Egypt?";
        q[26][4]="How many kilometres of cost line does Egypt have?";
        q[27][4]="What are the some natural Hazards in Egypt?";
        q[28][4]=" In Mid-July, What would the weather most likely be in Egypt?";
        q[29][4]="How many chapters does the glorious Quran contain? ";

        //first ans

        q[0][0]="virtual machine";
        q[1][0]="Adds 1 to counter";
        q[2][0]="For Loop 1";
        q[3][0]="Break";
        q[4][0]="Control value";
        q[5][0]="A collection of statements grouped together to perform an operation";
        q[6][0]="Representation of an entity in the real world that can be distinctly identified";
        q[7][0]="Numbers of items ArrayList can store without increasing its size";
        q[8][0]="Throw";
        q[9][0]="Created";
        q[10][0]="Classes";
        q[11][0]="pkg";
        q[12][0]="TRUE";
        q[13][0]="instanceOf";
        q[14][0]="Obj";
        q[15][0]="Java 4.0";
        q[16][0]="int";
        q[17][0]="byte";
        q[18][0]="long";
        q[19][0]="int";
        q[20][0]="characters";
        q[21][0]="both integers and floating - numbers ";
        q[22][0]="classes ";
        q[23][0]="/*";
        q[24][0]="javac filename.java";
        q[25][0]="UTC + 5 ";
        q[26][0]="1,682 km";
        q[27][0]="Droughts, Cyclones , and Earthquake";
        q[28][0]="Snow , Frost , Ice ";
        q[29][0]="100";

        //second ans

        q[0][1]="the physical machine\n";
        q[1][1]="Adds 2 to counter\n";
        q[2][1]="Infinite Loop\n ";
        q[3][1]="Program will exit\n";
        q[4][1]="Mutator Method\n ";
        q[5][1]="A value returned from a method using the return statement\n";
        q[6][1]="A static method can be called without creating an instance of the class\n";
        q[7][1]="Number used as an index to pinpoint a specific element within an array\n";
        q[8][1]="call stack\n";
        q[9][1]="Called\n";
        q[10][1]="Sub Packages\n";
        q[11][1]="Pkg\n";
        q[12][1]="FALSE\n";
        q[13][1]="import\n";
        q[14][1]="Source Code\n";
        q[15][1]="Java 8.0\n";
        q[16][1]="byte\n ";
        q[17][1]="enum\n";
        q[18][1]="byte\n ";
        q[19][1]="double\n";
        q[20][1]="boolean\n";
        q[21][1]="integers\n";
        q[22][1]="sub packages \n";
        q[23][1]="//\n";
        q[24][1]="java filename.java\n";
        q[25][1]="UTC + 6\n ";
        q[26][1]="257 km\n";
        q[27][1]="Cyclones , Earthquakes, and Severe flooding\n";
        q[28][1]="Humid , Warm , Rainy\n";
        q[29][1]="125\n";


        //third ans

        q[0][2]="applications such as browsers\n";
        q[1][2]="Gets the sum\n";
        q[2][2]="Do-While Loop\n";
        q[3][2]="Repeat\n";
        q[4][2]="Accessor Method\n";
        q[5][2]="The portion of the program where the variable can be accessed\n";
        q[6][2]="Instance variable/instance method\n";
        q[7][2]="Object that can store a group of values, all of the same type\n";
        q[8][2]="try block\n";
        q[9][2]="Thrown\n";
        q[10][2]="Interfaces\n";
        q[11][2]="package\n";
        q[12][2]="can be true or false\n";
        q[13][2]="extends\n";
        q[14][2]="Bytecode\n";
        q[15][2]="Java 5.0\n";
        q[16][2]="short\n";
        q[17][2]="short\n";
        q[18][2]="short\n";
        q[19][2]="long\n";
        q[20][2]="numeric\n";
        q[21][2]="floating point numbers\n";
        q[22][2]="all of the above\n";
        q[23][2]="/\n";
        q[24][2]="javac filename\n";
        q[25][2]="UTC + 4\n";
        q[26][2]="2,798 km\n";
        q[27][2]="Droughts, Cyclones , and Severe Flooding\n";
        q[28][2]="Hot & Dry\n";
        q[29][2]="114\n";

        //fourth ans

        q[0][3]="part of the processor\n";
        q[1][3]="Multiplies the numbers\n";
        q[2][3]="Full Loop\n";
        q[3][3]="Continue through program\n";
        q[4][3]="Sentinel Value\n";
        q[5][3]="The combination of the name of a method and the list of its parameters\n";
        q[6][3]="A template,blueprint or contract that defines what an object's data fields and methods will be\n";
        q[7][3]="Method of locating a specific item in a larger collection of data\n";
        q[8][3]="thrown\n";
        q[9][3]="Generated\n";
        q[10][3]="All of the above\n";
        q[11][3]="Package\n";
        q[12][3]="can not say\n";
        q[13][3]="implement\n";
        q[14][3]="exe\n";
        q[15][3]="Java 6.0\n";
        q[16][3]="long\n";
        q[17][3]="int\n";
        q[18][3]="double\n";
        q[19][3]="byte\n";
        q[20][3]="both numeric and characters\n";
        q[21][3]="none of the mentioned\n";
        q[22][3]="interfaces\n";
        q[23][3]="none of these\n";
        q[24][3]="java filename\n";
        q[25][3]="none of all\n";
        q[26][3]="580 km\n";
        q[27][3]="Droughts, Earthquakes, and Landslides\n";
        q[28][3]="Mild\n";
        q[29][3]="90\n";

        //ans
        anss[0]=1;
        anss[1]=0;
        anss[2]=1;
        anss[3]=2;
        anss[4]=3;
        anss[5]=0;
        anss[6]=0;
        anss[7]=2;
        anss[8]=0;
        anss[9]=2;
        anss[10]=3;
        anss[11]=2;
        anss[12]=0;
        anss[13]=1;
        anss[14]=2;
        anss[15]=2;
        anss[16]=1;
        anss[17]=1;
        anss[18]=3;
        anss[19]=1;
        anss[20]=3;
        anss[21]=0;
        anss[22]=2;
        anss[23]=1;
        anss[24]=3;
        anss[25]=1;
        anss[26]=3;
        anss[27]=2;
        anss[28]=1;
        anss[29]=2;
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (ans[anss[ques]].isSelected())
                count++;
            current++;
            set();
            if (current == 9) {
                b1.setEnabled(false);
                b2.setEnabled(true);
            }
        }
        if (e.getActionCommand().equals("Result")) {
            if (ans[anss[ques]].isSelected())
                count++;
            current++;
            // System.out.println("correct ans="+count);
            JOptionPane.showMessageDialog(this, "correct ans=" + count);
            System.exit(0);
        }
    }

    void set()
    {
        ans[4].setSelected(true);
        ques=(int)((Math.random() * 29) + 0);
        while(vis[ques])
        {
            ques=(int)((Math.random() * 29) + 0);
        }
        vis[ques]=true;
        l.setText(q[ques][4]);
        ans[0].setText(q[ques][0]);
        ans[1].setText(q[ques][1]);
        ans[2].setText(q[ques][2]);
        ans[3].setText(q[ques][3]);

        l.setBounds(30, 40, 850, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            ans[j].setBounds(50, 80 + i, 600, 20);
    }
}


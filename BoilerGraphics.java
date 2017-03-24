
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener
{
JFrame window;
JPanel p1;
JPanel p2;
JPanel p3;
JPanel p4;
JPanel p5;
JButton graphic;
JTextArea statusT;
JTextArea storyT;
JTextField input;
JButton commandB1;
Timer timer;

public static void main(String[]args)
{

    BoilerGraphics game = new BoilerGraphics();

    game.opening();
}

public void opening()
{

    Boilerlogic boiler = new Boilerlogic();
    JFrame window = new JFrame();
    window.setBounds(200,200,1024,768);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBackground(Color.black);
    window.setLayout(null); //Disabling the default layout.

    Font basicfont = new Font("MS Gothic", Font.PLAIN, 20);

    // Panel Setup
    JPanel p1 = new JPanel(); //This is where graphics are displayed.
    p1.setBounds(670, 680, 325, 50); //Panel layout(x,y,x,y)
    p1.setBackground(Color.black);

    JPanel p2 = new JPanel(); //This is where status is displayed.
    p2.setBounds(670, 10, 325, 350);
    p2.setBackground(Color.black);

    JPanel p3 = new JPanel(); //This is where story text is displayed.
    p3.setBounds(10, 370, 650, 350);
    p3.setBackground(Color.black);

    JPanel p4 = new JPanel(); //This is where command menu is displayed.
    p4.setBounds(670, 370, 325, 300);
    p4.setBackground(Color.black);
    p4.setLayout(new GridLayout(5,1)); //Setting the layout of Panel 4

    JPanel p5 = new JPanel(); //This is the text-entry box.
    p5.setBounds(10, 10, 650, 350);


    // TextArea Setup
    statusT = new JTextArea();
    storyT = new JTextArea();
    input = new JTextField(32);


    JButton commandB1 = new JButton("Quit Game");

    //Graphic setup
    //graphic = new JButton(new ImageIcon("dungeonSample.jpg"));
    //graphic.setBackground(Color.black);


    //Status text setup
    statusT.setFont(basicfont);
    statusT.setBackground(Color.black);
    statusT.setForeground(Color.white);
    statusT.setText(""); //Ths is just a sample status

    //Story text setup
    storyT.setFont(basicfont);
    storyT.setBackground(Color.black);
    storyT.setForeground(Color.white);
    storyT.setText(boiler.str_roominfo);

    //Input box setup
    input.setFont(basicfont);
    input.setBackground(Color.black);
    input.setForeground(Color.white);
    //input.setText("Input a number here>");
    input.addActionListener(this);



    // Add Text>>Panel>>Window
    //p1.add(graphic);
    p2.add(statusT);
    p3.add(storyT);
    p4.add(commandB1);
    p5.add(input);

    window.add(p1);
    window.add(p2);
    window.add(p3);
    window.add(p4);
    window.add(p5);

    window.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
  Boilerlogic boiler = new Boilerlogic();
  Boilerlogic boiler2 = new Boilerlogic();
  Boilerlogic boiler3 = new Boilerlogic();
  String bchoice1 = input.getText();
  input.selectAll();
    if (bchoice1.equals("start"))
    {
      storyT.setText(boiler.prompts);
      storyT.setText(boiler.mainmenu);
      input.selectAll();
    }
    String bchoice2 = bchoice1;

    if (bchoice2.equals("1"))
    {
      storyT.setText(boiler2.Table_descrip);
      storyT.append(boiler2.prompts);
      storyT.append(boiler2.possibleValues);
    }

    if (bchoice2.equals("2"))
    {
      storyT.setText(boiler3.tryDoor(boiler3.key5));
    }

    String bchoice3 = bchoice2;

    if (bchoice3.equals("R") || bchoice3.equals("G") || bchoice3.equals("B"))
    {
      boiler3.choiceTableMenu(bchoice3);
      boiler3.getColour();
      storyT.setText(boiler3.curr_d_colour);
      boiler3.changeDial(bchoice3);
      boiler3.tryDoor(boiler3.key5);
      storyT.append(boiler3.new_d_colour);
      boiler3.changeKey(bchoice3);
      System.out.println(boiler3.changeDial(bchoice3));
      System.out.println("Key value: " + boiler3.key5);

    }


}


}

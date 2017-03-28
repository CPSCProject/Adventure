import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
*GUI panel that displays the logic of the Library class with 8 riddles
*Each action creates an instance of Library class and runs one method
*code adapted from http://stackoverflow.com/questions/29578570/having-a-trouble-in-making-a-text-based-rpg-text-area-field-related
*/

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
JButton commandB2;
JButton commandB3;
JButton commandB4;
JButton commandB5;
Timer timer;

public static void main(String[]args)
{
    String display1 = "\n   Riddle 1: \n   What is a 7 letter word containing thousands of letters?   \n";

    //String display2 = "Riddle 2: \nWhat is it that after you take away the whole, some still remains?";

    //String display3 = "Riddle 3: \nName an eight letter word that has kst in the middle, in the beginning, and at the end. ";

    Main game = new Main();
    game.opening(display1);

}

public void opening(String displaymessage)
{


    JFrame window = new JFrame();
    window.setBounds(200,200,1024,868);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBackground(Color.pink);
    window.setLayout(new GridLayout(2,4,1,1)); //Disabling the default layout.

    Font basicfont = new Font("Comic Sans", Font.PLAIN, 20);

    // Panel Setup
    JPanel p1 = new JPanel(); //This is where graphics are displayed.
    p1.setBounds(670, 675, 325, 140); //Panel layout(x,y,x,y)
    p1.setBackground(Color.pink);

    JPanel p2 = new JPanel(); //This is where status is displayed.
    p2.setBounds(670, 10, 325, 350);
    p2.setBackground(Color.pink);

    JPanel p3 = new JPanel(); //This is where story text is displayed.
    p3.setBounds(0, 210, 660, 550);
    p3.setBackground(Color.pink);

    JPanel p4 = new JPanel(); //This is where command menu is displayed.
    p4.setBounds(670, 370, 325, 300);
    p4.setBackground(Color.pink);
    p4.setLayout(new GridLayout(5,1)); //Setting the layout of Panel 4

    JPanel p5 = new JPanel(); //This is the text-entry box.
    p5.setBounds(10, 80, 650, 350);


    // TextArea Setup
    statusT = new JTextArea();
    storyT = new JTextArea();
    input = new JTextField(32);


    JButton commandB1 = new JButton("1: Quit game");
    commandB1.setBackground(Color.pink);
    commandB1.setForeground(Color.white);
    JButton commandB2 = new JButton("2: view difficulty");
    commandB2.setBackground(Color.white);
    commandB2.setForeground(Color.pink);
    /*
    JButton commandB3 = new JButton("");
    commandB3.setBackground(Color.pink);
    commandB3.setForeground(Color.white);
    JButton commandB4 = new JButton("");
    commandB4.setBackground(Color.white);
    commandB4.setForeground(Color.pink);
    JButton commandB5 = new JButton("");
    commandB5.setBackground(Color.pink);
    commandB5.setForeground(Color.white);
    */
    //Graphic setup
    //graphic = new JButton(new ImageIcon("flower.jpg"));
    //graphic.setBackground(Color.pink);


    //Status text setup
    statusT.setFont(basicfont);
    statusT.setBackground(Color.pink);
    statusT.setForeground(Color.black);
    //statusT.setText("\n\n   LV     Kitchen   \n\n   HP   100   \n\n   MP    28   \n\n   EXP   36   \n\n"); //Ths is just a sample status

    //Story text setup
    storyT.setFont(basicfont);
    storyT.setBackground(Color.pink);
    storyT.setForeground(Color.black);
    storyT.setText(displaymessage);

    //Input box setup
    input.setFont(basicfont);
    input.setBackground(Color.white);
    input.setForeground(Color.black);
    //input.setText("Answer: ");
    input.addActionListener(this);



    // Add Text>>Panel>>Window

    p3.add(statusT);
    p2.add(storyT);
    p4.add(commandB1);
    p4.add(commandB2);
    //p4.add(commandB3);
    //p4.add(commandB4);
    //p4.add(commandB5);
    p5.add(input);
    //p1.add(graphic);


    window.add(p1);
    window.add(p2);
    window.add(p3);
    window.add(p4);
    window.add(p5);

    window.setVisible(true);
    storyT.setText("You have entered the library. \nRiddle 1: What is a 7 letter word containing thousands of letters? \n1. mailbox \n2. alphabet ");
}


public void actionPerformed(ActionEvent e)
{
    String lchoice = input.getText();
    if (lchoice.equals("mailbox") || lchoice.equals("alphabet")) {
      Library key1p1 = new Library();
      String puzzle1menu = key1p1.puzzle1method(lchoice);
      storyT.setText(puzzle1menu);
      input.selectAll();
    }
    String lchoice2 = input.getText();
    if (lchoice2.equals("wholesome") || lchoice2.equals("donut")) {
      Library key1p2 = new Library();
      String puzzle2menu = key1p2.puzzle2method(lchoice2);
      storyT.setText(puzzle2menu);
      input.selectAll();
    }
    String lchoice3 = input.getText();
    if (lchoice3.equals("inkstand") || lchoice3.equals("kstkstkst")) {
      Library key1p3 = new Library();
      String puzzle3menu = key1p3.puzzle3method(lchoice3);
      storyT.setText(puzzle3menu);
      input.selectAll();
    }
    String lchoice4 = input.getText();
    if (lchoice4.equals("refunded") || lchoice4.equals("deafened")) {
      Library key1p4 = new Library();
      String puzzle4menu = key1p4.puzzle4method(lchoice4);
      storyT.setText(puzzle4menu);
      input.selectAll();
    }
    String lchoice5 = input.getText();
    if (lchoice5.equals("observant") || lchoice5.equals("observance")) {
      Library key1p5 = new Library();
      String puzzle5menu = key1p5.puzzle5method(lchoice5);
      storyT.setText(puzzle5menu);
      input.selectAll();
    }
    String lchoice6 = input.getText();
    if (lchoice6.equals("flamingos") || lchoice6.equals("flamenco")) {
      Library key1p6 = new Library();
      String puzzle6menu = key1p6.puzzle6method(lchoice6);
      storyT.setText(puzzle6menu);
      input.selectAll();
    }
    String lchoice7 = input.getText();
    if (lchoice7.equals("361127") || lchoice7.equals("112736")) {
      Library key1p7 = new Library();
      String puzzle7menu = key1p7.puzzle7method(lchoice7);
      storyT.setText(puzzle7menu);
      input.selectAll();
    }
    String lchoice8 = input.getText();
    if (lchoice8.equals("190442") || lchoice8.equals("041942")) {
      Library key1p8 = new Library();
      String puzzle8menu = key1p8.puzzle8method(lchoice8);
      storyT.setText(puzzle8menu);
      input.selectAll();
    }

}
}

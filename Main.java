import GUI.TimerR;
import rooms.Library;
import rooms.Kitchen;
import rooms.Boiler;
import rooms.Key3;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
*The Main class inherits the Jframe and implements the ActionListener.
*The Main class creates a JFrame with 4 panels.
*Instances are made in this class to call methods in classes Kitchen and Library.
*Input from user is taken as a parameter to these methods
*corresponding output is the returned from the methods in Class Kitchen and Class Library.
*The output is then displayed in the TextArea with a following menu.
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
JButton Image1;
Timer timer;

public static void main(String[]args)
{

    Main game = new Main();
    game.opening();

}



public void opening()
{

    JFrame window = new JFrame();
    window.setBounds(200,50,1024,768);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBackground(Color.black);
    window.setLayout(null); //Disabling the default layout.

    Font basicfont = new Font("MS Gothic", Font.PLAIN, 20);
    // Panel Setup
    JPanel p1 = new JPanel(); //This is where graphics are displayed.
    p1.setBounds(670, 680, 325, 50); //Panel layout(x,y,x,y)
    p1.setBackground(Color.pink);


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
    p5.setBounds(60, 60, 650, 350);

    TimerR panel = new TimerR();//This is the Timer panel
    panel.setBounds(20,20,250,250);

//------------------------------------------------------------------------------
    // TextArea Setup
    statusT = new JTextArea();
    storyT = new JTextArea();
    input = new JTextField(32);


    JButton commandB1 = new JButton("Go to previous menu");
    JButton commandB2 = new JButton("Quit");





    //Graphic setup
    //graphic = new JButton(new ImageIcon("dungeonSample.jpg"));
    //graphic.setBackground(Color.black);


    //Status text setup
    statusT.setFont(basicfont);
    statusT.setBackground(Color.black);
    statusT.setForeground(Color.white);


    //Story text setup
    storyT.setFont(basicfont);
    storyT.setBackground(Color.black);
    storyT.setForeground(Color.white);
    storyT.setText("Adventure Game: input 'start' to start game");

    //Input box setup
    input.setFont(basicfont);
    input.setBackground(Color.black);
    input.setForeground(Color.white);
    //input.setText("Input a number here>");
    input.addActionListener(this);

    // add map jpg to top right panel
    String mapPath = "map.jpg";
    ImageIcon mapIcon = new ImageIcon(mapPath);
    Image mapImage = mapIcon.getImage();
    Image changedImg = mapImage.getScaledInstance(120,120, Image.SCALE_SMOOTH);
    ImageIcon Icon = new ImageIcon(changedImg);
    JButton Image1 = new JButton(Icon);



    // Add Text>>Panel>>Window
    //p1.add(graphic);
    p2.add(Image1);
    p2.add(statusT);
    p3.add(storyT);
    p4.add(commandB1);
    commandB1.addActionListener(new Action());
    p4.add(commandB2);
    p5.add(input);

    window.add(p1);
    window.add(p2);
    window.add(p3);
    window.add(p4);
    window.add(p5);


    window.add(panel);//Add the timer to the JFrame
    window.setLocationByPlatform( true );
    window.setVisible(true);

    //The main menu is shown before any input.
    storyT.setText("You have entered the library.\nRiddle 1:\nWhat is a 7 letter\nword containing thousands of letters? \n1. mailbox \n2. alphabet ");

}

public void actionPerformed(ActionEvent e)
{
//--------------------------LIBRARY------------------------------------------------
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
//--------------------------KITCHEN--------------------------------------------------


        String choice = input.getText();
        if(choice.equals("t") || choice.equals("c")){
          Kitchen key2 = new Kitchen();
          String table_menu = key2.KitchenExploreTable(choice);
          storyT.setText(table_menu);
          System.out.println("choice is:" + choice);
          //input.setText(null);
          input.selectAll();
          //Boolean table = false;
        }
        //Displays menu for the table. Player can pick paper or knife to store in the inventory.
          String choice2 = choice;
          Kitchen key2_paper = new Kitchen();
          if(choice2.equals("k")|| choice2.equals("p")){ //if statement to prevent it from skipping menus.
          String paper_menu = key2_paper.KitchenExplorePaper(choice2);
          storyT.setText(paper_menu);
          System.out.println("choice2 is:" + choice2);
          //input.setText(null);
          input.selectAll();
        }

        //Displays menu for the cabinet. Player can try to unlock the.
        String choice3 = choice2;
        Kitchen key2_cabinet = new Kitchen();
        if(choice3.equals("e")|| choice3.equals("l")){
        String cabinet_menu = key2_cabinet.KitchenExploreCabinet(choice3);
        storyT.setText(cabinet_menu);
        System.out.println("choice3 is:" + choice3);
        //input.setText(null);
        input.selectAll();
      }

      String choice4 = choice3;
      Kitchen key2_code = new Kitchen();
      if(choice4.equals("345")|| choice4.equals("987")){
      String code_menu = key2_code.KitchenExploreCode(choice4);
      storyT.setText(code_menu);
      System.out.println("choice4 is:" + choice3);
      //input.setText(null);
      input.selectAll();
    }



}
//Action listerner for quit button.
public class Action implements ActionListener{
public void actionPerformed(ActionEvent b){
 storyT.setText("Do you wanna quit?");
}
}
}

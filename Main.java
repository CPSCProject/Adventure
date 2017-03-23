

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
JButton commandB2;
JButton commandB3;
JButton commandB4;
JButton commandB5;
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
    p5.setBounds(60, 60, 650, 350);






    // TextArea Setup
    statusT = new JTextArea();
    storyT = new JTextArea();
    input = new JTextField(32);


    JButton commandB1 = new JButton("1:Stay");
    JButton commandB2 = new JButton("2:Attack the man");
    JButton commandB3 = new JButton("3:Drink");
    JButton commandB4 = new JButton("4:Leave");
    JButton commandB5 = new JButton("5:(Debug)Clear the text");

    //Graphic setup
    //graphic = new JButton(new ImageIcon("dungeonSample.jpg"));
    //graphic.setBackground(Color.black);


    //Status text setup
    statusT.setFont(basicfont);
    statusT.setBackground(Color.black);
    statusT.setForeground(Color.white);
    statusT.setText("\nLV     Kitchen\nHP   100\nMP    28\nEXP   36"); //Ths is just a sample status

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



    // Add Text>>Panel>>Window
    //p1.add(graphic);
    p2.add(statusT);
    p3.add(storyT);
    p4.add(commandB1);
    p4.add(commandB2);
    p4.add(commandB3);
    p4.add(commandB4);
    p4.add(commandB5);
    p5.add(input);

    window.add(p1);
    window.add(p2);
    window.add(p3);
    window.add(p4);
    window.add(p5);

    TimerR panel = new TimerR();
    panel.setBounds(20,20,250,250);
    window.add(panel);//Add the timer to the JFrame
    window.setLocationByPlatform( true );
    window.setVisible(true);
    storyT.setText("There is a table across the room. \nYou see a cabinet and hope to find something useful\n (1) Move towards the Table.\n (2) Try to open the Cabinet.");


}





public void actionPerformed(ActionEvent e)
{
//--------------------------KITCHEN--------------------------------------------------

        String choice = input.getText();
        if(choice.equals("1") || choice.equals("2")){
          Kitchen key2 = new Kitchen();
          String table_menu = key2.KitchenExploreTable(choice);
          storyT.setText(table_menu);
          System.out.println("choice is:" + choice);
          //input.setText(null);
          input.selectAll();
          //Boolean table = false;
        }

          String choice2 = choice;
          Kitchen key2_paper = new Kitchen();
          if(choice2.equals("k")|| choice2.equals("p")){
          String paper_menu = key2_paper.KitchenExplorePaper(choice2);
          storyT.setText(paper_menu);
          System.out.println("choice2 is:" + choice2);
          //input.setText(null);
          input.selectAll();
        }

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



}

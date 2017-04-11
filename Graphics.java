import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import GUI.TimerR;
import rooms.Kitchen;
import rooms.Library;

/**
* @author  Erika Fung, Rumika Mascarenhas, Neera Phell, John Kim, Jiahe Huang
*
* The Graphics class creates the GUI portion of the game.
* The Graphics class first creates the main JFrame window and adds JPanels in
* a gridbag layout to the JFrame window. The size of the JPanels are determined by
* their weightx and weighty
*
*/

public class Graphics extends JFrame implements ActionListener

{

final static boolean shouldWeightX = true;
JFrame mainwindow;
JPanel mainpanel;
JPanel userstatus; //00 --> 01
JPanel story;
JPanel questionpanel; //01
JPanel mappanel; //02
JPanel answerpanel; //11
JPanel buttonpanel; //12
JPanel TimerR; //20
JTextArea storyT;
JButton quitbutton;
JButton getclue;
JTextField input;
ActionListener quitB;
ActionListener getHintB;


public void opening()
{
  JFrame mainframe = new JFrame();
  mainframe.setSize(1000,1000);
  JPanel mainPanel = new JPanel(new GridBagLayout());
  GridBagConstraints c = new GridBagConstraints();
  Font basicfont = new Font("Comic Sans", Font.PLAIN, 60);
/** add user status---------------------------------------------------------------
*   Top left panel
*   4x space among columns
*   15x space among rows
*/
  JPanel userstatus = new JPanel();

  c.gridx = 0;
  c.gridy = 0;
  c.weightx = 4.0;
  c.weighty = 15.0;
  c.fill = GridBagConstraints.BOTH;
  userstatus.setBackground(Color.ORANGE);
  userstatus.add(new JTextArea("This is where the user status will go."));
  mainPanel.add(userstatus,c);

/** add room description---------------------------------------------------------
*   Middle left panel
*   4x space among columns
*   15x space among rows
*/
  JPanel story = new JPanel();

  c.gridx = 0;
  c.gridy = 1;
  c.weightx = 4.0;
  c.weighty = 15.0;
  c.fill = GridBagConstraints.BOTH;
  Library key1desc = new Library();
  String lDescription = key1desc.libraryDescription();
  story.add(new JTextArea(lDescription));
  story.setBackground(Color.YELLOW);
  mainPanel.add(story,c);

/**add question Panel------------------------------------------------------------
*   Middle top panel
*   10x space among columns
*   15x space among rows
*
*/
  JPanel questionpanel = new JPanel();

  c.gridx = 1;
  c.gridy = 0;
  c.weightx = 10.0;
  c.weighty = 15.0;
  c.fill = GridBagConstraints.BOTH;
  //questionpanel.add(new JTextArea("This is where the question will go."));
  storyT = new JTextArea("You have entered the library. \nRiddle 1: What is a 7 letter word containing thousands of letters? Is it mailbox or alphabet? ");
  questionpanel.add(storyT);
  //question1panel.add(new JTextArea("You have entered the library. \nRiddle 1: What is a 7 letter word containing thousands of letters? \n1. mailbox \n2. alphabet "));
  questionpanel.setBackground(Color.PINK);
  mainPanel.add(questionpanel,c);


/**add map image---------------------------------------------------------------
*/
  String mapPath = "map.jpg";
  ImageIcon mapIcon = new ImageIcon(mapPath);
  Image mapImage = mapIcon.getImage();
  Image mapImg = mapImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
  ImageIcon mapIcon1 = new ImageIcon(mapImg);
  JButton map = new JButton(mapIcon1);

/**add map Panel-----------------------------------------------------------------
*   Top right panel
*   10x space among columns
*   15x space among rows
*/
  JPanel mappanel = new JPanel(new CardLayout());

  c.gridx = 2;
  c.gridy = 0;
  c.weightx = 10.0;
  c.weighty = 15.0;
  mappanel.setBackground(Color.RED);
  mappanel.add(map);
  mainPanel.add(mappanel,c);



/**Add answer Panel--------------------------------------------------------------
*
*
*/
JPanel answerpanel = new JPanel(new CardLayout());

/** mcq style card
*   Middle center panel
*/
  JPanel mcq = new JPanel();

  mcq.setLayout(new GridLayout(5,0,1,1));
  mcq.add(new JButton("Button 1"));
  mcq.add(new JButton("Button 2"));
  mcq.add(new JButton("Button 3"));


/**written style card
*/
  JPanel writtenresponse = new JPanel();

  //JTextField input;
  writtenresponse.add(new JLabel("Enter your answer:"));
  input = new JTextField(50);
  writtenresponse.add(input);

/**panel position in GridBagLayout
*/
  c.gridx = 1;
  c.gridy = 1;
  c.weightx = 10.0;
  c.weighty = 10.0;
  c.fill = GridBagConstraints.BOTH;
  //answerpanel.add(mcq);
  answerpanel.add(writtenresponse);
  answerpanel.setBackground(Color.GREEN);
  input.addActionListener(this);
  mainPanel.add(answerpanel,c);


/**Add button panel--------------------------------------------------------------
*   Middle right panel
*   1x space among columns
*   0.5x space among rows
*/
  JPanel buttonpanel = new JPanel();
  buttonpanel.setLayout(new GridLayout(9,9,0,0));
  c.gridx = 2;
  c.gridy = 1;
  c.weightx = 0.5;
  buttonpanel.setBackground(Color.BLUE);
  JButton quitbutton = new JButton("Quit Game");
  JButton getclue = new JButton("Get Hint");
  buttonpanel.add(quitbutton);
  buttonpanel.add(getclue);
  mainPanel.add(buttonpanel,c);

/**Add actionlisnter to JButton--------------------------------------------------
*
*
*/
   quitbutton.addActionListener(this);
   quitbutton.setActionCommand("Quit Game");
   getclue.addActionListener(this);
   getclue.setActionCommand("Get Hint");

/**Add timer panel---------------------------------------------------------------
*   Entire bottom panel
*   3x space among columns
*   1x space among rows
*/
JPanel TimerR = new TimerR();
CountDownProgressBar cdp = new CountDownProgressBar();
TimerR.add(cdp.progressBar);
c.gridx = 0;
c.gridy = 2;
c.weightx = 3.0;
c.weighty = 1.0;
c.gridwidth = GridBagConstraints.REMAINDER;
TimerR.setBackground(Color.PINK);
mainPanel.add(TimerR,c);

/** mainframe set up-------------------------------------------------------------
*
*
*/
  mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  mainframe.getContentPane().add(mainPanel);
  mainframe.pack();
  mainframe.setLocationByPlatform(true);
  mainframe.setVisible(true);

  }

/**  Implementing riddles into GUI-------------------------------------------------------------
*
*
*/
  public void actionPerformed(ActionEvent e)
  {


      String lchoice = input.getText();
      if(e.getActionCommand() == "Get Hint") {
         JOptionPane.showMessageDialog(null, "hint ");
     }

     if(e.getActionCommand() == "Quit Game") {
         System.exit(0);
     }
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
//----------------------KITCHEN----------------------------------------------
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

  public static void main(String[]args)
  {
     Graphics game = new Graphics();
     game.opening();
  }
}

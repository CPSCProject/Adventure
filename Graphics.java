/*
Hey guys, this is the version of the GUI for the game. Most of the main stuff is
layed out.
A few more things need to be added, like the timer and the maps. If these can be
added, it would make it a lot easier to start adding in menu options and determining
card order.
When the program starts, it comes as a really small pop up instead of a full sized
window. I'm not sure how to fix this feel free to fix it if you know the problem.
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Graphics extends JFrame

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
JPanel timerpanel; //20

JButton quitbutton;
JButton getclue;

JTextField input;


public void opening()
{
  JFrame mainframe = new JFrame();
  mainframe.setSize(1000,1000);
  JPanel mainPanel = new JPanel(new GridBagLayout());
  GridBagConstraints c = new GridBagConstraints();

//add user status---------------------------------------------------------------
  JPanel userstatus = new JPanel();
  c.gridx = 0;
  c.gridy = 0;
  c.weightx = 4.0;
  c.weighty = 15.0;
  c.fill = GridBagConstraints.BOTH;
  userstatus.setBackground(Color.ORANGE);
  userstatus.add(new JTextArea("This is where the user status will go."));
  mainPanel.add(userstatus,c);

// add room description---------------------------------------------------------
  JPanel story = new JPanel();
  c.gridx = 0;
  c.gridy = 1;
  c.weightx = 4.0;
  c.weighty = 15.0;
  c.fill = GridBagConstraints.BOTH;
  story.add(new JTextArea("This is where the room description will go."));
  story.setBackground(Color.YELLOW);
  mainPanel.add(story,c);

//add question Panel------------------------------------------------------------
  JPanel questionpanel = new JPanel();
  c.gridx = 1;
  c.gridy = 0;
  c.weightx = 10.0;
  c.weighty = 15.0;
  c.fill = GridBagConstraints.BOTH;
  questionpanel.add(new JTextArea("This is where the question will go."));
  questionpanel.setBackground(Color.PINK);
  mainPanel.add(questionpanel,c);


  //add map image---------------------------------------------------------------

  String mapPath = "map.jpg";
  ImageIcon mapIcon = new ImageIcon(mapPath);
  Image mapImage = mapIcon.getImage();
  Image mapImg = mapImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
  ImageIcon mapIcon1 = new ImageIcon(mapImg);
  JButton map = new JButton(mapIcon1);


  //add room buttons on map---------------------------------------------------------------

  JButton dungeon = new JButton("Dungeon");
  dungeon.setBounds(10, 10, 20, 20);
  dungeon.setSize(50,50);
  JButton kitchen = new JButton("Kitchen");
  kitchen.setBounds(10, 10, 200, 200);
  kitchen.setSize(50,50);
  JButton boiler = new JButton("Boiler");
  boiler.setBounds(10, 10, 200, 200);
  boiler.setSize(50,50);
  JButton library = new JButton("Library");
  library.setBounds(10, 10, 200, 200);
  library.setSize(50,50);
  JButton bedroom = new JButton("Bedroom");
  bedroom.setBounds(10, 10, 200, 200);
  bedroom.setSize(50,50);


 //add clickable actions on the map buttons---------------------------------------------------------------
  /*
  dungeon.addActionListener(this);
  dungeon.setActionCommand("Dungeon");
  dungeon.addActionListener(new ButtonListener());

  kitchen.addActionListener(this);
  kitchen.setActionCommand("Kitchen");
  kitchen.addActionListener(new ButtonListener());

  boiler.addActionListener(this);
  boiler.setActionCommand("Boiler");
  boiler.addActionListener(new ButtonListener());

  library.addActionListener(this);
  library.setActionCommand("Library");
  library.addActionListener(new ButtonListener());

  bedroom.addActionListener(this);
  bedroom.setActionCommand("Bedroom");
  bedroom.addActionListener(new ButtonListener()); */

//add map Panel-----------------------------------------------------------------
  JPanel mappanel = new JPanel(new CardLayout());

  //mappanel.setLayout(new GridLayout(6,1));
  /*
   add the map version to a new card (create a new panel for each card and then
   add it to the mappanel NOT the main panel otherwise everthing gets messed up) :P
  */
  c.gridx = 2;
  c.gridy = 0;
  c.weightx = 10.0;
  c.weighty = 15.0;
  mappanel.setBackground(Color.RED);
  mappanel.add(map);
  /*mappanel.add(dungeon);
  mappanel.add(library);
  mappanel.add(kitchen);
  mappanel.add(boiler);
  mappanel.add(bedroom);*/




  mainPanel.add(mappanel,c);




//Add answer Panel--------------------------------------------------------------
  JPanel answerpanel = new JPanel(new CardLayout());
//mcq style card
  JPanel mcq = new JPanel();
  mcq.setLayout(new GridLayout(5,0,1,1));
  mcq.add(new JButton("Button 1"));
  mcq.add(new JButton("Button 2"));
  mcq.add(new JButton("Button 3"));
  /*
  depending on who's level we are on/ stage in game, we can add or take away button by adding
  more cards --> i will add the menu options here.
  */

//written style card
  JPanel writtenresponse = new JPanel();
  writtenresponse.add(new JLabel("Enter your answer:"));
  writtenresponse.add(new JTextField(50));
//panel position in GridBagLayout
  c.gridx = 1;
  c.gridy = 1;
  c.weightx = 10.0;
  c.weighty = 10.0;
  c.fill = GridBagConstraints.BOTH;
  answerpanel.add(mcq);
  answerpanel.add(writtenresponse);
  answerpanel.setBackground(Color.GREEN);
  mainPanel.add(answerpanel,c);

//Add button panel--------------------------------------------------------------
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

//Add timer panel---------------------------------------------------------------
  JPanel timerpanel = new JPanel();
  c.gridx = 0;
  c.gridy = 2;
  c.weightx = 3.0;
  c.weighty = 1.0;
  c.gridwidth = GridBagConstraints.REMAINDER;
  timerpanel.setBackground(Color.BLACK);
  mainPanel.add(timerpanel,c);

// mainframe set up-------------------------------------------------------------
  mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  mainframe.getContentPane().add(mainPanel);
  mainframe.pack();
  mainframe.setLocationByPlatform(true);
  mainframe.setVisible(true);
  }

  public static void main(String[]args)
  {
     Graphics game = new Graphics();

      game.opening();
  }

/*  class ButtonListener implements ActionListener
  {
          ButtonListener() {
          }


    /*      /// to make it perform
          public void actionPerformed(ActionEvent eve)
          {


              if(eve.getActionCommand() == "1:Help") {
                  JOptionPane.showMessageDialog(null, "Hello");

                  //commandB1.setVisible(false);
                  //JButton Image1 = new JButton(Icon5);

              }

              // when you first pressed one button
              else if(eve.getActionCommand() == "Dungeon")
              {
                  storyT.setText("You have entered the dungeon!");

              }

              else  if(eve.getActionCommand() == "Kitchen")
              {
                  storyT.setText("You have entered the kitchen!");

              }

              else if(eve.getActionCommand() == "Boiler")
              {
                  storyT.setText("You have entered the boiler!");

              }
              else  if(eve.getActionCommand() == "Bedroom")
              {
                  storyT.setText("You have entered the bedroom!");

              }
              else  if(eve.getActionCommand() == "Library")
              {
                  storyT.setText("You have entered the library");
              }
          }  */
  //}
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.*;


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
JPanel timerpanel; //20
JTextArea storyT;
JButton quitbutton;
JButton getclue;
JTextField input;
ActionListener quitB;
ActionListener getHintB;
String line;
BufferedReader br = null;
FileReader fr = null;
java.util.List<String> name = new ArrayList<String>();

String[] namesArray;

public String libraryDescription() {
	  String lDescription, lDescription1, lDescription2, lDescription3;
	  try {
	    fr = new FileReader("Introduction.txt");
	    br = new BufferedReader(fr);
	    br = new BufferedReader(new FileReader("Introduction.txt"));
	    while ((line = br.readLine()) != null) {
	      name.add(line);
	    }
	    namesArray = name.toArray(new String[name.size()]);
	    lDescription1 = name.get(1);
	    lDescription2 = name.get(2);
	    lDescription3 = name.get(3);
	    lDescription = (lDescription1 + "\n" + lDescription2 + "\n" + lDescription3);
	  }
	  catch (IndexOutOfBoundsException e) {
	  lDescription = "Index is out of bounds";
	  }
	  catch (FileNotFoundException e) {
	  lDescription = "File is not found";
	  }
	  catch (IOException e) {
	  lDescription = "IOexception arose";
	  }
	  return lDescription;
	}


public void opening()
{
  JFrame mainframe = new JFrame();
  mainframe.setSize(1000,1000);
  JPanel mainPanel = new JPanel(new GridBagLayout());
  GridBagConstraints c = new GridBagConstraints();
  Font basicfont = new Font("Comic Sans", Font.PLAIN, 60);
//------------------------------------------------------------------------------



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
  //story.add(new JTextArea("This is where the room description will go."));
  
  
  //Graphics roomDescription = new Graphics();-------------------------------------
  String lDescription = initialmethod();
  story.add(new JTextArea(lDescription));
 // input.selectAll();
  story.setBackground(Color.YELLOW);
  mainPanel.add(story,c);

//add question Panel------------------------------------------------------------
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


 //add map image---------------------------------------------------------------

  String mapPath = "map.jpg";
  ImageIcon mapIcon = new ImageIcon(mapPath);
  Image mapImage = mapIcon.getImage();
  Image mapImg = mapImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
  ImageIcon mapIcon1 = new ImageIcon(mapImg);
  JButton map = new JButton(mapIcon1);

 //add kitchen image---------------------------------------------------------------

  String kitchenPath = "kitchen.jpg";
  ImageIcon kitchenIcon = new ImageIcon(kitchenPath);
  Image kitchenImage = kitchenIcon.getImage();
  Image kitchenImg = kitchenImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
  ImageIcon mapIcon2 = new ImageIcon(kitchenImg);
  JButton kitchen = new JButton(mapIcon2);

 //add library image---------------------------------------------------------------

  String libraryPath = "library.jpg";
  ImageIcon libraryIcon = new ImageIcon(libraryPath);
  Image libraryImage = libraryIcon.getImage();
  Image libraryImg = libraryImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
  ImageIcon mapIcon3 = new ImageIcon(libraryImg);
  JButton library = new JButton(mapIcon3);


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

  JPanel mapCard = new JPanel();
  mapCard.add(map);

  JPanel kitchenCard = new JPanel();
  kitchenCard.add(kitchen);

  JPanel libraryCard = new JPanel();
  libraryCard.add(library);

  mappanel.add(mapCard, "mapCard");
  mappanel.add(kitchenCard, "kitchenCard");
  mappanel.add(libraryCard,"libraryCard");

  CardLayout cardLayout = (CardLayout) mappanel.getLayout();

  cardLayout.show(mappanel, "mapCard");
  //cardLayout.show(mappanel, "libraryCard");
  //cardLayout.show(mappanel, "kitchenCard");


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
  //JTextField input;
  writtenresponse.add(new JLabel("Enter your answer:"));
  input = new JTextField(50);
  writtenresponse.add(input);
//panel position in GridBagLayout
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

//Add actionlisnter to JButton--------------------------------------------------
   //quitB = new ActionListener();
   //getHintB = new ActionListener();
   quitbutton.addActionListener(this);
   quitbutton.setActionCommand("Quit Game");
   getclue.addActionListener(this);
   getclue.setActionCommand("Get Hint");

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
}
//-----------------------------------------------------------------------------
  public String initialmethod(){
	    String puzzle2 = "error";
	    String puzzle3, puzzle4, puzzle5;
	    String puzzleReturn = "anything";
	        try {
	          fr = new FileReader("Description.txt");
	          br = new BufferedReader(fr);
	          br = new BufferedReader(new FileReader("Description.txt"));
	          while ((line = br.readLine()) != null) {
	            name.add(line);
	          }
	          namesArray = name.toArray(new String[name.size()]);
	          puzzle2 = name.get(0);
	          puzzle3 = name.get(1);
	          puzzle4 = name.get(2);
	          puzzle5 = name.get(3);
	          puzzleReturn = (puzzle2 + "\n" + puzzle3 + "\n" + puzzle4 + "\n" + puzzle5);
	        }
	      catch (IndexOutOfBoundsException e) {
	        puzzle2 = "Index is out of bounds";
	      }
	      catch (FileNotFoundException e) {
	        puzzle2 = "File is not found";
	      }
	      catch (IOException e) {
	        puzzle2 = "IOexception arose";
	      }  
	        //puzzle2 = "Correct! \nRiddle 3: Name an eight letter word that has kst in the middle, \nin the beginning, and at the end. \n1. instand \n2. kstkstkst";//answer is correct

	      //String puzzle2return = puzzleReturn;
	      return puzzleReturn;
	    }
  
  public String KitchenDescription(){
	    String puzzle2 = "error";
	    String puzzle6, puzzle7, puzzle8;
	    String puzzleReturn2 = "anything";
	        try {
	          fr = new FileReader("Description.txt");
	          br = new BufferedReader(fr);
	          br = new BufferedReader(new FileReader("Description.txt"));
	          while ((line = br.readLine()) != null) {
	            name.add(line);
	          }
	          namesArray = name.toArray(new String[name.size()]);
	          puzzle6 = name.get(4);
	          puzzle7 = name.get(5);
	          puzzle8 = name.get(6);
	          puzzleReturn2 = (puzzle6 + "\n" + puzzle7 + "\n" + puzzle8);
	        }
	      catch (IndexOutOfBoundsException e) {
	        puzzle2 = "Index is out of bounds";
	      }
	      catch (FileNotFoundException e) {
	        puzzle2 = "File is not found";
	      }
	      catch (IOException e) {
	        puzzle2 = "IOexception arose";
	      }  
	        //puzzle2 = "Correct! \nRiddle 3: Name an eight letter word that has kst in the middle, \nin the beginning, and at the end. \n1. instand \n2. kstkstkst";//answer is correct

	      //String puzzle2return = puzzleReturn;
	      return puzzleReturn2;
	    }
  
  

  public static void main(String[]args)
  {
     Graphics game = new Graphics();
     game.opening();
     
  }
}






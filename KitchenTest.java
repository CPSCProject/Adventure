//@author Rumika Mascarenhas
// Room Kitchen
// goal: obtain key2


import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class KitchenTest{
  private boolean gameOnKitchen;
  private int count;
  private boolean key2;

//takes in parameters from the Test.java
public KitchenTest(boolean usergameOnKitchen, int userCount){
  gameOnKitchen = usergameOnKitchen;
  count = userCount;
}
//default values for gameOnKitchen and Count
  public KitchenTest() {
    this(false, 600);

  }

  public KitchenTest(boolean usergameOnKitchen){
    this(usergameOnKitchen, 600);
  }

public KitchenTest(int count) {
  this(false, count);
}

//getter constructor for gameOnKitchen
public boolean getgameOnKitchen(){
  return gameOnKitchen;
}

//getter constructor for Count
public int getCount(){
  return count;
}
//----------------------------------------------------------------------------

//The startGame is called by the Driver. Takes user input for starting the game.
public void startGame(String input){
   Scanner keyboard = new Scanner(System.in);

    //Object[] possibleValues = {"yes", "no"};

    //String newgameKitchen = (String)JOptionPane.showInputDialog(null,
                    //"This door leads to the Kitchen. Do you want to continue? ", "Input",
                    //JOptionPane.INFORMATION_MESSAGE, null,
                    //possibleValues, possibleValues[0]);
    String newgameKitchen = input;
    if(newgameKitchen.equalsIgnoreCase("no"))
    {
        gameOnKitchen = false;
        System.out.println("See you later!");

    }

    else if(newgameKitchen.equalsIgnoreCase("yes"))
    {
         System.out.println("Welcome!You have entered the Kitchen.You cannot explore the Kitchen yet.... ");
         gameOnKitchen = true;

    }
  }
//------------------------------------------------------------------------------
    public void difficultyKitchen(String level)
    {
      //takes input for level of difficulty. changes time left on the timer.
      Scanner keyboard = new Scanner(System.in);
      if(gameOnKitchen)
      {
        System.out.print("Difficulty? (easy, medium, hard) ");
        //String difficultyKitchenInput = keyboard.next();
        boolean difficultyneededKitchen = false;
        String difficultyKitchenInput = level;
        System.out.println(difficultyKitchenInput);

          if (difficultyKitchenInput.equals("easy")) {
            System.out.print("Difficulty set to easy");
            //implement timer to 10 min
            count = count-0;
            //difficultyneededKitchen = true;
            //gameOnKitchen = false;
            TimerR gui = new TimerR(count);
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.setSize(251,100);
            gui.setTitle("Timer Program");
            gui.setVisible(true);



          }
          else if (difficultyKitchenInput.equals("medium")) {
            //implement medium (4 lives)

            count = count - 30;
            difficultyneededKitchen = true;
            TimerR gui = new TimerR(count);
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.setSize(251,100);
            gui.setTitle("Timer Program");
            gui.setVisible(true);
          }
          else if (difficultyKitchenInput.equals("hard")) {
            //implement hard (3 lives)
            count = count - 60;
            difficultyneededKitchen = true;
            TimerR gui = new TimerR(count);
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.setSize(251,100);
            gui.setTitle("Timer Program");
            gui.setVisible(true);
          }
          else {
            System.out.println("That is not a vaild difficulty");
            System.out.print("Difficulty? (easy, medium, hard) ");
            difficultyKitchenInput = keyboard.next();
          }
      }
    }

//------------------------------------------------------------------------------

public boolean KitchenExplore(String finput, String cinput, String c )
{
  Scanner keyboard = new Scanner(System.in);
  boolean paper = true;
  if(gameOnKitchen){
  while(paper){
  System.out.println("There is a table across the room. You see a cabinet and hope to find something useful");
  System.out.println("");
  System.out.println("Choose an option: ");
  System.out.println("(1) Move towards the Table.");
  System.out.println("(2) Try to open the Cabinet.");
  System.out.println("Enter your move: ");
  String first_input = finput;
  String cabinet_input = "1";
  System.out.println(first_input);

  while(first_input.equals("1")|| cabinet_input.equals("2"))
  {
    System.out.print("You are walking towards the table. You notice a crumpled piece of paper and a knife ");
    System.out.println("Choose an option: ");
    System.out.println("(1) Pick up the knife.");
    System.out.println("(2) Pick up the piece of paper");
    System.out.println("Enter your move: ");

    String table_input = "1";
    if(table_input.equals("1")){
      System.out.print("The knife is now in your inventory.");
      System.out.println("The knife cannot be used in this room");

    }
    else if(table_input.equals("2")){
      System.out.print("The paper is now in your inventory.");
      System.out.println("The message on the paper says (1)triangle, (2)square, (3)Pentagon");
      paper = true;
      first_input = "3";

    }
}
  if(first_input.equals("2"))
  {
    System.out.print("The cabinet is locked...it needs a code!");
    System.out.println("Choose an option: ");
    System.out.println("(1) try to unlock the door.");
    System.out.println("(2) Go to the table.");
    System.out.println("Enter your move: ");
    cabinet_input = cinput;
    System.out.println(cabinet_input);

    if(cabinet_input.equals("1"))
    {
      System.out.print("Enter a digit code: ");
      String code = c;
      System.out.println(code);

      if(code.equals("345"))
      {
        System.out.println("The door is unlocked");
        System.out.println("Key obtained");
        key2 = true;
        break;

      }

      else
      {
        System.out.println("Cabinet door remains unlocked");
        break;
      }

    }


  }

  }
}

 return(key2);
}

}

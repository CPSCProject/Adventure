//@author Rumika Mascarenhas
// Room Kitchen
// goal: obtain key2


import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Kitchen{
  private boolean key2;
  private boolean gameOnKitchen;


//The startGame is called by the MainDriver. Takes user input for starting the game.
public boolean startGame(){
  Scanner keyboard = new Scanner(System.in);
    int new_count;
    //If user chooses "yes" game continues; if "no" is chosen user is taken to next room.
      Object[] possibleValues = {"yes", "no"};

    String newgameKitchen = (String)JOptionPane.showInputDialog(null,
                    "This door leads to the Kitchen. Do you want to continue? ", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);

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
    return(gameOnKitchen);
  }

//------------------------------------------------------------------------------

    public void difficultyKitchen(int input)
    {
      //takes input for level of difficulty. changes time left on the timer.
      Scanner keyboard = new Scanner(System.in);
      boolean gameOnKitchen = true;
      int count = input;
      if(gameOnKitchen)
      {
        System.out.print("Difficulty? (easy, medium, hard) ");
        String difficultyKitchenInput = keyboard.next();
        boolean difficultyneededKitchen = false;
        System.out.println(difficultyKitchenInput);

//If difficulty is easy timer is not changed.
          if (difficultyKitchenInput.equals("easy")) {
            System.out.print("Difficulty set to easy");
            //implement timer to 10 min
            count = count-0;
            difficultyneededKitchen = true;
            TimerR gui = new TimerR(count);
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.setSize(251,100);
            gui.setTitle("Timer Program");
            gui.setVisible(true);



          }
//If difficulty is easy time goes down by 30sec.
            else if (difficultyKitchenInput.equals("medium")) {
            count = count - 30;
            difficultyneededKitchen = true;
            TimerR gui = new TimerR(count);
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.setSize(251,100);
            gui.setTitle("Timer Program");
            gui.setVisible(true);
          }
//If difficulty is easy time goes down by 60sec.

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
          //Invalid inputs are handled by prompting an input until the user inputs a
          //valid input.
          else {
            System.out.println("That is not a vaild difficulty");
            System.out.print("Difficulty? (easy, medium, hard) ");
            difficultyKitchenInput = keyboard.next();
          }
      }
    }

//------------------------------------------------------------------------------
//KitchenExplore runs the escape room game.User is providedd with choices throughout
// The cabinet is locked and is unlocked by a code.
//The code can be found on the piece of paper on the table.
//The knife on the table is added to inventory when chosen.
//The cabinet has the key2.
public boolean KitchenExplore()
{
  Scanner keyboard = new Scanner(System.in);
  boolean paper = true;
  while(paper){
  System.out.println("There is a table across the room. You see a cabinet and hope to find something useful");
  System.out.println("");
  System.out.println("Choose an option: ");
  System.out.println("(1) Move towards the Table.");
  System.out.println("(2) Try to open the Cabinet.");
  System.out.println("Enter your move: ");
  String first_input = keyboard.next();
  System.out.println("-----------------------------------");

  String cabinet_input = "1";


  while(first_input.equals("1")|| cabinet_input.equals("2"))
  {
    System.out.print("You are walking towards the table. You notice a crumpled piece of paper and a knife ");
    System.out.println("Choose an option: ");
    System.out.println("(1) Pick up the knife.");
    System.out.println("(2) Pick up the piece of paper");
    System.out.println("Enter your move: ");
    String table_input = keyboard.next();
    System.out.println("-----------------------------------");

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
    cabinet_input = keyboard.next();
    System.out.println("-----------------------------------");



    if(cabinet_input.equals("1"))
    {
      System.out.print("Enter a digit code: ");
      String code = keyboard.next();
      System.out.println("-----------------------------------");



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
      }

    }


  }

  }
  return(key2);
}

}

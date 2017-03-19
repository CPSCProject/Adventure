//@author Rumika Mascarenhas
// Room Kitchen
// goal: obtain key2


import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class KitchenLogic{
  private boolean gameOnKitchen;
  private int count;
  private boolean key2;

//----------------------------------------------------------------------------

//The startGame is called by the Driver. Takes user input for starting the game.
public boolean startGame(){
   Scanner keyboard = new Scanner(System.in);

    //Object[] possibleValues = {"yes", "no"};

    //String newgameKitchen = (String)JOptionPane.showInputDialog(null,
                    System.out.print("This door leads to the Kitchen. Do you want to continue? ");
                    //JOptionPane.INFORMATION_MESSAGE, null,
                    //possibleValues, possibleValues[0]);
    String newgameKitchen = keyboard.next();
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
    return gameOnKitchen;
  }
//------------------------------------------------------------------------------

//------------------------------------------------------------------------------

public boolean KitchenExplore( )
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
  String first_input = keyboard.next();
  String cabinet_input = "1";


  while(first_input.equals("1")|| cabinet_input.equals("2"))
  {
    System.out.print("You are walking towards the table. You notice a crumpled piece of paper and a knife ");
    System.out.println("Choose an option: ");
    System.out.println("(1) Pick up the knife.");
    System.out.println("(2) Pick up the piece of paper");
    System.out.println("Enter your move: ");

    String table_input = keyboard.next();
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


    if(cabinet_input.equals("1"))
    {
      System.out.print("Enter a digit code: ");
      String code = keyboard.next();


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




  public static void main(String[] args){
    KitchenLogic n = new KitchenLogic();
    boolean game1 = n.startGame();
    boolean key2 = n.KitchenExplore();
    game1 = false;
  }
}

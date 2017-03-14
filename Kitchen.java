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
        String kitchen_exit = "See you later! ";
          JOptionPane.showMessageDialog(null, kitchen_exit);



    }
    else if(newgameKitchen.equalsIgnoreCase("yes"))
    {
      String kitchen_welcome = "Welcome!You have entered the Kitchen.You cannot explore the Kitchen yet.... ";
        JOptionPane.showMessageDialog(null, kitchen_welcome);
         gameOnKitchen = true;

    }
    return(gameOnKitchen);
  }

//------------------------------------------------------------------------------

    public void difficultyKitchen(int input)
    {
      //takes input for level of difficulty. changes time left on the timer.
      boolean gameOnKitchen = true;
      int count = input;
      if(gameOnKitchen)
      {
        Object[] possibleValues = {"easy", "medium", "hard"};

      String difficultyKitchenInput = (String)JOptionPane.showInputDialog(null,
                      "Choose the level of difficulty: ", "Input",
                      JOptionPane.INFORMATION_MESSAGE, null,
                      possibleValues, possibleValues[0]);
        boolean difficultyneededKitchen = false;


//If difficulty is easy timer is not changed.
          if (difficultyKitchenInput.equals("easy")) {
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
  boolean paper = true;
  while(paper){

  Object[] possibleValues = {"(1) Move towards the Table.", "(2) Try to open the Cabinet."};

String first_input = (String)JOptionPane.showInputDialog(null,
                "There is a table across the room. You see a cabinet and hope to find something useful ", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);

  String cabinet_input = "1";


  while(first_input.equals("(1) Move towards the Table.")|| cabinet_input.equals("(2) Try to open the Cabinet."))
  {

    Object[] possibleValues2 = {"(1) Pick up the knife.", "(2) Pick up the piece of paper"};

  String table_input = (String)JOptionPane.showInputDialog(null,
                  "You are walking towards the table. You notice a crumpled piece of paper and a knife. Choose your move: ", "Input",
                  JOptionPane.INFORMATION_MESSAGE, null,
                  possibleValues2, possibleValues2[0]);


    if(table_input.equals("(1) Pick up the knife.")){
      String knife_message = "The key is in the inventory. It cannot be used in this room." ;
          JOptionPane.showMessageDialog(null , knife_message);

    }
    else if(table_input.equals("(2) Pick up the piece of paper")){
      String paper_message = "There are three shapes drawn on the paper: a triangle, a square and a pentagon." ;
          JOptionPane.showMessageDialog(null , paper_message);
      paper = true;
      first_input = "3";

    }
}
  if(first_input.equals("(2) Try to open the Cabinet."))
  {

    Object[] possibleValues3 = {"(1) try to unlock the door.", "(2) Go to the table."};

   cabinet_input = (String)JOptionPane.showInputDialog(null,
                  "The cabinet is locked...it needs a code! Choose your move: ", "Input",
                  JOptionPane.INFORMATION_MESSAGE, null,
                  possibleValues3, possibleValues3[0]);




    if(cabinet_input.equals("(1) try to unlock the door."))
    {
      String code =
          JOptionPane.showInputDialog(" Enter your guess for the code:  ");



      if(code.equals("345"))
      {
        String key_message = "The door is unlocked and the key is obtained!" ;
            JOptionPane.showMessageDialog(null , key_message);

        key2 = true;
        break;
      }

      else
      {
        String key_message_fail = "The door remains locked." ;
            JOptionPane.showMessageDialog(null , key_message_fail);
      }

    }


  }

  }
  return(key2);
}

}

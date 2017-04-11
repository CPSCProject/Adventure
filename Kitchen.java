//@author Rumika Mascarenhas
// Room Kitchen
// goal: obtain key2

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Kitchen{
  private boolean key2;
  private boolean gameOnKitchen;

//------------------------------------------------------------------------------------------------------------------
/*Method: startGame()
  Parameters: none
  Return values: Boolean game1
  Goal: the goal is to determine if the user wants to proceed to the kitchen.
*/
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

//------------------------------------------------------------------------------
//KitchenExplore runs the escape room game.User is providedd with choices throughout
// The cabinet is locked and is unlocked by a code.
//The code can be found on the piece of paper on the table.
//The knife on the table is added to inventory when chosen.
//The cabinet has the key2.
public String KitchenExploreTable(String input)
{
    String table_return_1 = "Error ";
    String table_input = input;
    if (table_input.equals("1"))
    {
      table_return_1 = "You are walking towards the table.\n You notice a crumpled piece of paper and a knife.\n Choose your move:\n(k) Pick up the knife. \n (p) Pick up the piece of paper.";
    }
    else if(table_input.equals("2"))
      {
      table_return_1 = "You walk towards the Cabinet. \nThe cabinet is locked...it needs a code! Choose your move:\n(e) try to unlock the door.\n(l) look at the paper in the inventory ";
      }
      String table_show = table_return_1;
    return table_show;

  }
    public String KitchenExplorePaper(String input2)
    {
        String Paper_return_1 = "Error";
        String Paper_input = input2;
        if (Paper_input.equals("k"))
        {
          Paper_return_1 = "The 'something' is in the inventory. \nIt cannot be used in this room.\ninput '1' to return to main menu";
          System.out.print("KitchenExplorepaper");
        }
        else if(Paper_input.equals("p"))
          {
          boolean paper =true;
          Paper_return_1 = "There are three shapes drawn on the paper: \na triangle, a square and a pentagon.\n use this to open the cabinet.\n (1) Move towards the Table.\n (2) Try to open the Cabinet.";
          }
          String Paper_show = Paper_return_1;
        return Paper_show;
      }

      public String KitchenExploreCabinet(String input3)
      {
          String cabinet_return_1 = "";
          String cabinet_input = input3;
          if (cabinet_input.equals("e"))
          {
            cabinet_return_1 = "Enter the code: \n(345)\n(123) \n(456) \n(987)";
            System.out.print("KitchenExplorecabinet");
          }
          else if(cabinet_input.equals("l"))
            {
              boolean paper = true;
              if(paper){
            cabinet_return_1 = "There are three shapes drawn on the paper: \na triangle, a square and a pentagon.\n use this to open the cabinet.";
          }
          else{
            cabinet_return_1 = "The paper is not in the inventory.\n (1)go to the table to pick it up.";
          }
            }


          String cabinet_show = cabinet_return_1;
          return cabinet_show;
        }


      public String KitchenExploreCode(String input4)
      {
          String code_return_1 = "";
          String code_input = input4;
          if (code_input.equals("345"))
          {
            code_return_1 = "The door is unlocked.\n you have obtained the key.";
            System.out.print("KitchenExplorecode");
          }
          else
          {
            code_return_1 = "The door remains locked.\n (e)Enter the code: \n (345)\n(123) \n(456) \n(987). \n(p) peek at the paper.";
          }

          String code_show = code_return_1;
          return code_show;
        }



/*
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
  return(key2);*/
}
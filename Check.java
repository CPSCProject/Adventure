//This the test class of the boiler room class.

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Check
{
  public ArrayList<String> key_count = new ArrayList<String>();
  public boolean key5 = false;
  public boolean door = false;
  public String dial = "No colour";
//------------------------------------------------------------------------------
  /*
  String messages for boiler room level.
  */
//------------------------------------------------------------------------------
    String str_roominfo = "You have entered the boiler room. The door your have entered from has disappeared. To exit the room, you must unlock the door you came from.";
    String str_switchTable_descrip = "The room is dark, and you can only see a table that has a single dial.";
    String door_locked = "You push with all your might, and the door remains stubbornly locked";
    String door_unlocked = "HAZZA THE DOOR IS UNLOCKED! YOU HAVE COMPLETED THE LEVEL";
    String switchTable_set = "You have lit the candle, and you see the key and pick it up. What shall you do with it???";
    String curr_d_colour = "Current Dial colour: " + this.dial;
    String new_d_colour = "Dial colour now set to: " + this.dial;
//------------------------------------------------------------------------------
  /*
  Method: Displays main menu options to user.

  Parameters: none

  Return: user choice (action that they want to perform.)
  */
//------------------------------------------------------------------------------

String printMainMenu(String userchoice)
  {
  //  Object[] possibleValues = { "1) Investigate the table", "2) Try to open the door"};
    //String userchoice = (String)JOptionPane.showInputDialog(null,
      //              "What action will you perform?", "Input",
        //            JOptionPane.INFORMATION_MESSAGE, null,
          //          possibleValues, possibleValues[0]);
    return (userchoice);
  }
//------------------------------------------------------------------------------
  /*
  Method: Displays user options for the dial colour.

  Parameters: none

  Return: d_colour (colour user wishes to set dial to)
  */
//------------------------------------------------------------------------------
  String printTableMenu(String userchoice)
  {
    String d_colour = userchoice;
    //Object[] possibleValues = { "Red", "Green", "Blue"};
    //String d_colour = (String)JOptionPane.showInputDialog(null,
      //              "Which action do you choose to perform?", "Input",
        //            JOptionPane.INFORMATION_MESSAGE, null,
          //          possibleValues, possibleValues[0]);
    this.setDial(d_colour);
    return (d_colour);
  }
//------------------------------------------------------------------------------
  /*
  Method: Sets dial colour to user choice

  Parameters: d_colour (colour user wishes to set dial to)

  Return: new dial colour (stored in string)

  */
//------------------------------------------------------------------------------
String setDial(String d_colour)
{
  this.curr_d_colour = "Current Dial colour: " + this.dial;
  if (d_colour.equals("Red"))
  {
    this.dial = "Red";
  }

  else if (d_colour.equals("Green"))
  {
    this.dial = "Green";
  }

  else if (d_colour.equals("Blue"))
  {
    this.dial = "Blue";
  }
  this.new_d_colour = "Dial colour now set to: " + this.dial;
  return(this.dial);
}

//------------------------------------------------------------------------------
   /*
   Method: Sets the user key to true if the correct states of the dial is obtained
           also adds "key5" to key_count list.

   Parameters: none

   Return: boolean key5 (returns true or false)
   */
//------------------------------------------------------------------------------
   boolean sw_Room(String userchoice)
   {
     if (dial.equals("Green"))
     {
       key5 = true;
       key_count.add("key5");
     }
     return(key5);
   }
//------------------------------------------------------------------------------
   /*
   Method: Determines if the user door will be set to true or false (true = unlocked,
           false = locked).

   Parameters: none

   Return: boolean door (true or false)
   */
//------------------------------------------------------------------------------
  boolean tryDoor(String userchoice)
  {
    if (key5 == true)
    {
      door = true;
    }
    return(door);
  }
//------------------------------------------------------------------------------
}

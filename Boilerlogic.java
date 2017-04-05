// This is the logic for the boiler room so user can obtain "key 5"

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Boilerlogic
{
  public static boolean key5 = false;
  private String door;
  public boolean gameStart = false;
  private static String dial = "No colour";
  public static final int COUNT = 60;
  private int count;
  private String mainuserchoice;

//------------------------------------------------------------------------------
  /*
  String messages for boiler room level.
  */
//------------------------------------------------------------------------------
    String str_roominfo = "You have entered the boiler room. \nThe door your have entered from has locked itself. \nTo exit the room, you must unlock the door you came from.\n You see a Table in the room with a dial on it.\n type\'start\' to continue.";
    String Table_descrip = "On the table, you see a dial that can be set to various colours.";
    String door_locked = "You push with all your might,\nand the door remains stubbornly \nlocked (type start to return to main menu)";
    String door_unlocked = "HAZZA THE DOOR IS UNLOCKED! \nYOU HAVE COMPLETED THE LEVEL";
    String curr_d_colour = "Current Dial colour: " + this.dial + "\n";
    String new_d_colour = "\nDial colour now set to: " + this.dial + "\n\n(type start to return to main menu)";
    String mainmenu = "\n\n1) Investigate the table \n2) Try to open the door";
    String possibleValues = "\nR) Red \nG) Green \nB) Blue\n\n(type start to return to main menu)";
    String prompts = "\nWhat action will you perform?";
//------------------------------------------------------------------------------
/*
Setter and getter methods for user main menu choice, door, and the dial.
*/
//------------------------------------------------------------------------------
public String getColour()
{
  return (this.dial);
}
//------------------------------------------------------------------------------
String getDoor()
{
  return(this.door);
}

//------------------------------------------------------------------------------
public void setDial(String d_colour)
{
  this.dial = d_colour;
}

//------------------------------------------------------------------------------
public void setMainMenuChoice(String userchoice)
{
  this.mainuserchoice = userchoice;
}

//------------------------------------------------------------------------------
  /*
  Method: Displays user options for the dial colour.

  Parameters: none

  Return: d_colour (colour user wishes to set dial to)
  */
//------------------------------------------------------------------------------
  void choiceTableMenu(String d_colour)
  {
    this.setDial(d_colour);
  }

//------------------------------------------------------------------------------
  /*
  Method: changes dial colour to user choice

  Parameters: string colour (colour user wishes to set dial to)

  Return: new dial colour (stored in string)

  */
//------------------------------------------------------------------------------
String changeDial(String colour)
{
  this.curr_d_colour = "Current Dial colour: " + this.dial;
  getColour();
  if (colour.equals("R"))
  {
    this.dial = "Red";
  }

  else if (colour.equals("G"))
  {
    this.dial = "Green";
  }

  else if (colour.equals("B"))
  {
    this.dial = "Blue";
  }
  this.new_d_colour = "Dial colour now set to: " + this.dial;
  setDial(this.dial);
  return(this.dial);
}

//------------------------------------------------------------------------------
   /*
   Method: Sets the user key to true if the correct states of the dial is obtained.

   Parameters: String dial

   Return: none
   */

//------------------------------------------------------------------------------
  public void changeKey(String dial)
   {
     if (this.dial.equals("Green"))
     {
       this.key5 = true;

     }
     else
     {
      this.key5 = false;
     }
   }
//------------------------------------------------------------------------------
/*
   Method: Determines if the user door will be set to locked or unlocked

   Parameters: boolean key

   Return: String door
*/
//------------------------------------------------------------------------------

public  String tryDoor(boolean key5)
  {
    if (key5 == true)
    {
      this.door = door_unlocked;
    }
    else
    {
      this.door = door_locked;
    }
    return(door);
  }
//------------------------------------------------------------------------------

}

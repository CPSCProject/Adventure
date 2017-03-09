//This is version 1 of the boiler room class.


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Key5
{
  ArrayList<String> key_count = new ArrayList<String>();
  boolean key5 = false;
  boolean door = false;
  String rm_switch1 = "On";
  String rm_switch2 = "On";
  String rm_switch3 = "On";
  String rm_switch4 = "On";
//------------------------------------------------------------------------------
  /*
  Method: Stores string messages for boiler room level.

  Parameters: none

  Return: none
  */
//------------------------------------------------------------------------------
  void print_rm_info()
  {
    String str_roominfo = "You have entered the boiler room. The door your have entered from has disappeared. To exit the room, you must unlock the door you came from.";
    String str_switchTable_descrip = "The room is dark, and you can only see a table that has a set of four switches.";
    String door_locked = "You push with all your might, and the door remains stubbornly locked";
    String door_unlocked = "HAZZA THE DOOR IS UNLOCKED! YOU HAVE COMPLETED THE LEVEL";
    String switchTable_set = "You have lit the candle, and you see the key and pick it up. What shall you do with it???";
  }
//------------------------------------------------------------------------------
  /*
  Method: Displays main menu options to user.

  Parameters: none

  Return: user choice (action that they want to perform.)
  */
//------------------------------------------------------------------------------

String printMainMenu()
  {
    Object[] possibleValues = { "1) Investigate the table", "2) Try to unlock the door"};
    String userchoice = (String)JOptionPane.showInputDialog(null,
                    "What action will you perform?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);
    return (userchoice);
  }
//------------------------------------------------------------------------------
  /*
  Method: Displays user options for the switch table.

  Parameters: none

  Return: none
  */
//------------------------------------------------------------------------------
  void printswitchTableMenu()
  {
    Object[] possibleValues = { "1", "2", "3","4"};
    String sw_toggle = (String)JOptionPane.showInputDialog(null,
                    "Which light switch do you want to toggle?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);
    this.switchTable(sw_toggle);
  }
//------------------------------------------------------------------------------
  /*
  Method: Changes the switches from their current state to the opposite state (on to off of vice versa)

  Parameters: sw_toggle (the switch the users chooses to toggle)

  Return: none
  */
//------------------------------------------------------------------------------
  void switchTable(String sw_toggle)
  {
    switch(sw_toggle)
    {
      case "1":
        if (rm_switch1.equals("On"))
        {
          rm_switch1 = "Off";
          System.out.println("Switch 1 now set to: "+ rm_switch1);
        }
        else if (rm_switch1.equals("Off"))
        {
          rm_switch1 = "On";
          System.out.println("Switch 1 now set to: "+ rm_switch1);
        }
        break;
      case "2":
        if (rm_switch2.equals("On"))
        {
          rm_switch2 = "Off";
          System.out.println("Switch 2 now set to: "+ rm_switch2);
        }
        else if (rm_switch2.equals("Off"))
        {
          rm_switch2 = "On";
          System.out.println("Switch 2 now set to: "+ rm_switch2);
        }
        break;
      case "3":
        if (rm_switch3.equals("On"))
        {
          rm_switch3 = "Off";
          System.out.println("Switch 3 now set to: "+ rm_switch3);
        }
        else if (rm_switch3.equals("Off"))
        {
          rm_switch3 = "On";
          System.out.println("Switch 3 now set to: "+ rm_switch3);
        }
        break;
      case "4":
        if (rm_switch4.equals("On"))
        {
          rm_switch4 = "Off";
          System.out.println("Switch 4 now set to: "+ rm_switch4);
        }
        else if (rm_switch4.equals("Off"))
        {
          rm_switch4 = "On";
          System.out.println("Switch 4 now set to: "+ rm_switch4);
        }
        break;
     }
   }
//------------------------------------------------------------------------------
   /*
   Method: Sets the user key to true if the correct states of the switches is obtained
           also adds "key5" to key_count list.

   Parameters: none

   Return: boolean key5 (returns true or false)
   */
//------------------------------------------------------------------------------
   boolean sw_Room()
   {
     if ((rm_switch1.equals("Off")) && (rm_switch2.equals("On")) && (rm_switch3.equals("Off")) && (rm_switch4.equals("On")))
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
  boolean tryDoor()
  {
    if (key5 == true)
    {
      door = true;
    }
    return(door);
  }
//------------------------------------------------------------------------------
}

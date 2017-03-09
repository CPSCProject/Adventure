import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Driver{
  public static void main(String[] args){


  //----------------USER INFO--------------------------------
  String player_name =
      JOptionPane.showInputDialog(" Enter your name:  ");
  String welcome = "Hello There, " + player_name + "!";
      JOptionPane.showMessageDialog(null , welcome);
      String message = "You are in the entrance way,the door is locked in front of you is locked. Proceed to the library?";
  JOptionPane.showMessageDialog(null, message);

  //------------------------LIBRARY----------------------------------
  System.out.println("     ");
  System.out.println("     ");

  key1 p1 = new key1();
  boolean game;
  if (game = p1.startgamemethod()) {
    p1.difficultymethod();
    if (p1.puzzle1method() && p1.lives > 0) {
      if (p1.puzzle2method() && p1.lives > 0) {
        if (p1.puzzle3method() && p1.lives > 0) {
          if (p1.puzzle4method() && p1.lives > 0) {
            System.out.println("Congratulations! ");
          }
        }
      }
    }
  }

  //-------------------------KITCHEN--------------------------
  int count = 600;
  Kitchen2 n = new Kitchen2();
  n.startGame();
  n.difficultyKitchen(count);
  n.KitchenExplore();
  //if(key2)
  //{
    //System.out.print("heyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
  //}


//--------------------------BOILER ROOM----------------------------

boolean play = true;
Key5temp boiler = new Key5temp();
System.out.println(boiler.str_roominfo);


while (play == true)
{
  String userchoice = boiler.printMainMenu();
  if (userchoice.equals("1) Investigate the table"))
  {
    while (boiler.key5 == false)
    {
      System.out.println(boiler.str_switchTable_descrip);
      String d_colour = boiler.printTableMenu();
      boiler.setDial(d_colour);
      boiler.key5 = boiler.sw_Room();
      boiler.tryDoor();
    }
    System.out.println(boiler.switchTable_set);
 }

 else if (userchoice.equals("2) Try to open the door"))
 {
   if (boiler.key5 == false)
   {
     System.out.println(boiler.door_locked);
   }
   else
   {
     System.out.println(boiler.door_unlocked);
     play = false;
   }
 }
}










}
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MainDriver{
  public static void main(String[] args){




// ---------------INITIALIZE GAME--------------------------
//public boolean start_main_game = false;

Event p3 = new Event();
p3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p3.setTitle("Events Program");
p3.setSize(300,300);
p3.setVisible(true);
//public boolean start_main_game = Event();




//----------------USER INFO--------------------------------

  String player_name =
      JOptionPane.showInputDialog(" Enter your name:  ");
  String welcome = "Hello There, " + player_name + "!";
      JOptionPane.showMessageDialog(null , welcome);
      String message = "You are in the entrance way,the door is locked in front of you is locked. Proceed to the library?";
  JOptionPane.showMessageDialog(null, message);

//-----------------------TIMER---------------------------------
  int count = 600;
  TimerR gui = new TimerR(count);

  gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  gui.setSize(251,100);
  gui.setTitle("Timer Program");
  gui.setVisible(true);



//------------------------LIBRARY----------------------------------
System.out.println("     ");
System.out.println("     ");
System.out.println("ROOM: LIBRARY");
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
  System.out.println("     ");
  System.out.println("     ");
  System.out.println("ROOM: KITCHEN");
  System.out.println("     ");


  
  Kitchen n = new Kitchen();
  boolean game1 = n.startGame();
  while(game1){
  n.difficultyKitchen(count);
  boolean key2 = n.KitchenExplore();
  game1 = false;
}


//--------------------------BOILER ROOM----------------------------
System.out.println("     ");
System.out.println("     ");
System.out.println("ROOM: BOILER ROOM");
System.out.println("     ");

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

//-----------------------------DUNGEON-----------------------
System.out.println("     ");
System.out.println("     ");
System.out.println("ROOM: DUNGEON");
System.out.println("     ");

Key3 dungeon = new Key3();
dungeon.dungeonStart();
dungeon.colorGame();


//--------------------------MAGIC ROOM-------------------------
System.out.println("     ");
System.out.println("     ");
System.out.println("ROOM: MAGIC ROOM");
System.out.println("     ");

//Logic2 game = new Logic2();
//game.difficultyKitchen(count);
//game.gamemove();

}
}

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Keyexercise3 {
	
	private boolean gamekey4;
	private int count;
	private String difficulty;
	
	 public Keyexercise3(boolean key4, int gamecount, String gamedifficulty) {
		    gamekey4 = key4;
		    count = gamecount;
		    difficulty = gamedifficulty;
		  }

	
	
	
	public Keyexercise3() {
		this(false, 600, "easy");
	}
	
	public Keyexercise3(boolean key4) {
		this(key4, 600, "easy");
	}
	
	public Keyexercise3(int gamecount) {
		this(false, gamecount, "easy");
	}

	public Keyexercise3(String gamedifficulty ) {
		this(false, 600, gamedifficulty);
	}
	
	public Keyexercise3(boolean key4, String gamedifficulty) {
		this(key4, 600, gamedifficulty);
	}
	
	public Keyexercise3(boolean key4, int gamecount) {
		this(key4, gamecount, "easy");
	}
	
	public Keyexercise3(int gamecount, String gamedifficulty ) {
		this(false, gamecount, gamedifficulty);
	}


//--------------------------------------------------------------------------------------------
	
	
   public void difficultyPortionRoom(int count, String difficulty)
   // this method will ask the user to set the diffculty of the game, baed on the user selects, it will set the time,
   // number of lives.
	    {
	      Scanner keyboard = new Scanner(System.in);
	      boolean gameOnKitchen = true;
	      if(gameOnKitchen)
	      {
	        System.out.print("Difficulty? (easy, medium, hard) ");
	        boolean difficultyneededKitchen = false;
	        int lives = 5;
	        String difficultyKitchenInput = difficulty;

	          if (difficultyKitchenInput.equals("easy")) {
	            System.out.print("Difficulty set to easy");
	            //implement timer to 10 min
	            count = 60;
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
	    





//-----------------------------------------------------------------------
   public void gameoption(String name, String a, String b, String c, String d) {
	   // this will ask a user for input. it will ask for name, which room to go. After going in to the room,
	   // the user must find the right condition to finish the game.
	   // the diffculty of the game will be manipulated by number of lives and the time.
	   // after finishing the game, the user will gain a key to go to the next room/level.
	   boolean gameloop1 = false;
	   Scanner keyboard = new Scanner(System.in);
	   String player_name = name;



	   System.out.print("what is your name? : ");

	   String welcome = "Hello There, " + player_name + "!";
	   System.out.println(welcome);
	   System.out.print("The door infront of you is locked, you must go left(L)  room to satisfy the right condition to finish the game! which room do you want to go?: ");
	   while (gameloop1 == false) {
		   String room_option = "L";
		   if (room_option.equalsIgnoreCase("L")) {
			   String welcome2 = "Your option is to go to left!";
			   System.out.println(welcome2);
			   gameloop1 = true;
		   }
		   else {
			   System.out.println("invalid option!! try again ");
		   }
	   }

	   // select an option
	   //any cards are not picked up
	   boolean R1 = false;
	   boolean R2 = false;
	   boolean R3 = false;
	   boolean R4 = false;
	   while ( (R1 == false || R2 == false) || (R3 == false || R4 == false) ) {

		   System.out.println("your objective here is to match cards of the same colour ");
		   System.out.println("1) redcard");
		   System.out.println("2) redcard");
		   System.out.println("3) greencard");
		   System.out.println("4) greencard");
		   System.out.println("what is your first option? :");
		   int p1 = Integer.parseInt(a);
		   int p2 = Integer.parseInt(b);
		   // after choosing one card, you must find the exact one

		   if (((p1 == 2 && p2 == 1) || (p1 == 1 && p2 == 2)) && (!R1 && !R2)) {
			   System.out.println("You have matched the red cards. They have been removed from the table. ");
			   R1 = true;
			   R2 = true;
			   a = c;
			   b = d;

		   } 
		   else if (((p1 == 4 && p2 == 3) || (p1 == 3 && p2 == 4)) && (!R3 && !R4)) {
			   System.out.println("You have matched the green cards. They have been removed from the table. ");
			   R3 = true;
			   R4 = true;
		   }

		   else if (((p1 == 3 && p2 == 1) || (p1 == 1 && p2 == 3)) && (!R1 && !R3)) {
			   System.out.println("These cards do not match. They have been placed back down");
			   R1 = false;
			   R3 = false;
		   }
		   else if (((p1 == 4 && p2 == 1) || (p1 == 1 && p2 == 4)) && (!R1 && !R4)) {
			   System.out.println("These cards do not match. They have been placed back down");
			   R1 = false;
			   R4 = false;
		   }
		   else if (((p1 == 3 && p2 == 2) || (p1 == 2 && p2 == 3)) && (!R2 && !R3)) {
			   System.out.println("These cards do not match. They have been placed back down");
			   R2 = false;
			   R3 = false;
		   }
		   else if (((p1 == 4 && p2 == 2) || (p1 == 2 && p2 == 4)) && (!R2 && !R4)) {
			   System.out.println("These cards do not match. They have been placed back down");
			   R2 = false;
			   R4 = false;
		   }

		   else if (((p1 == 3 && p2 == 1) || (p1 == 1 && p2 == 3)) && (R1 || R3)) {
			   System.out.println("You have previously selected one of these cards. Please choose again");
		   }
		   else if (((p1 == 4 && p2 == 1) || (p1 == 1 && p2 == 4)) && (R1 || R4)) {
			   System.out.println("You have previously selected one of these cards. Please choose again");
		   }
		   else if (((p1 == 3 && p2 == 2) || (p1 == 2 && p2 == 3)) && (R2 || R3)) {
			   System.out.println("You have previously selected one of these cards. Please choose again");
		   }
		   else if (((p1 == 4 && p2 == 2) || (p1 == 2 && p2 == 4)) && (R2 || R4)) {
			   System.out.println("You have previously selected one of these cards. Please choose again");
		   }
		   else {
			   System.out.println("You did not match the cards correctly. Your selected cards have been put back down, please select two new cards: ");
		   } 
	   } 
	   boolean gamekey4 = true;
	   System.out.println("You finished the game");
	   System.out.println("you gained the key ");
   }
}

   
   
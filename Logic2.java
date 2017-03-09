//@author John Kim

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Logic2 {


   void difficultyKitchen(int count)
	    {
	      Scanner keyboard = new Scanner(System.in);
	      boolean gameOnKitchen = true;
	      if(gameOnKitchen)
	      {
	        System.out.print("Difficulty? (easy, medium, hard) ");
	        String difficultyKitchenInput = keyboard.next();
	        boolean difficultyneededKitchen = false;
	        int lives = 5;

	          if (difficultyKitchenInput.equals("easy")) {
	            System.out.print("Difficulty set to easy");
	            //implement timer to 10 min
	            count = 60;
	            //difficultyneededKitchen = true;
	            //gameOnKitchen = false;
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
	   void gamemove() {
		boolean gameloop1 = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is your name? : ");
		String player_name = keyboard.nextLine();
		String welcome = "Hello There, " + player_name + "!";
		System.out.println(welcome);
		System.out.print("The door infront of you is locked, you must go left(L)  room to satisfy the right condition to finish the game! which room do you want to go?: ");
		while (gameloop1 == false) {
			String room_option = keyboard.nextLine();
			room_option = room_option.toUpperCase();
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
		   		int p1 = keyboard.nextInt();
					System.out.println("what is your second option? :");
					int p2 = keyboard.nextInt();
		   		// after choosing one card, you must find the exact one

		    	if (((p1 == 2 && p2 == 1) || (p1 == 1 && p2 == 2)) && (!R1 && !R2)) {
						System.out.println("You have matched the red cards. They have been removed from the table. ");
						R1 = true;
						R2 = true;
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
			}
		}

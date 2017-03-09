//@author Jack Kuang

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

/*
List of variables

key3 = false: main boolean for the stage loop
numOfLives = 5: number of lives of the player
all the other variables are going to be local to this stage

*/


public class Key3
{

    public boolean mainRoom;
    public boolean key3;

    // instance variables
    /*public String d_roomTitle;
    public String d_roomDescription;

    public String Location()
    {
    roomTitle = new String("");
    roomDescription = new String ();
    }

    public String location (String title)
    {
        //Assigns title
        d_roomTitle = title;

        //blank room description
        d_roomDescription = new String();
    }

    // returns location title
    public String getTitle()
    {
        return d_roomTitle;
    }

    // assigns the location title
    public void setTitle(String roomTitle)
    {
        d_roomTitle = roomTitle;
    }

    // returns location description
    public String getDescription()
    {
        return d_roomDescription;
    }

    // assigns location description
    public void setDescription(String roomDescription)
    {
        d_roomDescription = roomDescription;
    }
*/

//------------------------------------------------------------------------------
void dungeonStart()
{
    boolean key3 = false;
    Scanner userInput = new Scanner(System.in);

    // main description of this stage and the possible options
/*    String description  = "In level 3 there are 2 levels as well. On the right is a certain level \n"
    + "and on the left is another level, both of which you can enter and leave at will.\n"
    + "You cannot proceed to the next part of the game without first solving this stage first. \n";

    System.out.println("\nWelcome to level 3! Another stage consisting of two parts!\n");

*/
        // main game loop that repeats until the player is out of lives
        if (key3 == false)
        {
            //System.out.println(Description);
            System.out.println("Would you like to go left (L) into the dungeon? ");

                // pop up box prompting user if they want to go left or right
                Object[] possibleValues = { "Left", "Go back" };
                String leftOrRight = (String)JOptionPane.showInputDialog(null,
                                "What is your move?", "Input",
                                JOptionPane.INFORMATION_MESSAGE, null,
                                possibleValues, possibleValues[0]);


            // variable to decide if the player is still in the main game loop or exits
            boolean mainRoom = false;

                // checks if the player wants to play the game and starts/exits accordingly
                if (leftOrRight.equalsIgnoreCase("Left") && (mainRoom == false))
                {
                    System.out.println("\nYou have entered the dungeon. It is dark all around. You see a\n"
                    + "spark. Flames blazing! There is a dragon! You must solve the puzzle to escape!");
                //    System.out.println("Player options: \n(P) to attempt the puzzle\n(E) to escape\n(Q) to quit game");
                //    System.out.print("Choice: ");

                } else
                {
                    System.out.println("You have gone back to the main room!");
                }
            }

}


//------------------------------------------------------------------------------
void colorGame()
{
    Object[] possibleDungeonValues = { "Puzzle", "Escape", "Quit" };
    String dungeonChoice = (String)JOptionPane.showInputDialog(null,
                    "What is your move?", "Input",
                    JOptionPane.QUESTION_MESSAGE, null,
                    possibleDungeonValues, possibleDungeonValues[0]);

                    // begins the puzzle
                    if (dungeonChoice.equalsIgnoreCase("Puzzle"))
                    {
                        System.out.println("The puzzle has commenced. Are you ready to fight for your life?");

                        int numOfLives = 5;
                        boolean colorStage = false;
                        int randomColor = new Random().nextInt(10);
                        Scanner color = new Scanner(System.in);

                        System.out.println("Answer correctly what each combination of color makes!");

                        // color minigame loop that runs until the player is out of lives
                        // or the player decides to exit
                        while (colorStage == false)
                        {
                            System.out.println("Number of lives: " + numOfLives);

                            if (randomColor == 1) // YELLOW AND RED
                            {
                                System.out.print("\nYellow and red makes? ");
                                String colorChoice1 = color.nextLine();
                                if (colorChoice1.equalsIgnoreCase("orange"))
                                {
                                    System.out.print("Correct!");
                                } else
                                {
                                    System.out.println("Incorrect! You have lost a life!");
                                    numOfLives = numOfLives - 1;
                                }
                            }
                            else if (randomColor == 2) { // RED AND BLUE
                                System.out.print("\nRed and blue makes? ");
                                String colorChoice2 = color.nextLine();
                                if (colorChoice2.equalsIgnoreCase("purple")) {
                                    System.out.print("Correct!");
                                } else {
                                    System.out.println("Incorrect! You have lost a life!");
                                    numOfLives = numOfLives - 1;
                                } }
                            else if (randomColor == 3) { //BLUE AND YELLOW
                                System.out.print("\nBlue and yellow makes? ");
                                String colorChoice3 = color.nextLine();
                                if (colorChoice3.equalsIgnoreCase("green")) {
                                    System.out.print("Correct!");
                                } else {
                                    System.out.println("Incorrect! You have lost a life!");
                                    numOfLives = numOfLives - 1;
                                } }
                            else if (randomColor == 4) { // RED AND GREEN
                                System.out.print("\nRed and green makes? ");
                                String colorChoice4 = color.nextLine();
                                if (colorChoice4.equalsIgnoreCase("brown")) {
                                    System.out.println("Correct!");
                                } else {
                                    System.out.println("Incorrect! You have lost a life!");
                                    numOfLives = numOfLives - 1;
                                }}
                            else if (randomColor == 5) { // YELLOW AND RED
                                System.out.print("\nYellow and red makes? ");
                                String colorChoice5 = color.nextLine();
                                if (colorChoice5.equalsIgnoreCase("yellow green") || colorChoice5.equalsIgnoreCase("green yellow")) {
                                    System.out.println("Correct!");
                                } else {
                                    System.out.println("Incorrect! You have lost a life!");
                                    numOfLives = numOfLives - 1;
                                }}
                            else if (randomColor == 6) { // BLUE AND GREEN
                                System.out.print("\nBlue and Green makes? ");
                                String colorChoice6 = color.nextLine();
                                if (colorChoice6.equalsIgnoreCase("aquamarine")) {
                                    System.out.print("Correct!");
                                } else {
                                    System.out.println("Incorrect! You have lost a life!");
                                    numOfLives = numOfLives - 1;
                                }}
                            else if (randomColor == 7) { // RED AND WHITE
                                System.out.print("\nRed and white makes? ");
                                String colorChoice7 = color.nextLine();
                                if (colorChoice7.equalsIgnoreCase("pink")) {
                                    System.out.println("Correct!");
                                } else {
                                    System.out.print("Incorrect! You have lost a life!");
                                    numOfLives = numOfLives - 1;
                                }}
                            else if (randomColor == 8) { // BLACK AND WHITE
                                System.out.print("\nBlack and white makes? ");
                                String colorChoice8 = color.nextLine();
                                if (colorChoice8.equalsIgnoreCase("grey") || colorChoice8.equalsIgnoreCase("gray")) {
                                    System.out.println("Correct!");
                                } else {
                                    System.out.print("Incorrect! You have lost a life!");
                                    numOfLives = numOfLives - 1;
                                }}
                            else if (randomColor == 9) // WHITE AND PURPLE
                            {
                                System.out.print("\nWhite and purple makes? ");
                                String colorChoice9 = color.nextLine();
                                if (colorChoice9.equalsIgnoreCase("light purple")) {
                                    System.out.println("Correct!");
                                } else
                                {
                                    System.out.print("Incorrect! You have lost a life!");
                                    numOfLives = numOfLives - 1;
                                }
                            }
                            else if (randomColor == 10) // RED AND BLACK
                            {
                                System.out.print("\nRed and black makes? ");
                                String colorChoice10 = color.nextLine();
                                if (colorChoice10.equalsIgnoreCase("pink")) {
                                    System.out.println("Correct!");
                                } else
                                {
                                    System.out.print("Incorrect! You have lost a life!");
                                    numOfLives = numOfLives - 1;
                                }
                            }
                        }
                        // shows player's number of lives and promtpts if the player wants to play again
                        System.out.println("\nNumber of lives: " + numOfLives);
                        System.out.println();
                        System.out.print("Would you like to play again [(Y) or (N)]? ");
                        String playAgain = color.nextLine();
                        // replays the color game if the player enters y
                        if (playAgain.equalsIgnoreCase("y"))
                        {
                            colorStage = false;
                            randomColor = randomColor + 1;
                            if (randomColor == 10)
                            {
                                randomColor = 1;
                            }
                        // program automatically ends game if lives reach 0
                        } else if(numOfLives == 0)
                        {
                            System.out.println("You have died. Rest in peace!");
                            key3 = true;
                        }
                        // program exits back to main loop if player no longer wants to play color game
                        else if (playAgain.equalsIgnoreCase("n"))
                        {
                            System.out.println("You have gone back to the main room");
                            colorStage = true;
                        } else
                        {
                            System.out.print("That is not a valid input.");
                        }


                    }
                    else if (dungeonChoice.equalsIgnoreCase("Escape"))
                    {
                        System.out.println("\nYou run for your life! You have returned to the main room.\n");
                        mainRoom = true;
                    } else if (dungeonChoice.equalsIgnoreCase("Quit"))
                    {
                        System.out.println("Aww, sad to see you go. Try again soon!");
                        key3 = true;
                    }

            else
            {
                System.out.println("That is an invalid input. Please select (R) or (L)!");
            }
        }
}

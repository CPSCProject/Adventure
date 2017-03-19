import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JFrame;



/*
List of variables

key3 = false: main boolean for the stage loop

*/


public class DungeonLogic
{

    public boolean key3;

    private int totalSticks;
    private int dragTakenSticks;
    private int playTakenSticks;


//------------------------------------------------------------------------------
// a list of most of the print information for the class

    String dungeonGameDescription =
    "\nA pile of sticks has trapped you in the dungeon cell! \n" +
    "You must remove either one or two sticks from the pile in" +
    "order to escape. Your goal is to not pick up the last stick.\n" +
    "However, a dragon will join you. Whoever is forced to \n" +
    "to take the last stick will be trapped forever";

    String dungeonEntranceInfo = "\nYou have entered the dungeon. It is dark all around. You see a\n"
    + "spark. Flames blazing! There is a dragon! You must solve the puzzle to escape! \n";
    String winGame = "\nYou have outsmarted the dragon. You are free to leave!";
    String loseGame = "You are forced to take the last stick. You are trapped for eternity!";
    String displayStickAmount = "\nThere are " + totalSticks + " sticks in the pile";
    //String displayPlayerAmount = "\nYou have taken " + takenSticks + " sticks.";
    //String displayDragonAmount = "\nThe dragon takes " + takenSticks + " sticks.";
    String stickError = "\nYou can only take one or two sticks!\n";


//------------------------------------------------------------------------------
/**
* Method that determines whether the dungeon level will start or to go back
*
* parameters: none
*
* returns: integer
*/

String dungeonStart()
{
    // pop up box prompting user if they want to go into the dungeon
    Object[] possibleValues = { "Dungeon", "Go back" };

    String dungeonOrBack = (String)JOptionPane.showInputDialog(null,
                    "Would you like to go into the dungeon?", "Dungeon",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);

    return (dungeonOrBack);
}

//------------------------------------------------------------------------------
/**
* Method that asks the user for how many sticks they would like to pick up
*
* parameters: none
*
* retuns: integer
*/

int takenStickAmount()
{
    // pop up box prompting user how many sticks to take
    Object[] possibleValues = { 1, 2 };
    int numSticks = (int)JOptionPane.showInputDialog(null,
                    "How many sticks would you like to take?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);

    //int i = Integer.parseInt(numSticks);
    return (numSticks);
}

//------------------------------------------------------------------------------
/**
* Method that gets the total stick amount
*
* parameters: none
*
* retuns: integer
*/
public int getTotalSticks()
{
    return (totalSticks);
}

//------------------------------------------------------------------------------
/**
Method that gets the total stick amount

parameters: integer

retuns: none
*/
public void setTotalSticks(int getSticks)
{
    totalSticks = getSticks;
}

//------------------------------------------------------------------------------
/**
* method to play the game when the player has the first turn. It will run the
* computers turn too and display whether the player wins or loses
*
* parameters; none
*
* returns: integer
*
*/
boolean sticks21first()
{

    while (totalSticks >= 1)
    {

        System.out.println("\nThere are " + totalSticks + " sticks in the pile");
        System.out.print("Would you like to take 1 or 2? ");
        Scanner input = new Scanner(System.in);
        playTakenSticks = input.nextInt();
        //playTakenSticks = takenStickAmount();
        totalSticks = totalSticks - playTakenSticks;

                System.out.println("\nYou have taken " + playTakenSticks + " sticks.");

                if (totalSticks <= 0)
                {
                    System.out.println(loseGame);
                }

                else
                {
                    // computer's turn to take sticks
                    if (totalSticks - 2 == 0 || (totalSticks - 2) % 3 == 0)
                    {
                        dragTakenSticks = 1;
                    }
                    else
                    {
                        dragTakenSticks = 2;
                    }

                    totalSticks = totalSticks - dragTakenSticks;
                    System.out.println("\nThe dragon takes " + dragTakenSticks + " sticks.");
                    System.out.println("There are " + totalSticks + " sticks left.");

                    if (totalSticks <= 0)
                    {
                        System.out.println(winGame);
                        key3 = true;
                    }
                }
    }
    return(key3);
}

//------------------------------------------------------------------------------
/**
* method to play the game when the player has the second turn. It will run the
* computers turn first and display whether the player wins or loses
*
* parameters; none
*
* returns: boolean
*
*/
boolean sticks21second()
{

    while (totalSticks >= 1)
    {
        // computers turn to take sticks
        if (totalSticks - 2 == 0 || (totalSticks - 2) % 3 == 0)
        {
            dragTakenSticks = 1;
        }
        else
        {
            dragTakenSticks = 2;
        }

        totalSticks = totalSticks - dragTakenSticks;
        System.out.println("\nThe dragon takes " + dragTakenSticks + " sticks.");

        if (totalSticks <= 0)
        {
            System.out.println(winGame);
            key3 = true;
        }
        else
        {
            // player's turn to take sticks
            System.out.println("There are " + totalSticks + " sticks in the pile");
            System.out.print("Would you like to take 1 or 2? ");
            Scanner input = new Scanner(System.in);
            playTakenSticks = input.nextInt();
            //playTakenSticks = takenStickAmount();
            totalSticks = totalSticks - playTakenSticks;

                    System.out.println("\nYou have taken " + playTakenSticks + " sticks.");

        }

        if (totalSticks <= 0)
        {
            System.out.println(loseGame);

        }

    }
    return(key3);
}


//------------------------------------------------------------------------------
/**
* method to ask player if they would like to play the string game again
*
* parameters: none
*
* returns: boolean
*/

String restartGame()
{
    // pop up box prompting user if they want to play again
    Object[] possibleValues = { "Yes", "No" };
    String gameRepeat = (String)JOptionPane.showInputDialog(null,
                    "Would you like to play again?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);
    return (gameRepeat);

}

//------------------------------------------------------------------------------
/**
* method to ask player if they want to go first or second in the sticks game
*
* parameters: none
*
* returns: string
*/

public String playerChoice()
{
    // pop up box prompting user if they want to go first or let the computer go first
    Object[] possibleValues = { "First", "Second" };
    String firstOrSecond = (String)JOptionPane.showInputDialog(null,
                    "Would you like to go first or second?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);
    return (firstOrSecond);
}

}

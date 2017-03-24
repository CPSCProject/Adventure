import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JFrame;



/*
List of variables

key3 = false: main boolean for the stage loop

*/


public class Key3
{

    public boolean key3;

    private boolean dungeonKeyStatus;
    private static int totalSticks = 21;
    private int dragTakenSticks;
    private int playTakenSticks;


//------------------------------------------------------------------------------
// a list of most of the print information for the class


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
* method to calculate if the dragon/computer has taken the last stick. If it did,
* it lost the game. If it didn't, the computer has won.
*
* parameters; none
*
* returns: boolean
*/
boolean dragonWin()
{
    boolean dragonVictory = false;
    if(totalSticks <=0)
    {
    dragonVictory = true;
    }
    return (dragonVictory);
}


//------------------------------------------------------------------------------
/**
* method to calculate if the player has taken the last stick. If they did,
* they lost the game. If they didn't, the have won.
*
* parameters; none
*
* returns: boolean
*/
boolean playerWin()
{
    boolean playerVictory = false;
    if (totalSticks <= 0 )
    {
        playerVictory = true;
    }
    return(playerVictory);
}



//------------------------------------------------------------------------------
/**
* method to calculate the total amount of sticks left by subtracting the amount
* the player and dragon takes
*
* parameters; integer
*
* returns: none
*/
void totalSticks(int takenSticks)
{
    totalSticks = totalSticks - takenSticks;
}

//------------------------------------------------------------------------------
/**
* method to that prints the amount of sticks left in the pile and promts the user
* for how many sticks they would like to pick up in the next turn
*
* parameters; none
*
* returns: integer
*/
String printSticks()
{
    String stickLeft = "There are " + totalSticks + " sticks left.\n" +
                        "Type q to pick up 1 stick \n" +
                        "Type w to pick up 2 sticks";
    return (stickLeft);
}

//------------------------------------------------------------------------------
/**
* method that calculates how many sticks the dragon (computer) will pick up
* The amount taken is a simple math algorithm so that the computer will try not
* to pick up the last stick. It will then return the amount of sticks taken
*
* parameters; none
*
* returns: integer
*/
int dragStick()
{
    if (totalSticks - 2 == 0 || (totalSticks - 2) % 3 == 0)
    {
        dragTakenSticks = 1;
    }
    else
    {
        dragTakenSticks = 2;
    }

    return(dragTakenSticks);

}

}

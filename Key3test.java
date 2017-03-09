import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

/*
List of variables

key3 = false: main boolean for the stage loop
numOfLives = 5: number of lives of the player
all the other variables are going to be local to this stage

*/


public class Key3test
{
    public boolean key3;
    private int totalSticks;
    private int dragTakenSticks;
    private int playTakenSticks;


  public Key3test(int totStick)
  {
    totalSticks = totStick;
    System.out.println("Total sticks: " + totalSticks);
  }

  public Key3test()
  {
    this(21);
  }



/* public Key1autotest(int userlives)
  {
    this(false, userlives);
} */


//------------------------------------------------------------------------------

    String dungeonGameDescription =
    "A pile of sticks has trapped you in the dungeon cell! \n" +
    "You must remove one or two sticks from the pile in order \n" +
    "to escape. However, a dragon will join you. Whoever has \n" +
    "to take the last stick will be trapped forever";

    String dungeonEntranceInfo = "\nYou have entered the dungeon. It is dark all around. You see a\n"
    + "spark. Flames blazing! There is a dragon! You must solve the puzzle to escape! \n";
    String winGame = "\nYou have outsmarted the dragon. You are free to leave!";
    String loseGame = "You have taken the last stick. You are trapped for eternity!";
    String displayStickAmount = "\nThere are " + totalSticks + " sticks in the pile";
    String stickError = "\nYou can only take one or two sticks!\n";


//------------------------------------------------------------------------------
/*
Method that determines whether the dungeon level will start or to go back

parameters: none

retuns: none
*/

String dungeonStart(String userChoice)
{
    // pop up box prompting user if they want to go into the dungeon
    /*Object[] possibleValues = { "Dungeon", "Go back" };
    String dungeonOrBack = (String)JOptionPane.showInputDialog(null,
                    "Would you like to go into the dungeon?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]); */
    String dungeonOrBack = userChoice;
    return (dungeonOrBack);

}

//------------------------------------------------------------------------------
/*
Method that asks the user for how many sticks they would like to pick up

parameters: none

retuns: integer
*/

int takenStickAmount(int a)
{
    // pop up box prompting user how many sticks to take
    /*Object[] possibleValues = { 1, 2 };
    int numSticks = (int)JOptionPane.showInputDialog(null,
                    "How many sticks would you like to take?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]); */
    int numSticks = a;
    return (numSticks);
}

//------------------------------------------------------------------------------
/*
Method that gets the total stick amount

parameters: none

retuns: integer
*/
public int getTotalSticks()
{
    return (totalSticks);
}

//------------------------------------------------------------------------------
/*
Method that sets the total stick amount

parameters: integer

retuns: none
*/
public void setTotalSticks(int getSticks)
{
    totalSticks = getSticks;
}

//------------------------------------------------------------------------------
boolean pass;
boolean Sticks21first(int stick1)
{

    while (totalSticks >= 1)
    {
        System.out.println("\nThere are " + totalSticks + " sticks in the pile");
        System.out.print("Would you like to take 1 or 2? ");
        playTakenSticks = stick1;
        totalSticks = totalSticks - playTakenSticks;

            System.out.println("\nYou have taken " + playTakenSticks + " sticks.");

            if (totalSticks <= 0)
            {
                System.out.println(loseGame);
                pass = true;

            }

            else
            {
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
                System.out.println("There are " + totalSticks + " left.");

                if (totalSticks <= 0)
                {
                    System.out.println(winGame);

                }
            }

    }
    return(pass);
}

//------------------------------------------------------------------------------
boolean fail;
boolean Sticks21second(int stick2)
{
    while (totalSticks >= 1)
    {

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

        }
        else
        {
            System.out.println("There are " + totalSticks + " sticks in the pile");
            System.out.print("Would you like to take 1 or 2? ");
            int playTakenSticks = stick2;
            totalSticks = totalSticks - playTakenSticks;

            System.out.println("\nYou have taken " + playTakenSticks + " sticks.");

        }

        if (totalSticks <= 0)
        {
            System.out.println(loseGame);
            fail = true;

        }

    }
    return (fail);
}

//------------------------------------------------------------------------------
/*
method to ask player if they would like to play the string game again

parameters: none

returns: boolean*
*/

String restartGame(String userChoice)
{
    // pop up box prompting user if they want to play again
    /*Object[] possibleValues = { "Yes", "No" };
    String gameRepeat = (String)JOptionPane.showInputDialog(null,
                    "Would you like to play again?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]); */
    String gameRepeat = userChoice;
    return (gameRepeat);

}

//------------------------------------------------------------------------------
/*
method to ask player if they want to go first or second in the sticks game

parameters: none

returns: string
*/

public String playerChoice(String userChoice)
{
    // pop up box prompting user if they want to go first or let the computer go first
    /*Object[] possibleValues = { "First", "Second" };
    String firstOrSecond = (String)JOptionPane.showInputDialog(null,
                    "Would you like to go first or second?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]); */
    String firstOrSecond = userChoice;
    return (firstOrSecond);
}

public String playerChoice1(String userChoice)
{
    // pop up box prompting user if they want to go first or let the computer go first
    /*Object[] possibleValues = { "First", "Second" };
    String firstOrSecond = (String)JOptionPane.showInputDialog(null,
                    "Would you like to go first or second?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]); */
    String firstOrSecond = userChoice;
    return (firstOrSecond);
}

}

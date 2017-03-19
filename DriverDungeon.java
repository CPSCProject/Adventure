/**
* The DriverDungeon program is the driver class for the DungeonLogic class.
*
*
*
*
*
*
*
*
* @author Jiahe (Jack)
*
*
*/

import java.util.Scanner;

public class DriverDungeon
{
    public static void main(String[]args)
    {

        DungeonLogic dungeonLogic = new DungeonLogic();

        boolean key3Start = true;
        boolean restart = true;
        boolean gameOver = false;
        dungeonLogic.setTotalSticks(21);

        Scanner input = new Scanner(System.in);

        while (key3Start == true)
        {
            //String startDungeon = dungeonLogic.dungeonStart();
            System.out.print("Would you like to go into the dungeon? ");
            String startDungeon = input.next();

            // checks if the player wants to play the game/enter dungeon and starts/exits accordingly
            if (startDungeon.equalsIgnoreCase("Yes"))
            {
                System.out.println(dungeonLogic.dungeonGameDescription);

            /*    if (gameOver == false)
                { */
                    //String first_second = dungeonLogic.playerChoice();
                    System.out.print("Would you like to go first or second? ");
                    String first_second = input.next();

                    if (first_second.equalsIgnoreCase("First"))
                    {
                        dungeonLogic.sticks21first();
                        key3Start = false;
                    }
                    else if (first_second.equals("Second"))
                    {
                        dungeonLogic.sticks21second();
                        key3Start = false;
                    }

                /*    String playAgain = dungeon.restartGame();
                    if (playAgain.equalsIgnoreCase("Yes"))
                    {
                        gameOver = false;
                    }
                    else
                    {
                        System.out.println("You leave the room.");
                        gameOver = true;
                        key3Start = false;
                    }
                    */
                }
            else if (startDungeon.equalsIgnoreCase("No"))
            {
                System.out.println("You have gone back");
                key3Start = false;

            }

        }
    }
}




/*
String playAgain = dungeon.restartGame();
if (playAgain.equals("Yes"))
{
    restart = true;
}
else
{
    restart = false;
}
*/

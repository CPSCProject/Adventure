public class Driver
{
    public static void main(String[]args)
    {

        Key3 dungeon = new Key3();

        boolean key3Start = true;
        boolean restart = true;
        boolean gameOver = false;
        dungeon.setTotalSticks(21);

        while (key3Start == true)
        {
            String startDungeon = dungeon.dungeonStart();

            // checks if the player wants to play the game/enter dungeon and starts/exits accordingly
            if (startDungeon.equalsIgnoreCase("Dungeon"))
            {
                System.out.println(dungeon.dungeonGameDescription);

            /*    if (gameOver == false)
                { */
                    String first_second = dungeon.playerChoice();

                    if (first_second.equals("First"))
                    {
                        System.out.println("hellothere");
                        dungeon.sticks21first();
                        key3Start = false;
                    }
                    else
                    {
                        dungeon.sticks21second();
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
            else
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

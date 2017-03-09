public class DriverTest
{
    public static void main(String[]args)
    {

        int counter = 0;
        int totalTests = 0;

        boolean test1;
        boolean test2;
        boolean test3;
        boolean test4;
        boolean test5;
        boolean test6;
        boolean test7;

        Key3test dungeonTest = new Key3test();
        Key3test dungeonTest2 = new Key3test();
        Key3test dungeonTest3 = new Key3test();
        Key3test dungeonTest4 = new Key3test();



            String startDungeon = dungeonTest.dungeonStart("Dungeon");
            // Tests first input if the player wants to enter the dungeon
            if (startDungeon.equalsIgnoreCase("Dungeon"))
            {
                test1 = true;
                counter = counter + 1;
            }
            else
            {
                test1 = false;
            }
            totalTests = totalTests + 1;

            String first_second = dungeonTest.playerChoice("First");

            // Tests if when the player chooses "first" that they start first
            if (first_second.equals("First"))
            {
                test2 = true;
                counter = counter + 1;
            }
            else
            {
                test2 = false;
            }
            totalTests = totalTests + 1;

            String first_second1 = dungeonTest.playerChoice1("Second");

            // tests if when the player chooses "second" that they start second
            if (first_second1.equals("Second"))
            {
                test3 = true;
                counter = counter + 1;
            }
            else
            {
                test3 = false;

            }
            totalTests = totalTests + 1;

            //tests if the player loses when they have first turn
            boolean stick1 = dungeonTest.Sticks21first(2);
            if (stick1 == true)
            {
                test4 = true;
                counter = counter + 1;
            }
            else
            {
                test4 = false;
            }
            totalTests = totalTests + 1;

            // tests is the player loses when they have second turn
            boolean stick2 = dungeonTest2.Sticks21second(2);
            if (stick2 == true)
            {
                test5 = true;
                counter = counter + 1;
            }
            else
            {
                test5 = false;
            }
            totalTests = totalTests + 1;

            /*boolean stick3 = dungeonTest3.Sticks21first1(1);
            if (stick1 == true)
            {
                test6 = true;
            }
            else
            {
                test6 = false;
            }

            boolean stick4 = dungeonTest4.Sticks21second1(1);
            if (stick1 == true)
            {
                test7 = true;
            }
            else
            {
                test7 = false;
            }
            */

//------------------------------------------------------------------------------
System.out.println("\n\n//------------------------------------------------------------------------------");
System.out.println("TEST RESULTS!");
System.out.println("Tests first input if the player wants to enter the dungeon:\n " + test1);
System.out.println("Tests if when the player chooses 'first' that they start first:\n " + test2);
System.out.println("Tests if when the player chooses 'second' that they start second:\n " + test3);
System.out.println("Tests if the player loses when they have first turn:\n " + test4);
System.out.println("Tests if the player loses when they have the second turn:\n " + test5);
/*System.out.println("Tests if the player wins when they have first turn:\n " + test6);
System.out.println("Tests if the player wins when they have the second turn:\n " + test7); */

System.out.println("TEST SUMMARY!");
System.out.println("//------------------------------------------------------------------------------");
System.out.println(counter + " tests passed out of " + totalTests + " total tests." );


    }


}

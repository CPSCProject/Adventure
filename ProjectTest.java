public class ProjectTest {
  public static void main(String[] args) {

//-------------------LIBRARY TEST--------------------------
Key1autotest p1 = new Key1autotest(true, 2);
boolean rboolean, uboolean, eboolean, key1;
p1.startgamemethod("no");
p1.startgamemethod("yes");
p1.difficultymethod("easy");
p1.difficultymethod("medium");
p1.difficultymethod("hard");
rboolean = p1.puzzle1method("mailbox", "wholesome", "inkstand");
//test wrong answers: lives will become negative
p1.puzzle1method("mailboxs", "wholesome", "inkstand");
p1.puzzle1method("mailbox", "wholesomes", "inkstand");
p1.puzzle1method("mailbox", "wholesome", "inkstands");
uboolean = p1.puzzle2method("refunded", "observant", "flamingos");
//test wrong answers: lives will become negative
p1.puzzle2method("refundeds", "observant", "flamingos");
p1.puzzle2method("refunded", "observants", "flamingos");
p1.puzzle2method("refunded", "observant", "flamingoss");
eboolean = p1.puzzle4method("german");
//test wrong answer: lives will become negative
p1.puzzle4method("germans");
key1 = p1.key1control(eboolean, uboolean, rboolean);
if (key1) {
  System.out.println("\nALL TESTS PASSED (8/8)");
}
else {
  System.out.println("\nNOT ALL TESTS PASSED");
}


//---------------------KITCHEN TEST------------------------
System.out.println("     ");
System.out.println("     ");
System.out.println("ROOM: KITCHEN");
System.out.println("     ");



KitchenTest r_testa = new KitchenTest(true,300);
r_testa.startGame("yes");
r_testa.difficultyKitchen("medium");
boolean key2determinant1 = r_testa.KitchenExplore("2", "1" ,"345");
System.out.println(key2determinant1);

System.out.println("--------------------------------------------");
System.out.println(" ");


KitchenTest r_testb = new KitchenTest(true,300);
r_testb.startGame("yes");
r_testb.difficultyKitchen("medium");
boolean key2determinant2 = r_testb.KitchenExplore("2", "1" ,"355");
System.out.println(key2determinant2);

System.out.println("--------------------------------------------");
System.out.println(" ");


KitchenTest r_testc = new KitchenTest(false,500);
r_testc.startGame("no");
r_testc.difficultyKitchen("hard");
boolean key2determinant3 = r_testc.KitchenExplore("2", "1" ,"355");
System.out.println(key2determinant3);





//----------------------BOILER TEST-------------------------------
System.out.println("     ");
System.out.println("     ");
System.out.println("ROOM: BOILER");
System.out.println("     ");

String userchoice1main = "1) Investigate the table";
String userchoice2main = "2) Try to open the door";
String userchoice1table = "Red";
String userchoice2table = "Blue";
String userchoice3table = "Green";
boolean n_test1;
boolean n_test2;
boolean n_test3;
boolean n_test4;
boolean n_test5;
boolean n_test6;
boolean n_test7;
boolean n_test8;
boolean n_test9;
boolean n_test10;
boolean n_test11;

//------------------------------------------------------------------------------
TestKey5 testa = new TestKey5(30);
String out1 = testa.printMainMenu(userchoice1main);
if (out1.equals("1) Investigate the table"))
{
  n_test1 = true;
}
else
{
  n_test1 = false;
}

TestKey5 testb = new TestKey5(45);
String out2 = testb.printMainMenu(userchoice2main);
if (testb.door == false)
{
  if (out2.equals("You push with all your might, and the door remains stubbornly locked"))
  {
    n_test2 = true;
  }
  else
  {
    n_test2 = false;
  }
}
else
{
  if (out2.equals("HAZZA THE DOOR IS UNLOCKED! YOU HAVE COMPLETED THE LEVEL"))
  {
    n_test2 = true;
  }
  else
  {
    n_test2 = false;
  }
}

TestKey5 testc = new TestKey5(30);
String out3 = testc.printTableMenu(userchoice1table);
if (out3.equals("Red"))
{
  n_test3 = true;
}
else
{
  n_test3 = false;
}

TestKey5 testd = new TestKey5(100);
String out4 = testd.printTableMenu(userchoice2table);
if (out4.equals("Blue"))
{
  n_test4 = true;
}
else
{
  n_test4 = false;
}

TestKey5 teste = new TestKey5(45);
String out5 = teste.printTableMenu(userchoice3table);
if (out5.equals("Green"))
{
  n_test5 = true;
}
else
{
  n_test5 = false;
}

TestKey5 testf = new TestKey5(30);
String out6 = testf.setDial(userchoice1table);
if (out6.equals(testf.curr_d_colour))
{
  n_test6 = true;
}
else
{
  n_test6 = false;
}

String out7 = testf.setDial(userchoice1table);
if (out7.equals("Dial colour now set to: Red"))
{
  n_test7 = true;
}
else
{
  n_test7 = false;
}

TestKey5 testh = new TestKey5();
String out8 = testh.setDial(userchoice2table);
if (out8.equals("Current Dial colour: Red"))
{
  n_test8 = true;
}
else
{
  n_test8 = false;
}

TestKey5 testi = new TestKey5();
String out9 = testi.setDial(userchoice2table);
if (out9.equals("Dial colour now set to: Blue"))
{
  n_test9 = true;
}
else
{
  n_test9 = false;
}

TestKey5 testj = new TestKey5(45);
String out10 = testj.setDial(userchoice3table);
if (out10.equals("Current Dial colour: Blue"))
{
  n_test10 = true;
}
else
{
  n_test10 = false;
}

TestKey5 testk = new TestKey5(30);
String out11 = testk.setDial(userchoice3table);
if (out11.equals("Dial colour now set to: Green"))
{
  n_test11 = true;
}
else
{
  n_test11 = false;
}


//------------------------------------------------------------------------------

System.out.println("Checking Methods results: ");
System.out.println("**************************************************************");
System.out.println("Test1: " + n_test1);
System.out.println("Test2: " + n_test2);
System.out.println("Test3: " + n_test3);
System.out.println("Test4: " + n_test4);
System.out.println("Test5: " + n_test5);
System.out.println("Test6: " + n_test6);
System.out.println("Test7: " + n_test7);
System.out.println("Test8: " + n_test8);
System.out.println("Test9: " + n_test9);
System.out.println("Test10: " + n_test10);
System.out.println("Test11: " + n_test11);



//-----------------------------DUNGEON TEST-----------------------------------------
System.out.println("     ");
System.out.println("     ");
System.out.println("ROOM: DUNGEON");
System.out.println("     ");

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

//---------------------------MAGIC TEST-----------------------------------------
System.out.println("     ");
System.out.println("     ");
System.out.println("ROOM: PortionRoom");
System.out.println("     ");

int count = 600;
Keyexercise3 j = new Keyexercise3(false, 600, "easy");
j.difficultyPortionRoom(count, "easy");
j.gameoption("john", "1", "2","3","4");


}
}

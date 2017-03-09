public class Testld
{
  public static void main(String[] args)
  {
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
    TestKey5 testa = new TestKey5();
    String out1 = testa.printMainMenu(userchoice1main);
    if (out1.equals("1) Investigate the table"))
    {
      n_test1 = true;
    }
    else
    {
      n_test1 = false;
    }

    TestKey5 testb = new TestKey5();
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

    TestKey5 testc = new TestKey5();
    String out3 = testc.printTableMenu(userchoice1table);
    if (out3.equals("Red"))
    {
      n_test3 = true;
    }
    else
    {
      n_test3 = false;
    }

    TestKey5 testd = new TestKey5();
    String out4 = testd.printTableMenu(userchoice2table);
    if (out4.equals("Blue"))
    {
      n_test4 = true;
    }
    else
    {
      n_test4 = false;
    }

    TestKey5 teste = new TestKey5();
    String out5 = teste.printTableMenu(userchoice3table);
    if (out5.equals("Green"))
    {
      n_test5 = true;
    }
    else
    {
      n_test5 = false;
    }

    TestKey5 testf = new TestKey5();
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

    TestKey5 testj = new TestKey5();
    String out10 = testj.setDial(userchoice3table);
    if (out10.equals("Current Dial colour: Blue"))
    {
      n_test10 = true;
    }
    else
    {
      n_test10 = false;
    }

    TestKey5 testk = new TestKey5();
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

  }
}

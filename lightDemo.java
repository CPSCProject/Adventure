// note: this is a temporary version of the lightDemo level using Key5temp class
public class lightDemo
{
  public static void main(String[] args)
  {
    boolean play = true;
    Key5temp boiler = new Key5temp();
    System.out.println(boiler.str_roominfo);


    while (play == true)
    {
      String userchoice = boiler.printMainMenu();
      if (userchoice.equals("1) Investigate the table"))
      {
        while (boiler.key5 == false)
        {
          System.out.println(boiler.str_switchTable_descrip);
          String d_colour = boiler.printTableMenu();
          boiler.setDial(d_colour);
          boiler.key5 = boiler.sw_Room();
          boiler.tryDoor();
        }
        System.out.println(boiler.switchTable_set);
     }

     else if (userchoice.equals("2) Try to open the door"))
     {
       if (boiler.key5 == false)
       {
         System.out.println(boiler.door_locked);
       }
       else
       {
         System.out.println(boiler.door_unlocked);
         play = false;
       }
     }
   }
  }
}

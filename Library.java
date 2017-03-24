import java.util.Scanner;
import java.util.Random;
/**
*The Library program runs the logic of the GUI Main.java
*this class represents a player of the game going through 8 riddles
*the body initializes keyboard and public variables gameOn (controls if level runs)
*There are no privacy leaks in this code because the entire instance of a class
*is never returned to another class, only individual instance variables are returned.
*/
public class Library
{
  //initialize keyboard and public variables gameOn (controls if level runs) and lives (differ depending on difficulty)
  Scanner keyboard = new Scanner(System.in);
  public boolean gameOn;
  //public int lives=5;
  public boolean key1;

//---------------------------------------------------------------------------------------------------------

/**
*8 riddles that will display one after another if the previous answer is right
*returns: String of new riddle depending on if answers are right
*/

/**
*Riddle 2
*checks answer of previous question and if it is right the next question is displayed
*parameter: String
*returns: String
*/
public String puzzle1method(String parameter){
  String puzzle1 = "error";
  if (parameter.equals("mailbox"))
    {
      puzzle1 = "Correct! \nRiddle 2: What is it that after you take away the whole, some still remains? \n1. wholesome \n2. donut";//answer is correct
    }
    else
    {
      puzzle1 = "Incorrect. ";
    }
    String puzzle1return = puzzle1;
    return puzzle1return;
  }
/**
*Riddle 3
*checks answer of previous question and if it is right the next question is displayed
*parameter: String
*returns: String
*/
  public String puzzle2method(String parameter){
    String puzzle2 = "error";
    if (parameter.equals("wholesome"))
      {
        puzzle2 = "Correct! \nRiddle 3: Name an eight letter word that has kst in the middle, \nin the beginning, and at the end. \n1. instand \n2. kstkstkst";//answer is correct
      }
      else
      {
        puzzle2 = "Incorrect. ";
      }
      String puzzle2return = puzzle2;
      return puzzle2return;
    }
/**
*Riddle 4
*checks answer of previous question and if it is right the next question is displayed
*parameter: String
*returns: String
*/
  public String puzzle3method(String parameter){
    String puzzle3 = "error";
    if (parameter.equals("inkstand"))
      {
        puzzle3 = "Correct! \nUnscramble 1: Arrange these letters into a word: \nN D U E D R E F  \n1. refunded \n2. deafened";//answer is correct
      }
      else
      {
        puzzle3 = "Incorrect. ";
      }
      String puzzle3return = puzzle3;
      return puzzle3return;
    }
/**
*Riddle 5
*checks answer of previous question and if it is right the next question is displayed
*parameter: String
*returns: String
*/
  public String puzzle4method(String parameter){
  String puzzle4 = "error";
  if (parameter.equals("refunded"))
   {
    puzzle4 = "Correct! \nUnscramble 2: Arrange these letters into a word: \nV R A E S N T O B \n1. observant \n2. observance";
   }
  else
   {
    puzzle4 = "Incorrect. ";
   }
   String puzzle4return = puzzle4;
   return puzzle4return;
  }
/**
*Riddle 6
*checks answer of previous question and if it is right the next question is displayed
*parameter: String
*returns: String
*/
  public String puzzle5method(String parameter){
    String puzzle5 = "error";
    if (parameter.equals("observant"))
    {
      puzzle5 = "Correct! \nUnscramble 3: Arrange these letters into a word: \nS F N L O I G M A \n1. flamingos \n2. flamenco";//answer is correct
    }
    else
    {
      puzzle5 = "Incorrect. ";
    }
     String puzzle5return = puzzle5;
     return puzzle5return;
    }
/**
*Riddle 7
*checks answer of previous question and if it is right the next question is displayed
*parameter: String
*returns: String
*/
  public String puzzle6method(String parameter){
    String puzzle6 = "error";
    if (parameter.equals("flamingos"))
      {
        puzzle6 = "Correct! \nCombination 1: Find the correct combination of these numbers \n 36 27 11 \n1. 361127 \n2. 112736";//answer is correct
      }
    else
      {
        puzzle6 = "Incorrect. ";
      }
      String puzzle6return = puzzle6;
      return puzzle6return;
    }
/**
*Riddle 8
*checks answer of previous question and if it is right the next question is displayed
*parameter: String
*returns: String
*/
  public String puzzle7method(String parameter){
    String puzzle7 = "error";
    if (parameter.equals("112736"))
      {
        puzzle7 = "Correct! \nCombination 2: Find the correct combination of these numbers \n 42 19 04 \n1. 190442 \n2. 041942";//answer is correct
      }
    else
      {
        puzzle7 = "Incorrect. ";
      }
      String puzzle7return = puzzle7;
      return puzzle7return;
    }
/**
*Riddle 9
*checks answer of previous question and if it is right the next question is displayed
*parameter: String
*returns: String
*/
  public String puzzle8method(String parameter){
    String puzzle8 = "error";
    if (parameter.equals("190442"))
      {
        puzzle8 = "Correct! \n The level has been completed! ";//answer is correct
      }
    else
      {
        puzzle8 = "Incorrect. ";
      }
      String puzzle8return = puzzle8;
      return puzzle8return;
    }
}

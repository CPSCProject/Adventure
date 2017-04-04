import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

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
  //public boolean gameOn;
  //public int lives=5;
  public static boolean key1;
  List<String> name = new ArrayList<String>();
  String[] namesArray;
  String line;
  BufferedReader br = null;
  FileReader fr = null;

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
      try {
        fr = new FileReader("Riddles.txt");
        br = new BufferedReader(fr);
        br = new BufferedReader(new FileReader("Riddles.txt"));
        while ((line = br.readLine()) != null) {
          name.add(line);
        }
        namesArray = name.toArray(new String[name.size()]);
        puzzle1 = name.get(0);
		}
    catch(IOException e){
          System.out.println("Error opening the file Riddles.txt");
          //System.exit(0);
      }
      //puzzle1 = "Correct! \nRiddle 2: What is it that after you take away the whole, \nsome still remains? \n1. wholesome \n2. donut";//answer is correct
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
        try {
          fr = new FileReader("Riddles.txt");
          br = new BufferedReader(fr);
          br = new BufferedReader(new FileReader("Riddles.txt"));
          while ((line = br.readLine()) != null) {
            name.add(line);
          }
          namesArray = name.toArray(new String[name.size()]);
          puzzle2 = name.get(1);
        }
      catch (IndexOutOfBoundsException e) {
        puzzle2 = "Index is out of bounds";
      }
      catch (FileNotFoundException e) {
        puzzle2 = "File is not found";
      }
      catch (IOException e) {
        puzzle2 = "IOexception arose";
      }
    }
        //puzzle2 = "Correct! \nRiddle 3: Name an eight letter word that has kst in the middle, \nin the beginning, and at the end. \n1. instand \n2. kstkstkst";//answer is correct
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
        try {
          fr = new FileReader("Riddles.txt");
          br = new BufferedReader(fr);
          br = new BufferedReader(new FileReader("Riddles.txt"));
          while ((line = br.readLine()) != null) {
            name.add(line);
          }
          namesArray = name.toArray(new String[name.size()]);
          puzzle3 = name.get(2);
        }
      catch (IndexOutOfBoundsException e) {
        puzzle3 = "Index is out of bounds";
      }
      catch (FileNotFoundException e) {
        puzzle3 = "File is not found";
      }
      catch (IOException e) {
        puzzle3 = "IOexception arose";
      }
        //puzzle3 = "Correct! \nUnscramble 1: Arrange these letters into a word: \nN D U E D R E F  \n1. refunded \n2. deafened";//answer is correct
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
     try {
       fr = new FileReader("Riddles.txt");
       br = new BufferedReader(fr);
       br = new BufferedReader(new FileReader("Riddles.txt"));
       while ((line = br.readLine()) != null) {
         name.add(line);
       }
       namesArray = name.toArray(new String[name.size()]);
       puzzle4 = name.get(3);
     }
   catch (IndexOutOfBoundsException e) {
     puzzle4 = "Index is out of bounds";
   }
   catch (FileNotFoundException e) {
     puzzle4 = "File is not found";
   }
   catch (IOException e) {
     puzzle4 = "IOexception arose";
   }
    //puzzle4 = "Correct! \nUnscramble 2: Arrange these letters into a word: \nV R A E S N T O B \n1. observant \n2. observance";
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
      try {
        fr = new FileReader("Riddles.txt");
        br = new BufferedReader(fr);
        br = new BufferedReader(new FileReader("Riddles.txt"));
        while ((line = br.readLine()) != null) {
          name.add(line);
        }
        namesArray = name.toArray(new String[name.size()]);
        puzzle5 = name.get(4);
      }
    catch (IndexOutOfBoundsException e) {
      puzzle5 = "Index is out of bounds";
    }
    catch (FileNotFoundException e) {
      puzzle5 = "File is not found";
    }
    catch (IOException e) {
      puzzle5 = "IOexception arose";
    }
      //puzzle5 = "Correct! \nUnscramble 3: Arrange these letters into a word: \nS F N L O I G M A \n1. flamingos \n2. flamenco";//answer is correct
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
        try {
          fr = new FileReader("Riddles.txt");
          br = new BufferedReader(fr);
          br = new BufferedReader(new FileReader("Riddles.txt"));
          while ((line = br.readLine()) != null) {
            name.add(line);
          }
          namesArray = name.toArray(new String[name.size()]);
          puzzle6 = name.get(5);
        }
      catch (IndexOutOfBoundsException e) {
        puzzle6 = "Index is out of bounds";
      }
      catch (FileNotFoundException e) {
        puzzle6 = "File is not found";
      }
      catch (IOException e) {
        puzzle6 = "IOexception arose";
      }
        //puzzle6 = "Correct! \nCombination 1: Find the correct combination of these numbers \n 36 27 11 \n1. 361127 \n2. 112736";//answer is correct
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
        try {
          fr = new FileReader("Riddles.txt");
          br = new BufferedReader(fr);
          br = new BufferedReader(new FileReader("Riddles.txt"));
          while ((line = br.readLine()) != null) {
            name.add(line);
          }
          namesArray = name.toArray(new String[name.size()]);
          puzzle7 = name.get(6);
        }
      catch (IndexOutOfBoundsException e) {
        puzzle7 = "Index is out of bounds";
      }
      catch (FileNotFoundException e) {
        puzzle7 = "File is not found";
      }
      catch (IOException e) {
        puzzle7 = "IOexception arose";
      }
        //puzzle7 = "Correct! \nCombination 2: Find the correct combination of these numbers \n 42 19 04 \n1. 190442 \n2. 041942";//answer is correct
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
        try {
          fr = new FileReader("Riddles.txt");
          br = new BufferedReader(fr);
          br = new BufferedReader(new FileReader("Riddles.txt"));
          while ((line = br.readLine()) != null) {
            name.add(line);
          }
          namesArray = name.toArray(new String[name.size()]);
          puzzle8 = name.get(7);
        }
      catch (IndexOutOfBoundsException e) {
        puzzle8 = "Index is out of bounds";
      }
      catch (FileNotFoundException e) {
        puzzle8 = "File is not found";
      }
      catch (IOException e) {
        puzzle8 = "IOexception arose";
      }
        //String puzzle8raw = "Correct! \n The level has been completed! \n"; //+ str;
        //puzzle8 = puzzle8raw;//answer is correct
      }
    else
      {
        puzzle8 = "Incorrect. ";
      }
      String puzzle8return = puzzle8;
      return puzzle8return;
    }
/*
  public boolean key1Control() {
    if (!puzzle1.equals("error") && !puzzle2.equals("error") && !puzzle3.equals("error") && !puzzle4.equals("error") && !puzzle5.equals("error") && !puzzle6.equals("error") && !puzzle7.equals("error") && !puzzle8.equals("error")){
      key1 = true;
    }
  }
  */
}

import java.util.Scanner;
import java.util.Random;

public class Key1text
{
  //initialize keyboard and public variables gameOn (controls if level runs) and lives (differ depending on difficulty)
  Scanner keyboard = new Scanner(System.in);
  public boolean gameOn;
  public int lives;
  public boolean key1;
//---------------------------------------------------------------------------------------------------------

  //determine if play will start the level
  //returns: boolean
  public boolean startgamemethod() {
    System.out.println("Behind this door are 4 puzzles you must complete to obtain a key.");
    System.out.println("You have entered the library. Start this level?");
    String newgameraw = keyboard.next();
    String newgame = newgameraw.toLowerCase();
    if (newgame.equals("yes")) {
      gameOn = true;
        System.out.println("Welcome! ");
      //start game
    }
    else {
      gameOn = false;
        System.out.println("Goodbye! ");
      //stay on start page
    }
    return gameOn;
}
//---------------------------------------------------------------------------------------------------------

  //determine difficulty (changes number of lives from 5 (easy) to 3 (hard))
  //returns: number of lives
  public int difficultymethod() {
    System.out.println("Difficulty?");
    String difficultyraw = keyboard.next();
    String difficulty = difficultyraw.toLowerCase();
    if (difficulty.equals("easy")) {
      lives = 5;
      System.out.println("You have 5 attempts at each puzzle. ");
    }
    else if (difficulty.equals("hard")) {
      lives = 3;
      System.out.println("You have 3 attempts at each puzzle. ");
    }
    else {
      lives = 4;
      System.out.println("You have 4 attempts at each puzzle. ");
    }
    return lives;
  }
//---------------------------------------------------------------------------------------------------------

// 3 riddles that will display one after another if the previous answer is right
//if the asnwer is wrong, the lives will go down
//if there are 0 lives, the riddles will not be displayed and the method will finish
//contains 3 booleans that determine if the 3 riddles are correct
//returns: riddleboolean
public boolean puzzle1method(){

  boolean riddle1boolean = false;
  //riddle 1
  while ((!riddle1boolean) && lives > 0)
  {
    System.out.println("Lives: " + lives);
    System.out.println("Riddle 1");
    System.out.print("What is a 7 letter word containing thousands of letters? ");
    //String riddle1raw = JOptionPane.showInputDialog("Riddle 1: What is a 7 letter word containing thousands of letters?  ");
    String riddle1raw = keyboard.next();
    String riddle1 = riddle1raw.toLowerCase();
    if (riddle1.equals("mailbox") && lives > 1)
    {
      //answer is correct
      System.out.println("Correct! ");
      riddle1boolean = true;
    }
    else
    {
      //answer is incorrect and player has remaining lives
      System.out.println("Incorrect. ");
      lives = lives - 1;
      if (lives < 1)
      {
        //player is out of lives and method ends
        System.out.println("You have no more lives!");
        gameOn = false;
      }
    }
  }

  boolean riddle2boolean = false;
  //riddle 2
  while ((!riddle2boolean) && lives > 0)
  {
    System.out.println("Lives: " + lives);
    System.out.println("Riddle 2");
    System.out.println("Riddle 2: What is it that after you take away the whole, some still remains? ");
    String riddle2raw = keyboard.next();
    String riddle2 = riddle2raw.toLowerCase();
    if (riddle2.equals("wholesome") && lives > 1)
    {
      //answer is correct
      System.out.println("Correct!");
      riddle2boolean = true;
    }
    else
    {
      //answer is incorrect and player has remaining lives
      System.out.println("Incorrect. ");
      lives = lives - 1;
      if (lives < 1)
      {
        //player is out of lives and method ends
        System.out.println("You have no more lives!");
        gameOn = false;
      }
    }
  }

  boolean riddle3boolean = false;
  //riddle 3
  while ((!riddle3boolean) && lives > 0)
  {
    System.out.println("Lives: " + lives);
    System.out.println("Riddle 3");
    System.out.println("Riddle 3: Name an eight letter word that has kst in the middle, in the beginning, and at the end. ");
    String riddle3raw = keyboard.next();
    String riddle3 = riddle3raw.toLowerCase();
    if (riddle3.equals("inkstand") && lives > 1)
    {
      //answer is correct
      System.out.println("Correct!");
      riddle3boolean = true;
    }
    else
    {
      //answer is incorrect and player has remaining lives
      System.out.println("Incorrect. ");
      lives = lives - 1;
      if (lives < 1)
      {
        //player is out of lives and method ends
        System.out.println("You have no more lives!");
        gameOn = false;
      }
    }
  }
  boolean riddleboolean = true;
  return riddleboolean;
}
//---------------------------------------------------------------------------------------------------------

// 3 word unscrambles that will display one after another if the previous answer is right
//if the asnwer is wrong, the lives will go down
//if there are 0 lives, the unscrambles will not be displayed and the method will finish
//contains 3 booleans that determine if the 3 unscrambles are correct
//returns: unscrambleboolean
public boolean puzzle2method() {

boolean unscramble1boolean = false;
//unscramble 1
while ((!unscramble1boolean) && lives > 0)
{
  System.out.println("Lives: " + lives);
  System.out.println("Word Unscramble 1");
  System.out.println("Unscramble these letters into a word: N D U E D R E F ");
  String unscramble1raw = keyboard.next();
  String unscramble1 = unscramble1raw.toLowerCase();
  if (unscramble1.equals("refunded") && lives > 1)
  {
    //answer is correct
    System.out.println("Correct!");
    unscramble1boolean = true;
  }
  else
  {
    //answer is incorrect and player has remaining lives
    System.out.println("Incorrect. ");
    lives = lives - 1;
    if (lives < 1)
    {
      //player is out of lives and method ends
      System.out.println("You have no more lives!");
      gameOn = false;
    }
  }
}

boolean unscramble2boolean = false;

while ((!unscramble2boolean) && lives > 0)
{
  System.out.println("Lives: " + lives);
  System.out.println("Word Unscramble 2");
  System.out.println("Unscramble these letters into a word: V R A E S N T O B ");
String unscramble2raw = keyboard.next();
  String unscramble2 = unscramble2raw.toLowerCase();
  if (unscramble2.equals("observant") && lives > 1)
  {
    //answer is correct
    System.out.println("Correct!");
    unscramble2boolean = true;
  }
  else
  {
    //answer is incorrect and player has remaining lives
    System.out.println("Incorrect. ");
    lives = lives - 1;
    if (lives < 1)
    {
      //player is out of lives and method ends
      System.out.println("You have no more lives!");
      gameOn = false;
    }
  }
}

boolean unscramble3boolean = false;

while ((!unscramble3boolean) && lives > 0)
{
  System.out.println("Lives: " + lives);
  System.out.println("Word Unscramble 3");
  System.out.println("Unscramble these letters into a word: S F N L O I G M A ");
  String unscramble3raw = keyboard.next();
  String unscramble3 = unscramble3raw.toLowerCase();
  if (unscramble3.equals("flamingos") && lives > 1)
  {
    //answer is correct
    System.out.println("Correct!");
    unscramble3boolean = true;
  }
  else
  {
    //answer is incorrect and player has remaining lives
    System.out.println("Incorrect. ");
    lives = lives - 1;
    if (lives < 1)
    {
      //player is out of lives and method ends
      System.out.println("You have no more lives!");
      gameOn = false;
    }
  }
}
boolean unscrambleboolean = true;
return unscrambleboolean;
}
//---------------------------------------------------------------------------------------------------------

// 2 combination locks that will display one after another if the previous answer is right
//the numbers for the combinations are randomly generated as numbers between 0 and 30
//if the asnwer is wrong, the lives will go down
//if there are 0 lives, the combinations will not be displayed and the method will finish
//contains 2 booleans that determine if the 2 combinations are correct
//returns: combinationboolean
public boolean puzzle3method() {

  //set 3 random numbers between 0 and 30
  int combonum1 = new Random().nextInt(31);
  int combonum2 = new Random().nextInt(31);
  int combonum3 = new Random().nextInt(31);
  String combostring1 = Integer.toString(combonum1);
  String combostring2 = Integer.toString(combonum2);
  String combostring3 = Integer.toString(combonum3);
  //combination is num1 num3 num2
  String combo1 = (combostring1 + combostring3 + combostring2);
  boolean combo1boolean = false;
  while ((!combo1boolean) && lives > 0)
  {
    //System.out.println("Lives: " + lives);
    //System.out.println("Combination locks 1");
    System.out.println("The numbers are: " + combonum1 + ", " + combonum2 + ", and " + combonum3 + ". Solve the combination (ex. 001122) ");
    String combo1raw = keyboard.next();
    if (combo1raw.equals(combo1) && lives > 1)
    {
      //answer is correct
      System.out.println("Correct!");
      combo1boolean = true;
    }
    else
    {
      //answer is incorrect and player has remaining lives
      System.out.println("Incorrect. ");
      lives = lives - 1;
      if (lives < 1)
      {
        //player is out of lives and method ends
        System.out.println("You have no more lives!");
        gameOn = false;
      }
    }
  }

  //set 3 random numbers between 0 and 30
  int combonum21 = new Random().nextInt(31);
  int combonum22 = new Random().nextInt(31);
  int combonum23 = new Random().nextInt(31);
  String combostring21 = Integer.toString(combonum21);
  String combostring22 = Integer.toString(combonum22);
  String combostring23 = Integer.toString(combonum23);
  // combo is num2 num3 num1
  String combo2 = (combostring22 + combostring23 + combostring21);
  boolean combo2boolean = false;
  while ((!combo2boolean) && lives > 0)
  {
    //System.out.println("Lives: " + lives);
    //System.out.println("Combination locks 2");
    System.out.println("The numbers are: " + combonum21 + ", " + combonum22 + ", and " + combonum23 + ". Solve the combination (ex. 001122) ");
    String combo2raw = keyboard.next();
    if (combo2raw.equals(combo2) && lives > 1)
    {
      //answer is correct
      System.out.println("Correct!");
      combo2boolean = true;
    }
    else
    {
      //answer is incorrect and player has remaining lives
      System.out.println("Incorrect. ");
      lives = lives - 1;
      if (lives < 1)
      {
        //player is out of lives and method ends
        System.out.println("You have no more lives!");
        gameOn = false;
      }
    }
  }
  boolean combinationboolean = true;
  return combinationboolean;
}
//---------------------------------------------------------------------------------------------------------

// One last word puzzle
//if the asnwer is wrong, the lives will go down
//if there are 0 lives, the puzzle will not be displayed and the method will finish
//contains 1 booleas that determines if the puzzle is correct
//returns:  einsteinboolean
public boolean puzzle4method() {

  boolean einsteinboolean = false;

  while ((!einsteinboolean) && lives > 0)
  {
    System.out.println("Lives: " + lives);
    System.out.println("Einstein's Riddle");
    System.out.println("The situation: ");
    System.out.println("1. There are 5 houses in 5 different colours.");
    System.out.println("2. In each house lives a person with a different nationality.");
    System.out.println("3. These 5 house owners drink a certain type of beverage, smoke a certain type of cigar, and keep a certain pet.");
    System.out.println("4. No owners have the same pet, smoke the same cigar brand, or drink the same beverage. ");
    System.out.println("Hints: ");
    System.out.println("1. The brit lives in the red house.");
    System.out.println("2. The swede keeps dogs as pets.");
    System.out.println("3. The dane drinks tea.");
    System.out.println("4. The green house is on the left of the white house.");
    System.out.println("5. The green house's owner drinks coffee.");
    System.out.println("6. The person who smokes Pall Mall keeps birds.");
    System.out.println("7. The man in the center house drinks milk.");
    System.out.println("8. The owner of the yellow house smokes Dunhill");
    System.out.println("9. The norwegian lives in the first house.");
    System.out.println("10. The man who smokes Blends lives next to the one with cats.");
    System.out.println("11. The man who keeps horses lives next to the Dunhill smoker.");
    System.out.println("12. The man who smokes BlueMaster drinks beer.");
    System.out.println("13. The German smokes Prince.");
    System.out.println("14. The norwegian lives next to the blue house.");
    System.out.println("15. The man who smokes Blends has a neighbour who drinks water.");
    System.out.print("Who owns the fish? (nationality)");
    String einsteinraw = keyboard.next();
    String einstein = einsteinraw.toLowerCase();
    if (einstein.equals("german") && lives > 1)
    {
      //answer is correct
      System.out.println("Correct!");
      einsteinboolean = true;
    }
    else
    {
      //answer is incorrect and player has remaining lives
      System.out.println("Incorrect. ");
      lives = lives - 1;
      if (lives < 1)
      {
        //player is out of lives and method ends
        System.out.println("You have no more lives!");
        gameOn = false;
      }
    }
  }
  return einsteinboolean;
}

public boolean key1control(boolean einsteinboolean, boolean comboboolean, boolean unscrambleboolean, boolean riddleboolean) {
  if (einsteinboolean && unscrambleboolean && riddleboolean && comboboolean) {
    key1 = true;
    System.out.println("Key is unlocked for this level! ");
  }
  else {
    key1 = false;
    System.out.println("Key is not unlocked" );
  }
  return key1;
}
}

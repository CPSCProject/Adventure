import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Driver
{
  public static void main(String[] args)
  {
    Object[] possibleValues = { "Easy" , "Medium", "Hard"};
    String difficulty = (String)JOptionPane.showInputDialog(null,
                    "Difficulty?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);
    if (difficulty.equals("Easy"))
    {
      Key5V2 boiler = new Key5V2(100);
      boiler.play();
    }

    else if (difficulty.equals("Medium"))
    {
      Key5V2 boiler = new Key5V2(80);
      boiler.play();
    }

    else if (difficulty.equals("Hard"))
    {
      Key5V2 boiler = new Key5V2(45);
      boiler.play();
    }

  }
}

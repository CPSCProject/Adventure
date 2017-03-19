import javax.swing.JOptionPane;
import java.util.ArrayList;


public class BoilerDriver
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
      Boilerlogic boiler = new Boilerlogic(100);
      boiler.play();
    }

    else if (difficulty.equals("Medium"))
    {
      Boilerlogic boiler = new Boilerlogic(80);
      boiler.play();
    }

    else if (difficulty.equals("Hard"))
    {
      Boilerlogic boiler = new Boilerlogic(45);
      boiler.play();
    }

  }
}

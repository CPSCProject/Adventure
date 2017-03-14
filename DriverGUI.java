import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
public class DriverGUI
{
    public static void main(String s[])
    {
       JFrame f = new JFrame("Dungeon: 21 sticks!");
       f.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
             System.exit(0);
          }
       });
       JApplet applet = new Lines();
       f.getContentPane().add("Center", applet);
       applet.init();

       f.pack();
       f.setSize(new Dimension(1000, 1000));
       f.setVisible(true);
    }
}

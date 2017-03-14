import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Lines extends JApplet {
   public void init() {
      setBackground(Color.black);
      setForeground(Color.black);
   }
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      g2.setPaint(Color.red);
      int x = 5;
      int y = 7;
      for (int i = 0; i<=21; i++)
      {
          int startX = 0;
          int startY = 0;
          int endX = 200;
          int endY = 200;

     // g2.draw(new Line2D.Double(startX, startY, endX, endY));
      g2.drawLine(startX, startY, endX, endY);
      g2.drawLine(200, 200, 500, 500);
      startX = startX + 50;
      startY = startY + 50;
        }
   }

}

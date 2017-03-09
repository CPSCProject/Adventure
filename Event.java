import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event extends JFrame{
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private JButton button;
    private JButton button1;
    public boolean start_main_game;


public Event() {
    setLayout(new FlowLayout());

    label3 = new JLabel("Do you want to play this game?");
    add(label3);

    button = new JButton("yes");
    add(button);

    button1 = new JButton("no");
    add(button1);

    //label will not say anything
    label = new JLabel("");
    add(label);

    //subclass in the main class Event
    //class can be named whatever
    event y = new event();
    //adds ActionListener to button.
    button.addActionListener(y);

    event2 n = new event2();
    button1.addActionListener(n);


}

public class event implements ActionListener {
    //
    public void actionPerformed(ActionEvent y) {
      start_main_game = true;
      label.setText("");
    }
  }
public class event2 implements ActionListener {
        //
        public void actionPerformed(ActionEvent n) {
          start_main_game = false;
          label.setText("try again");
        }
      }
    }

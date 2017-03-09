//@author Rumika Mascarenhas
//Timer: Counts down time; variable count is changed in different rooms.
import java.util.Scanner;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class TimerR extends JFrame {
  JLabel promptLabel, timerLabel;
  JTextField tf;
  JButton button;
  Timer timer;

  public TimerR(int new_count) {
    setLayout(new GridLayout(2,2,5,5));

    timerLabel = new JLabel("Waiting...", SwingConstants.CENTER);
    add(timerLabel);

    int count = new_count;
    timerLabel.setText("Time left: " + count);

    TimeClass tc = new TimeClass(count);
    timer = new Timer(1000, tc);
    timer.start();
    //event e = new event();
    //button.addActionListener(e);1


  }



  public class TimeClass implements ActionListener {
    int counter;

    public TimeClass(int counter) {
      this.counter = counter;

    }

    public void actionPerformed(ActionEvent tc) {
      counter--;

      if(counter >= 1) {
        timerLabel.setText("Time left: " + counter);
      }
      else {
        timer.stop();
        timerLabel.setText("Done!");
      }
    }
  }


    //TimerR gui = new TimerR();
    //gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //gui.setSize(251,100);
    //gui.setTitle("Timer Program");
    //gui.setVisible(true);

}

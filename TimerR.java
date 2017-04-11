package GUI;
//@author Rumika Mascarenhas
//Timer: Counts down time; variable count is changed in different rooms.

import java.util.Scanner;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class TimerR extends JPanel {
  JLabel promptLabel, timerLabel;
  JTextField tf;
  JButton button;
  Timer timer;

  public TimerR() {

    timerLabel = new JLabel("Waiting...", SwingConstants.CENTER);
    add(timerLabel);

    int count = 600;
    timerLabel.setText("Time left: " + count);


    TimeClass tc = new TimeClass(count);
    timer = new Timer(1000, tc);
    timer.start();

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



}

//package GUI;
import java.awt.event.*;
import javax.swing.*;

public class CountDownProgressBar {

    Timer timer;
    public JProgressBar progressBar;

    public CountDownProgressBar() {
        progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 600);
        progressBar.setValue(600);
        ActionListener listener = new ActionListener() {
            int counter = 600;
            public void actionPerformed(ActionEvent ae) {
                counter--;
                progressBar.setValue(counter);
                if (counter<1) {
                    JOptionPane.showMessageDialog(null, "Kaboom!");
                    timer.stop();
                }
            }
        };
        timer = new Timer(1000, listener);
        timer.start();

    }


}

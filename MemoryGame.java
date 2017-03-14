//import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;


public class MemoryGame extends JFrame {
	
	private JLabel label;
	private JButton button;
	private JTextField textfield;
	
	public MemoryGame() {
		
		setLayout(new FlowLayout());
		
		label = new JLabel("HI, player ");
		add(label);
		
		textfield = new JTextField(15);
		add(textfield);
		
		button = new JButton("click me ");
		add(button);
	}
	
	/*public void Image() {
		setLayout(new FlowLayout());
		
		image1 = new ImageIcon(getClass().getResource("plane.jpg"));	
		label1 = new JLabel(image1);
		add(label1);
		
		image2 = new ImageIcon(getClass().getResource("apple.jpg"));
		label2 = new JLabel(image2);
		add(label2); 
	} */
	
	
	
	
	public static void main (String args[] ) {
		String first_name;
		first_name = JOptionPane.showInputDialog("what is your name?");
		String direction;
		direction = JOptionPane.showInputDialog(first_name + "which way do you want to go?");
		MemoryGame gui = new MemoryGame();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(400, 400);
		gui.setVisible(true);
		gui.setTitle("Introduction");

		gui.pack();
		
	}



}
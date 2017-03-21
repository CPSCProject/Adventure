import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pratice extends JFrame implements ActionListener
{
	JFrame window;
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JPanel p4;
	JPanel p5;
	JButton graphic;
	JTextArea statusT;
	JTextArea storyT;
	JTextField input;
	private JButton commandB1, commandB2, commandB3, commandB4, commandB5;
	private JButton Image1, Image2, Image3, Image4;
	Timer timer;
	String applePath = "apple.jpg";
	String planePath = "plane.jpg";
	private JLabel label;
	private JButton button;
	private JTextField textfield;

	public static void main(String[]args)
	{

		Pratice game = new Pratice();
		game.opening();

	}

	public void opening()
	{


		JFrame window = new JFrame();
		window.setBounds(200,200,1024,768);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBackground(Color.black);
		window.setLayout(null); //Disabling the default layout.

		Font basicfont = new Font("MS Gothic", Font.PLAIN, 20);

		// Panel Setup
		JPanel p1 = new JPanel(); //This is where graphics are displayed.
		p1.setBounds(670, 680, 325, 50); //Panel layout(x,y,x,y)
		p1.setBackground(Color.black);

		JPanel p2 = new JPanel(); //This is where status is displayed.
		p2.setBounds(670, 10, 325, 350);
		p2.setBackground(Color.black);

		JPanel p3 = new JPanel(); //This is where story text is displayed.
		p3.setBounds(10, 370, 650, 350);
		p3.setBackground(Color.pink);

		JPanel p4 = new JPanel(); //This is where command menu is displayed.
		p4.setBounds(670, 370, 325, 300);
		p4.setBackground(Color.black);
		p4.setLayout(new GridLayout(5,1)); //Setting the layout of Panel 4

		// JPanel p5 = new JPanel(); //This is the text-entry box.
		//p5.setBounds(10, 10, 650, 350);

		JPanel p6 = new JPanel(); 
		p6.setBounds(60, 60, 550, 360);
		p6.setBackground(Color.white);




		// TextArea Setup
		statusT = new JTextArea();
		storyT = new JTextArea();
		input = new JTextField(32);


		JButton commandB1 = new JButton("1:Help");
		JButton commandB2 = new JButton("2:Attack the man");
		JButton commandB3 = new JButton("3:Drink");
		JButton commandB4 = new JButton("4:Leave");
		JButton commandB5 = new JButton("5:(Debug)Clear the text");

		//Graphic setup
		//graphic = new JButton(new ImageIcon("dungeonSample.jpg"));
		//graphic.setBackground(Color.black);


		//Status text setup
		statusT.setFont(basicfont);
		statusT.setBackground(Color.black);
		statusT.setForeground(Color.white);
		statusT.setText("\nLV     Kitchen\nHP   100\nMP    28\nEXP   36"); //Ths is just a sample status

		//Story text setup
		storyT.setFont(basicfont);
		storyT.setBackground(Color.black);
		storyT.setForeground(Color.white);
		storyT.setText("           		 This is a Portion room. \n   In a given time, a player has to idnetify the same cards to  \n finish the game. \n A player must use the mouse to complete the game.\n (1) Move towards the Table.\n (2) Try to open the Cabinet.");

		//Input box setup
		input.setFont(basicfont);
		input.setBackground(Color.black);
		input.setForeground(Color.white);
		//input.setText("Input a number here>");
		input.addActionListener(this);

		// images to icon 

		ImageIcon originIcon = new ImageIcon(applePath);  
		ImageIcon originIcon2 = new ImageIcon(applePath); 
		ImageIcon originIcon3 = new ImageIcon(planePath); 
		ImageIcon originIcon4 = new ImageIcon(planePath); 




		Image originImg = originIcon.getImage(); 
		Image originImg2 = originIcon2.getImage(); 
		Image originImg3 = originIcon3.getImage(); 
		Image originImg4 = originIcon4.getImage(); 

		Image changedImg= originImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
		Image changedImg2= originImg2.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
		Image changedImg3= originImg3.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
		Image changedImg4= originImg4.getScaledInstance(70, 70, Image.SCALE_SMOOTH );

		ImageIcon Icon = new ImageIcon(changedImg);
		ImageIcon Icon2 = new ImageIcon(changedImg2);
		ImageIcon Icon3 = new ImageIcon(changedImg3);
		ImageIcon Icon4 = new ImageIcon(changedImg4);

		JButton Image1 = new JButton(Icon);
		JButton Image2 = new JButton(Icon2);
		JButton Image3 = new JButton(Icon3);
		JButton Image4 = new JButton(Icon4);














		//p6.add(Image1);

		//p6.add(btn4);


		// Add Text>>Panel>>Window
		//p1.add(graphic);
		p2.add(statusT);
		p3.add(storyT);
		p4.add(commandB1);
		p4.add(commandB2);
		p4.add(commandB3);
		p4.add(commandB4);
		p4.add(commandB5);
		//  p5.add(input);
		p6.add(Image1);
		p6.add(Image2);
		p6.add(Image3);
		p6.add(Image4);
		window.add(p1);
		window.add(p2);
		window.add(p3);
		window.add(p4);
		// window.add(p5);
		window.add(p6);

		window.setVisible(true);
	}
	
	

	public void actionPerformed(ActionEvent e)
	{

		String choice = input.getText();
		input.selectAll();

		if(choice.equals("1")){
			storyT.setText("You are walking towards the table. \nYou notice a crumpled piece of paper and a knife.\n Choose your move: \n(1) Pick up the knife.\n(2) Pick up the piece of paper");
			input.selectAll();
			if(choice.equals("2")){
				storyT.setText("There are three shapes drawn on the paper: a triangle, \na square and a pentagon.");
				storyT.setText("There is a table across the room. \nYou see a cabinet and hope to find something useful\n (1) Move towards the Table.\n (2) Try to open the Cabinet.");
			}
		}
		if(choice.equals("2"))
		{
			storyT.setText("What, you think you can rob me?!\n\nThe inkeeper attacked!\n6870 points of damage!\nYou are dead.");
		}
		if(choice.equals("3"))
		{
			storyT.setText("Sorry, we can't serve booze anymore because of the restriction by the lord");
		}
		if(choice.equals("4"))
		{
			storyT.setText("See ya.");
		}
		if(choice.equals("5"))
		{
			storyT.setText("");
		}

	}


	public JButton getButton() {
		return this.commandB1;
	}

	public JButton getImage() {
		return this.Image1;
	}
	
	public JButton getImage2() {
		return this.Image2;
	}
	
	public JButton getImage3() {
		return this.Image3;
	}
	
	public JButton getImage4() {
		return this.Image4;
	}


}





class ButtonListener implements ActionListener {
	ButtonListener() {
		
		  Pratice frame = new Pratice();
		  JButton theWidth = frame.getImage();
		  JButton commandB1 = frame.getButton();
	}





	private void setAction()
	{
		//commandB1.addActionListener(this);
		//commandB1.setActionCommand("help");

	}

	public void actionPerformed(ActionEvent eve)
	{
		if(eve.getActionCommand() == "1:Help")
			JOptionPane.showMessageDialog(null, "JButton01 Pressed");
		else if(eve.getActionCommand() == "jb2")
			JOptionPane.showMessageDialog(null, "JButton02 Pressed");
		else if(eve.getActionCommand() == "jb3")
			JOptionPane.showMessageDialog(null, "JButton03 Pressed");
	} 
}












	
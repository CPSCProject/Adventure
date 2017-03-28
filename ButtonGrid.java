import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonGrid extends JFrame implements ActionListener
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
	public JButton commandB1;
	public JButton commandB2;
	public JButton commandB3;
	public JButton commandB4;
	public JButton commandB5;
	Timer timer;

    //the paths for the 10 different JPEG pictures (2 for each of the 5 rooms)
    String kitchenPath = "kitchen.jpg";  //copy this code
    String kitchenPathKey = "kitchen_key1.jpg";
	String dungeonPath = "dungeon.jpg";
    String dungeonPathKey = "dungeon_key2.jpg";
    String boilerPath = "boiler.jpg";
    String boilerPathKey = "boiler_key3.jpg";
    String libraryPath = "library.jpg";
    String libraryPathKey = "library_key4.jpg";
    String bedroomPath = "bedroom.jpg";
    String bedroomPathKey = "bedroom_key5.jpg";

	private JLabel label;
	private JButton button;
	private JTextField textfield;

	public static void main(String[]args)
	{

		ButtonGrid game = new ButtonGrid();
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
		p2.setBounds(670,10, 325, 350);
		p2.setBackground(Color.black);

		JLabel jLabelObject = new JLabel();



		JPanel p3 = new JPanel(); //This is where story text is displayed.
		p3.setBounds(10, 370, 650, 350);
		p3.setBackground(Color.pink);

		JPanel p4 = new JPanel(); //This is where command menu is displayed.
		p4.setBounds(670, 370, 325, 300);
		p4.setBackground(Color.black);
		p4.setLayout(new GridLayout(5,1)); //Setting the layout of Panel 4

		JPanel p5 = new JPanel(); //This is the text-entry box.
		p5.setBounds(10, 10, 650, 350);




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
		statusT.setText("hi"); //Ths is just a sample status


		storyT.setFont(basicfont);
		storyT.setBackground(Color.black);
		storyT.setForeground(Color.white);
		storyT.setText(" A pile of sticks has trapped you in the dungeon cell! \n" +
				    	" You must remove either one or two sticks from the pile in\n" +
				    	" order to escape. Your goal is to not pick up the last stick.\n" +
				    	" However, a dragon will join you. Whoever is forced to \n" +
				    	" to take the last stick will be trapped forever \n\n" +
						" Type 'start' to begin the dungeon!" );

		//Input box setup
		input.setFont(basicfont);
		input.setBackground(Color.black);
		input.setForeground(Color.white);
		//input.setText("Input a number here>");
		input.addActionListener(this);



		// images to icon
        ImageIcon kitchenIcon = new ImageIcon(kitchenPath); //copy this code
		ImageIcon kitchenIcon1  = new ImageIcon(kitchenPathKey);
		ImageIcon dungeonIcon = new ImageIcon(dungeonPath);
		ImageIcon dungeonIcon2 = new ImageIcon(dungeonPathKey);
        ImageIcon boilerIcon = new ImageIcon(boilerPath);
		ImageIcon boilerIcon3 = new ImageIcon(boilerPathKey);
        ImageIcon libraryIcon = new ImageIcon(libraryPath);
		ImageIcon libraryIcon4 = new ImageIcon(libraryPathKey);
        ImageIcon bedroomIcon = new ImageIcon(bedroomPath);
		ImageIcon bedroomIcon5 = new ImageIcon(bedroomPathKey);


        Image kitchenImage = kitchenIcon.getImage();  //copy this code
        Image kitchenImage1= kitchenIcon1.getImage();
		Image dungeonImage = dungeonIcon.getImage();
		Image dungeonImage2= dungeonIcon2.getImage();
		Image boilerImage = boilerIcon.getImage();
		Image boilerImage3 = boilerIcon3.getImage();
        Image libraryImage = libraryIcon.getImage();
        Image libraryImage4 = libraryIcon4.getImage();
        Image bedroomImage = bedroomIcon.getImage();
        Image bedroomImage5 = bedroomIcon5.getImage();

		Image changedImg = kitchenImage.getScaledInstance(320, 320, Image.SCALE_SMOOTH );  //copy this code
		Image changedImg2 = kitchenImage1.getScaledInstance(320, 320, Image.SCALE_SMOOTH );
		Image changedImg3 = dungeonImage.getScaledInstance(320, 320, Image.SCALE_SMOOTH );
		Image changedImg4 = dungeonImage2.getScaledInstance(320, 320, Image.SCALE_SMOOTH );
        Image changedImg5 = boilerImage.getScaledInstance(320, 320, Image.SCALE_SMOOTH );
		Image changedImg6 = boilerImage3.getScaledInstance(320, 320, Image.SCALE_SMOOTH );
		Image changedImg7 = libraryImage.getScaledInstance(320, 320, Image.SCALE_SMOOTH );
        Image changedImg8 = libraryImage4.getScaledInstance(320, 320, Image.SCALE_SMOOTH );
		Image changedImg9 = bedroomImage.getScaledInstance(320, 320, Image.SCALE_SMOOTH );
		Image changedImg10 = bedroomImage5.getScaledInstance(320, 320, Image.SCALE_SMOOTH );

	    ImageIcon Icon = new ImageIcon(changedImg);  //copy this code
	    ImageIcon Icon2 = new ImageIcon(changedImg2);
		ImageIcon Icon3 = new ImageIcon(changedImg3);
		ImageIcon Icon4 = new ImageIcon(changedImg4);
        ImageIcon Icon5 = new ImageIcon(changedImg5);
	    ImageIcon Icon6 = new ImageIcon(changedImg6);
		ImageIcon Icon7 = new ImageIcon(changedImg7);
		ImageIcon Icon8 = new ImageIcon(changedImg8);
        ImageIcon Icon9 = new ImageIcon(changedImg9);
	    ImageIcon Icon10 = new ImageIcon(changedImg10);



	 	JButton Image1 = new JButton(Icon);  //copy this code
		JButton Image2 = new JButton(Icon2);
		JButton Image3 = new JButton(Icon3);
		JButton Image4 = new JButton(Icon4);
        JButton Image5 = new JButton(Icon5);
		JButton Image6 = new JButton(Icon6);
        JButton Image7 = new JButton(Icon7);
		JButton Image8 = new JButton(Icon8);
        JButton Image9 = new JButton(Icon9);
		JButton Image10 = new JButton(Icon10);



		// Add Text>>Panel>>Window
		//p1.add(graphic);
	    p2.add(Image1);  //copy this code
		p3.add(storyT);
		p4.add(commandB1);
		p4.add(commandB2);
		p4.add(commandB3);
		p4.add(commandB4);
		p4.add(commandB5);
		p5.add(input);


		window.add(p1);
		window.add(p2);
		window.add(p3);
		window.add(p4);
		window.add(p5);

		window.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{

		Key3 key3 = new Key3();
		boolean dragonWin = key3.dragonWin();
		boolean playerWin = key3.playerWin();

		String choice = input.getText();

			String printStatus = key3.printSticks();
			storyT.setText(printStatus);

	        if(choice.equalsIgnoreCase("q"))
	        {
				key3.totalSticks(1);
	            storyT.setText("You have taken 1 stick.\n" +
								"There are " + key3.getTotalSticks() + " sticks left.\n" +
								"The dragon takes " + key3.dragStick() + " sticks.");
				key3.totalSticks(key3.dragStick());
				//dragonWin = key3.dragonWin();
				//playerWin = key3.playerWin();
				input.selectAll();

	        }


			if(choice.equalsIgnoreCase("w"))
			{
				key3.totalSticks(2);
				storyT.setText("You have taken 2 sticks.\n" +
								"There are " + key3.getTotalSticks() + " sticks left. \n" +
								"The dragon takes " + key3.dragStick() + " sticks.");
				key3.totalSticks(key3.dragStick());
				//dragonWin = key3.dragonWin();
				//playerWin = key3.playerWin();
				input.selectAll();
			}

			if (dragonWin == true)
			{
				storyT.setText("The dragon has won!");
			}
			else if(playerWin == true)
			{
				storyT.setText("You have won!");
			}



	}



}

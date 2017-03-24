import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pratice2 extends JFrame implements ActionListener
{
	JFrame window;
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JPanel p4;
	JPanel p5;
	JButton graphic;
	JTextArea statusT;
	JTextArea storyT, storyT2;
	private boolean option = true;

	JTextField input;
	private JButton commandB1, commandB2, commandB3, commandB4, commandB5;
	private JButton Image1, Image2, Image3, Image4, apple;
	private Image changedImg, changedImg2;
	Timer timer;
	String applePath = "apple.jpg";
	String planePath = "plane.jpg";
	String emptyPath = "empty.jpg";
	private JLabel label;
	private JButton button;
	private JTextField textfield;
	private boolean key = false;
	private boolean buttonkey = false;
	private boolean buttonkey2 = false;
	private boolean gamecomplete = false;
	private boolean gamecomplete2 = false;

	public static void main(String[]args)
	{

		Pratice2 game = new Pratice2();
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
		storyT2 = new JTextArea();
		input = new JTextField(32);


		JButton commandB1 = new JButton("1:Help");
		commandB1.addActionListener(new ButtonListener());
		JButton commandB2 = new JButton("2:Attack the man");
		commandB2.addActionListener(new ButtonListener());
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
		statusT.setText("\nLV     PortionRoom\nHP   100\nMP    28\nEXP   36"); //Ths is just a sample status

		//Story text setup
		storyT.setFont(basicfont);
		storyT.setBackground(Color.black);
		storyT.setForeground(Color.white);
		storyT.setText("           		 This is a Portion room. \n   In a given time, a player has to idnetify the same cards to  \n finish the game. \n A player must use the mouse to complete the game.");

		storyT.setText("           		 This is a Portion room. \n   In a given time, a player has to idnetify the same cards to  \n finish the game. \n A player must use the mouse to complete the game.");
		
		
		
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
		ImageIcon originIcon5 = new ImageIcon(emptyPath); 




		 /*Image originImg = originIcon.getImage(); 
		Image originImg2 = originIcon2.getImage(); 
		Image originImg3 = originIcon3.getImage(); 
		Image originImg4 = originIcon4.getImage(); 
		Image originImg5 = originIcon4.getImage(); 
		
		

		Image changedImg= originImg.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
		Image changedImg2= originImg2.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
		Image changedImg3= originImg3.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
		Image changedImg4= originImg4.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
		Image changedImg5= originImg5.getScaledInstance(70, 70, Image.SCALE_SMOOTH );

		ImageIcon Icon = new ImageIcon(changedImg);
		ImageIcon Icon2 = new ImageIcon(changedImg2);
		ImageIcon Icon3 = new ImageIcon(changedImg3);
		ImageIcon Icon4 = new ImageIcon(changedImg4);
		ImageIcon Icon5 = new ImageIcon(changedImg5);

		JButton Image1 = new JButton(Icon);
		JButton Image2 = new JButton(Icon2);
		JButton Image3 = new JButton(Icon3);
		JButton Image4 = new JButton(Icon4);
		
		Image1.addActionListener(new ButtonListener()); */
		
		
		JButton apple = new JButton("apple");
		apple.addActionListener(this);
		apple.setActionCommand("apple");
		apple.addActionListener(new ButtonListener());
		p6.add(apple);
		
		JButton apple2 = new JButton("apple2");
		apple2.addActionListener(this);
		apple2.setActionCommand("apple2");
		apple2.addActionListener(new ButtonListener());
		p6.add(apple2);
		
		JButton airplane = new JButton("airplane");
		airplane.addActionListener(this);
		airplane.setActionCommand("airplane");
		airplane.addActionListener(new ButtonListener());
		p6.add(airplane);
		
		JButton airplane2 = new JButton("airplane2");
		airplane2.addActionListener(this);
		airplane2.setActionCommand("airplane2");
		airplane2.addActionListener(new ButtonListener());
		p6.add(airplane2);

		
		
//replace image icon with button








		// Add Text>>Panel>>Window
		//p1.add(graphic);
		p2.add(statusT);
		p3.add(storyT);
		p4.add(commandB1);
		p4.add(commandB2);
		p4.add(commandB3);
		p4.add(commandB4);
		p4.add(commandB5);

		window.add(p1);
		window.add(p2);
		window.add(p3);
		window.add(p4);
		// window.add(p5);
		window.add(p6);

		window.setVisible(true);
		System.out.println("hihihihi");
	}

	private void setAction()
	{
		//Pratice sword = new Pratice();
		//String Icon = sword.getIcon();
		
		
		System.out.println("hihihihi");
		commandB1.addActionListener(this);
		commandB1.setActionCommand("1:Help");
		commandB2.addActionListener(this);
		commandB2.setActionCommand("2:Attack the man");
		Image1.addActionListener(this);
		//image1
		




	}

	// unnecssary part

	public void actionPerformed(ActionEvent eve)
	{
		if(eve.getActionCommand() == "1:Help") {
			System.out.println("hihihihi");
			JOptionPane.showMessageDialog(null, "Please select the same card to acheive an key"); }





	}



//	public Image getIcon(){
	//	return Icon;
	//}

	public Image getchangedImg2(){
		return changedImg2;
	}














	class ButtonListener implements ActionListener {
		ButtonListener() {

			//Pratice frame = new Pratice();
			//JButton theWidth = frame.getImage();
			//JButton commandB1 = frame.getButton();
		}


		/// to make it perform 
		public void actionPerformed(ActionEvent eve)
		{
			if(eve.getActionCommand() == "1:Help") {
				JOptionPane.showMessageDialog(null, "please selct the same card to acheive  a key !!");
				key = true;
				//commandB1.setVisible(false);
				//JButton Image1 = new JButton(Icon5);
				
			}
			
			 // when you first pressed one button
			 if(eve.getActionCommand() == "apple" && !buttonkey) {
				 storyT.setText("You pressed apple !!");
				buttonkey = true;	
			}
			 
			 if(eve.getActionCommand() == "apple2" && !buttonkey) {
				 storyT.setText("You pressed apple !!");
				buttonkey = true;	
			}
			 
			 if(eve.getActionCommand() == "airplane" && !buttonkey2) {
				 storyT.setText("You pressed airplane !!");
				buttonkey2 = true;
			}
			 if(eve.getActionCommand() == "airplane2" && !buttonkey2) {
				 storyT.setText("You pressed airplane !!");
				buttonkey2 = true;
			}
			
			 // if apple was alread picked once
			 
			 if(eve.getActionCommand() == "apple2" && buttonkey == true) {
				 storyT.setText("correct!");
				gamecomplete = true;
			}
			 
			 if(eve.getActionCommand() == "apple" && buttonkey == true) {
				 storyT.setText("correct!");
				gamecomplete = true;
			}
			 
			 // if airplane was already picked once  

			 if(eve.getActionCommand() == "airplane" && buttonkey2) {
				 storyT.setText("correct!");
				gamecomplete2 = true;
			}
			 
			 if(eve.getActionCommand() == "airplane2" && buttonkey2) {
				 storyT.setText("correct!");
				gamecomplete2 = true;
			}
			 
			 if(gamecomplete && gamecomplete2) {
				 storyT.setText("You finshed the game !!");
				 
				 
			 }
		
			
		
			
	
				

		}






	/*	public static boolean compareImage(Image changedImg, Image changedImg2) {        
		       /* // take buffer data from botm image files //
		        BufferedImage biA = ImageIO.read(fileA);
		        DataBuffer dbA = biA.getData().getDataBuffer();
		        int sizeA = dbA.getSize();                      
		        BufferedImage biB = ImageIO.read(fileB);
		        DataBuffer dbB = biB.getData().getDataBuffer();
		        int sizeB = dbB.getSize();
		        // compare data-buffer objects // 

				Pratice image = new bucky();
				image.getchangedImg();
				image.getchangedImg2();



			int sizeA =  changedImg.getSize();



		        if(sizeA == sizeB) {
		            for(int i=0; i<sizeA; i++) { 
		                if(dbA.getElem(i) != dbB.getElem(i)) {
		                    return false;
		                }
		            }
		            return true;
		        }
		        else {
		            return false;
		        } 
		} */
	}
}




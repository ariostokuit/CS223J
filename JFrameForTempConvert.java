import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Ch 14
public class JFrameForTempConvert extends JFrame implements ActionListener{
	final int FRAME_WIDTH = 300; //set frame width and height
	final int FRAME_HEIGHT = 150; 
	JLabel namePrompt;
	JLabel heading;
	JTextField nameField;
	JButton ConvertButton;
	JLabel ConvertAnswer;
	
	public JFrameForTempConvert() {
		super("Temperature Converter");
		
		namePrompt = new JLabel("Enter Fahrenheit:");
		heading = new JLabel("Enter Degrees F* to receive Degrees C*");
		nameField = new JTextField(5);
		ConvertButton = new JButton("Click to Continue");
		ConvertAnswer = new JLabel();
		
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		ConvertButton.setToolTipText("Begin Conversion");
		//set the font of the heading
		heading.setFont(new Font("Arial",Font.BOLD,16));
		setLayout(new FlowLayout()); //create the layout
		add(heading);
		add(namePrompt);
		add(nameField);
		add(ConvertButton);
		ConvertButton.addActionListener(this);
	}
	
	//Write your own functionalirt to listen to clicks on the Window
	@Override
	public void actionPerformed(ActionEvent e) {
		String Fahrenheit = nameField.getText();
		double Celsius;
		//will convert the string into double
		double f = Double.parseDouble(Fahrenheit);
		Celsius = (f-32)*5/9; //convert from fahrenheit to Celsius
		add(ConvertAnswer);
		ConvertAnswer.setFont(new Font("Arial",Font.BOLD,16));
		ConvertAnswer.setText("Degrees Celsius " + Celsius + "*");
		//Display result
	}
}

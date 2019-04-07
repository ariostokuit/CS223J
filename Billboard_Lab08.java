/*
 * Ariosto Kuit
 * Lab 08
 * 10/9/18
 * Create a billboard Advertisement using GUI window by using JFrame
 */

import java.awt.*;
import javax.swing.JFrame; //These imports are used for GUI and FRAME
import javax.swing.JLabel;
import java.util.Scanner;
public class Billboard_Lab08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String CompanyName,message,contact;
		
		System.out.println("=== Welcome to the Billboard Advertisement" +
				" CO. ==="); 	//Ask for the advertisement title
		
		System.out.println("Please enter your Company Name");
		CompanyName = scan.nextLine();
		
		System.out.println("Please enter your Message"); //Ask for the message
		message = scan.nextLine();
		
		System.out.println("Please enter your Contact Info"); //Ask for contact info
		contact = scan.nextLine();
		
		final int FRAME_WIDTH = 1000;	//set the frame width and height
		final int FRAME_HEIGHT = 480;
		
		JFrame billboard = new JFrame("Bill Board");
		billboard.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		billboard.setResizable(false);
		billboard.setLocationRelativeTo(null);
		billboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		billboard.setVisible(true);
		
		billboard.getContentPane().setBackground(Color.cyan); //set the color to cyan
		
		JLabel Company = new JLabel(CompanyName + "\n"); //added "\n" so it skips line
		Company.setFont(new Font("Arial",Font.BOLD,80));
		billboard.add(Company);
		
		JLabel Message = new JLabel(message + "\n");
		Message.setFont(new Font("Arial", Font.BOLD, 55));
		billboard.add(Message);
		
		JLabel Contact = new JLabel(contact + "\n");
		Contact.setFont(new Font("Arial",Font.ITALIC,55));
		billboard.add(Contact);
		
		billboard.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		billboard.setVisible(true);
	}

}

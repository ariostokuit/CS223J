import javax.swing.JOptionPane;
import java.util.Scanner;


public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name;
	int age;
	Scanner scan = new Scanner(System.in);
	System.out.println("Please Enter your name");
	name = scan.nextLine();
	System.out.println("Please enter your age");
	age = scan.nextInt();
	System.out.print("Your name is " + name + " and you are " + age + " years old.");
	
	}

}

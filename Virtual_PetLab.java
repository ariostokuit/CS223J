import java.util.Scanner;
public class Virtual_PetLab {

	public static void main(String[] args) {
		String name;
		int choice;
		Scanner scan = new Scanner(System.in);
		
		DisplayTitle();
		
		System.out.println("Please Enter a name for your Pet: "); // ask for the name of your Pet
		name =scan.nextLine(); //input name
		
		Virtual_Pet Pet1 = new Virtual_Pet(name); //create a pet object
		System.out.println("Initializing Stats...");
		printStats(Pet1); //Print the first stats of the pet
		
		do {
			DisplayMenu();
			choice = scan.nextInt(); // the user selects their choice
			Pet1.Action(choice);
			checkAttributes(Pet1);
			if(Attribute_Tool.statsIsZero(Pet1)== true) {
				System.out.println("Insuffiencient stat: George has died");
				printStats(Pet1); // print the first stats of the pet
				System.out.println("Quitting Program");
				System.exit(0);
			}
			printStats(Pet1); //print the first stats of the pet
		}while(choice <= 4 && Pet1.getAge() != 10);
		
		//If pet is age 10 then he will die of old age
		if(Pet1.getAge() == 10) {
			System.out.println(Pet1.getName() + " died of old age");
			System.out.println("Quitting Program.....");
		}
	}
	
	//will check pet attribute
	public static void checkAttributes(Virtual_Pet orangutan) {
		Attribute_Tool.checkCleanliness(orangutan);
		Attribute_Tool.checkHappiness(orangutan);
		Attribute_Tool.checkHealth(orangutan);
		Attribute_Tool.checkHunger(orangutan);
	}
	
	//The initial start of the virtual pet screen
	public static void DisplayTitle() {
		System.out.println("-Virtual Orangutan-");
		System.out.println("-----m------m-----");
		System.out.println("     @(o.o)@");
		System.out.println("      (0)~~");
		System.out.println("       o o");
	}
	//Display Menu for selection
	public static void DisplayMenu() {
		System.out.println("Main Menu:");
		System.out.println("1. Feed");
		System.out.println("2. Wash");
		System.out.println("3. Play");
		System.out.println("4. Health");
		System.out.println("5. -Quit-");
		System.out.println("Enter a number(1-5)");
	}
	//Display pet's current stats
	public static void printStats(Virtual_Pet orangeMan) {
		System.out.println("-" + orangeMan.getName() + "'s Stats-");
		System.out.println("Hunger: " + orangeMan.getHunger());
		System.out.println("Cleanliness: " + orangeMan.getClean());
		System.out.println("Happiness: " + orangeMan.getHappy());
		System.out.println("Health: " + orangeMan.getHealth());

		//if age = 0 then pet was just born
		if(orangeMan.getAge() == 0) {System.out.println(orangeMan.getName()+ " was born!");}
	}
}

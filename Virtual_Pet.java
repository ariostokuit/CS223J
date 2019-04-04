
public class Virtual_Pet {
	private String name;
	private int age, hunger, cleanliness,happiness, health;
	int random;

	//constructor
	public Virtual_Pet(String name) {
		this.name = name;
		this.age = 0;
		this.hunger = (int)(Math.random()*10) + 1;
		this.cleanliness = (int)(Math.random()*10) + 1;
		this.happiness = (int)(Math.random()*10) + 1;
		this.health = (int)(Math.random()*10) + 1;
	}

	//getter functions
	public String getName() {return this.name;}
	public int getHunger() {return this.hunger;}
	public int getAge() {return this.age;}
	public int getClean() {return this.cleanliness;}
	public int getHappy() {return this.happiness;}
	public int getHealth() {return this.health;}

	//setter functions
	public void setHunger(int hunger) {this.hunger = hunger;}
	public void setClean(int clean) {this.cleanliness = clean;}
	public void setHealth(int health) {this.health = health;}
	public void setHappy(int happy) {this.happiness = happy;}

	//These methods are for the swtich case statements
	public void Feed() {
		random = (int)(Math.random() * 2) + 1; //the random variable will decide which string to use
		if(random == 1) {System.out.println(this.name + "jumps with joy as you offer a banana. (+1 Hunger)");}
		else System.out.println(this.name + " dances with joy and devours pasta. (+1 Hunger)");
		this.hunger++;
		this.age++;
	}
	public void Wash() {
		random = (int)(Math.random()*2) + 1; // the random variable will decide which string to use
		if(random == 1) {System.out.println(this.name + " brushes his hair and becomes slightly upset"
				+ " due to excessive knots. (+1 Cleanliness)");}
		else System.out.println(this.name + " puts up a fight to resists, however he gives in and becomes " 
				+ "squeaky clean. (+1 Cleanliness)");
		this.cleanliness++; // change clean stats
		this.age++; //add age
	}
	public void Play() {
		random = (int)(Math.random()*2) + 1; // the random variable will decide which string to use
		if(random == 1) {System.out.println("You pet " + this.name + "\n" + this.name
				+ " pets you back then suddenly eats a spider from out of your hair.(+1 Happiness)");}
		else System.out.println(this.name + " climbs the nearest tree.(+1 Happiness)"); 
		this.happiness++; // change clean stats
		this.age++; //add age
	}
	public void Health() {
		random = (int)(Math.random()*2) + 1; // the random variable will decide which string to use
		if(random == 1) {System.out.println(this.name + " goes for a bike ride.(+1 Health)");}
		else System.out.println(this.name + " thrashes around the vet's office, breaking "
		+ "a window trying to escape from a shot.(+1 Cleanliness)");
		this.health++; // change clean stats
		this.age++; //add age
	}

	//This is where you select your choices and action happen
	public void Action(int choice) {
		switch(choice) {
		case 1: Feed();
				break;
		case 2: Wash();
		break;
		case 3: Play();
			break;
		case 4 : Health();
			break;
		case 5: System.exit(0);
		}
	}
}

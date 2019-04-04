//Will help check attributes and modify values in pet stats
public class Attribute_Tool {
public static void  checkCleanliness(Virtual_Pet Pet) {
	if(Pet.getClean() < 5) {
		System.out.println(Pet.getName() + " is starting to smell bad. (-1 Health)");
		Pet.setHealth(Pet.getHealth() - 1);
	}
}
public static void checkHappiness(Virtual_Pet Pet) {
	if(Pet.getHappy() < 5) {
		System.out.println(Pet.getName() + " is sad because he couldn't get a girlfriend (-1 Happiness)");
		Pet.setHappy(Pet.getHappy() -1 );
	}
}
public static void checkHealth(Virtual_Pet Pet) {
	if(Pet.getHunger() < 5) {
		int random = (int)(Math.random()*2)+ 1;
		if(random == 1) {
			System.out.println(Pet.getName() + " has flu like symptoms. (-1 Happiness)");
			Pet.setHappy(Pet.getHappy() - 1);
		}
		if(random == 2) {
			System.out.println(Pet.getName() + " is about to vomit bananas. (-1 Hunger)");
			Pet.setHappy(Pet.getHappy() -1);}
		}
	}

public static void checkHunger(Virtual_Pet Pet) {
	if(Pet.getHunger() < 5) {
		int random = (int)(Math.random()*2)+ 1;
		
		if(random == 1) {
			System.out.println(Pet.getName() + " is about to gnaw off his leg from hunger. (-1 Health)");
			Pet.setHealth(Pet.getHealth() - 1);
		}
		else {
			System.out.println(Pet.getName() + " is looking a bit thin. (-1 Happiness)");
			Pet.setHealth(Pet.getHealth()-1);
		}
	}
}
	//if one of the stats is 0 return true to end the program
	public static Boolean statsIsZero(Virtual_Pet Pet) {
		if(Pet.getClean() == 0) {return true;}
		if(Pet.getHappy() == 0) {return true;}
		if(Pet.getHunger() == 0) {return true;}
		if(Pet.getHealth() == 0) {return true;}
		else
			return false;
	}
}


/*
 * Ariosto Kuit 
 * Lab04-Car Class
 * Create a Car Class that represents a car
 */
public class CarClassLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car Lola = new Car(); //Instantiate a car class named Lola
		
		Lola.setCarName("Lola"); //set the name of the car
		Lola.setCarSpeed(0); //set the speed of the car to zero
		System.out.println(Lola.getCarName() + " has a current speed of " + Lola.getCarSpeed() +
				" and has gone a distance of " +  Lola.getDistanceTraveled()); // Display the result
		
		Lola.accelerate(50); //Accelerate the car at 50 mph
		Lola.Hourstravel(1.5); //set the time traveled by 1.5 hours
		System.out.println(Lola.getCarName() + " has a current speed of " + Lola.getCarSpeed() +
				" and has gone a distance of " +  Lola.getDistanceTraveled());
		
		Lola.decelerate(15); // decelerate the car by 15mph
		Lola.Hourstravel(1); //set the time traveled by 1 hour
		
		System.out.println(Lola.getCarName() + " has a current speed of " + Lola.getCarSpeed() +
				" and has gone a distance of " +  Lola.getDistanceTraveled()); //Print the final result
	}

}

/*
 * Ariosto Kuit Lab 07
 * 10/5/18
 * Create paitent's with enum values
 */
public class Enum_Lab07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient Timmy = new Patient();
		System.out.println("Patient ID: " + Timmy.getID() +
				"\nPatient Age: " + Timmy.getAge());
		Timmy.displayBlood();
		
		//Patient spike has its own set of values
		Patient Spike = new Patient(1337,19,RhFactor.NEGATIVE, BloodType.AB);
		System.out.println("Patient ID: " + Spike.getID() + "\nPatientAge: " + Spike.getAge());
		Spike.displayBlood();
	}

}

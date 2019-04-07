
public class Patient {
	private int ID_number,age;
	private BloodData blood_data;
	
	public Patient() {
		this.ID_number = 0;
		this.age = 0;
		blood_data = new BloodData();
	}
	public Patient(int idNum,int age, RhFactor type, BloodType blood) {//can hold in enum values
		this.ID_number =idNum;
		this.age = age;
		blood_data = new BloodData(type,blood);
	}
	
	public int getID() {return ID_number;} //return ID
	public int getAge() {return age;} // return age

	public void displayBlood() {
		System.out.println("Blood Type: " + blood_data.blood_type.getBlood()
		+ blood_data.rhfactor.getType());
	}
	
	//sub class BloodData
	private class BloodData{
		private BloodType blood_type;
		private RhFactor rhfactor;
		
		public BloodData() {
			this.blood_type = BloodType.O;
			this.rhfactor = RhFactor.POSITIVE;
		}
		public BloodData(RhFactor type, BloodType blood) {
			this.blood_type = blood;
			this.rhfactor = type;
		}
	}
}

//enum variables for blood type and rh factor
enum BloodType{
	O("O"), A("A"),B("B"),AB("AB"); //set the blood types
	
	private String blood;
	
	private BloodType(String blood) {
		this.blood = blood;
	}
	
	public String getBlood() {
		return this.blood;
	}
}

enum RhFactor{
	NEGATIVE('-'),POSITIVE('+'); //set the enum of RhFactors
	
	private char Rhtype;
	
	private RhFactor(char type) {
		this.Rhtype = type;
	}
	public char getType() {
		return this.Rhtype;
	}
}
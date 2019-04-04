
public class Car {
	private String carName;
	private int Carspeed;
	private double TravelDistance;
	private double Distance;
	
	public void Hourstravel(double hours) {//get the hours traveled and update the distance variable
		Distance = hours * Carspeed;
	}
	public double getDistanceTraveled() {//return the calculate distance traveled
		TravelDistance += Distance;
		return TravelDistance;
	}
	public void setCarSpeed(int speed) {//set and car speed
		this.Carspeed = speed;
	}
	public int getCarSpeed() {
		return Carspeed;
	}
	public void accelerate(int speed) {
		if(Carspeed >= 0) {Carspeed = Carspeed + speed;} //if the car speed is greater than zero accerlate}
	}
	public void decelerate(int speed) {
		if(Carspeed >= 0) {
			Carspeed = Carspeed - speed; //if the car speed is greater than zero decelerate
		}
	}
	public void setCarName(String name) {//set the name of the car
		this.carName = name;
	}
	public String getCarName() {
		return carName;
	}
}

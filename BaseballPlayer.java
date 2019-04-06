/*
 * Ariosto Kuit
 * Lab-06
 * create a baseball program demostrating the usage of the 'this' keyword
 */

import javax.swing.JOptionPane;

public class BaseballPlayer {
static int count =0;
private int number;
private double battingAverage;

BaseballPlayer(){
	this(999,0.5); //default constructor
}
public BaseballPlayer(int id,double avg) {
	number = id;
	battingAverage = avg;
	count = count+1;
}

public BaseballPlayer(int id) {
	this(id,0.5);
}
public BaseballPlayer(double avg) {
	this(999,avg);
}

public void showPlayer() {
	JOptionPane.showMessageDialog(null, "Player # " + number + " batting average is " +
			battingAverage + "There are " + count + " players total on the team.","Display Playaer",
			JOptionPane.INFORMATION_MESSAGE);
}
}

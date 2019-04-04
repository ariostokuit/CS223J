/*
 * Ariosto Kuit
 * Lab 03 - Dice Game
 * Create a program that displays a dice game
 */
import javax.swing.JOptionPane;
public class DiceGameLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isYes;
		int rollADie1,rollADie2, rollADie3;
		int selection;
		int numGame = 1; //will keep count of the game wanted to play again
		
		selection = JOptionPane.showConfirmDialog(null, "Do you want to play the dice game?", "Dice Game Begin "+ 
		numGame,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
		
		isYes = (selection == JOptionPane.YES_OPTION);
		
		//if true execute program
		if(isYes == true) {
			do {
				//Create three random generated numberse from 1 - 6
				rollADie1 = (int)(Math.random()*6) +1;
				rollADie2 = (int)(Math.random()*6) +1;
				rollADie3 = (int)(Math.random()*6) +1;

				//show rolled dice results
				JOptionPane.showMessageDialog(null, "Die 1: " + rollADie1 + "\nDie2: " + rollADie2 + "\nDie3: " + rollADie3,
						"Roll Results", JOptionPane.INFORMATION_MESSAGE);
				
				//test if an dices match or not
				
				if(rollADie1 == rollADie2 && rollADie3 == rollADie1 && rollADie2 == rollADie3) {
					JOptionPane.showMessageDialog(null, "All three of your dice are a match", "WINNER",
							JOptionPane.INFORMATION_MESSAGE);
				}
				else if(rollADie1 == rollADie2 || rollADie1 == rollADie3 || rollADie2 == rollADie3 ) {
					JOptionPane.showMessageDialog(null, "Two of your dice are a match", "WINNER",
							JOptionPane.INFORMATION_MESSAGE);
				}
				else 
					JOptionPane.showMessageDialog(null, "Better luck next time\n", "Loser", JOptionPane.ERROR_MESSAGE);
				
				//Ask to Play another game
				selection = JOptionPane.showConfirmDialog(null, "Would you like to play the dice game again", "Dice Game Begin " + numGame++, 
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				//if yes then isYes is true
				isYes = (selection == JOptionPane.YES_OPTION);
			}while(isYes != false);
		}
	}

}

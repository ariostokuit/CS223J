/*
 * Ariosto Kuit
 * Lab02-mad libs
 * Create a Mad libs program using Joptionpane gui that asks the user to provide at least
 * four or five words or numbers
 * 
 */
import javax.swing.JOptionPane; //Needed for GUI and inputs
public class MadLibsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String noun,noun2,adjective, past_tenseVerb;
		
		//Each GUI will ask the user to input a string based on type of grammar
		noun = JOptionPane.showInputDialog(null,"Enter a noun", "Mad Libs", JOptionPane.INFORMATION_MESSAGE);
		noun2 = JOptionPane.showInputDialog(null,"Enter a second noun", "Mab Libs",JOptionPane.INFORMATION_MESSAGE);
		adjective = JOptionPane.showInputDialog(null, "Enter an adjective", "Mab Libs", JOptionPane.INFORMATION_MESSAGE);
		past_tenseVerb = JOptionPane.showInputDialog(null, "Enter an past tense verb", "Mab Libs", JOptionPane.INFORMATION_MESSAGE);
		
		//Display Mab Lib result
		JOptionPane.showMessageDialog(null,"Mary had a little " + noun + "\nIts " + noun2 + " was silly as " + adjective
				+ "\nAnd everywhere that Mary " + past_tenseVerb + "\nThe " + noun + " was sure to go","Mad Libs",
				JOptionPane.INFORMATION_MESSAGE);
	}

}

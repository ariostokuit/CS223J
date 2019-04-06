import javax.swing.JOptionPane;
public class Lab06_Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		double BatAverage,collectiveAve =0; //used to collect the players averages
		String StringId,StringBatAve;
		
		//get teh catcher's status
		StringId = JOptionPane.showInputDialog(null,"What is the Catcher's ID", "Catcher", JOptionPane.QUESTION_MESSAGE);
		StringBatAve = JOptionPane.showInputDialog(null, "What is the Catcher's Batting Average", "Catcher",JOptionPane.QUESTION_MESSAGE);
		
		//Change the strings into int or Double
		id = Integer.parseInt(StringId);
		BatAverage = Double.parseDouble(StringBatAve);
		
		//create catcher object
		BaseballPlayer catcher = new BaseballPlayer(id,BatAverage);
		collectiveAve += BatAverage;
		catcher.showPlayer(); //show the GUI
		
		//Get teh Shortstop ID
		StringId = JOptionPane.showInputDialog(null, "What is the Shortstop's id", "Shortstop", JOptionPane.QUESTION_MESSAGE);
		StringBatAve = JOptionPane.showInputDialog(null, "What is the Shortstop's Batting Average",
				"Shortstop", JOptionPane.INFORMATION_MESSAGE);
		id = Integer.parseInt(StringId);
		BatAverage = Double.parseDouble(StringBatAve);
		
		//create the shortstop object
		BaseballPlayer shortstop = new BaseballPlayer(id,BatAverage);
		collectiveAve += BatAverage;
		shortstop.showPlayer();
		
		//Get the Outfielder object
		StringBatAve = JOptionPane.showInputDialog(null, "What is the Outfielder's Batting Average",
				"Outfielder", JOptionPane.QUESTION_MESSAGE);
		BatAverage = Double.parseDouble(StringBatAve);
		
		BaseballPlayer Outfielder = new BaseballPlayer(BatAverage);
		collectiveAve += BatAverage;
		Outfielder.showPlayer();
		
		//Create the Batter Object
		StringId = JOptionPane.showInputDialog(null, "What is the Batter's id", "Batter", JOptionPane.QUESTION_MESSAGE);
		id = Integer.parseInt(StringId);
		
		BaseballPlayer Batter = new BaseballPlayer(id);
		collectiveAve += BatAverage;
		Batter.showPlayer();
		
		CollectiveAve(collectiveAve,Batter.count);
	}
	
	//Calculate the collective average of the batting
	public static void CollectiveAve(double ave,int count) {
		ave /=count;
		JOptionPane.showMessageDialog(null, "There are " + count + " players & the teans " + " collective batting average is: "
				+ ave, "Collective Batting Average", JOptionPane.INFORMATION_MESSAGE);
	}

}

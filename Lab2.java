import javax.swing.JOptionPane;

/*
 * Ariosto Kuit 
 * Lab02-1 Taxable Incom
 * Create a Java program utilizing JoptionPane that computes a single filer's federal income tax
 */
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Income;
		double taxableIncome;
		double result;
		
		//Ask for the taxable Income
		
		Income = JOptionPane.showInputDialog(null,"Please provide your taxable income", "Taxable Income dialog 1",
												JOptionPane.INFORMATION_MESSAGE);
		taxableIncome = Double.parseDouble(Income);
		//go through each if statements to tax the income
		if(taxableIncome > 0 && taxableIncome <=9325) {result =.1*taxableIncome;}
		else if(taxableIncome > 9325 && taxableIncome <= 37950) {result = 932.50 + (.15*(taxableIncome - 9325));}
		else if(taxableIncome > 91900 && taxableIncome <= 191650) {result = 18713.75 + (.28 * (taxableIncome - 91900));}
		else if(taxableIncome > 191650 && taxableIncome <= 416700) {result = 46643.75 + (.33 * (taxableIncome - 191650));}
		else if(taxableIncome > 416700 && taxableIncome <= 418400) {result = 120910.25 + (.25 * (taxableIncome - 416700));}
		else
			result = 121505.25 + (.396 * (taxableIncome - 418400));
		
		//Display the result
		JOptionPane.showMessageDialog(null, "Your federal income tax is " + result,"Taxable Income Dialog 2", JOptionPane.INFORMATION_MESSAGE);
	}

}

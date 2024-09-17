package BL_Assign2_1;

import javax.swing.JOptionPane;

public class Blake_Larson_Assignment2_1 {

	public static void main(String[] args) {
		
		String firstName;
		char middleInitial;
		String lastName;
		int age;
		double grossAnnualPay, taxRate, netAnnualPay;
		
		firstName = JOptionPane.showInputDialog("Enter your first name: ");
		middleInitial = JOptionPane.showInputDialog("Entering your middle initial: ").charAt(0);
		lastName = JOptionPane.showInputDialog("Enter your last name: ");
		
		String ageString;
		ageString = JOptionPane.showInputDialog("Enter your age: ");
		age =Integer.parseInt(ageString);
		
		String grossPay;
		grossPay = JOptionPane.showInputDialog("Enter your gross annual pay: ");
		grossAnnualPay = Double.parseDouble(grossPay);
		
		String annualTaxRate;
		annualTaxRate = JOptionPane.showInputDialog("Enter in your current tax rate: ");
		taxRate = Double.parseDouble(annualTaxRate);
		
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		
		System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ".\n"
				+ "You are currently " + age + " years old.\n"
				+ "It is amazing that you made $" + (int)grossAnnualPay + " this year.\n"
				+ "With the tax rate of %" + taxRate +", you can take home $" + (int)netAnnualPay + ".");
		
		System.exit(0);

	}

}

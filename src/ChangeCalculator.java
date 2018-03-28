//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String n=JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickel= Integer.parseInt(n);
		// Ask the user how many dimes they have, and convert their answer
		String d= JOptionPane.showInputDialog("How many dimes do you have?");
		int dime= Integer.parseInt(d);
		// Ask the user how many quarters they have, and convert their answer
		String q= JOptionPane.showInputDialog("how many quarters do you have?");
		int quarters= Integer.parseInt(q);
		String papper= JOptionPane.showInputDialog("how many quarters do you have?");
		int dollar= Integer.parseInt(papper);
		// Calculate how much money the user has and save it in a double variable 
		double total= 0.00;
		// Tell the user how much money they have
		total= 0.05* nickel;
			total+= 0.10* dime;
			total+= 0.25*quarters;
			total+= 1.00* dollar;
			JOptionPane.showMessageDialog(null, "You have a total of "+total+" Cents");
	}
}


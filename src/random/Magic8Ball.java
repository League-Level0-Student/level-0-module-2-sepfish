//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random rand = new Random();
		int hmm = rand.nextInt(4);
	// 3. Print out this variable
		System.out.println(hmm);
	// 4. Get the user to enter a question for the 8 ball
		String question = JOptionPane.showInputDialog("Ask a question for the 8 ball...");
	// 5. If the random number is 0
		if (hmm == 0) {
	// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "Your answer is... Yes!");
		} else
	// 6. If the random number is 1
		if (hmm == 1) {
	// -- tell the user "No"
			JOptionPane.showMessageDialog(null, "Your answer is... No!");
		} else
	// 7. If the random number is 2
		if (hmm == 2) {
	// -- tell the user "Maybe you should ask Google?"
		JOptionPane.showMessageDialog(null, "I'm supposed to tell you now to ask your uncle Google.");
		} else {
	// 8. If the random number is 3
		
	// -- write your own answer
		JOptionPane.showMessageDialog(null, "Reply hazy. Try again.");
		}
	}

}

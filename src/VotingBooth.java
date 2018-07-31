package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int y = Integer.parseInt(age);
		if (y > 18) {
			String hmm = JOptionPane.showInputDialog(null, "Who do you think the next president should be?");
			JOptionPane.showMessageDialog(null, "Hmm... " + hmm + " would be an interesting choice.");
		}else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
		}
	}
}

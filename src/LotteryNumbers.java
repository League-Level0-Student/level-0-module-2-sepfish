package ifs_ints_and_loops;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random rand = new Random();
		int n1 = rand.nextInt(9) + 0;
		int n2 = rand.nextInt(9) + 0;
		int n3 = rand.nextInt(9) + 0;
		int n4 = rand.nextInt(9) + 0;
		int n5 = rand.nextInt(9) + 0;
		JOptionPane.showMessageDialog(null, "Your lottery number is " + n1 + n2 + n3 + n4 + n5);
	}

}

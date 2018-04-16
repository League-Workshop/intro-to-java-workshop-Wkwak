package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
	public static void main(String[] args) {
		Random rand = new Random();

		JOptionPane.showMessageDialog(null, "Your number is " + rand.nextInt(1000000) + ", " + rand.nextInt(1000000) + ", "
				+ rand.nextInt(1000000) + ", "+ rand.nextInt(1000000));
	}
}

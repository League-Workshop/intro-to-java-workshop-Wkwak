package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int rValue = new Random().nextInt(4);

		// 3. Print out this variable
		JOptionPane.showMessageDialog(null, rValue);

		// 4. Get the user to enter something that they think is awesome
		String user = JOptionPane.showInputDialog("What do you think is awesome?");

		// 5. If the random number is 0
		if (rValue == 0) {
			JOptionPane.showMessageDialog(null,
					"Without a doubt what you put in is awesome, even though this response is not based on opionion but just a random number generator.");
			// -- tell the user whatever they entered is awesome!
		}
		if (rValue == 1) {
			JOptionPane.showMessageDialog(null, "Sure that works");
			// 6. If the random number is 1
			// -- tell the user whatever they entered is ok.
		}
		if (rValue == 2) {
			// 7. If the random number is 2
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, "Come back with a better answer");
		}

		if (rValue == 3) {
			// 8. If the random number is 3
			// -- write your own answer
			JOptionPane.showMessageDialog(null,
					"Your answer is undoubtedly the magnum opus of all written text, beautiful OwO. ");
		}

	}

}

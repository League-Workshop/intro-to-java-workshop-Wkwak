package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		int score = 0;
		String wrong = "):";

		String q1 = JOptionPane.showInputDialog(null, "What is 4001 rubles in dollars");

		if (q1.equals("64.51 dollars")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, wrong);
		}

		String q2 = JOptionPane.showInputDialog(null,
				"rho squared times this function of the polar angle is used to change an integral from Cartesian to spherical coordinates. This function's Taylor series begins x, minus x cubed over 3 factorial. In Eurler's formula this function is multiplied by (*)i");
		if (q2.equals("sin(x)")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, wrong);
		}

		String q3 = JOptionPane.showInputDialog(null,
				"Which Roman Emperor, according to legend, attempted to make his horse a consul or an executive leader in Rome");

		if (q3.equals("Caligula")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, wrong);
		}

		JOptionPane.showMessageDialog(null, score + "/3.");

		if (score == 0) {
			JOptionPane.showMessageDialog(null,
					"Just take the test again and get a 100%. How would I know I am just an if statement");
		}
		if (score == 1) {
			JOptionPane.showMessageDialog(null, "Atleast you got one");
		}
		if (score == 2) {
			JOptionPane.showMessageDialog(null, "Close but not really");
		}
		if (score == 3) {
			JOptionPane.showMessageDialog(null, "You are a genius according to this quiz");
		}
	}

}

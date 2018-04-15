package section2;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	Robot phil = new Robot();

	void go() {
		phil.setSpeed(80);

		phil.setPenWidth(10);

		for (int i = 0; i < 3; i++) {
			phil.setPenColor(i, i, i); // random value

		}

		// 7. Set the pen color to random

		// 1. Call the drawSquare() method

		// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}

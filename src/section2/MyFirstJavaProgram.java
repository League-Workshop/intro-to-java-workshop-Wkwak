package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot phil = new Robot();
	phil.setSpeed(30);
	phil.penDown();
	phil.setPenColor(40, 40, 300);
	for (int i = 0; i<10; i++) {
		phil.move(90);
		phil.turn(90);
	}
}
}

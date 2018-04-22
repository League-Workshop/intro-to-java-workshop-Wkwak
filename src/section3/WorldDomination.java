package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		String worldDom = JOptionPane.showInputDialog(null, "Do you know how to code?");
		if (worldDom.equals("yes")) {
			JOptionPane.showMessageDialog(null, "great");
		}
		if (worldDom.equals("no")) {
			JOptionPane.showMessageDialog(null, "OwO what's this?");
		}
		// 1. Ask the user if they know how to write code.

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}

package section4;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		int playerHealth = 100;
		int dragonHealth = 100;
		int playerDa = 0;
		int dragonDa = 0;
		Random gen = new Random();

		while (playerHealth > 0 && dragonHealth > 0) {
			String attack = JOptionPane.showInputDialog(null,
					"Do you want to raise Dragon's taxes (1) or claim his castle as public property (2)");

			if (attack.equals("raise Dragon's taxes")) {
				int dragonDa = gen.nextInt(30);
			}
			if (attack.equals("claim his castle as public property")) {

			}

		}

		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
		// or a kick

		// 9. If they typed in "yell":

		// -- Find a random number between 0 and 10 and store it in dragonDamage

		// -- Subtract that number from the dragon's health variable

		// 10. If they typed in "kick":

		// -- Find a random number between 0 and 25 and store it in dragonDamage

		// -- Subtract that number from the dragon's health variable

		// 11. Find a random number between 0 and 35 and store it in playerDamage

		// 12. Subtract this number from the player's health

		// 13. If the user's health is less than or equal to 0

		// -- Tell the user that they lost

		// 14. Else if the dragon's health is less than or equal to 0

		// -- Tell the user that the dragon is dead and they took a ton of gold!

		// 15. Else

		// -- Pop up a message that tells the their current health and the dragon's
		// currently health (Bonus: Also display the amount of health that was lost for
		// each player this round)

	}
}

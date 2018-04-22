package section4;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		int round = 0;
		int playerHealth = 100;
		int dragonHealth = 100;
		int playerDamage;
		int dragonDamage = 0;

		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
		// or a kick

		while (playerHealth > 0 && dragonHealth > 0) {
			String attack = JOptionPane.showInputDialog(null,
					"Do you want to raise dragon's taxes (1) or claim his castle as public property (2)");

			if (attack.equals("raise dragon's taxes")) {
				// 9. If they typed in "yell":

				// -- Find a random number between 0 and 10 and store it in dragonDamage

				// -- Subtract that number from the dragon's health variable
				dragonDamage = new Random().nextInt(10);
				dragonHealth = dragonHealth - dragonDamage;
			}
			if (attack.equals("claim his castle as public property")) {
				// 10. If they typed in "kick":

				// -- Find a random number between 0 and 25 and store it in dragonDamage

				// -- Subtract that number from the dragon's health variable
				dragonDamage = new Random().nextInt(25);
				dragonHealth = dragonHealth - dragonDamage;
			}

			// 11. Find a random number between 0 and 35 and store it in playerDamage
			// 12. Subtract this number from the player's health
			if (round == 0 || round % 2 == 0 || round % 4 == 0 || round % 6 == 0 || round % 8 == 0) {
				playerDamage = new Random().nextInt(35);
				playerHealth = playerHealth - playerDamage;
			}

			if (playerHealth <= 0) {
				// 13. If the user's health is less than or equal to 0

				// -- Tell the user that they lost
				JOptionPane.showMessageDialog(null, "You lost, and how you had the government on your side?");
			} else if (dragonHealth <= 0) {
				// 14. Else if the dragon's health is less than or equal to 0

				// -- Tell the user that the dragon is dead and they took a ton of gold!
				JOptionPane.showMessageDialog(null, "You won and stole all his property");
			} else {
				JOptionPane.showMessageDialog(null,
						"Your health is " + playerHealth + ", and the dragon's health is " + dragonHealth);
			}
			round++;
		}

		// 15. Else

		// -- Pop up a message that tells the their current health and the dragon's
		// currently health (Bonus: Also display the amount of health that was lost for
		// each player this round)

	}
}

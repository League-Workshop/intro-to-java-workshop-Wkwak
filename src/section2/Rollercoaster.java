package section2;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		for (int k = 0; k <5; k++) {
		String height = JOptionPane.showInputDialog("What is your height (inches)?");
		int h = Integer.parseInt(height);
		
		if (h <= 48) {
			JOptionPane.showMessageDialog(null, "You need to grow more before you can ride.");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "You can ride the Rollercoaster!");
		}
		}
	}
}

package section3;

import javax.swing.JOptionPane;

public class SpeakAndSpell {

	public static void main(String[] args) {

		speak("deoxyribonucleic");
		String spelling = JOptionPane.showInputDialog(null, "spell the word");

		if (spelling.equals("deoxyribonucleic")) {
			speak("correct");
		} else {
			speak("wrong!");
		}
		speak("asdfghjklqwertyuiopzxcvbnm");
		String otherWord = JOptionPane.showInputDialog(null, "spell it");

		if (otherWord.equals("asdfghjklqwertyuiopzxcvbnm")) {
			speak("but how");
		}

		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"

		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

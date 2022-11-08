package aufgabe11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char char1;
		char char2;

		boolean charBeforeSecondCharInAlphabet, charEqualsSecondChar, charAfterSecondCharInAlphabet,
				charIsDifferentToSecondChar;

		System.out.println("Geben Sie zwei Buchstaben ein.");
		char1 = scan.next().charAt(0);
		char2 = scan.next().charAt(0);

		charBeforeSecondCharInAlphabet = char1 < char2;
		charEqualsSecondChar = char1 == char2;
		charAfterSecondCharInAlphabet = char1 > char2;

		charIsDifferentToSecondChar = !charEqualsSecondChar;

		System.out.println("Das Zeichen " + char1 + " steht vor dem Zeichen " + char2 + " im Alphabet: "
				+ charBeforeSecondCharInAlphabet);

		System.out.println("Das Zeichen " + char1 + " ist gleich dem Zeichen " + char2 + ": " + charEqualsSecondChar);

		System.out.println("Das Zeichen " + char1 + " steht hinter dem Zeichen " + char2 + " im Alphabet: "
				+ charAfterSecondCharInAlphabet);
		
		System.out.println("Das Zeichen " + char1 + " und " + char2 + " sind verschiedene Zeichen: " + charIsDifferentToSecondChar);
		
		scan.close();

	}

}

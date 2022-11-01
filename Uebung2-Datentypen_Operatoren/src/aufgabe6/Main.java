package aufgabe6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String operation;
		int erg = 0;

		System.out.println("Welche Rechenoperation möchten Sie durchführen?");
		System.out.println("Die Auswahl treffen Sie mit A=Addition, S=Subtraktion, D=Durchschnitt, AS=Abstand ");
		operation = scan.next();

		switch (operation) {
		case "A": {
			int val1;
			int val2;
			System.out.println("Addition:");
			System.out.println("Bitte geben Sie die erste Zahl ein.");
			val1 = scan.nextInt();
			System.out.println("Bitte geben sie die zweite Zahl ein.");
			val2 = scan.nextInt();

			erg = val1 + val2;

		}
		case "S": {
			int val1;
			int val2;
			System.out.println("Subtraktion:");
			System.out.println("Bitte geben Sie die erste Zahl ein.");
			val1 = scan.nextInt();
			System.out.println("Bitte geben sie die zweite Zahl ein.");
			val2 = scan.nextInt();

			erg = val1 - val2;

		}
		case "D": {
			ArrayList<Integer> arr = new ArrayList<>();
			int input = -1;
			System.out.println("Durchschnittsberechnung");
			System.out.println("Bitte geben Sie die Zahlen ein, dessen Durchschnitt Sie berechnen wollen.");
			System.out.println("Mit der Eingabe von 0 beenden Sie die Zahlensammlung.");

			while (input != 0) {
				System.out.println("Nächste Zahl Bitte.");
				input = scan.nextInt();
				arr.add(input);
			}
			
			int fullVal = 0;
			
			for (int i = 0; i < arr.size(); i++) {
				fullVal += arr.get(i);
			}
			
			erg = fullVal / (arr.size() -1) ;

		}
		case "AS": {

		}

		}

		System.out.println("Das Ergebnis ihrer Rechnung ist: " + erg);

	}

}

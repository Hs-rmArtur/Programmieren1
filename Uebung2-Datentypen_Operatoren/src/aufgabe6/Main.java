package aufgabe6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String operation;
		double erg = 0;

		System.out.println("Welche Rechenoperation möchten Sie durchführen?");
		System.out.println("Die Auswahl treffen Sie mit A=Addition, S=Subtraktion, D=Durchschnitt, AS=Abstand ");
		operation = scan.next();

		switch (operation) {
		case "A": {
			int val1, val2;

			System.out.println("Addition:");
			
			System.out.println("Bitte geben Sie die erste Zahl ein.");
			val1 = scan.nextInt();
			System.out.println("Bitte geben sie die zweite Zahl ein.");
			val2 = scan.nextInt();

			erg = val1 + val2;

		}
		case "S": {
			int val1, val2;

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
			int fullVal = 0;

			System.out.println("Durchschnittsberechnung");
			System.out.println("Bitte geben Sie die Zahlen ein, dessen Durchschnitt Sie berechnen wollen.");
			System.out.println("Mit der Eingabe von 0 beenden Sie die Zahlensammlung.");

			while (input != 0) {
				System.out.println("Nächste Zahl Bitte.");
				input = scan.nextInt();
				arr.add(input);
			}

			for (int i = 0; i < arr.size(); i++) {
				fullVal += arr.get(i);
			}

			erg = fullVal / (arr.size() - 1);

		}
		case "AS": {
			System.out.println("Abstandsberechnung");
			double length1, length2;

			System.out.println("Bitte geben Sie die Länge der zwei Seiten als Gleitkommazahl ein.");

			System.out.println("Erste Länge:");
			length1 = scan.nextDouble();
			System.out.println("Zweite Länge:");
			length2 = scan.nextDouble();
			
			erg = Math.sqrt( Math.pow(length1, 2) + Math.pow(length2, 2));
			

		}

		}

		System.out.println("Das Ergebnis ihrer Rechnung ist: " + String.format("%.2f", erg));

	}

}

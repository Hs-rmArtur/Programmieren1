package aufgabe9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int bottleCount, sixpackCount, leftoverCount, freeGlasses;

		System.out.println("Wieviele Flaschen möchten Sie einkaufen?");
		bottleCount = scan.nextInt();

		sixpackCount = bottleCount / 6;
		leftoverCount = bottleCount % 6;
		freeGlasses = sixpackCount / 3;

		System.out.println("Für " + bottleCount + " Flaschen müssen Sie " + sixpackCount + " Sixpacks kaufen und "
				+ leftoverCount + " Einzelflaschen.");

		if (freeGlasses > 0) {
			System.out.println("!!Sonderaktion!!");
			if (freeGlasses == 1) {
				System.out.println(
						"Sie erhalten für Ihren Einkauf noch " + freeGlasses + " kostenloses Fassbrauseglas hinzu!");
			} else {
				System.out.println(
						"Sie erhalten für Ihren Einkauf noch " + freeGlasses + " kostenlose Fassbrausegläser hinzu!");
			}

		}

		scan.close();
	}

}

package aufgabe24;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int minRange, maxRange, numberOfGeneratedNumbers;

		System.out.println("Wieviel zufällige Zahlen möchten Sie generieren?");
		numberOfGeneratedNumbers = scan.nextInt();

		System.out.println("In welchem Bereich möchten Sie zufällige Zahlen generieren?");
		System.out.println("Anfang: ");
		minRange = scan.nextInt();

		System.out.println("Ende: ");
		maxRange = scan.nextInt();

		
		System.out.println("Ihre Zahlen sind:");
		for (int i = 0; i < numberOfGeneratedNumbers; i++) {
			System.out.print(getRandomNumberInRange(maxRange, minRange));
			System.out.print(", ");
		}
		
		
		scan.close();

	}

	public static int getRandomNumberInRange(int max, int min) {

		return (int) Math.round(Math.random() * (max - min) + min);
	}
}

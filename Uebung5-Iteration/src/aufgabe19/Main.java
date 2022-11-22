package aufgabe19;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numberToCalc = 0;
		long result = 1;

		System.out.println("Welche Fakultät möchten Sie berechnen?");
		numberToCalc = scan.nextInt();

		for (int i = 1; i <= numberToCalc; i++) {
			result *= i;
		}

		System.out.println("Das Ergebnis ist: " + result);

		scan.close();
	}

}

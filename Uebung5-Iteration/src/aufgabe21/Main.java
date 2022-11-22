package aufgabe21;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int coinGuess;
		int coinNum;
		boolean isCoin = false;

		System.out.println("Gewinnen Sie, gewinnen Sie!!!");
		System.out.println("Unter welchem Hütchen steckt die Münze? 1,2 oder 3. Geben Sie Ihre Vermutung ab!");

		while (!isCoin) {
			coinGuess = scan.nextInt();
			coinNum = getRandomInt(3, 1);

			isCoin = coinGuess == coinNum ? true : false;

			if (isCoin) {
				System.out.println("Sie haben richtig geraten! Herzlichen Glückwunsch!");
			} else {
				System.out.println("Leider lagen Sie falsch. Versuchen Sie es erneut!");
			}
		}

		scan.close();

	}

	public static int getRandomInt(int max, int min) {
		return (int) Math.round(Math.random() * (max - min) + min);

	}

}

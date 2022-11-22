package aufgabe20;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Aus welcher Zahl möchten Sie die Quersumme bilden?");
		int number = scan.nextInt();
		int result = 0;

		while (number > 0) {
			result += number % 10;
			number = number / 10;
		}

		System.out.println(result);

		scan.close();

	}

}

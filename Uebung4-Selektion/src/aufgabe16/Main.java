package aufgabe16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Bitte geben Sie das Jahr ein, um zu überprüfen, ob sich dieses um ein Schaltjahr handelt.");
		int inputYear = scan.hasNextInt() ? scan.nextInt() : 0;

		if (inputYear > 0) {
			if (((inputYear % 4 == 0) && !(inputYear % 100 == 0)) || (inputYear % 400 == 0)) {
				System.out.printf("Bei dem Jahr %d handelt es sich um ein Schaltjahr.", inputYear);
			} else {
				System.out.printf("Das Jahr %d ist kein Schaltjahr.", inputYear);
			}

		} else {
			System.out.println(
					"Es werden nur Jahre nach Christus Geburt berücksichtigt. Bitte geben Sie ein gültiges Jahr ein.");

		}

		scan.close();

	}

}

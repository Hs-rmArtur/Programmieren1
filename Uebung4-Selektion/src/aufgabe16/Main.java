package aufgabe16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Bitte geben Sie das Jahr ein, um zu überprüfen, ob sich dieses um ein Schaltjahr handelt.");
		int inputYear = scan.hasNextInt() ? scan.nextInt() : 0;
		
		boolean isSchaltjahr = false;

		if (inputYear <= 0) {
			System.out.println(
					"Es werden nur Jahre nach Christus geburt berücksichtigt. Bitte geben Sie ein gültiges Jahr ein.");
		} else {
			if (((inputYear % 4 == 0) && !(inputYear % 100 == 0)) || (inputYear % 400 == 0)) {
				isSchaltjahr = true;
			}
			
			

			if (isSchaltjahr) {
				System.out.printf("Bei dem Jahr %d handelt es sich um ein Schaltjahr.", inputYear);
			} else {
				System.out.printf("Das Jahr %d ist kein Schaltjahr.", inputYear);
			}
		}
		
		scan.close();

	}

}

package aufgabe17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine Zahl für einen Wochentag ein");
		int inputDay = scan.hasNextInt() ? scan.nextInt() : -1;

		switch (inputDay) {
		case 1:
			System.out.printf("Wochentag-Nummer: %d%nWochentag: Montag", inputDay);
			break;
		case 2:
			System.out.printf("Wochentag-Nummer: %d%nWochentag: Dienstag", inputDay);
			break;
		case 3:
			System.out.printf("Wochentag-Nummer: %d%nWochentag: Mittwoch", inputDay);
			break;
		case 4:
			System.out.printf("Wochentag-Nummer: %d%nWochentag: Donnerstag", inputDay);
			break;
		case 5:
			System.out.printf("Wochentag-Nummer: %d%nWochentag: Freitag", inputDay);
			break;
		case 6:
			System.out.printf("Wochentag-Nummer: %d%nWochentag: Samstag", inputDay);
			break;
		case 7:
			System.out.printf("Wochentag-Nummer: %d%nWochentag: Sonntag", inputDay);
			break;
		default:
			System.out.printf("Keine korrekte Eingabe. Bitte überprüfen Sie diese.");			
		}
		
		scan.close();

	}

}

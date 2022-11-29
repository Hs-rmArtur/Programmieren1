package aufgabe25;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		
		
		
		while(number != -1) {
			System.out.println("Aus welcher Zahl möchten Sie die Quersumme bilden? Mit -1 brechen Sie das Progamm ab.");
			number = scan.nextInt();
			System.out.println(getChecksum(number));	
		}
		
		scan.close();
		
	}

	public static int getChecksum(int number) {
		int result = 0;

		while (number > 0) {
			result += number % 10;
			number = number / 10;
		}

		return result;

	}

}

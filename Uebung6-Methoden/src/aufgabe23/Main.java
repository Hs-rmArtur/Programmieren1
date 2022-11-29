package aufgabe23;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numStars, numStairs;
		
		
		System.out.println("Wieviel Sterne möchten Sie ausgeben?");
		numStars = scan.nextInt();		
		writeStars(numStars);
		
		
		System.out.println("Wieviel Treppenstufen möchten Sie haben?");
		numStairs = scan.nextInt();
		createStairs(numStairs);
		
		
		scan.close();

	}

	public static void writeStars(int numStars) {
		for (int i = 0; i < numStars; i++) {
			System.out.print("*");
		}
		System.out.println();

	}

	public static void createStairs(int numStairs) {
		String stairs = "";
		for (int i = 0; i < numStairs; i++) {
				stairs += "*";
				System.out.println(stairs);
			
		}
	}
}

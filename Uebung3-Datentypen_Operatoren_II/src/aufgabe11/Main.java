package aufgabe11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char char1;
		char char2;
		
		
		System.out.println("Geben Sie zwei Buchstaben ein.");
		char1 = scan.next().charAt(0);
		char2 = scan.next().charAt(0);
		
		System.out.println("Das Zeichen " + char1 + " steht vor dem Zeichen " + char2 + " im Alphabet: " + (char1 < char2));
		
		System.out.println("Das Zeichen " + char1 + " ist gleich dem Zeichen " + char2 + ": " + (char1 == char2));

	}

}

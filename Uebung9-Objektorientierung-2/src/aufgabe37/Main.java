package aufgabe37;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ComboLock lock1 = new ComboLock(13, 1, 37);

		System.out.println("Sie haben ein Schloss vor sich. Was möchten Sie damit tun?");
		System.out.println("Sie haben folgende Möglichkeiten:");
		System.out.println("X nach rechts drehen: rd");
		System.out.println("X nach links drehen: ld");
		System.out.println("Aktuelle Zahl einrasten lassen: ln");
		System.out.println("Ausgabe der aktuellen Zahl: gcM");
		System.out.println("Ausgabe der bereits eingerasteten Nummern: geN");
		System.out.println("");
		System.out.println("");

		lock1.getCurrentNum();
		lock1.turnRight(5);
		lock1.getCurrentNum();
		lock1.turnLeft(6);
		lock1.getCurrentNum();
		lock1.turnRight(2);
		lock1.getCurrentNum();

		lock1.reset();
		lock1.getCurrentNum();
		lock1.turnRight(13);
		lock1.lockCurrentNumber();
		lock1.turnRight(1);
		lock1.lockCurrentNumber();

		lock1.getLockedNumbers();
		lock1.turnRight(36);
		lock1.lockCurrentNumber();
		lock1.getLockedNumbers();
		lock1.open();
		lock1.getLockedNumbers();

	}

}

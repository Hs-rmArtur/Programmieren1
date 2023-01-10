package aufgabe34;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int MAX_LIST_ITEMS = 5;

		ToDo[] toDoListe = new ToDo[MAX_LIST_ITEMS];
		String description;
		boolean listIsFull = false;
		boolean userIsEditing = true;
		char operation;

		while (userIsEditing) {
			System.out.println("Welche Operation möchten Sie ausführen? Sie haben folgende Wahl:");
			System.out.println("a - Hinzufügen eines neuen ToDo's.");
			System.out.println("r - Löschen eines ToDo's.");
			System.out.println("s - Anzeigen Ihrer ToDo-Liste.");
			System.out.println("c - Ein ToDo auf erledigt setzen.");
			System.out.println("b - Beenden des Programms.");

			operation = scan.next().charAt(0);
			scan.nextLine();

			switch (operation) {
			case 'a': {

				// Überprüfen, ob die Liste noch Platz hat
				listIsFull = checkIfListIsFull(toDoListe);

				if (listIsFull) {
					System.out.println("Die Liste ist voll, Sie können keine weiteren ToDo's erfassen.");
				} else {
					System.out.println("Welchen ToDo möchten Sie erfassen?");
					description = scan.nextLine();

					// ToDo am nächsten freien Platz füllen
					addToDo(toDoListe, description);
				}

				break;
			}
			case 'r': {
				
				int toDoNr = -1;

				printToDoList(toDoListe);
				System.out.println("Welches ToDo möchten Sie entfernen? Bitte geben Sie dessen Nummer an.");
				toDoNr = scan.nextInt();
				removeToDo(toDoListe, toDoNr);
				
				break;
			}
			case 's': {
				
				printToDoList(toDoListe);
				
				break;
			}
			case 'c': {
				
				int toDoNr = -1;

				printToDoList(toDoListe);
				System.out.println("Welches ToDo haben Sie erledigt? Bitte geben Sie dessen Nummer an.");
				toDoNr = scan.nextInt();
				setToDoOnFinished(toDoListe, toDoNr);
				
				break;
			}
			case 'b': {
				
				System.out.println("Danke für Ihre Nutzung und bis zum nächsten mal!");
				userIsEditing = false;
				
				break;
			}
			default:
				System.out.println("Diese Operation unterstützen wir leider nicht. Bitte versuchen Sie erneut.");
			}

		}
		
		scan.close();

	}

	public static void printToDoList(ToDo[] toDoList) {
		System.out.println("Ihre ToDo Liste:");
		for (int i = 0; i < toDoList.length; i++) {
			if (toDoList[i] != null) {
				toDoList[i].print();
			}
		}
	}

	public static void addToDo(ToDo[] toDoList, String description) {
		for (int i = 0; i < toDoList.length; i++) {
			if (toDoList[i] == null) {
				toDoList[i] = new ToDo(i, description);
				break;
			}
		}
	}

	public static boolean checkIfListIsFull(ToDo[] toDoList) {
		boolean isFull = false;
		for (int i = 0; i < toDoList.length; i++) {
			if (toDoList[i] == null) {
				isFull = false;
				break;
			} else {
				isFull = true;
			}
		}
		return isFull;
	}

	public static void removeToDo(ToDo[] toDoList, int toDoNr) {
		if (toDoNr >= 0 && toDoNr < toDoList.length) {
			if (toDoList[toDoNr] != null) {
				toDoList[toDoNr] = null;
				System.out.println("ToDo " + toDoNr + " " + toDoList[toDoNr] + " wurde entfernt.");
			} else {
				System.out.println("Die angegebene ToDoNummer ist nicht vorhanden.");
			}
		} else {
			System.out.println("Die angegebene ToDoNummer ist nicht vorhanden.");
		}

	}

	public static void setToDoOnFinished(ToDo[] toDoList, int toDoNr) {
		if (toDoNr >= 0 && toDoNr < toDoList.length) {
			if (toDoList[toDoNr] != null) {
				toDoList[toDoNr].finished();
			} else {
				System.out.println("Die angegebene ToDoNummer ist nicht vorhanden.");
			}
		} else {
			System.out.println("Die angegebene ToDoNummer ist nicht vorhanden.");
		}

	}
}

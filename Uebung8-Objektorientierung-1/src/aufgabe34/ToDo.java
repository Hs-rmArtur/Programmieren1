package aufgabe34;

public class ToDo {
	private int number;
	private String description;
	private boolean open;

	public ToDo(int number, String description) {
		this.number = number;
		this.description = description;
		this.open = true;
	}

	public boolean isOpen() {
		return false;
	}

	public void finished() {
		open = false;
	}

	public void print() {
		System.out.println("ToDo " + number + ": " + description);
		if (open) {
			System.out.println("Status: nicht erledigt");
		} else {
			System.out.println("Status: erledigt");
		}
		System.out.println("- - - - - - - - - - - - - - - - - - -");

	}

}

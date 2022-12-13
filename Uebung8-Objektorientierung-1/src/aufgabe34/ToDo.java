package aufgabe34;

public class ToDo {
	int number;
	String description;
	boolean open;

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
	
	public void print(){
		System.out.println("ToDo: " + description);
		System.out.println();
	
	}
	
	
}

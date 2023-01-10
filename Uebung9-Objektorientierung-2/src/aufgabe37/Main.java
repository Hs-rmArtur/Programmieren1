package aufgabe37;

public class Main {
	
	public static void main (String[] args) {
		
		ComboLock lock1 = new ComboLock(13, 1, 37);
		
		
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

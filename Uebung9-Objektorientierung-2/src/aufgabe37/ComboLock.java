package aufgabe37;

public class ComboLock {
	static final int START_NUM = 0;
	static final int END_NUM = 39;
	private static final int DEFAULT_LOCKED_NUM = -1;

	private int secretNum1, secretNum2, secretNum3;
	private int lockedNum1, lockedNum2, lockedNum3;
	private int currentNum;

	public ComboLock(int secretNum1, int secretNum2, int secretNum3) {
		this.secretNum1 = secretNum1;
		this.secretNum2 = secretNum2;
		this.secretNum3 = secretNum3;

		this.lockedNum1 = DEFAULT_LOCKED_NUM;
		this.lockedNum2 = DEFAULT_LOCKED_NUM;
		this.lockedNum3 = DEFAULT_LOCKED_NUM;
		this.currentNum = START_NUM;

	}

	public void reset() {
		this.currentNum = START_NUM;
		lockedNum1 = DEFAULT_LOCKED_NUM;
		lockedNum2 = DEFAULT_LOCKED_NUM;
		lockedNum3 = DEFAULT_LOCKED_NUM;
	}

	public void turnRight(int ticks) {
		if ((currentNum + ticks) > END_NUM) {
			currentNum = (currentNum + ticks) - END_NUM - 1; // -1 because eg. 41-39 = 2, but the lock is on 1
																	// (don't forget zero)
		} else {
			currentNum += ticks;
		}
	}

	public void turnLeft(int ticks) {
		if (currentNum - ticks < START_NUM) {
			currentNum = END_NUM + (currentNum - ticks) + 1; 
		} else {
			currentNum -= ticks;
		}
	}

	public void lockCurrentNumber() {
		if (lockedNum1 == DEFAULT_LOCKED_NUM) {
			lockedNum1 = currentNum;
		} else if (lockedNum2 == DEFAULT_LOCKED_NUM) {
			lockedNum2 = currentNum;
		} else if (lockedNum3 == DEFAULT_LOCKED_NUM) {
			lockedNum3 = currentNum;
		} else {
			System.out.println("All numbers are already locked.");
		}

		currentNum = 0;

	}

	public void open() {
		if (lockedNum1 == secretNum1 && lockedNum2 == secretNum2 && lockedNum3 == secretNum3) {
			System.out.println("Lock has opened.");
		} else {
			System.out.println("Combination is not valid. Pls try again.");
		}

		reset();

	}

	public void getCurrentNum() {
		System.out.println("Current number: " + currentNum);
	}

	public void getLockedNumbers() {
		System.out.println("Locked numbers: " + lockedNum1 + " " + lockedNum2 + " " + lockedNum3);
	}
}

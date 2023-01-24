package aufgabe40;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 20;

		for (int i = 1; i < num; i++) {
			if (i < num - 1) {
				System.out.println(calcFibonacci(i) + ", ");
			} else {
				System.out.println(calcFibonacci(i));
			}

		}

	}

	public static int calcFibonacci(int num) {

		if (num == 1) {
			return 1;
		}

		if (num == 2) {
			return 1;
		}

		return calcFibonacci(num - 1) + calcFibonacci(num - 2);

	}

}

package aufgabe22;

public class Main {
	public static void main(String[] args) {

		final int CHESSBOARD_X = 8;
		final int CHESSBOARD_Y = 8;

		for (int y = 0; y < CHESSBOARD_X; y++) {
			for (int i = 0; i < CHESSBOARD_Y; i++) {

				if (y % 2 == 0) {
					if (i % 2 == 0) {
						System.out.print("X ");
					} else {
						System.out.print("O ");
					}
				} else {
					if (i % 2 == 0) {
						System.out.print("O ");
					} else {
						System.out.print("X ");
					}
				}

			}
			System.out.println();
		}
	}
}

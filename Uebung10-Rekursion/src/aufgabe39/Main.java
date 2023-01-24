package aufgabe39;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double basis = 2;
		double potenz = 5;

		System.out.println(Math.pow(basis, potenz));
		System.out.println(errechneHochX(basis, potenz));
	}

	public static double errechneHochX(double basis, double potenz) {
		double erg = 1.0;

		if (potenz > 0) {
			erg = basis * (errechneHochX(basis, potenz - 1));
		}

		return erg;
	}

}

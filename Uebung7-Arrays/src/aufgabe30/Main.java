package aufgabe30;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int floatArrayLength;
		float[] floatArray;

		System.out.println("Wie viele Werte möchten Sie eingeben, die berechnet werden sollen?");
		floatArrayLength = scan.nextInt();

		floatArray = fillFloatArray(floatArrayLength);
		showFloatArray(floatArray);

		System.out.println("Summe der Zahlen: " + calcSum(floatArray));
		System.out.println("Durchschnitt: " + calcAverage(floatArray));
		System.out.println("Höchste Zahl: " + determineMax(floatArray));

		scan.close();

	}
	
	public static float determineMax(float[] array) {
		float max = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static float calcAverage(float[] array) {
		float sum = calcSum(array);

		return sum / array.length;
	}

	public static float calcSum(float[] array) {
		float result = 0;

		for (float number : array) {
			result += number;
		}
		return result;
	}

	public static float[] fillFloatArray(int arrayLength) {
		Scanner scan = new Scanner(System.in);
		float[] floatArray = new float[arrayLength];

		for (int i = 0; i < floatArray.length; i++) {
			System.out.println("Bitte geben Sie ihre Fließkommazahl ein. " + i + "/" + floatArray.length);
			floatArray[i] = scan.nextFloat();
		}

		scan.close();
		return floatArray;

	}

	public static void showFloatArray(float[] array) {
		System.out.println("Ihre Zahlen lauten: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != array.length - 1) {
				System.out.print(" | ");
			}
		}
		System.out.println();

	}
}

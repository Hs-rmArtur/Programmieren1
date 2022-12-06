package aufgabe29;

public class Main {
	public static void main(String[] args) {
		float[] floatArray;
		
		floatArray = convertStringArrayIntoFloatArray(args);
		showFloatArray(floatArray);

	}
	
	public static float[] convertStringArrayIntoFloatArray(String[] array) {
		float[] floatArray = new float[array.length];
		
		for (int i = 0; i < array.length; i++) {
			floatArray[i] = Float.parseFloat(array[i]);
		}
		
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

	}
}

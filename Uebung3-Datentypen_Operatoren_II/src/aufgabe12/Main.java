package aufgabe12;

public class Main {

	public static void main(String[] args) {

		int maxChar = Character.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		long maxLong = Long.MAX_VALUE;
		double maxDouble = Double.MAX_VALUE;
		
		int overflowInt = maxInt++;
		long overflowLong = maxLong++;
		double overflowDouble = maxDouble++;

		System.out.printf("maxChar: %d%nminInt: %d%nmaxInt: %d%nmaxLong: %d%nmaxDouble: %f%n", maxChar, minInt, maxInt,
				maxLong, maxDouble);

		System.out.printf("Overflow Int: %d%nOverflow Long: %d%nOverflow Double: %f",overflowInt, overflowLong, overflowDouble);
		
		System.out.println("Bei Double geht der Wertebereich bei einem Overflow ins unendliche.");
		
		
		/*
		char _char = 'a';
		int _int = 192391;
		long _long = 193103129;
		float _float = 1231412.11F;
		double _double = 123831.5892;
		
		*/
	
	}
	
}

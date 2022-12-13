package aufgabe33;

public class Main {

	public static void main(String[] args) {
		MagicPotion potion1 = new MagicPotion(5, 20);
		MagicPotion potion2 = new MagicPotion(2, 10);
		MagicPotion potion3 = new MagicPotion(10, 15);
		MagicPotion potion4 = new MagicPotion(8, 10);
		MagicPotion potion5 = new MagicPotion(12, 12);
		
	

		System.out.println("Potion " + ": " + potion1.energy());
		System.out.println("Potion2: " + potion2.energy());
		System.out.println("Potion3: " + potion3.energy());
		System.out.println("Potion4: " + potion4.energy());
		System.out.println("Potion5: " + potion5.energy());
		
		
	}

}

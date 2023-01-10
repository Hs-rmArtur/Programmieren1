package aufgabe33;

public class MagicPotion {
	final static float ENERGYLEVEL = 3;
	
	float radius;
	float height;

	public MagicPotion(float radius, float height) {
		this.radius = radius;
		this.height = height;
	}

	public float volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}

	public float energy() {
		return (float) Math.round((volume() * ENERGYLEVEL / 1000) * 100) / 100;
	}

}

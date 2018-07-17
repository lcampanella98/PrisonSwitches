import java.util.Random;

public class Warden {
	
	private Random rand = new Random();
	
	public Prisoner selectPrisoner(Prisoner[] prisoners) {
		return prisoners[rand.nextInt(prisoners.length)];
	}
	
}

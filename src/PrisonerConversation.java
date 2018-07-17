import java.util.Random;

public class PrisonerConversation {
	
	private Prisoner[] prisoners;
	
	public PrisonerConversation(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}
	
	public void converse() {
		Random rand = new Random();
		
		int counterPrisonerIdx = rand.nextInt(prisoners.length);
		
		prisoners[counterPrisonerIdx] = new CounterPrisoner(); // I'm the counter prisoner
		
		for (int c = 0; c < prisoners.length; c++) {
			if (c != counterPrisonerIdx) prisoners[c] = new RegularPrisoner();
		}
		
		// every prisoner knows how many of them there are
		for (Prisoner p : prisoners) p.setNumPrisoners(prisoners.length); 
	}
	
}

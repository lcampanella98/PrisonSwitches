import java.util.Scanner;

public class PrisonGame {
	
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter number of prisoners: ");
		int numPrisoners = scan.nextInt();
		System.out.println("Enter number of prisoners brought into the room per day: ");
		double prisonersPerDay = scan.nextDouble();
		
		double daysTaken = playGame(numPrisoners, prisonersPerDay);
		double yearsTaken = daysTaken / 365.25;
		System.out.println("Took the prisoners " + daysTaken + " days (" + yearsTaken + " years) to win the game");
	}
	
	// returns number of days it took to win the game
	public static double playGame(int numPrisoners, double prisonersPerDay) {
		double day = 0;
		
		Prisoner[] prisoners = new Prisoner[numPrisoners];
		
		new PrisonerConversation(prisoners).converse(); // have important conversation
		
		Warden bigBadWarden = new Warden();
		Room theRoom = new Room();
		
		Switch chosenSwitch;
		Prisoner chosenPrisoner;
		do {
			chosenPrisoner = bigBadWarden.selectPrisoner(prisoners);
			chosenSwitch = chosenPrisoner.enterRoomAndChooseSwitch(theRoom);
			if (chosenSwitch != null) chosenSwitch.flip();
			day += 1.0 / prisonersPerDay;
		} while (chosenSwitch != null); // someone declared victory
		
		return day;
	}
	
}

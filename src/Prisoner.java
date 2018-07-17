
public abstract class Prisoner {
	
	protected int numPrisoners;
	
	public void setNumPrisoners(int n) {
		numPrisoners = n;
	}
	
	public abstract Switch enterRoomAndChooseSwitch(Room room); // if returns null, prisoner declared victory
}

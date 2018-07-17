
public class CounterPrisoner extends Prisoner {

	private int count = 0; // prisoner must remember this
	
	public Switch enterRoomAndChooseSwitch(Room room) {
		if (room.leftSwitch.isOn()) {
			++count;
			if (count == numPrisoners - 1) return null; // declare victory
			
			return room.leftSwitch;
		}
		return room.rightSwitch;
	}

}

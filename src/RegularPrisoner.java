
public class RegularPrisoner extends Prisoner {

	private boolean flippedLeftSwitch = false; // prisoner must remember this
	
	public Switch enterRoomAndChooseSwitch(Room room) {
		if (!flippedLeftSwitch && !room.leftSwitch.isOn()) {
			flippedLeftSwitch = true;
			return room.leftSwitch;
		}
		
		return room.rightSwitch;
	}

}


public class Switch {
	
	private boolean isOn;
	
	public Switch () {
		isOn = false;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public void flip() {
		isOn = !isOn;
	}
	
}

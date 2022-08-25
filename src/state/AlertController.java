package state;

public class AlertController {
	private AlertState state;
	
	public void setState( AlertState state) {
		this.state = state;
	}
	
	
	public void alert() {
		this.state.alert();
	}

	public void switchMode() {
		this.state.nextState();
	}
}

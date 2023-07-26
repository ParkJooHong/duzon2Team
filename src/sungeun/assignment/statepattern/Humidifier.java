package sungeun.assignment.statepattern;

public class Humidifier {

	final State BasicModeState;
	final State DryLaundryState;
	final State SleepModeState;
	final State SleepTimerState;
	
	private State currentState;
	
	public Humidifier() {
		this.BasicModeState = new BasicModeState(this);
		this.DryLaundryState = new DryLaundryState(this);
		this.SleepModeState = new SleepModeState(this);
		this.SleepTimerState = new SleepTimerState(this);
		
		this.currentState = this.BasicModeState;
	}
	
	void changeState(State nextState) {
		this.currentState = nextState;
	}
	
	public void basicMode() {
		this.currentState.basicMode();
	};
	public void dryLaundryMode() {
		this.currentState.dryLaundryMode();
	};
	public void sleepMode() {
		this.currentState.sleepMode();
	};
	public void sleepTimer() {
		this.currentState.sleepTimer();
		
	};
	public void operator() {
		this.currentState.operator();
	}
	
	
}

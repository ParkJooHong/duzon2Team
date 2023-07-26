package sungeun.assignment.statepattern;

public class SleepTimerState implements State{
	private final Humidifier humidifier;
	
	SleepTimerState(Humidifier humidifier){
		this.humidifier = humidifier;
	}

	@Override
	public void basicMode() {
		// TODO Auto-generated method stub
		System.out.println("수면타이머가 해제됩니다");
		humidifier.changeState(humidifier.BasicModeState);
	}

	@Override
	public void dryLaundryMode() {
		// TODO Auto-generated method stub
		System.out.println("수면타이머가 해제됩니다");
		humidifier.changeState(humidifier.DryLaundryState);
	}

	@Override
	public void sleepMode() {
		// TODO Auto-generated method stub
		System.out.println("수면타이머가 작동중입니다");
		
	}

	@Override
	public void sleepTimer() {
		// TODO Auto-generated method stub
		System.out.println("수면모드 타이머가 해제됩니다.");
		humidifier.changeState(humidifier.SleepModeState);
	}

	@Override
	public void operator() {
		// TODO Auto-generated method stub
		System.out.println("3시간 뒤 전원이 off됩니다.");
	}
	
}

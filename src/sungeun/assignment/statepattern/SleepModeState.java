package sungeun.assignment.statepattern;

public class SleepModeState implements State {
	private final Humidifier humidifier;
	
	SleepModeState(Humidifier humidifier){
		this.humidifier = humidifier;
	}

	@Override
	public void basicMode() {
		// TODO Auto-generated method stub
		System.out.println("수면건조 -> 기본모드로 상태를 변경합니다.");
		humidifier.changeState(humidifier.BasicModeState);
	}

	@Override
	public void dryLaundryMode() {
		// TODO Auto-generated method stub
		System.out.println("수면건조 -> 빨래건조모드로 상태를 변경합니다.");
		humidifier.changeState(humidifier.DryLaundryState);
	}

	@Override
	public void sleepMode() {
		// TODO Auto-generated method stub
		System.out.println("현재 수면모드로 선택되어 있습니다.");
		
	}

	@Override
	public void sleepTimer() {
		// TODO Auto-generated method stub
		System.out.println("수면모드 타이머가 작동됩니다. 3시간 후 전원이 OFF 됩니다.");
		humidifier.changeState(humidifier.SleepTimerState);
	}

	@Override
	public void operator() {
		// TODO Auto-generated method stub
		System.out.println("제습 수면모드로 작동합니다.");
		
	}
	
	
	
}

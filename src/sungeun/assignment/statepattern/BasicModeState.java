package sungeun.assignment.statepattern;

public class BasicModeState  implements State {
	private final Humidifier humidifier;
	
	BasicModeState(Humidifier humidifier){
		this.humidifier = humidifier;
	}

	@Override
	public void basicMode() {
		// TODO Auto-generated method stub
		System.out.println("현재 기본모드로 선택되어 있습니다.");
	}

	@Override
	public void dryLaundryMode() {
		// TODO Auto-generated method stub
		System.out.println("기본 -> 빨래건조모드로 상태를 변경합니다.");
		humidifier.changeState(humidifier.DryLaundryState);
	}

	@Override
	public void sleepMode() {
		// TODO Auto-generated method stub
		System.out.println("기본 -> 수면모드로 상태를 변경합니다.");
		humidifier.changeState(humidifier.SleepModeState);
	}

	@Override
	public void sleepTimer() {
		// TODO Auto-generated method stub
		System.out.println("수면타이머 기능은 수면모드에서 사용 가능합니다.");
	}

	@Override
	public void operator() {
		// TODO Auto-generated method stub
		System.out.println("제습 기본모드로 작동합니다.");
	}
	
	
}

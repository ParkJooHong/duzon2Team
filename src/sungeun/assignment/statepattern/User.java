package sungeun.assignment.statepattern;

public class User {
	public static void main(String[] args) {
		Humidifier humidifier = new Humidifier();
		
		humidifier.operator();
		humidifier.basicMode();
		System.out.println();
		humidifier.dryLaundryMode();
		humidifier.operator();
		humidifier.sleepTimer();
		System.out.println();
		humidifier.sleepMode();
		humidifier.operator();
		humidifier.sleepTimer();
		humidifier.sleepTimer();
		System.out.println();
		humidifier.basicMode();
		humidifier.operator();
		humidifier.sleepTimer();
		
	}
	
}

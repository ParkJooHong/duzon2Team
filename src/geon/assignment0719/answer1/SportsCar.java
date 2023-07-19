package geon.assignment0719.answer1;

public class SportsCar extends Car {
	
	@Override
	public void name() {
		System.out.println("스포츠카입니다!");
	}

	@Override
	public void speed() {
		System.out.println("현재 속력은 시속 500km 입니다.");
	}

	@Override
	public void run() {
		super.run();
	}

	@Override
	public void weight() {
		System.out.println("무게는 900kg 입니다.");
	}
	

}

package geon.assignment0719.answer1;

public class Truck extends Car {
	
	@Override
	public void name() {
		System.out.println("트럭입니다!");
	}

	@Override
	public void speed() {
		System.out.println("현재 속력은 시속 110km 입니다.");
	}

	@Override
	public void run() {
		super.run();
	}

	@Override
	public void weight() {
		System.out.println("무게는 30톤 입니다.");
	}
	

}

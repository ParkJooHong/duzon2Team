package geon.assignment0719.answer1;

public class Airplane extends Vehicle implements Fly {
	
	@Override
	public void isFly() {
		System.out.println("하늘에 떠다니는 운송수단입니다.");
	}

	@Override
	public void name() {
		System.out.println("비행기입니다!");
	}

	@Override
	public void speed() {
		System.out.println("현재 속력은 시속 700Km 입니다.");
	}

	@Override
	public void run() {
		super.run();
	}

	@Override
	public void weight() {
		System.out.println("무게는 380톤 입니다.");
	}

}

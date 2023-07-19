package geon.assignment0719.answer1;

public abstract class Car extends Vehicle {
	public abstract void name();
	public abstract void speed();
	public void run() {
		System.out.println("자동차가 움직이기 시작합니다!");
	}
	public abstract void weight();
}

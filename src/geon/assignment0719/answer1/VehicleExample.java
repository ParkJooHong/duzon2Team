package geon.assignment0719.answer1;

public class VehicleExample {
	
	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		Car car = new SportsCar();
		Car car2 = new Truck();
		
		airplane.name();
		airplane.isFly();
		airplane.run();
		airplane.speed();
		airplane.weight();
		System.out.println("==============================");
		car.name();
		car.run();
		car.speed();
		car.weight();
		System.out.println("==============================");
		car2.name();
		car2.run();
		car2.speed();
		car2.weight();
	}

}

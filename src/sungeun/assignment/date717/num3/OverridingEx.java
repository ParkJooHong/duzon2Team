package sungeun.assignment.date717.num3;

class Animal{
	public void move() {
		System.out.println("동물의 움직임");
	}
}

class Human extends Animal{ //Animal을 상속받아 move를 오버라이딩함
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람이 두발로 걷는다.");
	}
	
}
class Dog extends Animal{ //Animal을 상속받아 move를 오버라이딩함
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("강아지는 네발로 걷는다");
	}
	
}
class Eagle extends Animal{ //Animal을 상속받아 move를 오버라이딩함
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("독수리는 하늘을 날아다닌다.");
	}
	
}

public class OverridingEx {
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public static void main(String[] args) {
		OverridingEx ex = new OverridingEx();
		ex.moveAnimal(new Human()); // 출력 값 : 사람이 두발로 걷는다.
		ex.moveAnimal(new Dog()); // 출력 값 : 강아지는 네발로 걷는다.
		ex.moveAnimal(new Eagle()); // 출력 값 : 독수리는 하늘을 날아다닌다.
		System.out.println("==============다형적 변수=================");
		Animal animal1 = new Human();	// 부모 클래스(Animal) 타입의 변수에 자식 클래스(Human) 객체를 대입
		Animal animal2 = new Dog();	    // 부모 클래스(Animal) 타입의 변수에 자식 클래스(Dog) 객체를 대입
		Animal animal3 = new Eagle();   // 부모 클래스(Animal) 타입의 변수에 자식 클래스(Eagle) 객체를 대입
		animal1.move(); // 출력 값 : 사람이 두발로 걷는다.
		animal2.move(); // 출력 값 : 강아지는 네발로 걷는다.
		animal3.move(); // 출력 값 : 독수리는 하늘을 날아다닌다.
	}
}
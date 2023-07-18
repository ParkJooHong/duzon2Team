package geon.assignment0719.answer3;

// 다형성이란 하나의 메서드나 클래스가 있을 때 다양한 방법으로 동작하는 것입니다.
// 대표적으로 메서드 오버로딩, 메서드 오버라이딩, 업캐스팅 사용이 있습니다.
class Animal {
	public String name;
	public String eat;
	public int height;
	
	Animal() {
		this.name = "";
		this.eat = "";
		this.height = 200;
	}
	
	// 다형성 예시 - 1. 메서드 오버로딩
	Animal(String name, String eat, int height) {
		this.name = name;
		this.eat = eat;
		this.height = height;
	}

	public void describe() {
		System.out.println("이름은 " + name + ", 먹는 것은 " + eat + ", 키는 " + height + "입니다!");
	}

}

class Dog extends Animal {
	public String name;
	public String eat;
	public int height;
	
	Dog(String name, String eat, int height) {
		super(name, eat, height);
	}

	// 다형성 예시 - 2. 메소드 오버라이딩
	// 상속을 통해 같은 이름의 메소드를 서로 다른 내용으로 구현한다는 점에서
	// 객체 지향의 다형성을 실현한다고 볼 수 있습니다.
	@Override
	public void describe() {
		System.out.println("[Dog]");
		super.describe();
	}

}

class Cat extends Animal {
	public String name;
	public String eat;
	public int height;
	
	Cat(String name, String eat, int height) {
		super(name, eat, height);
	}

	// 다형성 예시 - 2. 메소드 오버라이딩
	@Override
	public void describe() {
		System.out.println("[Cat]");
		super.describe();
	}

}

public class Polymorphism {
	public static void main(String[] args) {
		
		// 다형성 예시 - 3. 업캐스팅하여 객체 선언 후 부모 클래스 객체로 메서드 호출
		// 굳이 업캐스팅을 사용해 호출하는 이유는 다형성과 관련이 있습니다.
		// 만약 업캐스팅을 사용하지 않고 각각의 객체 메서드를 호출하게 되면
		// 어떤 동물인지 조건문으로 확인하고 각 조건에 맞는 메서드를 호출해야 할 것입니다.
		// 이처럼 업캐스팅은 다형성의 원칙을 지키는 방법입니다.
		Animal animal = new Dog("순순이", "사료", 100);
		Animal animal2 = new Cat("애용이", "참치캔", 90);
		animal.describe();
		animal2.describe();
	}
}

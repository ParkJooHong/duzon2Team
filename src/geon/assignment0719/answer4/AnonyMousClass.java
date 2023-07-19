package geon.assignment0719.answer4;

/*
// 원래라면 아래의 추상 클래스를 사용하기 위해서 다음 과정을 거쳐야 합니다.
abstract class Dotori {
	public abstract void eatDotori();
}

// Dotori를 상속받은 자식 클래스를 만든 후 메서드를 오버라이드합니다.
class MyDotori extends Dotori {
	@Override
	public void eatDotori() {
		System.out.println("도토리를 먹습니다.");
	}
}

// 그리고 메인 메서드에서 추상 클래스인 부모 대신 자식 객체로 생성합니다.
// 이렇게 자식 클래스를 별도로 생성하여 사용하였습니다.
public class AnonyMousClass {
	public static void main(String[] args) {
		Dotori dotori = new MyDotori();
		dotori.eatDotori();
	}
}
*/

// 이제 익명 클래스를 사용해 보겠습니다.

abstract class Dotori {
	public abstract void eatDotori();
}

// 이렇게 dotori를 상속받은 익명클래스를 만들어 사용하면
// 자식 클래스를 별도로 생성하지 않을 수 있습니다.
public class AnonyMousClass {
	public static void main(String[] args) {
		// 추상 클래스를 그대로 선언하고 {}; 안에서 메서드를 오버라이딩 하면 됩니다.
		Dotori dotori = new Dotori() {
			@Override
			public void eatDotori() {
				System.out.println("도토리를 먹습니다.");
			}
		};
		dotori.eatDotori();
	}
}
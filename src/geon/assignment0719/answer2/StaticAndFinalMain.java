package geon.assignment0719.answer2;

// public class Answer2 extends FinalClass {
// 만약 위 처럼 작성하면 컴파일 에러가 발생합니다. 
// 다른 클래스에서 final로 선언한 클래스를 상속할 수 없기 때문입니다.
public class StaticAndFinalMain extends FinalMethodClass {
	
	int num1 = 10;
	static int num2 = 10;
	
	// 아래 코드는 에러가 발생합니다. final이 붙은 변수는 초기화 값을 필수적으로 설정해야 합니다.
	// static final int constValue2; 
	static final int constValue = 20;
	
	public void plus(int x, int y) {
		System.out.println(x + y);
	}
	public static void staticPlus(int x, int y) {
		System.out.println(x + y);
	}
	public static void printNum() {
		// 에러가 발생합니다. static 메소드 내에서 인스턴스 변수를 사용할 수 없기 때문입니다.
		// System.out.println(x + y + num1); 
		System.out.println(num2);
	}
	
	// 아래 코드는 에러가 발생합니다.
	// final 키워드를 붙인 메서드를 오버라이딩 할 수 없기 때문입니다.
	/*
	@Override
	final void finalMethod() {
		System.out.println("finalMethod");
	}
	*/

	public static void main(String[] args) {
		
		// static
		
		// plus(2,3); // 에러가 발생합니다. 객체를 생성 후 사용해야 합니다.
		StaticAndFinalMain a = new StaticAndFinalMain();
		a.plus(2,3); // 객체를 생성 후 메소드를 사용하였습니다.
		
		staticPlus(4,5); // static 메서드는 다음과 같이 객체를 생성하지 않고 메소드를 사용할 수 있습니다.
		printNum();

		// final
		
		// constValue = 30; // final이 붙은 변수의 값은 수정할 수 없습니다.
	}

}


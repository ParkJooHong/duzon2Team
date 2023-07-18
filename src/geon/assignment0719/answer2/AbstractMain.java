package geon.assignment0719.answer2;

public class AbstractMain extends AbstractClass {
	private static int a;
	private static int b;

	// 추상 클래스를 상속받은 자식 클래스는 반드시 추상 메서드를 오버라이딩 해야합니다.
	// 따라서 아래 5개의 메서드를 모두 구현해야 에러가 발생하지 않습니다.
	@Override
	public void add() {
		System.out.println(a+b);
	}
	@Override
	public void minus() {
		System.out.println(a-b);
	}
	@Override
	public void print() {
		System.out.println("a의 값은 : " + a + " b의 값은 : " + b);
	}
	@Override
	public void reset() {
		a = 0;
		b = 0;
	}
	@Override
	public void sizeUp(char c, int num) {
		if (c == 'a') a += num;
		else if (c == 'b') b += num;
	}
	
	public static void main(String[] args) {
		AbstractMain o = new AbstractMain();
		o.sizeUp('a', 5);
		o.sizeUp('b', 3);
		o.add();
		o.minus();
		o.print();
	}
	
}

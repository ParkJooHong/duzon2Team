package geon.assignment0719.answer4;

public class StaticInnerClassOuter {
	private static int diamondDotori; 
	private int goldDotori;
	
	public static class StaticInnerClass {
		static int silverDotori;
		int bronzeDotori;
		
		public StaticInnerClass() {
			// 아래 코드는 에러가 발생합니다.
			// 정적 이너 클래스는 외부 클래스의 변수나 메서드 중
			// static 키워드가 붙어있지 않으면 사용할 수 없습니다. 
			// instanceValue += 100;
			
			// 이렇게 외부 클래스의 변수와 메서드 중 static이 붙은 것들을 사용할 수 있습니다. 
			diamondDotori += 1;
		}
		
		public static void getDotori() {
			System.out.println("getDotori() 실행");
			
			// 외부 클래스 인스턴스 멤버에 접근이 불가능합니다.
			// goldDotori += 10;
			
			// 내부 클래스 인스턴스 멤버에도 접근이 불가능합니다.
			// bronzeDotori += 100;
			
			// 외부 클래스 static 멤버에는 접근이 가능합니다.
			diamondDotori += 1;
			
			// 내부 클래스 static 멤버에도 접근이 가능합니다.
			silverDotori += 50;
		}
	}
	
	public static void main(String[] args) {
		// 정적 내부 클래스는 외부 클래스를 먼저 생성하지 않아도 생성이 가능합니다.
		StaticInnerClassOuter.StaticInnerClass s = new StaticInnerClassOuter.StaticInnerClass();
		System.out.println("diamondDotori : " + diamondDotori);
		System.out.println("silverDotori : " + s.silverDotori);
		
		StaticInnerClassOuter.StaticInnerClass.getDotori();
		
		System.out.println("diamondDotori : " + diamondDotori);
		System.out.println("silverDotori : " + s.silverDotori);
	}
}

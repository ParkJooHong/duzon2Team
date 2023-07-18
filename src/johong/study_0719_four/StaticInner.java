package johong.study_0719_four;

// static 변수(클래스 변수)와 같이 클래스가 static으로 선언된 경우 사용한다.
//static (Compile) |  instance (RunTime)
//다른 클래스 내에 선언된 클래스로, 외부 클래스의 인스턴스와 독립적으로 생성될 수 있다.
// 외부클래스의 정적 멤버에만 접근할 수 있으며, 
//외부 클래스의 인스턴스 멤버에는 직접 접근할 수 없다.

public class StaticInner {
	
	private static int outStaticField = 100;
	private int outInstanceField = 90;
	
	public static class Inner{
		public void innerMethod() {
			System.out.println("내부 메소드 접근 성공");
			System.out.println("외부 정적변수 : " + outStaticField);
			//System.out.println("외부 인스턴스 변수 : " + outInstanceField);
			//위 외부 인스턴스 변수가 에러나는 이유는,
			//static은 컴파일시에 만들어져야하는데, 인스턴스 변수는 런타임때 실행되므로 안된다.
			outerStatic();
			//outerInstance();
			//위와 마찬가지인 이유로 instance는 static보다 늦게 생성되기 때문에 실행 불가능하다.
		}
	}
	
	public static void outerStatic() {
		System.out.println("외부 스태틱 메소드 접근 가능");
	}
	
	public void outerInstance() {
		System.out.println("외부 인스턴스 메소드 접근 불가");
	}
	
}

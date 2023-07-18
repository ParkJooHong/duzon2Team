package johong.study_0719_four;

// 특정한 메서드 내에 클래스가 정의된 경우 사용한다.
// 외부 클래스의 멤버에 접근할 수 있으며, 메서드의 로컬 변수와 매개변수도 사용 가능.
public class LocalInner {

	
	private int outerField = 100;
	
	public void outer() {
		final int localVariable = 200; //로컬 변수이다.
		
		class LocalInnerClass { //로컬 내부 클래스.
			public void inner() {
				System.out.println("내부 메소드");
				System.out.println("외부 변수 : " + outerField);
				System.out.println("지역 변수 : " + localVariable);
			}
		}
		
		LocalInnerClass innerClass = new LocalInnerClass();
		innerClass.inner();
	}
}

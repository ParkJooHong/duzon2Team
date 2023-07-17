package johong.study_0719_four;

// memberInnerClass는 클래스 내부에 정의된 내부 클래스를 의미한다.
// 내부 클래스는 다른 클래스 내부에 정의되어 있는 클래스로, 외부 클래스의 멤버로 간주한다.
// 이 내부 클래스는 외부 클래스의 멤버 변수 및 메서드에 접근할 수 있으며, 외부 클래스의 private 멤버에도 접근 가능하다.

public class MemberInner {

	private int outVariable;
	
	
	
	public class InnerClass{
		public void innerMethod() {
			//외부 클래스의 멤버 변수에 접근
			outVariable = 10;
			System.out.println("Inner method = " + outVariable);
		}
	}
	
	public void outMethod() {
		
		//내부 클래스의 인스턴스 생성.
		InnerClass inner = new InnerClass();
		inner.innerMethod();
	}
}

// InnerClass 는 OuterClass 내부에 정의된 내부 클래스이다.
// InnerClass의 인스턴스는 OuterClass의 멤버인 outerMethod에서 생성되고 사용된다.
// innerMethod 내부에서는 outerVarialbe과 같은 외부 클래스의 멤버 변수에 접근 가능하다.
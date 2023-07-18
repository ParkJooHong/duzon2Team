package johong.study_0719_four;

//멤버 내부 클래스는 다른 클래스 내에 선언된 내부 클래수로,
// 외부 클래스의 멤버(필드, 메서드)에 접근할 수 있다.
// 멤버 내부 클래스는 외부 클래스의 인스턴스와 연관되며,
// 외부 클래스의 인스턴스가 없는 상태에선 멤버 내부 클래스를 생성할 수 없다.

// memberInnerClass는 클래스 내부에 정의된 내부 클래스를 의미한다.
// 내부 클래스는 다른 클래스 내부에 정의되어 있는 클래스로, 외부 클래스의 멤버로 간주한다.
// 이 내부 클래스는 외부 클래스의 멤버 변수 및 메서드에 접근할 수 있으며, 외부 클래스의 private 멤버에도 접근 가능하다.
//InnerClass 는 MemberInner 내부에 정의된 내부 클래스이다.
//innerMethod 내부에서는 outerVarialbe과 같은 외부 클래스의 멤버 변수에 접근 가능하다.

public class MemberInner {

	private int outVariable;

	public class InnerClass{
		public void innerMethod() {
			//외부 클래스의 멤버 변수에 접근
			outVariable = 10;
			System.out.println("내부 메소드이고, 외부 클래스의 멤버 변수 : " + outVariable);
			outMethod();
		}
	}
	
	public void outMethod() {		
		System.out.println("외부 메소드 접근");
	}
}


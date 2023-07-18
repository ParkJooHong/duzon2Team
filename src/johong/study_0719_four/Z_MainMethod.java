package johong.study_0719_four;

public class Z_MainMethod {

	public static void main(String[] args) {

		//멤버 이너 클래스
		MemberInner m = new MemberInner();
		
		MemberInner.InnerClass inner = m.new InnerClass();
		inner.innerMethod();
		
		System.out.println();
		//---------------------------------------
		
		//스태틱 이너 클래스
		StaticInner.Inner staticInner = new StaticInner.Inner();
		staticInner.innerMethod();
		
	}

}

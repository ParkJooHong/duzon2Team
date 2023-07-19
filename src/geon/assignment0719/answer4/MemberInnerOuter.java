package geon.assignment0719.answer4;

public class MemberInnerOuter {
	private int instanceValue;
	private static int staticValue;
	
	public MemberInnerOuter() {
		instanceValue = 2;
		staticValue = 3;
	}

	// Member Inner Class 입니다.
	// 주로 외부 클래스의 인스턴스 변수나 메서드에 사용되기 위해 사용합니다.
	class MemberInnerClass {
		// Member Inner Class 는 클래스 내부에 static 키워드를 갖지 않습니다.
		public MemberInnerClass() {
			// MemberInnerOuter 멤버에 접근 가능합니다.
			instanceValue = 4;
			staticValue = 6;
		}
		
		public void MemberInnerClass() {
			System.out.println("instanceValue : " + MemberInnerOuter.this.instanceValue + " staticValue : " + staticValue);
		}
	}
	
	public static void main(String[] args) {
		// 아래 코드는 에러가 발생합니다. 외부 클래스 없이 내부 클래스를 생성할 수 없기 때문입니다.
		// new MemberInnerClass();
		
		// Member Inner Class 를 생성하기 위해선 다음과 같이 외부 클래스를 생성하고 Member Inner Class를 생성해야 합니다.
		MemberInnerOuter outer = new MemberInnerOuter();
		MemberInnerOuter.MemberInnerClass inner = outer.new MemberInnerClass();
		// 다음 코드와 동일합니다.
		//MemberInnerOuter.MemberInnerClass inner = new MemberInnerOuter().new MemberInnerClass();
		
		inner.MemberInnerClass();
	}

}
package johong.study_0719_four;

public class Z_MainMethod {

	public static void main(String[] args) {

		System.out.println("----------------------------멤버 내부 클래스---------------------------------");
		//멤버 내부 클래스
		MemberInner m = new MemberInner();
		
		MemberInner.InnerClass inner = m.new InnerClass();
		inner.innerMethod();
		
		System.out.println("----------------------------스태틱 내부 클래스---------------------------------");
		//---------------------------------------
		
		//스태틱 내부 클래스
		StaticInner.Inner staticInner = new StaticInner.Inner();
		staticInner.innerMethod();
		
		System.out.println("----------------------------지역 내부 클래스---------------------------------");
		//--------------------------------------------
		
		//지역 내부 클래스
		LocalInner local = new LocalInner();
		local.outer();
		
		
		System.out.println("----------------------------익명 내부 클래스---------------------------------");
		//---------------------------------------
		
		//익명 내부 클래스
		AnonymousInner a =new AnonymousInner();
		
		//how1 . 익명객체 필드 사용
		a.dog.cute();
		
		//how2 . 익명 객체 지역 변수 사용
		a.dog1();
		
		//how3 . 매개변수 익명개체 사용
		a.dog2(new Animal() {
			String name = "진돗개";
			
			void eatting() {
				System.out.println("밥을 먹는다.");
			}

			@Override
			public void cute() {
				System.out.println("짱 기엽다.");
			}
		});
	}
}

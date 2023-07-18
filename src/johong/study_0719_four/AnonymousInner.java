package johong.study_0719_four;

//참조할 수 있는 이름이 없는 경우 사용한다.
// 클래스 선언과 동시에 인스턴스를 생성한다.
//주로 인터페이스나 추상 클래스의 구현체를 바로 생성할때 사용.
//익명 자식 객체에서 새롭게 정의된 필드와 메소드는
// 자식 객체 범위에서만 사용할 수 있다. (외부에서는 사용 불가.)
public class AnonymousInner {

	//how1 . 필드에 익명자식객체 생성
	Animal dog = new Animal() {
		String name = "시바견";
		
		void bark() {
			System.out.println("귀엽게 짖는다.");
		}

		@Override
		public void cute() {
			System.out.println("강아지 중에 제일 귀엽다.");
		}
	};
	
	//how2 . 지역변수 초기값으로 삽입
	public void dog1() {
		Animal dog1 = new Animal() {
			String name = "불독";
			
			void angry() {
				System.out.println("화나면 무섭다.");
			}
			@Override
			public void cute() {
				System.out.println("하나도 안귀엽다");
			}
		};
		dog1.cute();
	}
	
	//how3 . 익명객체 매개변수로 삽입
	public void dog2(Animal dog) {
		dog.cute();
	}
}

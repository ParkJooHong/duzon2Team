package johong.study_0719_four;

public class AnoymousInner2 {

	
	//필드에 Animal 객체 대입
	private Animal animal1 = new Animal();
	
	//필드에 익명 자식 객체 대입
	private Animal animal2 = new Animal() {
		@Override
		public void cute() {
			System.out.println("익명 자식 동물은 귀엽다.");
		}
	};
	
	//메소드 필드 이용
	public void ani1() {
		animal1.cute();
		animal2.cute();
	}
	
	//메소드 로컬 변수 이용
	public void ani2() {
		//로컬 변수에 익명 자식 객체 대입
		Animal animal = new Animal() {
			@Override
			public void cute() {
				System.out.println("익명자식 동물2도 귀엽다.");
			}
		};
		animal.cute();
	}
	
	//메소드 매개변수 이용
	public void ani3(Animal dog) {
		dog.cute();
	}
}

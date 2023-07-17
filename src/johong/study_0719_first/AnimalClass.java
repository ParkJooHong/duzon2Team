package johong.study_0719_first;

public class AnimalClass extends AnimalAdator {
	
	@Override
	public void bark() {
		System.out.println("개가 짖습니다.");
		super.bark();
	}

	public static void main(String[] args) {
		
		AnimalClass a  = new AnimalClass();
		
		a.bark();
		
	}

	
}

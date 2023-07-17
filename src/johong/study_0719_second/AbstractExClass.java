package johong.study_0719_second;

public class AbstractExClass extends AbstractEx {

	
	
	@Override
	public void bark() {
		System.out.println("개가 짖습니다.");
		super.bark();
	}

	public static void main(String[] args) {

		AbstractExClass a = new AbstractExClass();
		
		a.bark();
	}

}

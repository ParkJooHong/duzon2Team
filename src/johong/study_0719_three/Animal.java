package johong.study_0719_three;

public class Animal {
	int age;

	//다형성 - 오버로딩
	public void Count() {
		System.out.println("동물 0마리");
	}
	
	public void Count(int count) {
		System.out.println("동물 " + count + "마리");
	}
	
	public void Count(int count, String type) {
		System.out.println("동물" + count + "마리 , " + "종류는 " + type );
	}
	
	//다형성 - 오버라이딩
	public void Count(Boolean yn) {
		System.out.println("동물입니다.");
	}
	
	public void Change() {
		System.out.println("사람이고, 나이는" + this.age +"살 입니다.");
	}
}

package johong;

public class Dog extends Animal {
	
	//다형성 - 오버로딩
	public void Count() {
		System.out.println("강아지 0마리");
	}
	
	public void Count(int count) {
		System.out.println("강아지 " + count + "마리");
	}
	
	public void Count(int count, String type) {
		System.out.println("강아지" + count + "마리 , " + "종류는 " + type );
	}



	
	//다형성 - 오버라이딩
	@Override
	public void Count(Boolean yn) {
		System.out.print("강아지는 ");
		super.Count(yn);
	}

	@Override
	public void Change() {
		System.out.println("강아지이고, 나이는" + this.age +"살 입니다." );
	}
	
	
	
}

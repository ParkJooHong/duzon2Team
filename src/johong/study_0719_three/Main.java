package johong.study_0719_three;

public class Main {

	public static void main(String[] args) {
		//다형성 오버로딩
		Dog a = new Dog();
		
		a.Count();	
		a.Count(5);
		a.Count(5, "시바견");
		
		System.out.println();
		
		//다형성 - 오버라이딩
		a.Count(true);
		
		a.age = 14;
		a.Change();
		
		Animal b = new Animal();
		b.age = 20;
		b.Change();
		
		System.out.println();
		
		//다형성 - 타입변환
		Animal c = new Dog();
		c.age = 92;
		c.Change();
		
		Dog a1 = new Dog();
		Animal b1 = (Dog) a1;
		
		System.out.println("동물 인가요? " + (b1 instanceof Animal)); 
		System.out.println("강아지 인가요? " + (a1 instanceof Animal)); 
	}
}

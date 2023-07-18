package sungeun.assignment.date717.num1;

public class BirdExample {

	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		Duck duck = new Duck();
		Sparrow sparrow = new Sparrow();
		
		chicken.eat();		//닭 : 밥을 먹습니다
		chicken.sound();	//꼬끼오
		
		System.out.println("======================");
		
		duck.eat();			//오리 : 밥을 먹습니다.
		duck.sound();		//꽥꽥
		duck.swim();		//수영할 수 있습니다.
		
		System.out.println("======================");
		sparrow.eat();		//참새 : 밥을 먹습니다.
		sparrow.sound();	//짹짹
		sparrow.fly();		//날 수 있습니다.

	}

}

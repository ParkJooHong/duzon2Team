package sungeun.assignment.date717.num3;

class Parent{
	void print() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	void print() {
		System.out.println("Child");
	}

	void childPlay() {
		System.out.println("Child Play");
	}

}

public class CastingEx {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c1 = new Child();
		Child c2 = new Child();
		
		p = c1;				// 업캐스팅 -> (Parent) 생략 가능
		c1.childPlay();		//Child Play
		p.print();			//Child
		
		//c2 = p;			// Error 발생
		c2 = (Child)p;		// 다운캐스팅 -> 생략하면 안된다.
		c2.print();			// Child
		
		System.out.println("========instanceof=========");
		
		Parent mom = new Parent();
		System.out.println(mom instanceof Object); //true
		System.out.println(mom instanceof Parent); //true
		System.out.println(mom instanceof Child);  //false
		
		Child me = new Child();
		System.out.println(me instanceof Object);  //true
		System.out.println(me instanceof Parent);  //true
		System.out.println(me instanceof Child);   //true
	}
}

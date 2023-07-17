package johong.study_0719_second;


class Number{
	static int num = 0; // 클래스 필드
	int num2 = 0; //인스턴스 필드
}

class Name{
	static void print() { // 클래스 메소드
		System.out.println("제 이름은 박주홍입니다.");
	}
	
	void print2() { // 인스턴스 메소드
		System.out.println("제 이름은 김자바입니다.");
	}
}

public class StaticEx {

	public static void main(String[] args) {
		
		// static 필드 사용 예시
		 Number number1 = new Number(); //첫번째 number
        Number number2 = new Number(); //두번쨰 number
        
        number1.num++; //클래스 필드 num을 1증가시킴
        number1.num2++; //인스턴스 필드 num을 1증가시킴
        System.out.println(number2.num); //두번째 number의 클래스 필드 출력
        System.out.println(number2.num2); //두번째 number의 인스턴스 필드 출력
        
        
        //static 메서드 사용 예시
        Name.print(); // 인스턴스를 생성하지 않아도 호출 가능.
        
        Name name = new Name(); // 인스턴스 생성
        name.print2(); // 인스턴스를 생성해야만 호출 가능.

	}

}

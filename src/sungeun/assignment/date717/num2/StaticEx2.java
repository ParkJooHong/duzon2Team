package sungeun.assignment.date717.num2;

public class StaticEx2 {
	int field;
	void method() {
		field = 1;
	}
	
	static int field2;
	static void method2() {
		field2 = 2;
	}
	
	static void metho3() {
		//field1 = 10; // 컴파일 에러
		//this.method();	// 컴파일 에러
		field2 = 4;
		method2();
	}
}

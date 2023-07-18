package sungeun.assignment.date717.num3;

public class OverloadingEx {
	
	public int example(int a, int b) { 
		return a+b;
	}
	
	public int example(int a, int b, int c) {
		return a+b-c;	
	}
	
	public int example(int ...a) { // 가변변수
	// 매개변수가 2,3개인 경우를 제외하고 int 타입의 매개변수가 입력되면 실행된다 
		return a.length;
	}
	
	public static void main(String[] args) {
		OverloadingEx ex = new OverloadingEx();
		
		System.out.println(ex.example(1,5));//6
		System.out.println(ex.example(1,50,30));//21
		System.out.println(ex.example(2,5,6,8,2,0,321,12,5,9,5));//11
	}
}
package sungeun.assignment.date717.num4;

public class StaticInnerEx {
	static class Cal{
		int value = 9;
		public void plus() {
			value++;
		}
	}
	
	 public static void main(String[] args) {
		StaticInnerEx.Cal cal = new StaticInnerEx.Cal();
		//외부 클래스를 먼저 선언하지 않고, 외부클래스.정적클래스명으로 사용할 수 있다.
		cal.plus();
		System.out.println(cal.value); //10
		
	}

}

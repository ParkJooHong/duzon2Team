package sungeun.assignment.date717.num4;

public class LocalOuterEx {
	private int value = 100;
	final static int DATA = 10;
	public void OuterMethod() {
		class Inner{
			int value = 0;
			public void InnerMethod() {
				value++;
			}
		}
		Inner inner = new Inner();	// outer 메서드 안에서만 inner 객체 생성 및 메소드 호출이 가능
		inner.InnerMethod();
		System.out.println(DATA);	// 외부 클래스 상수 접근 가능
		System.out.println(value);	//외부 클래스 private 변수 접근가능 -> this.value
		System.out.println(inner.value); // 내부 클래스 value 
	}
	
	public static void main(String[] args) {
		LocalOuterEx local = new LocalOuterEx();
		local.OuterMethod();	// 10 100 1
	}
}

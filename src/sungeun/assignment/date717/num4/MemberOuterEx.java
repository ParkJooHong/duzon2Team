package sungeun.assignment.date717.num4;

public class MemberOuterEx {
	private int outerValue = 10;
	public MemberOuterEx() {
		System.out.println("Outer Class");
	}
	
	private void outerMethod() {
		System.out.println("outer Method");
	}
	
	public class Inner{
		private int innerValue = 50;
		public Inner() {
			outerValue = 100; // private라도 외부선조 바로 접근 가능
			System.out.println("Inner Class");
			outerMethod();
		}
		public void InnerMethod() {
			System.out.println("Inner Method");
			System.out.println(this.innerValue);	//내부속성 접근
			System.out.println(MemberOuterEx.this.outerValue);	//외부속성접근
		}
	}
	
	
	public static void main(String[] args) {
		MemberOuterEx.Inner inner = new MemberOuterEx().new Inner();
		inner.InnerMethod();	//외부 -> 내부 순으로 접근 
	}
}

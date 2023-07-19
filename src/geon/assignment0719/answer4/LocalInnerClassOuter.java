package geon.assignment0719.answer4;

public class LocalInnerClassOuter {
	private int outerValue;
	
	public void disp() {
		int localValue;
		
		// Local Inner Class는 외부 클래스의 메서드나 초기화 블록에 선언된 클래스입니다.
		// 마치 메서드 내의 지역변수처럼 사용됩니다.
		// 메서드 내부에서 new 한 뒤에 사용해야 합니다. 메서드 밖에서 사용할 수 없습니다.
		class LocalInnerClass {
			int num = 0;
			public void numUp() {
				num += 100;
				outerValue += 200; // 접근 가능합니다.
				
				// 아래 코드는 에러가 발생합니다.
				// 로컬 내부 클래스가 정의된 메서드 내의 로컬변수에 접근할 수 없기 때문입니다.
				// localValue += 100;  
			}
		}
		
		// Local Inner Class의 객체 생성은 해당 클래스가 포함된 메서드에서만 가능합니다.
		LocalInnerClass lc = new LocalInnerClass();
		lc.numUp();
		System.out.println(lc.num +", " + outerValue);
		
	}
	
	
	public static void main(String[] args) {
		// 아래 코드는 에러가 발생합니다.
		// LocalInnerClass l = new LocalInnerClass();
		
		// 메인 메서드 안에서 사용 시, 외부 클래스 객체를 생성하고
		// 이후 지역 내부 클래스가 있는 메서드를 호출하여 동작시킬 수 있습니다.
		LocalInnerClassOuter o = new LocalInnerClassOuter();
		o.disp();
	}

}

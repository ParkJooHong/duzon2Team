package johong.study_0719_second.staticEx;


//스태틱 필드
public class StaticEx2 {
	private static int count; // 정적 필드이다.
	
	public StaticEx2() {
		count++;
	}
	
	public static int getCount() { //정적 메소드.
		return count;
	}
	
	public static void main(String[] args) {
		
		StaticEx2 a = new StaticEx2(); // count 1증가.
		StaticEx2 b = new StaticEx2(); // count 1증가.
		
		System.out.println(StaticEx2.count);
	}
}
